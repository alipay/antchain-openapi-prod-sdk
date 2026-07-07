// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class CertProductInfoDO extends TeaModel {
    // 同证书信息显示
    /**
     * <strong>example:</strong>
     * <p>证书编号</p>
     */
    @NameInMap("certification_no")
    @Validation(required = true)
    public String certificationNo;

    // 同证书信息显示
    /**
     * <strong>example:</strong>
     * <p>证书类型</p>
     */
    @NameInMap("certification_type")
    @Validation(required = true)
    public String certificationType;

    // 同证书信息显示
    /**
     * <strong>example:</strong>
     * <p>证书名称</p>
     */
    @NameInMap("certification_name")
    @Validation(required = true)
    public String certificationName;

    // 同证书信息显示
    /**
     * <strong>example:</strong>
     * <p>认证机构名称</p>
     */
    @NameInMap("authentication_name")
    @Validation(required = true)
    public String authenticationName;

    // 证书颁发时间
    /**
     * <strong>example:</strong>
     * <p>2022-01-01</p>
     */
    @NameInMap("issue_time")
    @Validation(required = true)
    public String issueTime;

    // 证书到期时间
    /**
     * <strong>example:</strong>
     * <p>2020-01-01</p>
     */
    @NameInMap("invalid_time")
    @Validation(required = true)
    public String invalidTime;

    // 同证书信息显示
    /**
     * <strong>example:</strong>
     * <p>认证委托人</p>
     */
    @NameInMap("certification_agent")
    @Validation(required = true)
    public String certificationAgent;

    // 同证书信息显示
    /**
     * <strong>example:</strong>
     * <p>制造商</p>
     */
    @NameInMap("manufacturer")
    public String manufacturer;

    // 同证书信息显示
    /**
     * <strong>example:</strong>
     * <p>生产厂商</p>
     */
    @NameInMap("cproduct_firm")
    public String cproductFirm;

    // 同证书信息显示
    /**
     * <strong>example:</strong>
     * <p>认证等级</p>
     */
    @NameInMap("certification_level")
    public String certificationLevel;

    // 同证书信息显示
    /**
     * <strong>example:</strong>
     * <p>产品名称</p>
     */
    @NameInMap("cproduct_name")
    public String cproductName;

    // 同证书信息显示
    /**
     * <strong>example:</strong>
     * <p>产品型号</p>
     */
    @NameInMap("cproduct_model")
    public String cproductModel;

    // 证书文件地址
    /**
     * <strong>example:</strong>
     * <p>https://</p>
     */
    @NameInMap("certification_file_address")
    @Validation(required = true)
    public String certificationFileAddress;

    // 证书授权的三方平台产品列表
    @NameInMap("auth_products")
    public java.util.List<CertProductAuthDO> authProducts;

    public static CertProductInfoDO build(java.util.Map<String, ?> map) throws Exception {
        CertProductInfoDO self = new CertProductInfoDO();
        return TeaModel.build(map, self);
    }

    public CertProductInfoDO setCertificationNo(String certificationNo) {
        this.certificationNo = certificationNo;
        return this;
    }
    public String getCertificationNo() {
        return this.certificationNo;
    }

    public CertProductInfoDO setCertificationType(String certificationType) {
        this.certificationType = certificationType;
        return this;
    }
    public String getCertificationType() {
        return this.certificationType;
    }

    public CertProductInfoDO setCertificationName(String certificationName) {
        this.certificationName = certificationName;
        return this;
    }
    public String getCertificationName() {
        return this.certificationName;
    }

    public CertProductInfoDO setAuthenticationName(String authenticationName) {
        this.authenticationName = authenticationName;
        return this;
    }
    public String getAuthenticationName() {
        return this.authenticationName;
    }

    public CertProductInfoDO setIssueTime(String issueTime) {
        this.issueTime = issueTime;
        return this;
    }
    public String getIssueTime() {
        return this.issueTime;
    }

    public CertProductInfoDO setInvalidTime(String invalidTime) {
        this.invalidTime = invalidTime;
        return this;
    }
    public String getInvalidTime() {
        return this.invalidTime;
    }

    public CertProductInfoDO setCertificationAgent(String certificationAgent) {
        this.certificationAgent = certificationAgent;
        return this;
    }
    public String getCertificationAgent() {
        return this.certificationAgent;
    }

    public CertProductInfoDO setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }
    public String getManufacturer() {
        return this.manufacturer;
    }

    public CertProductInfoDO setCproductFirm(String cproductFirm) {
        this.cproductFirm = cproductFirm;
        return this;
    }
    public String getCproductFirm() {
        return this.cproductFirm;
    }

    public CertProductInfoDO setCertificationLevel(String certificationLevel) {
        this.certificationLevel = certificationLevel;
        return this;
    }
    public String getCertificationLevel() {
        return this.certificationLevel;
    }

    public CertProductInfoDO setCproductName(String cproductName) {
        this.cproductName = cproductName;
        return this;
    }
    public String getCproductName() {
        return this.cproductName;
    }

    public CertProductInfoDO setCproductModel(String cproductModel) {
        this.cproductModel = cproductModel;
        return this;
    }
    public String getCproductModel() {
        return this.cproductModel;
    }

    public CertProductInfoDO setCertificationFileAddress(String certificationFileAddress) {
        this.certificationFileAddress = certificationFileAddress;
        return this;
    }
    public String getCertificationFileAddress() {
        return this.certificationFileAddress;
    }

    public CertProductInfoDO setAuthProducts(java.util.List<CertProductAuthDO> authProducts) {
        this.authProducts = authProducts;
        return this;
    }
    public java.util.List<CertProductAuthDO> getAuthProducts() {
        return this.authProducts;
    }

}
