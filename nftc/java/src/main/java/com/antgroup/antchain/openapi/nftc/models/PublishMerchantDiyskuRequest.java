// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class PublishMerchantDiyskuRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务请求id，用来做业务上的幂等。后面查询状态也是此字段
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    // 调用渠道
    // PET 宠物
    // MEMBER 会员
    @NameInMap("channel")
    @Validation(required = true)
    public String channel;

    // 领取数字藏品的用户ID，支持2088/手机号/1322
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 支付宝2088账号：ALIPAY_UID
    // 手机号：PHONE_NO
    // 鲸探1322账号：FANS_UID
    @NameInMap("user_type")
    @Validation(required = true)
    public String userType;

    // 需要发放的SKUID编码
    @NameInMap("sku_id")
    @Validation(required = true)
    public String skuId;

    // 一期仅支持图片：IMAGE
    @NameInMap("sku_type")
    @Validation(required = true)
    public String skuType;

    // 数字藏品的缩略图地址，可与原图相同也可不同，需要校验长宽比为1:1
    @NameInMap("thumbnail_url")
    @Validation(required = true)
    public String thumbnailUrl;

    // 数字藏品的原图地址，需要校验长宽比为1:1
    @NameInMap("original_url")
    @Validation(required = true)
    public String originalUrl;

    public static PublishMerchantDiyskuRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishMerchantDiyskuRequest self = new PublishMerchantDiyskuRequest();
        return TeaModel.build(map, self);
    }

    public PublishMerchantDiyskuRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PublishMerchantDiyskuRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PublishMerchantDiyskuRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public PublishMerchantDiyskuRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public PublishMerchantDiyskuRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public PublishMerchantDiyskuRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public PublishMerchantDiyskuRequest setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

    public PublishMerchantDiyskuRequest setSkuType(String skuType) {
        this.skuType = skuType;
        return this;
    }
    public String getSkuType() {
        return this.skuType;
    }

    public PublishMerchantDiyskuRequest setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public PublishMerchantDiyskuRequest setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
        return this;
    }
    public String getOriginalUrl() {
        return this.originalUrl;
    }

}
