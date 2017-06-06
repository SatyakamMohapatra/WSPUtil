package com.unify_iri.wspUtill.utilityPkg;

public enum SQLCONSTANT {

	CHARTPROPERTIES{
		@Override
		public String toString() {
			return "SELECT W.WSP_ID,CP.PROPERTIES FROM WSP_PANE_TBL PN ,CMN_REPORT_TBL RPT , "
					+ "WSP_PAGE_TBL P ,CMN_PANE_PROPS_TBL CP ,WSP_SUMM_TBL W "
					+ "WHERE PN.PAGE_ID = P.PAGE_ID "
					+ "AND W.WSP_ID IN (?) AND W.WSP_ID = P.WSP_ID "
					+ "AND PN.OBJECT_ID = RPT.REPORT_ID "
					+ "AND CP.PANE_ID = RPT.BLX_PROPS_ID "
					+ "AND CP.PANE_TYPE =?";
		}
	},

	SELECTALLPROPERTIES{
		@Override
		public String toString() {
			return "SELECT W.WSP_ID,CP.PROPERTIES,CP.PANE_TYPE FROM WSP_PANE_TBL PN ,CMN_REPORT_TBL RPT , "
					+ "WSP_PAGE_TBL P ,CMN_PANE_PROPS_TBL CP ,WSP_SUMM_TBL W "
					+ "WHERE PN.PAGE_ID = P.PAGE_ID AND W.WSP_ID IN (?) "
					+ "AND W.WSP_ID = P.WSP_ID AND PN.OBJECT_ID = RPT.REPORT_ID "
					+ "AND CP.PANE_ID = RPT.BLX_PROPS_ID";
		}
	}
}
