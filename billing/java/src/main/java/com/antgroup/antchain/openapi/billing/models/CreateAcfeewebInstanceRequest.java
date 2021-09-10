// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.billing.models;

import com.aliyun.tea.*;

public class CreateAcfeewebInstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 出账验证主键id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

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

    public static CreateAcfeewebInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAcfeewebInstanceRequest self = new CreateAcfeewebInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateAcfeewebInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAcfeewebInstanceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateAcfeewebInstanceRequest setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

    public CreateAcfeewebInstanceRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateAcfeewebInstanceRequest setDomainVersion(String domainVersion) {
        this.domainVersion = domainVersion;
        return this;
    }
    public String getDomainVersion() {
        return this.domainVersion;
    }

    public CreateAcfeewebInstanceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CreateAcfeewebInstanceRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public CreateAcfeewebInstanceRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public CreateAcfeewebInstanceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public CreateAcfeewebInstanceRequest setOfferCode(String offerCode) {
        this.offerCode = offerCode;
        return this;
    }
    public String getOfferCode() {
        return this.offerCode;
    }

    public CreateAcfeewebInstanceRequest setOfferName(String offerName) {
        this.offerName = offerName;
        return this;
    }
    public String getOfferName() {
        return this.offerName;
    }

    public CreateAcfeewebInstanceRequest setOmsData(String omsData) {
        this.omsData = omsData;
        return this;
    }
    public String getOmsData() {
        return this.omsData;
    }

    public CreateAcfeewebInstanceRequest setOmsBizNo(String omsBizNo) {
        this.omsBizNo = omsBizNo;
        return this;
    }
    public String getOmsBizNo() {
        return this.omsBizNo;
    }

    public CreateAcfeewebInstanceRequest setVerificationCache(String verificationCache) {
        this.verificationCache = verificationCache;
        return this;
    }
    public String getVerificationCache() {
        return this.verificationCache;
    }

    public CreateAcfeewebInstanceRequest setVerificationUrl(String verificationUrl) {
        this.verificationUrl = verificationUrl;
        return this;
    }
    public String getVerificationUrl() {
        return this.verificationUrl;
    }

    public CreateAcfeewebInstanceRequest setBpmsId(String bpmsId) {
        this.bpmsId = bpmsId;
        return this;
    }
    public String getBpmsId() {
        return this.bpmsId;
    }

    public CreateAcfeewebInstanceRequest setConfigData(String configData) {
        this.configData = configData;
        return this;
    }
    public String getConfigData() {
        return this.configData;
    }

    public CreateAcfeewebInstanceRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateAcfeewebInstanceRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public CreateAcfeewebInstanceRequest setModifor(String modifor) {
        this.modifor = modifor;
        return this;
    }
    public String getModifor() {
        return this.modifor;
    }

}
