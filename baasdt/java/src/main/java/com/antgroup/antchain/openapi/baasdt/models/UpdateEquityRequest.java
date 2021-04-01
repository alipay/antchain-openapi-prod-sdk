// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class UpdateEquityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权类型：0 Auto，1 Contract。不可修改，如需修改需重新发布商品
    @NameInMap("auth_type")
    @Validation(required = true)
    public Long authType;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 货币类型。不可修改，如需修改需重新发布商品。
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    // 默认价格（单位：元）
    @NameInMap("default_price")
    @Validation(required = true)
    public String defaultPrice;

    // 要代理的租户ID
    @NameInMap("delegated_tenant_id")
    public String delegatedTenantId;

    // 权益商品详细描述信息
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 描述图片信息(;分隔)
    @NameInMap("desc_images")
    @Validation(required = true)
    public String descImages;

    // 权益商品ID
    @NameInMap("equity_id")
    @Validation(required = true)
    public String equityId;

    // 权益商品名称
    @NameInMap("equity_name")
    @Validation(required = true)
    public String equityName;

    // 权益商品类型：类型为整型（不大于：2147483647），需要进行细分，类型由三部分组成；aabbbbcccc。aa 为大类分类，bbbb 为细项分类（无细项分类时为0000），cccc 为数据格式分类（其中0000表示无格式要求）。请根据实际商品类型填写，具体类型和兑换时数据结构查看文档【https://tech.antfin.com/docs/2/163896】。不可修改，如需修改需重新发布商品
    @NameInMap("equity_type")
    @Validation(required = true)
    public Long equityType;

    // 权益商品是否公开。不可修改，如需修改需重新发布商品
    @NameInMap("if_public")
    @Validation(required = true)
    public Boolean ifPublic;

    // 主图片信息(;分隔)
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

    // 附言
    @NameInMap("memo")
    public String memo;

    // 交易ID
    @NameInMap("out_tx_id")
    @Validation(required = true)
    public String outTxId;

    // 库存
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

    // 面值（单位：元）。不可修改，如需修改需重新发布商品
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static UpdateEquityRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEquityRequest self = new UpdateEquityRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEquityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateEquityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateEquityRequest setAuthType(Long authType) {
        this.authType = authType;
        return this;
    }
    public Long getAuthType() {
        return this.authType;
    }

    public UpdateEquityRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public UpdateEquityRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public UpdateEquityRequest setDefaultPrice(String defaultPrice) {
        this.defaultPrice = defaultPrice;
        return this;
    }
    public String getDefaultPrice() {
        return this.defaultPrice;
    }

    public UpdateEquityRequest setDelegatedTenantId(String delegatedTenantId) {
        this.delegatedTenantId = delegatedTenantId;
        return this;
    }
    public String getDelegatedTenantId() {
        return this.delegatedTenantId;
    }

    public UpdateEquityRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateEquityRequest setDescImages(String descImages) {
        this.descImages = descImages;
        return this;
    }
    public String getDescImages() {
        return this.descImages;
    }

    public UpdateEquityRequest setEquityId(String equityId) {
        this.equityId = equityId;
        return this;
    }
    public String getEquityId() {
        return this.equityId;
    }

    public UpdateEquityRequest setEquityName(String equityName) {
        this.equityName = equityName;
        return this;
    }
    public String getEquityName() {
        return this.equityName;
    }

    public UpdateEquityRequest setEquityType(Long equityType) {
        this.equityType = equityType;
        return this;
    }
    public Long getEquityType() {
        return this.equityType;
    }

    public UpdateEquityRequest setIfPublic(Boolean ifPublic) {
        this.ifPublic = ifPublic;
        return this;
    }
    public Boolean getIfPublic() {
        return this.ifPublic;
    }

    public UpdateEquityRequest setImages(String images) {
        this.images = images;
        return this;
    }
    public String getImages() {
        return this.images;
    }

    public UpdateEquityRequest setLimitPerMerchantAndDay(Long limitPerMerchantAndDay) {
        this.limitPerMerchantAndDay = limitPerMerchantAndDay;
        return this;
    }
    public Long getLimitPerMerchantAndDay() {
        return this.limitPerMerchantAndDay;
    }

    public UpdateEquityRequest setLimitPerMerchantAndMonth(Long limitPerMerchantAndMonth) {
        this.limitPerMerchantAndMonth = limitPerMerchantAndMonth;
        return this;
    }
    public Long getLimitPerMerchantAndMonth() {
        return this.limitPerMerchantAndMonth;
    }

    public UpdateEquityRequest setLimitPerUserAndDay(Long limitPerUserAndDay) {
        this.limitPerUserAndDay = limitPerUserAndDay;
        return this;
    }
    public Long getLimitPerUserAndDay() {
        return this.limitPerUserAndDay;
    }

    public UpdateEquityRequest setLimitPerUserAndMonth(Long limitPerUserAndMonth) {
        this.limitPerUserAndMonth = limitPerUserAndMonth;
        return this;
    }
    public Long getLimitPerUserAndMonth() {
        return this.limitPerUserAndMonth;
    }

    public UpdateEquityRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public UpdateEquityRequest setOutTxId(String outTxId) {
        this.outTxId = outTxId;
        return this;
    }
    public String getOutTxId() {
        return this.outTxId;
    }

    public UpdateEquityRequest setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public UpdateEquityRequest setUseValidNotAfter(Long useValidNotAfter) {
        this.useValidNotAfter = useValidNotAfter;
        return this;
    }
    public Long getUseValidNotAfter() {
        return this.useValidNotAfter;
    }

    public UpdateEquityRequest setUseValidNotBefore(Long useValidNotBefore) {
        this.useValidNotBefore = useValidNotBefore;
        return this;
    }
    public Long getUseValidNotBefore() {
        return this.useValidNotBefore;
    }

    public UpdateEquityRequest setValidNotAfter(Long validNotAfter) {
        this.validNotAfter = validNotAfter;
        return this;
    }
    public Long getValidNotAfter() {
        return this.validNotAfter;
    }

    public UpdateEquityRequest setValidNotBefore(Long validNotBefore) {
        this.validNotBefore = validNotBefore;
        return this;
    }
    public Long getValidNotBefore() {
        return this.validNotBefore;
    }

    public UpdateEquityRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
