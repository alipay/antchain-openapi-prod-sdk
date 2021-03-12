// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CheckOpenchainCorporateFaceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业名称
    @NameInMap("ep_cert_name")
    @Validation(required = true)
    public String epCertName;

    // 企业证件
    @NameInMap("ep_cert_no")
    @Validation(required = true)
    public String epCertNo;

    // 企业证件类型（NATIONAL_LEGAL（工商注册号）或 NATIONAL_LEGAL_MERGE （ 社会统一信用代码））
    @NameInMap("ep_cert_type")
    @Validation(required = true)
    public String epCertType;

    // 企业法人名称
    @NameInMap("legal_person_cert_name")
    @Validation(required = true)
    public String legalPersonCertName;

    // 法人身份证号
    @NameInMap("legal_person_cert_no")
    @Validation(required = true)
    public String legalPersonCertNo;

    // 商户code
    @NameInMap("merchant_code")
    @Validation(required = true)
    public String merchantCode;

    // 店铺描述
    @NameInMap("shop_desc")
    public String shopDesc;

    // 店铺图片地址
    @NameInMap("shop_sit_image")
    public String shopSitImage;

    // 店铺url地址
    @NameInMap("shop_web_url")
    public String shopWebUrl;

    // 租户code
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 网站id，为网站产品唯一标识
    @NameInMap("web_sit_id")
    @Validation(required = true)
    public String webSitId;

    // 网站域名
    @NameInMap("web_sit_url")
    @Validation(required = true)
    public String webSitUrl;

    public static CheckOpenchainCorporateFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckOpenchainCorporateFaceRequest self = new CheckOpenchainCorporateFaceRequest();
        return TeaModel.build(map, self);
    }

    public CheckOpenchainCorporateFaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckOpenchainCorporateFaceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckOpenchainCorporateFaceRequest setEpCertName(String epCertName) {
        this.epCertName = epCertName;
        return this;
    }
    public String getEpCertName() {
        return this.epCertName;
    }

    public CheckOpenchainCorporateFaceRequest setEpCertNo(String epCertNo) {
        this.epCertNo = epCertNo;
        return this;
    }
    public String getEpCertNo() {
        return this.epCertNo;
    }

    public CheckOpenchainCorporateFaceRequest setEpCertType(String epCertType) {
        this.epCertType = epCertType;
        return this;
    }
    public String getEpCertType() {
        return this.epCertType;
    }

    public CheckOpenchainCorporateFaceRequest setLegalPersonCertName(String legalPersonCertName) {
        this.legalPersonCertName = legalPersonCertName;
        return this;
    }
    public String getLegalPersonCertName() {
        return this.legalPersonCertName;
    }

    public CheckOpenchainCorporateFaceRequest setLegalPersonCertNo(String legalPersonCertNo) {
        this.legalPersonCertNo = legalPersonCertNo;
        return this;
    }
    public String getLegalPersonCertNo() {
        return this.legalPersonCertNo;
    }

    public CheckOpenchainCorporateFaceRequest setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
        return this;
    }
    public String getMerchantCode() {
        return this.merchantCode;
    }

    public CheckOpenchainCorporateFaceRequest setShopDesc(String shopDesc) {
        this.shopDesc = shopDesc;
        return this;
    }
    public String getShopDesc() {
        return this.shopDesc;
    }

    public CheckOpenchainCorporateFaceRequest setShopSitImage(String shopSitImage) {
        this.shopSitImage = shopSitImage;
        return this;
    }
    public String getShopSitImage() {
        return this.shopSitImage;
    }

    public CheckOpenchainCorporateFaceRequest setShopWebUrl(String shopWebUrl) {
        this.shopWebUrl = shopWebUrl;
        return this;
    }
    public String getShopWebUrl() {
        return this.shopWebUrl;
    }

    public CheckOpenchainCorporateFaceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CheckOpenchainCorporateFaceRequest setWebSitId(String webSitId) {
        this.webSitId = webSitId;
        return this;
    }
    public String getWebSitId() {
        return this.webSitId;
    }

    public CheckOpenchainCorporateFaceRequest setWebSitUrl(String webSitUrl) {
        this.webSitUrl = webSitUrl;
        return this;
    }
    public String getWebSitUrl() {
        return this.webSitUrl;
    }

}
