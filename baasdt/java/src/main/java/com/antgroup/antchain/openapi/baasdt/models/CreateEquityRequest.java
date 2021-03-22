// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CreateEquityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权类型 0 Auto，1Contract
    @NameInMap("auth_type")
    @Validation(required = true)
    public Long authType;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 结算币种
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    // 权益价格（单位：元）
    @NameInMap("default_price")
    @Validation(required = true)
    public String defaultPrice;

    // 代理操作专用，要代理操作的租户ID
    @NameInMap("delegated_tenant_id")
    public String delegatedTenantId;

    // 权益商品详情信息
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 权益商品详情图。上传仅接受链接，请使用OSS存储服务上传图片(;分隔)
    @NameInMap("desc_images")
    @Validation(required = true)
    public String descImages;

    // 权益商品名称
    @NameInMap("equity_name")
    @Validation(required = true)
    public String equityName;

    // 权益商品类型：类型为整型（不大于：2147483647），需要进行细分，类型由三部分组成；aabbbbcccc。aa 为大类分类，bbbb 为细项分类（无细项分类时为0000），cccc 为数据格式分类（其中0000表示无格式要求）。请根据实际商品类型填写，具体类型和兑换时数据结构查看文档【https://tech.antfin.com/docs/2/163896】 。不可修改，如需修改需重新发布商品
    @NameInMap("equity_type")
    @Validation(required = true)
    public Long equityType;

    // 字段决定权益商品是否全量链上客户可见，当选择权益为false时，需要使用baas.antdao.equity.merchant.open接口增加权益商品可见客户
    @NameInMap("if_public")
    @Validation(required = true)
    public Boolean ifPublic;

    // 权益商品主图。上传仅接受链接，请使用OSS存储服务上传图片(;分隔)
    @NameInMap("images")
    @Validation(required = true)
    public String images;

    // 商户每日兑换上限
    @NameInMap("limit_per_merchant_and_day")
    @Validation(required = true)
    public Long limitPerMerchantAndDay;

    // 商户每月兑换上限
    @NameInMap("limit_per_merchant_and_month")
    @Validation(required = true)
    public Long limitPerMerchantAndMonth;

    // 用户每日兑换上限
    @NameInMap("limit_per_user_and_day")
    @Validation(required = true)
    public Long limitPerUserAndDay;

    // 用户每月兑换上限
    @NameInMap("limit_per_user_and_month")
    @Validation(required = true)
    public Long limitPerUserAndMonth;

    // 若需要兑换方提供的特殊信息，可增加在备注字段，并要求兑换方是否传入（按照需求方自定义内容信息）
    // - 如必须传入证件号，手机号信息，则权益需要通过运营平台审核，非必须采集信息将拒绝上架
    @NameInMap("memo")
    public String memo;

    // 外部交易ID
    @NameInMap("out_tx_id")
    @Validation(required = true)
    public String outTxId;

    // 权益商品库存数量
    @NameInMap("total_count")
    @Validation(required = true)
    public String totalCount;

    // 权益商品使用有效期结束时间（毫秒）
    @NameInMap("use_valid_not_after")
    @Validation(required = true)
    public Long useValidNotAfter;

    // 权益商品使用有效期开始时间（毫秒）
    @NameInMap("use_valid_not_before")
    @Validation(required = true)
    public Long useValidNotBefore;

    // 权益商品兑换有效期结束时间（毫秒）
    @NameInMap("valid_not_after")
    @Validation(required = true)
    public Long validNotAfter;

    // 权益商品兑换有效期开始时间（毫秒）
    @NameInMap("valid_not_before")
    @Validation(required = true)
    public Long validNotBefore;

    // 权益商品面值（单位：元）
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static CreateEquityRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEquityRequest self = new CreateEquityRequest();
        return TeaModel.build(map, self);
    }

    public CreateEquityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateEquityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateEquityRequest setAuthType(Long authType) {
        this.authType = authType;
        return this;
    }
    public Long getAuthType() {
        return this.authType;
    }

    public CreateEquityRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public CreateEquityRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public CreateEquityRequest setDefaultPrice(String defaultPrice) {
        this.defaultPrice = defaultPrice;
        return this;
    }
    public String getDefaultPrice() {
        return this.defaultPrice;
    }

    public CreateEquityRequest setDelegatedTenantId(String delegatedTenantId) {
        this.delegatedTenantId = delegatedTenantId;
        return this;
    }
    public String getDelegatedTenantId() {
        return this.delegatedTenantId;
    }

    public CreateEquityRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEquityRequest setDescImages(String descImages) {
        this.descImages = descImages;
        return this;
    }
    public String getDescImages() {
        return this.descImages;
    }

    public CreateEquityRequest setEquityName(String equityName) {
        this.equityName = equityName;
        return this;
    }
    public String getEquityName() {
        return this.equityName;
    }

    public CreateEquityRequest setEquityType(Long equityType) {
        this.equityType = equityType;
        return this;
    }
    public Long getEquityType() {
        return this.equityType;
    }

    public CreateEquityRequest setIfPublic(Boolean ifPublic) {
        this.ifPublic = ifPublic;
        return this;
    }
    public Boolean getIfPublic() {
        return this.ifPublic;
    }

    public CreateEquityRequest setImages(String images) {
        this.images = images;
        return this;
    }
    public String getImages() {
        return this.images;
    }

    public CreateEquityRequest setLimitPerMerchantAndDay(Long limitPerMerchantAndDay) {
        this.limitPerMerchantAndDay = limitPerMerchantAndDay;
        return this;
    }
    public Long getLimitPerMerchantAndDay() {
        return this.limitPerMerchantAndDay;
    }

    public CreateEquityRequest setLimitPerMerchantAndMonth(Long limitPerMerchantAndMonth) {
        this.limitPerMerchantAndMonth = limitPerMerchantAndMonth;
        return this;
    }
    public Long getLimitPerMerchantAndMonth() {
        return this.limitPerMerchantAndMonth;
    }

    public CreateEquityRequest setLimitPerUserAndDay(Long limitPerUserAndDay) {
        this.limitPerUserAndDay = limitPerUserAndDay;
        return this;
    }
    public Long getLimitPerUserAndDay() {
        return this.limitPerUserAndDay;
    }

    public CreateEquityRequest setLimitPerUserAndMonth(Long limitPerUserAndMonth) {
        this.limitPerUserAndMonth = limitPerUserAndMonth;
        return this;
    }
    public Long getLimitPerUserAndMonth() {
        return this.limitPerUserAndMonth;
    }

    public CreateEquityRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public CreateEquityRequest setOutTxId(String outTxId) {
        this.outTxId = outTxId;
        return this;
    }
    public String getOutTxId() {
        return this.outTxId;
    }

    public CreateEquityRequest setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public CreateEquityRequest setUseValidNotAfter(Long useValidNotAfter) {
        this.useValidNotAfter = useValidNotAfter;
        return this;
    }
    public Long getUseValidNotAfter() {
        return this.useValidNotAfter;
    }

    public CreateEquityRequest setUseValidNotBefore(Long useValidNotBefore) {
        this.useValidNotBefore = useValidNotBefore;
        return this;
    }
    public Long getUseValidNotBefore() {
        return this.useValidNotBefore;
    }

    public CreateEquityRequest setValidNotAfter(Long validNotAfter) {
        this.validNotAfter = validNotAfter;
        return this;
    }
    public Long getValidNotAfter() {
        return this.validNotAfter;
    }

    public CreateEquityRequest setValidNotBefore(Long validNotBefore) {
        this.validNotBefore = validNotBefore;
        return this;
    }
    public Long getValidNotBefore() {
        return this.validNotBefore;
    }

    public CreateEquityRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
