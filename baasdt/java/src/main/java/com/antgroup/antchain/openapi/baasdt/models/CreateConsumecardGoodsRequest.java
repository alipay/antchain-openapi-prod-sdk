// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CreateConsumecardGoodsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商品授权类型
    @NameInMap("auth_type")
    @Validation(required = true)
    public Long authType;

    // 请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequest baseRequest;

    // 默认价格(单位:元,精确到分)
    @NameInMap("default_price")
    @Validation(required = true)
    public String defaultPrice;

    // 代理操作的链上ID
    @NameInMap("delegate_account_id")
    @Validation(required = true)
    public String delegateAccountId;

    // 商品描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 商品描述图片url，多个图片间用;隔开
    @NameInMap("desc_images")
    @Validation(required = true)
    public String descImages;

    // 商品标价
    @NameInMap("display_price")
    @Validation(required = true)
    public String displayPrice;

    // 商品名称
    @NameInMap("goods_name")
    @Validation(required = true)
    public String goodsName;

    // 商品类型
    @NameInMap("goods_type")
    @Validation(required = true)
    public String goodsType;

    // 是否公开
    @NameInMap("if_public")
    @Validation(required = true)
    public Boolean ifPublic;

    // 商品主图片url
    @NameInMap("image")
    @Validation(required = true)
    public String image;

    // 商品每日上限
    @NameInMap("limit_per_user_and_day")
    @Validation(required = true)
    public Long limitPerUserAndDay;

    // 商品每月上限
    @NameInMap("limit_per_user_and_month")
    @Validation(required = true)
    public Long limitPerUserAndMonth;

    // 商品库存
    @NameInMap("total_count")
    @Validation(required = true)
    public Long totalCount;

    // 商品有效结束时间(UNIX毫秒时间戳)
    @NameInMap("valid_not_after")
    @Validation(required = true)
    public Long validNotAfter;

    // 商品有效开始时间(UNIX毫秒时间戳)
    @NameInMap("valid_not_before")
    @Validation(required = true)
    public Long validNotBefore;

    // 备注信息
    @NameInMap("memo")
    public String memo;

    public static CreateConsumecardGoodsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumecardGoodsRequest self = new CreateConsumecardGoodsRequest();
        return TeaModel.build(map, self);
    }

    public CreateConsumecardGoodsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateConsumecardGoodsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateConsumecardGoodsRequest setAuthType(Long authType) {
        this.authType = authType;
        return this;
    }
    public Long getAuthType() {
        return this.authType;
    }

    public CreateConsumecardGoodsRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public CreateConsumecardGoodsRequest setDefaultPrice(String defaultPrice) {
        this.defaultPrice = defaultPrice;
        return this;
    }
    public String getDefaultPrice() {
        return this.defaultPrice;
    }

    public CreateConsumecardGoodsRequest setDelegateAccountId(String delegateAccountId) {
        this.delegateAccountId = delegateAccountId;
        return this;
    }
    public String getDelegateAccountId() {
        return this.delegateAccountId;
    }

    public CreateConsumecardGoodsRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateConsumecardGoodsRequest setDescImages(String descImages) {
        this.descImages = descImages;
        return this;
    }
    public String getDescImages() {
        return this.descImages;
    }

    public CreateConsumecardGoodsRequest setDisplayPrice(String displayPrice) {
        this.displayPrice = displayPrice;
        return this;
    }
    public String getDisplayPrice() {
        return this.displayPrice;
    }

    public CreateConsumecardGoodsRequest setGoodsName(String goodsName) {
        this.goodsName = goodsName;
        return this;
    }
    public String getGoodsName() {
        return this.goodsName;
    }

    public CreateConsumecardGoodsRequest setGoodsType(String goodsType) {
        this.goodsType = goodsType;
        return this;
    }
    public String getGoodsType() {
        return this.goodsType;
    }

    public CreateConsumecardGoodsRequest setIfPublic(Boolean ifPublic) {
        this.ifPublic = ifPublic;
        return this;
    }
    public Boolean getIfPublic() {
        return this.ifPublic;
    }

    public CreateConsumecardGoodsRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public CreateConsumecardGoodsRequest setLimitPerUserAndDay(Long limitPerUserAndDay) {
        this.limitPerUserAndDay = limitPerUserAndDay;
        return this;
    }
    public Long getLimitPerUserAndDay() {
        return this.limitPerUserAndDay;
    }

    public CreateConsumecardGoodsRequest setLimitPerUserAndMonth(Long limitPerUserAndMonth) {
        this.limitPerUserAndMonth = limitPerUserAndMonth;
        return this;
    }
    public Long getLimitPerUserAndMonth() {
        return this.limitPerUserAndMonth;
    }

    public CreateConsumecardGoodsRequest setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public CreateConsumecardGoodsRequest setValidNotAfter(Long validNotAfter) {
        this.validNotAfter = validNotAfter;
        return this;
    }
    public Long getValidNotAfter() {
        return this.validNotAfter;
    }

    public CreateConsumecardGoodsRequest setValidNotBefore(Long validNotBefore) {
        this.validNotBefore = validNotBefore;
        return this;
    }
    public Long getValidNotBefore() {
        return this.validNotBefore;
    }

    public CreateConsumecardGoodsRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

}
