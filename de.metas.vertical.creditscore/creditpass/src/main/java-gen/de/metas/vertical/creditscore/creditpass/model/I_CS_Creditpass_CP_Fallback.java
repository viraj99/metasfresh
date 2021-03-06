package de.metas.vertical.creditscore.creditpass.model;


/** Generated Interface for CS_Creditpass_CP_Fallback
 *  @author Adempiere (generated) 
 */
@SuppressWarnings("javadoc")
public interface I_CS_Creditpass_CP_Fallback 
{

    /** TableName=CS_Creditpass_CP_Fallback */
    public static final String Table_Name = "CS_Creditpass_CP_Fallback";

    /** AD_Table_ID=541336 */
//    public static final int Table_ID = org.compiere.model.MTable.getTable_ID(Table_Name);

//    org.compiere.util.KeyNamePair Model = new org.compiere.util.KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org
     */
//    java.math.BigDecimal accessLevel = java.math.BigDecimal.valueOf(3);

    /** Load Meta Data */

	/**
	 * Get Mandant.
	 * Mandant für diese Installation.
	 *
	 * <br>Type: TableDir
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public int getAD_Client_ID();

	public org.compiere.model.I_AD_Client getAD_Client();

    /** Column definition for AD_Client_ID */
    public static final org.adempiere.model.ModelColumn<I_CS_Creditpass_CP_Fallback, org.compiere.model.I_AD_Client> COLUMN_AD_Client_ID = new org.adempiere.model.ModelColumn<I_CS_Creditpass_CP_Fallback, org.compiere.model.I_AD_Client>(I_CS_Creditpass_CP_Fallback.class, "AD_Client_ID", org.compiere.model.I_AD_Client.class);
    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/**
	 * Set Sektion.
	 * Organisatorische Einheit des Mandanten
	 *
	 * <br>Type: TableDir
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public void setAD_Org_ID (int AD_Org_ID);

	/**
	 * Get Sektion.
	 * Organisatorische Einheit des Mandanten
	 *
	 * <br>Type: TableDir
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public int getAD_Org_ID();

	public org.compiere.model.I_AD_Org getAD_Org();

	public void setAD_Org(org.compiere.model.I_AD_Org AD_Org);

    /** Column definition for AD_Org_ID */
    public static final org.adempiere.model.ModelColumn<I_CS_Creditpass_CP_Fallback, org.compiere.model.I_AD_Org> COLUMN_AD_Org_ID = new org.adempiere.model.ModelColumn<I_CS_Creditpass_CP_Fallback, org.compiere.model.I_AD_Org>(I_CS_Creditpass_CP_Fallback.class, "AD_Org_ID", org.compiere.model.I_AD_Org.class);
    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/**
	 * Get Erstellt.
	 * Datum, an dem dieser Eintrag erstellt wurde
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public java.sql.Timestamp getCreated();

    /** Column definition for Created */
    public static final org.adempiere.model.ModelColumn<I_CS_Creditpass_CP_Fallback, Object> COLUMN_Created = new org.adempiere.model.ModelColumn<I_CS_Creditpass_CP_Fallback, Object>(I_CS_Creditpass_CP_Fallback.class, "Created", null);
    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/**
	 * Get Erstellt durch.
	 * Nutzer, der diesen Eintrag erstellt hat
	 *
	 * <br>Type: Table
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public int getCreatedBy();

    /** Column definition for CreatedBy */
    public static final org.adempiere.model.ModelColumn<I_CS_Creditpass_CP_Fallback, org.compiere.model.I_AD_User> COLUMN_CreatedBy = new org.adempiere.model.ModelColumn<I_CS_Creditpass_CP_Fallback, org.compiere.model.I_AD_User>(I_CS_Creditpass_CP_Fallback.class, "CreatedBy", org.compiere.model.I_AD_User.class);
    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/**
	 * Set CS Creditpass Configuration payment rule.
	 *
	 * <br>Type: TableDir
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public void setCS_Creditpass_Config_PaymentRule_ID (int CS_Creditpass_Config_PaymentRule_ID);

	/**
	 * Get CS Creditpass Configuration payment rule.
	 *
	 * <br>Type: TableDir
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public int getCS_Creditpass_Config_PaymentRule_ID();

	public de.metas.vertical.creditscore.creditpass.model.I_CS_Creditpass_Config_PaymentRule getCS_Creditpass_Config_PaymentRule();

	public void setCS_Creditpass_Config_PaymentRule(de.metas.vertical.creditscore.creditpass.model.I_CS_Creditpass_Config_PaymentRule CS_Creditpass_Config_PaymentRule);

    /** Column definition for CS_Creditpass_Config_PaymentRule_ID */
    public static final org.adempiere.model.ModelColumn<I_CS_Creditpass_CP_Fallback, de.metas.vertical.creditscore.creditpass.model.I_CS_Creditpass_Config_PaymentRule> COLUMN_CS_Creditpass_Config_PaymentRule_ID = new org.adempiere.model.ModelColumn<I_CS_Creditpass_CP_Fallback, de.metas.vertical.creditscore.creditpass.model.I_CS_Creditpass_Config_PaymentRule>(I_CS_Creditpass_CP_Fallback.class, "CS_Creditpass_Config_PaymentRule_ID", de.metas.vertical.creditscore.creditpass.model.I_CS_Creditpass_Config_PaymentRule.class);
    /** Column name CS_Creditpass_Config_PaymentRule_ID */
    public static final String COLUMNNAME_CS_Creditpass_Config_PaymentRule_ID = "CS_Creditpass_Config_PaymentRule_ID";

	/**
	 * Set CS Creditpass Configuration payment rule fallback.
	 *
	 * <br>Type: ID
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public void setCS_Creditpass_CP_Fallback_ID (int CS_Creditpass_CP_Fallback_ID);

	/**
	 * Get CS Creditpass Configuration payment rule fallback.
	 *
	 * <br>Type: ID
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public int getCS_Creditpass_CP_Fallback_ID();

    /** Column definition for CS_Creditpass_CP_Fallback_ID */
    public static final org.adempiere.model.ModelColumn<I_CS_Creditpass_CP_Fallback, Object> COLUMN_CS_Creditpass_CP_Fallback_ID = new org.adempiere.model.ModelColumn<I_CS_Creditpass_CP_Fallback, Object>(I_CS_Creditpass_CP_Fallback.class, "CS_Creditpass_CP_Fallback_ID", null);
    /** Column name CS_Creditpass_CP_Fallback_ID */
    public static final String COLUMNNAME_CS_Creditpass_CP_Fallback_ID = "CS_Creditpass_CP_Fallback_ID";

	/**
	 * Set Zahlart Rückgriff.
	 *
	 * <br>Type: List
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	public void setFallbackPaymentRule (java.lang.String FallbackPaymentRule);

	/**
	 * Get Zahlart Rückgriff.
	 *
	 * <br>Type: List
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	public java.lang.String getFallbackPaymentRule();

    /** Column definition for FallbackPaymentRule */
    public static final org.adempiere.model.ModelColumn<I_CS_Creditpass_CP_Fallback, Object> COLUMN_FallbackPaymentRule = new org.adempiere.model.ModelColumn<I_CS_Creditpass_CP_Fallback, Object>(I_CS_Creditpass_CP_Fallback.class, "FallbackPaymentRule", null);
    /** Column name FallbackPaymentRule */
    public static final String COLUMNNAME_FallbackPaymentRule = "FallbackPaymentRule";

	/**
	 * Set Aktiv.
	 * Der Eintrag ist im System aktiv
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public void setIsActive (boolean IsActive);

	/**
	 * Get Aktiv.
	 * Der Eintrag ist im System aktiv
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public boolean isActive();

    /** Column definition for IsActive */
    public static final org.adempiere.model.ModelColumn<I_CS_Creditpass_CP_Fallback, Object> COLUMN_IsActive = new org.adempiere.model.ModelColumn<I_CS_Creditpass_CP_Fallback, Object>(I_CS_Creditpass_CP_Fallback.class, "IsActive", null);
    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/**
	 * Get Aktualisiert.
	 * Datum, an dem dieser Eintrag aktualisiert wurde
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public java.sql.Timestamp getUpdated();

    /** Column definition for Updated */
    public static final org.adempiere.model.ModelColumn<I_CS_Creditpass_CP_Fallback, Object> COLUMN_Updated = new org.adempiere.model.ModelColumn<I_CS_Creditpass_CP_Fallback, Object>(I_CS_Creditpass_CP_Fallback.class, "Updated", null);
    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/**
	 * Get Aktualisiert durch.
	 * Nutzer, der diesen Eintrag aktualisiert hat
	 *
	 * <br>Type: Table
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public int getUpdatedBy();

    /** Column definition for UpdatedBy */
    public static final org.adempiere.model.ModelColumn<I_CS_Creditpass_CP_Fallback, org.compiere.model.I_AD_User> COLUMN_UpdatedBy = new org.adempiere.model.ModelColumn<I_CS_Creditpass_CP_Fallback, org.compiere.model.I_AD_User>(I_CS_Creditpass_CP_Fallback.class, "UpdatedBy", org.compiere.model.I_AD_User.class);
    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";
}
