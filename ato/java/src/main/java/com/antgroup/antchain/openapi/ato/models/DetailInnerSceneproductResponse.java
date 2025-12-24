// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class DetailInnerSceneproductResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商品id
    @NameInMap("platform_product_id")
    public String platformProductId;

    // 一级分类
    @NameInMap("primary_category")
    public String primaryCategory;

    // 二级分类
    @NameInMap("secondary_category")
    public String secondaryCategory;

    // 商品名称
    @NameInMap("product_name")
    public String productName;

    // 商品成色
    @NameInMap("product_condition")
    public String productCondition;

    // 商品描述
    @NameInMap("product_description")
    public String productDescription;

    // 商品封面图
    @NameInMap("cover_image_url_list")
    public java.util.List<String> coverImageUrlList;

    // 商品封面图
    @NameInMap("large_cover_image_url_list")
    public java.util.List<String> largeCoverImageUrlList;

    // 商品详情图
    @NameInMap("detail_image_url_list")
    public java.util.List<String> detailImageUrlList;

    // 商品详情图
    @NameInMap("large_detail_image_url_list")
    public java.util.List<String> largeDetailImageUrlList;

    // 商品规格
    @NameInMap("spec_config_list")
    public java.util.List<ProductSpecConfig> specConfigList;

    // 报名商家租赁属性信息列表
    @NameInMap("sign_merchant_lease_config_list")
    public java.util.List<SignMerchantLeaseConfig> signMerchantLeaseConfigList;

    // 适用商家列表
    @NameInMap("apply_product_merchant_list")
    public java.util.List<SignProductMerchant> applyProductMerchantList;

    // 适用商家租赁属性信息列表
    @NameInMap("apply_merchant_lease_config_list")
    public java.util.List<SignMerchantLeaseConfig> applyMerchantLeaseConfigList;

    // 推广场景
    @NameInMap("scene_name")
    public String sceneName;

    // 场景商品上架状态
    @NameInMap("display_status")
    public String displayStatus;

    // 推广模式
    @NameInMap("delivery_mode")
    public String deliveryMode;

    // 添加标志
    @NameInMap("added_flag")
    public Boolean addedFlag;

    public static DetailInnerSceneproductResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailInnerSceneproductResponse self = new DetailInnerSceneproductResponse();
        return TeaModel.build(map, self);
    }

    public DetailInnerSceneproductResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailInnerSceneproductResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailInnerSceneproductResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailInnerSceneproductResponse setPlatformProductId(String platformProductId) {
        this.platformProductId = platformProductId;
        return this;
    }
    public String getPlatformProductId() {
        return this.platformProductId;
    }

    public DetailInnerSceneproductResponse setPrimaryCategory(String primaryCategory) {
        this.primaryCategory = primaryCategory;
        return this;
    }
    public String getPrimaryCategory() {
        return this.primaryCategory;
    }

    public DetailInnerSceneproductResponse setSecondaryCategory(String secondaryCategory) {
        this.secondaryCategory = secondaryCategory;
        return this;
    }
    public String getSecondaryCategory() {
        return this.secondaryCategory;
    }

    public DetailInnerSceneproductResponse setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public DetailInnerSceneproductResponse setProductCondition(String productCondition) {
        this.productCondition = productCondition;
        return this;
    }
    public String getProductCondition() {
        return this.productCondition;
    }

    public DetailInnerSceneproductResponse setProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }
    public String getProductDescription() {
        return this.productDescription;
    }

    public DetailInnerSceneproductResponse setCoverImageUrlList(java.util.List<String> coverImageUrlList) {
        this.coverImageUrlList = coverImageUrlList;
        return this;
    }
    public java.util.List<String> getCoverImageUrlList() {
        return this.coverImageUrlList;
    }

    public DetailInnerSceneproductResponse setLargeCoverImageUrlList(java.util.List<String> largeCoverImageUrlList) {
        this.largeCoverImageUrlList = largeCoverImageUrlList;
        return this;
    }
    public java.util.List<String> getLargeCoverImageUrlList() {
        return this.largeCoverImageUrlList;
    }

    public DetailInnerSceneproductResponse setDetailImageUrlList(java.util.List<String> detailImageUrlList) {
        this.detailImageUrlList = detailImageUrlList;
        return this;
    }
    public java.util.List<String> getDetailImageUrlList() {
        return this.detailImageUrlList;
    }

    public DetailInnerSceneproductResponse setLargeDetailImageUrlList(java.util.List<String> largeDetailImageUrlList) {
        this.largeDetailImageUrlList = largeDetailImageUrlList;
        return this;
    }
    public java.util.List<String> getLargeDetailImageUrlList() {
        return this.largeDetailImageUrlList;
    }

    public DetailInnerSceneproductResponse setSpecConfigList(java.util.List<ProductSpecConfig> specConfigList) {
        this.specConfigList = specConfigList;
        return this;
    }
    public java.util.List<ProductSpecConfig> getSpecConfigList() {
        return this.specConfigList;
    }

    public DetailInnerSceneproductResponse setSignMerchantLeaseConfigList(java.util.List<SignMerchantLeaseConfig> signMerchantLeaseConfigList) {
        this.signMerchantLeaseConfigList = signMerchantLeaseConfigList;
        return this;
    }
    public java.util.List<SignMerchantLeaseConfig> getSignMerchantLeaseConfigList() {
        return this.signMerchantLeaseConfigList;
    }

    public DetailInnerSceneproductResponse setApplyProductMerchantList(java.util.List<SignProductMerchant> applyProductMerchantList) {
        this.applyProductMerchantList = applyProductMerchantList;
        return this;
    }
    public java.util.List<SignProductMerchant> getApplyProductMerchantList() {
        return this.applyProductMerchantList;
    }

    public DetailInnerSceneproductResponse setApplyMerchantLeaseConfigList(java.util.List<SignMerchantLeaseConfig> applyMerchantLeaseConfigList) {
        this.applyMerchantLeaseConfigList = applyMerchantLeaseConfigList;
        return this;
    }
    public java.util.List<SignMerchantLeaseConfig> getApplyMerchantLeaseConfigList() {
        return this.applyMerchantLeaseConfigList;
    }

    public DetailInnerSceneproductResponse setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public DetailInnerSceneproductResponse setDisplayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
        return this;
    }
    public String getDisplayStatus() {
        return this.displayStatus;
    }

    public DetailInnerSceneproductResponse setDeliveryMode(String deliveryMode) {
        this.deliveryMode = deliveryMode;
        return this;
    }
    public String getDeliveryMode() {
        return this.deliveryMode;
    }

    public DetailInnerSceneproductResponse setAddedFlag(Boolean addedFlag) {
        this.addedFlag = addedFlag;
        return this;
    }
    public Boolean getAddedFlag() {
        return this.addedFlag;
    }

}
