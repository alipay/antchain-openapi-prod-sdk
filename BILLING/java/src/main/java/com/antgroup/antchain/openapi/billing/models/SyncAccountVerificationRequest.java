// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.billing.models;

import com.aliyun.tea.*;

public class SyncAccountVerificationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 出账验证主键id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 计量域code
    @NameInMap("domain_code")
    @Validation(required = true)
    public String domainCode;

    // 计量域名称
    @NameInMap("domain_name")
    @Validation(required = true)
    public String domainName;

    // 计量域版本
    @NameInMap("domain_version")
    @Validation(required = true)
    public String domainVersion;

    // 业务产品code
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 业务产品名称
    @NameInMap("product_name")
    @Validation(required = true)
    public String productName;

    // 渠道产品code
    @NameInMap("service_code")
    @Validation(required = true)
    public String serviceCode;

    // 渠道产品名称
    @NameInMap("service_name")
    @Validation(required = true)
    public String serviceName;

    // 商品code
    @NameInMap("offer_code")
    @Validation(required = true)
    public String offerCode;

    // 商品名称
    @NameInMap("offer_name")
    @Validation(required = true)
    public String offerName;

    // 验证的计量数据
    @NameInMap("oms_data")
    @Validation(required = true)
    public String omsData;

    // 计量数据业务幂等号
    @NameInMap("oms_biz_no")
    @Validation(required = true)
    public String omsBizNo;

    // 缓存报文
    @NameInMap("verification_cache")
    @Validation(required = true)
    public String verificationCache;

    // 缓存链接
    @NameInMap("verification_url")
    @Validation(required = true)
    public String verificationUrl;

    // 审批流id
    @NameInMap("bpms_id")
    @Validation(required = true)
    public String bpmsId;

    // 配置报文
    @NameInMap("config_data")
    @Validation(required = true)
    public String configData;

    // 状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 创建人
    @NameInMap("creator")
    @Validation(required = true)
    public String creator;

    // 修改人
    @NameInMap("modifor")
    @Validation(required = true)
    public String modifor;

    public static SyncAccountVerificationRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncAccountVerificationRequest self = new SyncAccountVerificationRequest();
        return TeaModel.build(map, self);
    }

    public SyncAccountVerificationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncAccountVerificationRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SyncAccountVerificationRequest setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

    public SyncAccountVerificationRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SyncAccountVerificationRequest setDomainVersion(String domainVersion) {
        this.domainVersion = domainVersion;
        return this;
    }
    public String getDomainVersion() {
        return this.domainVersion;
    }

    public SyncAccountVerificationRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public SyncAccountVerificationRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public SyncAccountVerificationRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public SyncAccountVerificationRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public SyncAccountVerificationRequest setOfferCode(String offerCode) {
        this.offerCode = offerCode;
        return this;
    }
    public String getOfferCode() {
        return this.offerCode;
    }

    public SyncAccountVerificationRequest setOfferName(String offerName) {
        this.offerName = offerName;
        return this;
    }
    public String getOfferName() {
        return this.offerName;
    }

    public SyncAccountVerificationRequest setOmsData(String omsData) {
        this.omsData = omsData;
        return this;
    }
    public String getOmsData() {
        return this.omsData;
    }

    public SyncAccountVerificationRequest setOmsBizNo(String omsBizNo) {
        this.omsBizNo = omsBizNo;
        return this;
    }
    public String getOmsBizNo() {
        return this.omsBizNo;
    }

    public SyncAccountVerificationRequest setVerificationCache(String verificationCache) {
        this.verificationCache = verificationCache;
        return this;
    }
    public String getVerificationCache() {
        return this.verificationCache;
    }

    public SyncAccountVerificationRequest setVerificationUrl(String verificationUrl) {
        this.verificationUrl = verificationUrl;
        return this;
    }
    public String getVerificationUrl() {
        return this.verificationUrl;
    }

    public SyncAccountVerificationRequest setBpmsId(String bpmsId) {
        this.bpmsId = bpmsId;
        return this;
    }
    public String getBpmsId() {
        return this.bpmsId;
    }

    public SyncAccountVerificationRequest setConfigData(String configData) {
        this.configData = configData;
        return this;
    }
    public String getConfigData() {
        return this.configData;
    }

    public SyncAccountVerificationRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SyncAccountVerificationRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public SyncAccountVerificationRequest setModifor(String modifor) {
        this.modifor = modifor;
        return this;
    }
    public String getModifor() {
        return this.modifor;
    }

}
