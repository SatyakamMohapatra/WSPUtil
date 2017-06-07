package com.unify_iri.wspUtill.utilityPkg;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class WspUtill {

	public static JdbcTemplate getJdbcTemplate(String UserName,String Password) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(new WspUtill().newInstance(UserName, Password));
		return jdbcTemplate;
	}

	private DataSource newInstance(String UserName,String Password){
		DriverManagerDataSource driver = new DriverManagerDataSource();
		driver.setUrl("jdbc:oracle:thin:@//ex02-scan.ch3.prod.i.com:1521/sv01dmt");
		driver.setUsername(UserName);
		driver.setPassword(Password);
		driver.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		return driver;
	}

	public  static void writeToFile(String fileName,String str)
	{
		File f = new File(fileName);
		try {
			f.getParentFile().mkdirs();
			f.createNewFile();
			Writer fw = new OutputStreamWriter(new FileOutputStream(f), StandardCharsets.UTF_8);
			fw.write(str);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String read(String fileName) throws Exception{
		StringBuilder sb = new StringBuilder();
		String sCurrentLine;

		BufferedReader br = new BufferedReader(new FileReader(fileName));

		while ((sCurrentLine = br.readLine()) != null) {
			sb.append(sCurrentLine);
		}
		br.close();
		return	sb.toString();
	}

	public static String convertClobToString(Clob clobData)throws SQLException,IOException{
		char clobVal[] = new char[(int) clobData.length()];
		Reader paramValueReader = clobData.getCharacterStream();
		paramValueReader.read(clobVal);
		StringWriter sw = new StringWriter();
		sw.write(clobVal);
		return sw.toString();
	}

	public static byte[] compressIt(String source)
	{
		try
		{
			byte[] sourceArr = null;
			if(source == null)
				return null;
			ByteArrayOutputStream bis = new ByteArrayOutputStream();

			sourceArr = source.getBytes("UTF-8");
			source.getBytes();
			GZIPOutputStream gOut = new GZIPOutputStream(bis);
			gOut.write(sourceArr,0,sourceArr.length);
			gOut.finish();
			byte[] outputArr = bis.toByteArray();
			gOut.close();
			bis.close();
			return outputArr;
		}
		catch(IOException ioe)
		{
			return null;	
		}
	}

	public static String unCompressIt(byte[] source)
	{
		try
		{
			if(source == null)
				return null;

			ByteArrayInputStream bis = new ByteArrayInputStream(source);
			GZIPInputStream gOut = new GZIPInputStream(bis);			
			ByteArrayOutputStream bout = new ByteArrayOutputStream();		
			//int maxLength = 0;
			String returnString="";
			while(gOut.available()==1) 
			{
				byte[] uncompressedArr = new byte[1024];
				int read = gOut.read(uncompressedArr,0,uncompressedArr.length);
				if(read!=-1)bout.write(uncompressedArr,0,read);
			}
			returnString = bout.toString("UTF-8"); 	
			bout.close();
			gOut.close();
			bis.close();
			return returnString;
		}
		catch(IOException ioe)
		{
			return null;	
		}			
	}
	public static byte[] getByteArrayFromBlob(ResultSet rs, String columnName) throws Exception
	{
		byte[] byteArray = null ;
		Blob blobObj = rs.getBlob(columnName);

		if (blobObj != null && blobObj.length() > 0) 
			byteArray = blobObj.getBytes(1, (int) blobObj.length());

		return byteArray ;
	}

}
