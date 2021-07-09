// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateInternalTextRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 哈希算法，目前仅支持 SHA256
    @NameInMap("hash_algorithm")
    public String hashAlgorithm;

    // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
    @NameInMap("location")
    public Location location;

    // 存证内容
    @NameInMap("notary_content")
    @Validation(required = true)
    public String notaryContent;

    // 描述本条存证在存证事务中的阶段，用户可自行维护
    @NameInMap("phase")
    @Validation(required = true)
    public String phase;

    // 扩展属性
    @NameInMap("properties")
    public String properties;

    // 文本存证类型，支持源文本/文本哈希
    @NameInMap("text_notary_type")
    public String textNotaryType;

    // 存证事务id
    @NameInMap("transaction_id")
    @Validation(required = true)
    public String transactionId;

    // 是否使用可信时间戳，默认为false
    @NameInMap("tsr")
    public Boolean tsr;

    // 代理客户存证时，实际用户的租户ID
    @NameInMap("real_tenant")
    public String realTenant;

    // 授权码
    @NameInMap("auth_code")
    public String authCode;

    // 授权码对应产品码
    @NameInMap("product")
    public String product;

    // 版权文本存证支持hash存证
    @NameInMap("biz_category")
    public String bizCategory;

    public static CreateInternalTextRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInternalTextRequest self = new CreateInternalTextRequest();
        return TeaModel.build(map, self);
    }

    public CreateInternalTextRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateInternalTextRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateInternalTextRequest setHashAlgorithm(String hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
        return this;
    }
    public String getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public CreateInternalTextRequest setLocation(Location location) {
        this.location = location;
        return this;
    }
    public Location getLocation() {
        return this.location;
    }

    public CreateInternalTextRequest setNotaryContent(String notaryContent) {
        this.notaryContent = notaryContent;
        return this;
    }
    public String getNotaryContent() {
        return this.notaryContent;
    }

    public CreateInternalTextRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public CreateInternalTextRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public CreateInternalTextRequest setTextNotaryType(String textNotaryType) {
        this.textNotaryType = textNotaryType;
        return this;
    }
    public String getTextNotaryType() {
        return this.textNotaryType;
    }

    public CreateInternalTextRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

    public CreateInternalTextRequest setTsr(Boolean tsr) {
        this.tsr = tsr;
        return this;
    }
    public Boolean getTsr() {
        return this.tsr;
    }

    public CreateInternalTextRequest setRealTenant(String realTenant) {
        this.realTenant = realTenant;
        return this;
    }
    public String getRealTenant() {
        return this.realTenant;
    }

    public CreateInternalTextRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public CreateInternalTextRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public CreateInternalTextRequest setBizCategory(String bizCategory) {
        this.bizCategory = bizCategory;
        return this;
    }
    public String getBizCategory() {
        return this.bizCategory;
    }

}
