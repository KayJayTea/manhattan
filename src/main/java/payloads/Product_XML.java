package payloads;

public class Product_XML {
	
	public static String productData(String masterProd, String dt_StepUpdt, String short_desc, String dt_PubSubRev) {
		
		String payload = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n" + 
				"<STEP-ProductInformation ExportTime=\"2019-03-23 13:14:03\" ExportContext=\"EN All All\" ContextID=\"EN All All\" WorkspaceID=\"Approved\" UseContextLocale=\"false\">\r\n" + 
				"  <Products>\r\n" + 
				"    <Product ID=\"Prod-2298947\" UserTypeID=\"Product\" ParentID=\"ProdFamily-252280\" Changed=\"true\" Republished=\"true\">\r\n" + 
				"      <Name Changed=\"true\">I10221 1G PVC PURP PRMR P70</Name>\r\n" + 
				"      <ClassificationReference ClassificationID=\"webfolder-2623\" Type=\"FOL Link\" Changed=\"true\">\r\n" + 
				"        <MetaData>\r\n" + 
				"          <Value AttributeID=\"Use for ECatalog\">Yes</Value>\r\n" + 
				"        </MetaData>\r\n" + 
				"      </ClassificationReference>\r\n" + 
				"      <Values>\r\n" + 
				"        <Value AttributeID=\"MP_UPC_CODE\">012181102213</Value>\r\n" + 
				"        <Value AttributeID=\"AltCodes4_Temp\">90101190@</Value>\r\n" + 
				"        <Value AttributeID=\"INT_MFG_PART_NUM\" Changed=\"true\">10221</Value>\r\n" + 
				"        <Value AttributeID=\"PE_Brand_Type\">Branded</Value>\r\n" + 
				"        <Value AttributeID=\"MP_LINEBUY_ID\" ID=\"5501\" Changed=\"true\">5501</Value>\r\n" + 
				"        <Value AttributeID=\"MP_DEPT_CODE\" ID=\"26\" Changed=\"true\">26</Value>\r\n" + 
				"        <Value AttributeID=\"MP_PRODUCT_DESC2\" Changed=\"true\">"+short_desc+"</Value>\r\n" + 
				"        <Value AttributeID=\"MP_UOM\" ID=\"EA\" Changed=\"true\">EA</Value>\r\n" + 
				"        <MultiValue AttributeID=\"FLD_Strategic Product Groups\" Changed=\"true\">\r\n" + 
				"          <Value ID=\"899\" Changed=\"true\">Sample for IT</Value>\r\n" + 
				"        </MultiValue>\r\n" + 
				"        <Value AttributeID=\"MP_HAZ_CLASS_CODE_S2T\" Changed=\"true\">3|3</Value>\r\n" + 
				"        <MultiValue AttributeID=\"FLD_eCatalog Product Details\">\r\n" + 
				"          <Value ID=\"76\">SS_Alcoa Main</Value>\r\n" + 
				"          <Value ID=\"966\">SS_Reynolds Packaging Main</Value>\r\n" + 
				"          <Value ID=\"908\">eCat Master</Value>\r\n" + 
				"          <Value ID=\"977\">SS_Vail Resorts Main</Value>\r\n" + 
				"          <Value ID=\"1044\">SS Master</Value>\r\n" + 
				"          <Value ID=\"1230\">SS_Arconic Main</Value>\r\n" + 
				"        </MultiValue>\r\n" + 
				"        <Value AttributeID=\"AltCodes2_Temp\">I107700411</Value>\r\n" + 
				"        <MultiValue AttributeID=\"FLD_Online Disposition\" Changed=\"true\">\r\n" + 
				"          <Value Changed=\"true\">B2C Hidden</Value>\r\n" + 
				"          <Value Changed=\"true\">B2B Fully Indexed</Value>\r\n" + 
				"        </MultiValue>\r\n" + 
				"        <Value AttributeID=\"MP_PARCEL_RESTRICT_FLAG\" Changed=\"true\">G</Value>\r\n" + 
				"        <Value AttributeID=\"DAR Batch ID\">Marie PRF RS File</Value>\r\n" + 
				"        <Value AttributeID=\"INT_S_INTEG.LOC.PRODUCT\">1324222</Value>\r\n" + 
				"        <Value AttributeID=\"Web Display Type\" Changed=\"true\">Drop-down</Value>\r\n" + 
				"        <Value AttributeID=\"MP_NFPA_CLASS_CODE\" ID=\"Flammable Liquid IB\" Changed=\"true\">FLIB</Value>\r\n" + 
				"        <Value AttributeID=\"ECAT_ANSI UOM\" Changed=\"true\">EA</Value>\r\n" + 
				"        <MultiValue AttributeID=\"MP_IMDG_HAZ_PROPER_SHIP_NAME\" Changed=\"true\">\r\n" + 
				"          <Value Changed=\"true\">FLAMMABLE LIQUID N.O.S. </Value>\r\n" + 
				"        </MultiValue>\r\n" + 
				"        <MultiValue AttributeID=\"PW_LAST_CHG_DATE\" Changed=\"true\">\r\n" + 
				"          <Value Changed=\"true\">2011 12 23</Value>\r\n" + 
				"        </MultiValue>\r\n" + 
				"        <Value AttributeID=\"INTL_EXPT_CTRL_CLASS_NUM\">EAR99</Value>\r\n" + 
				"        <Value AttributeID=\"CVR_NFPA Storage Classification\" Changed=\"true\">FLIB</Value>\r\n" + 
				"        <Value AttributeID=\"PW_PREVIOUS_PRICE\" Changed=\"true\">102.20</Value>\r\n" + 
				"        <MultiValue AttributeID=\"MP_HAZ_PROPER_SHIP_NAME\" Changed=\"true\">\r\n" + 
				"          <Value Changed=\"true\">FLAMMABLE LIQUID N.O.S.</Value>\r\n" + 
				"          <Value Changed=\"true\">(TETRAHYDROFURAN, ACETONE)</Value>\r\n" + 
				"        </MultiValue>\r\n" + 
				"        <Value AttributeID=\"INTL_EXPT_PROD_TARIFF_CD\">3814000000</Value>\r\n" + 
				"        <MultiValue AttributeID=\"FLD_Merchandising Profiles\" Changed=\"true\">\r\n" + 
				"          <Value ID=\"5\" Changed=\"true\">Utilities Top Skus 091911</Value>\r\n" + 
				"          <Value ID=\"6\" Changed=\"true\">Mechanical Top Skus 091911</Value>\r\n" + 
				"          <Value ID=\"7\" Changed=\"true\">Res_Plumbing Top Skus 091911</Value>\r\n" + 
				"          <Value ID=\"9\" Changed=\"true\">Fire &amp; Fab Top Skus 032612</Value>\r\n" + 
				"        </MultiValue>\r\n" + 
				"        <Value AttributeID=\"CVR_Shelf Life Y/N\" Changed=\"true\">Y</Value>\r\n" + 
				"        <Value AttributeID=\"MP_SHELF_LIFE_FLAG\" Changed=\"true\">Y</Value>\r\n" + 
				"        <Value AttributeID=\"MP_HAZ_PROPER_SHIP_NAME_S2T\" Changed=\"true\">FLAMMABLE LIQUID N.O.S.^(TETRAHYDROFURAN, ACETONE)|FLAMMABLE LIQUID N.O.S. </Value>\r\n" + 
				"        <Value AttributeID=\"PW_CURRENT_PRICE\" Changed=\"true\">0.00</Value>\r\n" + 
				"        <MultiValue AttributeID=\"MP_IMDG_HAZ_LABEL_REQMT\" Changed=\"true\">\r\n" + 
				"          <Value Changed=\"true\">3</Value>\r\n" + 
				"        </MultiValue>\r\n" + 
				"        <Value AttributeID=\"AltCodes1_Temp\">I10221</Value>\r\n" + 
				"        <Value AttributeID=\"PW_LOCAL_PRICE_FLAG\" ID=\"1\" Changed=\"true\">Y</Value>\r\n" + 
				"        <Value AttributeID=\"ImportBatchID\" Changed=\"true\">SCA Linebuy Audit_082018</Value>\r\n" + 
				"        <Value AttributeID=\"MP_IMDG_HAZMAT_ID\" ID=\"UN1993\" Changed=\"true\">UN1993</Value>\r\n" + 
				"        <Value AttributeID=\"MP_HAZMAT_ID_S2T\" Changed=\"true\">UN1993|UN1993</Value>\r\n" + 
				"        <Value AttributeID=\"PW_DONT_FORGET\" Changed=\"true\">SOLD IN QTY'S OF 6 ONLY!</Value>\r\n" + 
				"        <Value AttributeID=\"MP_HAZ_RPTABLE_QTY_S2T\" Changed=\"true\">5000|</Value>\r\n" + 
				"        <Value AttributeID=\"MP_HAZ_ADDL_EXCP_S2T\" Changed=\"true\">|</Value>\r\n" + 
				"        <Value AttributeID=\"Eco_128\" Changed=\"true\">Yes</Value>\r\n" + 
				"        <Value AttributeID=\"MP_HAZ_PACKAGING_DESC_S2T\" Changed=\"true\">___X__ BOX|___X__ BOX</Value>\r\n" + 
				"        <Value AttributeID=\"MP_PER_QTY\" Changed=\"true\">1</Value>\r\n" + 
				"        <Value AttributeID=\"MP_PRODUCT_DESC\" Changed=\"true\">1G PVC PURP PRMR P70</Value>\r\n" + 
				"        <Value AttributeID=\"MP_S_MASTER.PRODUCT\">" + masterProd + "</Value>\r\n" + 
				"        <Value AttributeID=\"MP_HAZ_PACK_GROUP\" ID=\"Medium\" Changed=\"true\">II</Value>\r\n" + 
				"        <Value AttributeID=\"MP_HAZ_TRNSPRT_MODE\" Changed=\"true\">G|S</Value>\r\n" + 
				"        <Value AttributeID=\"MP_SELL_MULTIPLIER\" Changed=\"true\">1</Value>\r\n" + 
				"        <Value AttributeID=\"FLD_NEW Features 02\" Changed=\"true\">Specially recommended for use on SCH 80 and larger size pipe</Value>\r\n" + 
				"        <Value AttributeID=\"FLD_NEW Features 03\" Changed=\"true\">Excellent for cold weather applications</Value>\r\n" + 
				"        <Value AttributeID=\"MP_HAZ_CLASS_CODE\" Changed=\"true\">3</Value>\r\n" + 
				"        <Value AttributeID=\"FLD_NEW Features 01\" Changed=\"true\">Premium,industrial strength, low VOC primer essential for proper softening and preparation of PVC and CPVC pipe and fitting surfaces</Value>\r\n" + 
				"        <Value AttributeID=\"ECAT_Qty Multiple\" Changed=\"true\">1</Value>\r\n" + 
				"        <Value AttributeID=\"MP_FREIGHT_CODE\" ID=\"CL55\" Changed=\"true\">CL55</Value>\r\n" + 
				"        <Value AttributeID=\"STEP_UPDT_DATE\">"+ dt_StepUpdt +"</Value>\r\n" + 
				"        <Value AttributeID=\"MP_HAZ_LABEL_REQMT_S2T\" Changed=\"true\">3|3</Value>\r\n" + 
				"        <Value AttributeID=\"MP_PROD_LONG_DESC\" Changed=\"true\">1 Gang PVC Purpose Primer P70</Value>\r\n" + 
				"        <Value AttributeID=\"MP_ALT.CODES4\" Changed=\"true\">90101190@</Value>\r\n" + 
				"        <Value AttributeID=\"ECAT_UNSPSC\" Changed=\"true\">47121808, Drain or pipe cleaning equipment</Value>\r\n" + 
				"        <Value AttributeID=\"Eco_1398\" Changed=\"true\">1 gal</Value>\r\n" + 
				"        <Value AttributeID=\"PW_DISC_PCT\" Changed=\"true\">0.0000</Value>\r\n" + 
				"        <Value AttributeID=\"MP_IMDG_HAZ_PACKAGING_DESC\" Changed=\"true\">___X__ BOX</Value>\r\n" + 
				"        <Value AttributeID=\"MP_VENDOR_PROD_CODE\">10221</Value>\r\n" + 
				"        <MultiValue AttributeID=\"eCat Import Batch ID\">\r\n" + 
				"          <Value>MasterBatch5</Value>\r\n" + 
				"        </MultiValue>\r\n" + 
				"        <Value AttributeID=\"MP_HAZ_DSPOS_CAT\" Changed=\"true\">FLAMLIQUID</Value>\r\n" + 
				"        <Value AttributeID=\"MP_HAZ_WGHT_VOL_S2T\" Changed=\"true\">|</Value>\r\n" + 
				"        <Value AttributeID=\"MP_GLBL_PROD_HIER\">13030803</Value>\r\n" + 
				"        <Value AttributeID=\"eComm Temp ID\">MoveFromReviewWF_20180820</Value>\r\n" + 
				"        <Value AttributeID=\"MP_OBS_FLAG\" Changed=\"true\">N</Value>\r\n" + 
				"        <Value AttributeID=\"MP_HAZ_PACKAGING_DESC\" Changed=\"true\">___X__ BOX</Value>\r\n" + 
				"        <MultiValue AttributeID=\"Eco_226\">\r\n" + 
				"          <Value>Purple</Value>\r\n" + 
				"        </MultiValue>\r\n" + 
				"        <Value AttributeID=\"FLD_Base Model Number\" Changed=\"true\">I10221</Value>\r\n" + 
				"        <MultiValue AttributeID=\"eComm Import ID\">\r\n" + 
				"          <Value>Platform SKUs</Value>\r\n" + 
				"          <Value>Dec 15 Ph1 Refresh</Value>\r\n" + 
				"          <Value>Need BM List 2.16</Value>\r\n" + 
				"          <Value>Prelim Refresh AUG 2016</Value>\r\n" + 
				"        </MultiValue>\r\n" + 
				"        <Value AttributeID=\"Web Display Name\" Changed=\"true\">1 gal. PVC Purple Primer 6 Pack</Value>\r\n" + 
				"        <Value AttributeID=\"MP_HAZ_LTD_QTY\" Changed=\"true\">Y</Value>\r\n" + 
				"        <Value AttributeID=\"MP_HAZ_RPTABLE_QTY\" Changed=\"true\">5000</Value>\r\n" + 
				"        <MultiValue AttributeID=\"Eco_11\" Changed=\"true\">\r\n" + 
				"          <Value Changed=\"true\">ASTM F-656</Value>\r\n" + 
				"        </MultiValue>\r\n" + 
				"        <Value AttributeID=\"MP_ALT.CODES2\" Changed=\"true\">I107700411</Value>\r\n" + 
				"        <Value AttributeID=\"MP_MSDS_REQRD_FLAG\" Changed=\"true\">Y</Value>\r\n" + 
				"        <Value AttributeID=\"PW_S_PRODUCT.WHSE\">1324222</Value>\r\n" + 
				"        <Value AttributeID=\"MP_HAZ_PACK_GROUP_S2T\" Changed=\"true\">II|III</Value>\r\n" + 
				"        <Value AttributeID=\"MP_IMDG_HAZ_PACK_GROUP\" ID=\"Minor\" Changed=\"true\">III</Value>\r\n" + 
				"        <Value AttributeID=\"EndecaFeedFlag\">true</Value>\r\n" + 
				"        <Value AttributeID=\"MP_IMDG_HAZ_CLASS_CODE\" Changed=\"true\">3</Value>\r\n" + 
				"        <Value AttributeID=\"MP_PRIM_VENDOR_ID\" Changed=\"true\">500</Value>\r\n" + 
				"        <MultiValue AttributeID=\"FLD_Catalog Product Details\">\r\n" + 
				"          <Value ID=\"2\">Old Online Flag 082511</Value>\r\n" + 
				"          <Value ID=\"84\">Old Online Flag 081312</Value>\r\n" + 
				"          <Value ID=\"124\">Old Online Flag 091413</Value>\r\n" + 
				"          <Value ID=\"129\">Old Mobile_010913</Value>\r\n" + 
				"          <Value ID=\"173\">Old Online Flag 083014</Value>\r\n" + 
				"          <Value ID=\"894\">Old Online Flag 081715</Value>\r\n" + 
				"          <Value ID=\"888\">B2B</Value>\r\n" + 
				"        </MultiValue>\r\n" + 
				"        <Value AttributeID=\"MP_ALT.CODES1\" Changed=\"true\">I10221</Value>\r\n" + 
				"        <Value AttributeID=\"MP_HAZMAT_ID\" ID=\"UN1993\" Changed=\"true\">UN1993</Value>\r\n" + 
				"        <Value AttributeID=\"FLD_Brand Names\" ID=\"3940\" Changed=\"true\">Weld-On&lt;REG/&gt;</Value>\r\n" + 
				"        <Value AttributeID=\"MP_DISC_GROUP_ID\" ID=\"1331\" Changed=\"true\">1331</Value>\r\n" + 
				"        <MultiValue AttributeID=\"Eco_129\" Changed=\"true\">\r\n" + 
				"          <Value Changed=\"true\">NSF 14</Value>\r\n" + 
				"        </MultiValue>\r\n" + 
				"        <MultiValue AttributeID=\"MP_HAZ_LABEL_REQMT\" Changed=\"true\">\r\n" + 
				"          <Value Changed=\"true\">3</Value>\r\n" + 
				"        </MultiValue>\r\n" + 
				"        <Value AttributeID=\"MP_DEPT_CODE_DESC\" Derived=\"true\">COMM / INDU - MILL SPLY</Value>\r\n" + 
				"        <Value AttributeID=\"MP_HAZMAT_ID_DESC\" Derived=\"true\">FLAMMABLE LIQUID N.O.S. </Value>\r\n" + 
				"        <Value AttributeID=\"USERofREVISION\" Derived=\"true\">PSAHOO</Value>\r\n" + 
				"        <Value AttributeID=\"Calc_MP_UPC_CODE\" Derived=\"true\">012181102213</Value>\r\n" + 
				"        <Value AttributeID=\"Calc_MP_PRODUCT_DESC\" Derived=\"true\">1G PVC PURP PRMR P70</Value>\r\n" + 
				"        <Value AttributeID=\"Calc_MP_PRODUCT_DESC2\" Derived=\"true\">*SHELF</Value>\r\n" + 
				"        <Value AttributeID=\"MP_LINEBUY_ID_DESC\" Derived=\"true\">IPS HAZMAT SKUS N/STK</Value>\r\n" + 
				"        <Value AttributeID=\"MP_UOM_DESC\" Derived=\"true\">EACH</Value>\r\n" + 
				"        <Value AttributeID=\"PubSub_Revision\" Derived=\"true\">v0.80 ("+ dt_PubSubRev +")</Value>\r\n" + 
				"        <Value AttributeID=\"MP_DISC_GROUP_ID_DESC\" Derived=\"true\">IPS CEMENT PRMR CLNR</Value>\r\n" + 
				"        <Value AttributeID=\"MP_ALT_CODE\" Derived=\"true\">I10221|I107700411||90101190@|</Value>\r\n" + 
				"        <Value AttributeID=\"STEP_CREATE_DATE\" Derived=\"true\">03/28/2015</Value>\r\n" + 
				"        <Value AttributeID=\"Supplier_Name\" Derived=\"true\">IPS CORPORATION</Value>\r\n" + 
				"        <Value AttributeID=\"FOL_Link_Calc\" Derived=\"true\">Pipe Primer &amp; Cleaner</Value>\r\n" + 
				"        <Value AttributeID=\"ParentReference\" Derived=\"true\">&lt;ACCENT/&gt;webfolder2-2623</Value>\r\n" + 
				"        <Value AttributeID=\"PW_PRICE\" Derived=\"true\">0.00|102.20</Value>\r\n" + 
				"        <Value AttributeID=\"ParentFOLReferencebyName\" Derived=\"true\">&lt;ACCENT/&gt;Pipe Primer &amp; Cleaner</Value>\r\n" + 
				"      </Values>\r\n" + 
				"      <Product ID=\"Fulfill-383752\" UserTypeID=\"Fulfillment Option\">\r\n" + 
				"        <Name>WMS I10221 1G PVC PURP PRMR P70</Name>\r\n" + 
				"        <Values>\r\n" + 
				"          <Value AttributeID=\"MPV_PPQ3\">252</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_MP_VENDOR_ID\">9164</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_WEIGHT.SRC2\" ID=\"Vendor\">V</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_WEIGHT2\">55.000</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_LENGTH.SRC3\" ID=\"Default\">D</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_HEIGHT3\">47.000</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_WEIGHT3\">2309.832</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_WEIGHT.SRC0\" ID=\"Vendor\">V</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_PPQ.SRC3\" ID=\"Calculated\">C</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_HEIGHT.SRC3\" ID=\"Default\">D</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_WIDTH.SRC3\" ID=\"Default\">D</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_WIDTH0\">6.640</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_HEIGHT.SRC0\" ID=\"Calculated\">C</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_WIDTH.SRC0\" ID=\"Calculated\">C</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_WIDTH2\">12.625</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_UOM0\" ID=\"EA\">EA</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_LENGTH.SRC2\" ID=\"Vendor\">V</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_HEIGHT.SRC2\" ID=\"Vendor\">V</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_WIDTH.SRC2\" ID=\"Vendor\">V</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_HEIGHT0\">6.640</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_WEIGHT0\">9.166</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_UOM2\" ID=\"CA\">CA</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_LENGTH2\">13.250</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_LENGTH3\">51.000</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_PPQ.SRC2\" ID=\"Vendor\">V</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_S_MP.VENDOR\">1324222*9164</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_PPQ0\">1</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_WEIGHT.SRC3\" ID=\"Calculated\">C</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_UOM3\" ID=\"PT\">PT</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_LENGTH0\">6.640</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_LENGTH.SRC0\" ID=\"Calculated\">C</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_HEIGHT2\">10.500</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_WIDTH3\">44.000</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_PPQ2\">6</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_INFO_DELETED_FLAG\" ID=\"0\">N</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_PPQ.SRC0\" ID=\"Vendor\">V</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_PPQ\" Derived=\"true\">1||6|252</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_PROD_WIDTH\" Derived=\"true\">6.640||12.625|44.000</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_WIDTH_SRC_CODE\" Derived=\"true\">C||V|D</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_WEIGHT_SRC_CODE\" Derived=\"true\">V||V|C</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_PACK_LEVEL_IND\" Derived=\"true\">|||</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_LENGTH_SRC_CODE\" Derived=\"true\">C||V|D</Value>\r\n" + 
				"          <Value AttributeID=\"PubSub_Revision\" Derived=\"true\">v0.10 (2018-09-02 14:48:01)</Value>\r\n" + 
				"          <Value AttributeID=\"Supplier_Name_FO\" Derived=\"true\">WAREHOUSE MANAGEMENT SYSTEM</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_HEIGHT_SRC_CODE\" Derived=\"true\">C||V|D</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_UOM\" Derived=\"true\">EA||CA|PT</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_PROD_LENGTH\" Derived=\"true\">6.640||13.250|51.000</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_UOM3_DESC\" Derived=\"true\">PALLET</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_PROD_WEIGHT\" Derived=\"true\">9.166||55.000|2309.832</Value>\r\n" + 
				"          <Value AttributeID=\"Supplier_Name\" Derived=\"true\">IPS CORPORATION</Value>\r\n" + 
				"          <Value AttributeID=\"ParentReference\" Derived=\"true\">&lt;ACCENT/&gt;webfolder-2623</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_UOM2_DESC\" Derived=\"true\">CASE</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_UOM0_DESC\" Derived=\"true\">EACH</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_PPQ_SRC_CODE\" Derived=\"true\">V||V|C</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_PROD_HEIGHT\" Derived=\"true\">6.640||10.500|47.000</Value>\r\n" + 
				"          <Value AttributeID=\"ParentFOLReferencebyName\" Derived=\"true\">&lt;ACCENT/&gt;Pipe Primer &amp; Cleaner</Value>\r\n" + 
				"        </Values>\r\n" + 
				"      </Product>\r\n" + 
				"      <Product ID=\"Fulfill-1843354\" UserTypeID=\"Fulfillment Option\">\r\n" + 
				"        <Name>IPSWELDON I10221 1G PVC PURP PRMR P70</Name>\r\n" + 
				"        <Values>\r\n" + 
				"          <Value AttributeID=\"MPV_PPQ3\">252</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_MP_VENDOR_ID\">500</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_UPC\">012181102213</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_WEIGHT.SRC0\" ID=\"Vendor\">V</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_PPQ.SRC3\" ID=\"Calculated\">C</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_WIDTH0\">6.640</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_HEIGHT.SRC0\" ID=\"Calculated\">C</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_WIDTH.SRC0\" ID=\"Calculated\">C</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_UOM0\" ID=\"EA\">EA</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_UPC_QUAL\">UD</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_UOM1\" ID=\"IP\">IP</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_PPQ.SRC1\" ID=\"Vendor\">V</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_HEIGHT0\">6.640</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_WEIGHT0\">9.166</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_UOM2\" ID=\"CA\">CA</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_PPQ.SRC2\" ID=\"Vendor\">V</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_S_MP.VENDOR\">1324222*500</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_PPQ0\">1</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_UOM3\" ID=\"PT\">PT</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_PPQ1\">1</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_LENGTH0\">6.640</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_LENGTH.SRC0\" ID=\"Calculated\">C</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_MFG_PART_NUM\">10221</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_PPQ2\">6</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_INFO_DELETED_FLAG\" ID=\"0\">N</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_PPQ.SRC0\" ID=\"Vendor\">V</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_PPQ\" Derived=\"true\">1|1|6|252</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_PROD_WIDTH\" Derived=\"true\">6.640|||</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_WIDTH_SRC_CODE\" Derived=\"true\">C|||</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_WEIGHT_SRC_CODE\" Derived=\"true\">V|||</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_PACK_LEVEL_IND\" Derived=\"true\">|||</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_LENGTH_SRC_CODE\" Derived=\"true\">C|||</Value>\r\n" + 
				"          <Value AttributeID=\"PubSub_Revision\" Derived=\"true\">v0.6 (2018-09-02 15:11:24)</Value>\r\n" + 
				"          <Value AttributeID=\"Supplier_Name_FO\" Derived=\"true\">IPS CORPORATION</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_HEIGHT_SRC_CODE\" Derived=\"true\">C|||</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_UOM\" Derived=\"true\">EA|IP|CA|PT</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_PROD_LENGTH\" Derived=\"true\">6.640|||</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_UOM3_DESC\" Derived=\"true\">PALLET</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_PROD_WEIGHT\" Derived=\"true\">9.166|||</Value>\r\n" + 
				"          <Value AttributeID=\"Supplier_Name\" Derived=\"true\">IPS CORPORATION</Value>\r\n" + 
				"          <Value AttributeID=\"ParentReference\" Derived=\"true\">&lt;ACCENT/&gt;webfolder-2623</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_UOM2_DESC\" Derived=\"true\">CASE</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_UOM0_DESC\" Derived=\"true\">EACH</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_PPQ_SRC_CODE\" Derived=\"true\">V|V|V|C</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_UOM1_DESC\" Derived=\"true\">INNER PACK</Value>\r\n" + 
				"          <Value AttributeID=\"MPV_PROD_HEIGHT\" Derived=\"true\">6.640|||</Value>\r\n" + 
				"          <Value AttributeID=\"ParentFOLReferencebyName\" Derived=\"true\">&lt;ACCENT/&gt;Pipe Primer &amp; Cleaner</Value>\r\n" + 
				"        </Values>\r\n" + 
				"      </Product>\r\n" + 
				"    </Product>\r\n" + 
				"  </Products>\r\n" + 
				"</STEP-ProductInformation>";
		
		return payload;
	}

}
