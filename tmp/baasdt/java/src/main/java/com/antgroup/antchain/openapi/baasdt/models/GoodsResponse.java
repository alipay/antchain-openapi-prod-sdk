// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class GoodsResponse extends TeaModel {
    // 商品归属的账户ID
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 商品名称
    @NameInMap("goods_name")
    @Validation(required = true)
    public String goodsName;

    // 商品类型
    @NameInMap("goods_type")
    @Validation(required = true)
    public String goodsType;

    // 商品描述信息
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 商品库存
    @NameInMap("total_count")
    @Validation(required = true)
    public Long totalCount;

    // 显示价格
    @NameInMap("display_price")
    @Validation(required = true)
    public String displayPrice;

    // 默认价格
    @NameInMap("default_price")
    @Validation(required = true)
    public String defaultPrice;

    // 是否公开商品
    @NameInMap("if_public")
    @Validation(required = true)
    public Boolean ifPublic;

    // 商品主图片URL
    @NameInMap("images")
    @Validation(required = true)
    public String images;

    // 商品描述图片，每个图片URL用:隔开
    @NameInMap("desc_images")
    @Validation(required = true)
    public String descImages;

    // 商品状态 0可用，1下线
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 商品开始时间
    @NameInMap("valid_not_before")
    @Validation(required = true)
    public Long validNotBefore;

    // 商品结束时间
    @NameInMap("valid_not_after")
    @Validation(required = true)
    public Long validNotAfter;

    // 商品每日上限
    @NameInMap("limit_per_user_and_day")
    @Validation(required = true)
    public Long limitPerUserAndDay;

    // 商品每月上限
    @NameInMap("limit_per_user_and_month")
    @Validation(required = true)
    public Long limitPerUserAndMonth;

    // 商品备注信息
    @NameInMap("memo")
    @Validation(required = true)
    public String memo;

    // 授权类型
    @NameInMap("auth_type")
    @Validation(required = true)
    public Long authType;

    // 商品类型
    @NameInMap("category_id")
    @Validation(required = true)
    public String categoryId;

    // 商品ID
    @NameInMap("goods_id")
    @Validation(required = true)
    public String goodsId;

    public static GoodsResponse build(java.util.Map<String, ?> map) throws Exception {
        GoodsResponse self = new GoodsResponse();
        return TeaModel.build(map, self);
    }

    public GoodsResponse setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public GoodsResponse setGoodsName(String goodsName) {
        this.goodsName = goodsName;
        return this;
    }
    public String getGoodsName() {
        return this.goodsName;
    }

    public GoodsResponse setGoodsType(String goodsType) {
        this.goodsType = goodsType;
        return this;
    }
    public String getGoodsType() {
        return this.goodsType;
    }

    public GoodsResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GoodsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public GoodsResponse setDisplayPrice(String displayPrice) {
        this.displayPrice = displayPrice;
        return this;
    }
    public String getDisplayPrice() {
        return this.displayPrice;
    }

    public GoodsResponse setDefaultPrice(String defaultPrice) {
        this.defaultPrice = defaultPrice;
        return this;
    }
    public String getDefaultPrice() {
        return this.defaultPrice;
    }

    public GoodsResponse setIfPublic(Boolean ifPublic) {
        this.ifPublic = ifPublic;
        return this;
    }
    public Boolean getIfPublic() {
        return this.ifPublic;
    }

    public GoodsResponse setImages(String images) {
        this.images = images;
        return this;
    }
    public String getImages() {
        return this.images;
    }

    public GoodsResponse setDescImages(String descImages) {
        this.descImages = descImages;
        return this;
    }
    public String getDescImages() {
        return this.descImages;
    }

    public GoodsResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public GoodsResponse setValidNotBefore(Long validNotBefore) {
        this.validNotBefore = validNotBefore;
        return this;
    }
    public Long getValidNotBefore() {
        return this.validNotBefore;
    }

    public GoodsResponse setValidNotAfter(Long validNotAfter) {
        this.validNotAfter = validNotAfter;
        return this;
    }
    public Long getValidNotAfter() {
        return this.validNotAfter;
    }

    public GoodsResponse setLimitPerUserAndDay(Long limitPerUserAndDay) {
        this.limitPerUserAndDay = limitPerUserAndDay;
        return this;
    }
    public Long getLimitPerUserAndDay() {
        return this.limitPerUserAndDay;
    }

    public GoodsResponse setLimitPerUserAndMonth(Long limitPerUserAndMonth) {
        this.limitPerUserAndMonth = limitPerUserAndMonth;
        return this;
    }
    public Long getLimitPerUserAndMonth() {
        return this.limitPerUserAndMonth;
    }

    public GoodsResponse setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public GoodsResponse setAuthType(Long authType) {
        this.authType = authType;
        return this;
    }
    public Long getAuthType() {
        return this.authType;
    }

    public GoodsResponse setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public GoodsResponse setGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }
    public String getGoodsId() {
        return this.goodsId;
    }

}
