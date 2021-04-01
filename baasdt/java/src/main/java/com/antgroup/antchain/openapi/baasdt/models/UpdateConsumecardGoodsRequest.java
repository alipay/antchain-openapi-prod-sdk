// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class UpdateConsumecardGoodsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequest baseRequest;

    // 默认价格
    @NameInMap("default_price")
    @Validation(required = true)
    public String defaultPrice;

    // 商品描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 描述图片url
    @NameInMap("desc_images")
    @Validation(required = true)
    public String descImages;

    // 商品标价
    @NameInMap("display_price")
    @Validation(required = true)
    public String displayPrice;

    // 商品ID
    @NameInMap("goods_id")
    @Validation(required = true)
    public String goodsId;

    // 商品名称
    @NameInMap("goods_name")
    @Validation(required = true)
    public String goodsName;

    // 主图片url
    @NameInMap("images")
    @Validation(required = true)
    public String images;

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

    public static UpdateConsumecardGoodsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConsumecardGoodsRequest self = new UpdateConsumecardGoodsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConsumecardGoodsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateConsumecardGoodsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateConsumecardGoodsRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public UpdateConsumecardGoodsRequest setDefaultPrice(String defaultPrice) {
        this.defaultPrice = defaultPrice;
        return this;
    }
    public String getDefaultPrice() {
        return this.defaultPrice;
    }

    public UpdateConsumecardGoodsRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateConsumecardGoodsRequest setDescImages(String descImages) {
        this.descImages = descImages;
        return this;
    }
    public String getDescImages() {
        return this.descImages;
    }

    public UpdateConsumecardGoodsRequest setDisplayPrice(String displayPrice) {
        this.displayPrice = displayPrice;
        return this;
    }
    public String getDisplayPrice() {
        return this.displayPrice;
    }

    public UpdateConsumecardGoodsRequest setGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }
    public String getGoodsId() {
        return this.goodsId;
    }

    public UpdateConsumecardGoodsRequest setGoodsName(String goodsName) {
        this.goodsName = goodsName;
        return this;
    }
    public String getGoodsName() {
        return this.goodsName;
    }

    public UpdateConsumecardGoodsRequest setImages(String images) {
        this.images = images;
        return this;
    }
    public String getImages() {
        return this.images;
    }

    public UpdateConsumecardGoodsRequest setLimitPerUserAndDay(Long limitPerUserAndDay) {
        this.limitPerUserAndDay = limitPerUserAndDay;
        return this;
    }
    public Long getLimitPerUserAndDay() {
        return this.limitPerUserAndDay;
    }

    public UpdateConsumecardGoodsRequest setLimitPerUserAndMonth(Long limitPerUserAndMonth) {
        this.limitPerUserAndMonth = limitPerUserAndMonth;
        return this;
    }
    public Long getLimitPerUserAndMonth() {
        return this.limitPerUserAndMonth;
    }

    public UpdateConsumecardGoodsRequest setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public UpdateConsumecardGoodsRequest setValidNotAfter(Long validNotAfter) {
        this.validNotAfter = validNotAfter;
        return this;
    }
    public Long getValidNotAfter() {
        return this.validNotAfter;
    }

    public UpdateConsumecardGoodsRequest setValidNotBefore(Long validNotBefore) {
        this.validNotBefore = validNotBefore;
        return this;
    }
    public Long getValidNotBefore() {
        return this.validNotBefore;
    }

}
