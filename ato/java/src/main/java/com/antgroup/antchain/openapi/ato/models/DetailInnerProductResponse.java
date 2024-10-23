// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class DetailInnerProductResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商家社会统一信用代码
    @NameInMap("merchant_id")
    public String merchantId;

    // 商品名称
    @NameInMap("product_name")
    public String productName;

    // 商品id
    @NameInMap("product_id")
    public String productId;

    // 商品规格
    @NameInMap("product_model")
    public String productModel;

    // 商品版本
    @NameInMap("product_version")
    public String productVersion;

    // 指导价
    @NameInMap("product_price")
    public String productPrice;

    // 一级类目
    @NameInMap("main_class")
    public String mainClass;

    // 二级类目
    @NameInMap("sub_class")
    public String subClass;

    // 品牌
    @NameInMap("product_brand")
    public String productBrand;

    // 商品链接
    @NameInMap("product_url")
    public String productUrl;

    // 商品详情
    @NameInMap("product_detail_info")
    public String productDetailInfo;

    public static DetailInnerProductResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailInnerProductResponse self = new DetailInnerProductResponse();
        return TeaModel.build(map, self);
    }

    public DetailInnerProductResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailInnerProductResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailInnerProductResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailInnerProductResponse setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public DetailInnerProductResponse setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public DetailInnerProductResponse setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public DetailInnerProductResponse setProductModel(String productModel) {
        this.productModel = productModel;
        return this;
    }
    public String getProductModel() {
        return this.productModel;
    }

    public DetailInnerProductResponse setProductVersion(String productVersion) {
        this.productVersion = productVersion;
        return this;
    }
    public String getProductVersion() {
        return this.productVersion;
    }

    public DetailInnerProductResponse setProductPrice(String productPrice) {
        this.productPrice = productPrice;
        return this;
    }
    public String getProductPrice() {
        return this.productPrice;
    }

    public DetailInnerProductResponse setMainClass(String mainClass) {
        this.mainClass = mainClass;
        return this;
    }
    public String getMainClass() {
        return this.mainClass;
    }

    public DetailInnerProductResponse setSubClass(String subClass) {
        this.subClass = subClass;
        return this;
    }
    public String getSubClass() {
        return this.subClass;
    }

    public DetailInnerProductResponse setProductBrand(String productBrand) {
        this.productBrand = productBrand;
        return this;
    }
    public String getProductBrand() {
        return this.productBrand;
    }

    public DetailInnerProductResponse setProductUrl(String productUrl) {
        this.productUrl = productUrl;
        return this;
    }
    public String getProductUrl() {
        return this.productUrl;
    }

    public DetailInnerProductResponse setProductDetailInfo(String productDetailInfo) {
        this.productDetailInfo = productDetailInfo;
        return this;
    }
    public String getProductDetailInfo() {
        return this.productDetailInfo;
    }

}
