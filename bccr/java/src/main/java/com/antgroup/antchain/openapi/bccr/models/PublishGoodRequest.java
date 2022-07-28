// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class PublishGoodRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 文件id,最长64个字符
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 商品标题，最长64个字符
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 商品名称
    @NameInMap("goods_name")
    @Validation(required = true)
    public String goodsName;

    // 商品分类
    @NameInMap("classification")
    public String classification;

    // 售价（分）
    @NameInMap("standard_price_in_cent")
    @Validation(required = true)
    public Long standardPriceInCent;

    // 上架/下架，默认上架
    @NameInMap("goods_status")
    public String goodsStatus;

    // 发布时间，默认直接发布
    @NameInMap("publish_time")
    public Long publishTime;

    // 授权期限起始时间
    @NameInMap("auth_start_time")
    @Validation(required = true)
    public Long authStartTime;

    // 授权期限结束时间（传-1 则为永久）
    @NameInMap("auth_end_time")
    @Validation(required = true)
    public Long authEndTime;

    // 是否是作者
    @NameInMap("is_author")
    @Validation(required = true)
    public Boolean isAuthor;

    // 作者姓名，如果isAuthor为false则必填，最长30个字符
    @NameInMap("author_cert_name")
    public String authorCertName;

    // 作者身份证号,如果isAuthor为false则必填
    @NameInMap("author_cert_no")
    public String authorCertNo;

    // 幂等号，可以保证请求的幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
    @NameInMap("client_token")
    public String clientToken;

    // 授权信息
    @NameInMap("auth_info")
    @Validation(required = true)
    public java.util.List<AuthInfo> authInfo;

    public static PublishGoodRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishGoodRequest self = new PublishGoodRequest();
        return TeaModel.build(map, self);
    }

    public PublishGoodRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PublishGoodRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PublishGoodRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public PublishGoodRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public PublishGoodRequest setGoodsName(String goodsName) {
        this.goodsName = goodsName;
        return this;
    }
    public String getGoodsName() {
        return this.goodsName;
    }

    public PublishGoodRequest setClassification(String classification) {
        this.classification = classification;
        return this;
    }
    public String getClassification() {
        return this.classification;
    }

    public PublishGoodRequest setStandardPriceInCent(Long standardPriceInCent) {
        this.standardPriceInCent = standardPriceInCent;
        return this;
    }
    public Long getStandardPriceInCent() {
        return this.standardPriceInCent;
    }

    public PublishGoodRequest setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus;
        return this;
    }
    public String getGoodsStatus() {
        return this.goodsStatus;
    }

    public PublishGoodRequest setPublishTime(Long publishTime) {
        this.publishTime = publishTime;
        return this;
    }
    public Long getPublishTime() {
        return this.publishTime;
    }

    public PublishGoodRequest setAuthStartTime(Long authStartTime) {
        this.authStartTime = authStartTime;
        return this;
    }
    public Long getAuthStartTime() {
        return this.authStartTime;
    }

    public PublishGoodRequest setAuthEndTime(Long authEndTime) {
        this.authEndTime = authEndTime;
        return this;
    }
    public Long getAuthEndTime() {
        return this.authEndTime;
    }

    public PublishGoodRequest setIsAuthor(Boolean isAuthor) {
        this.isAuthor = isAuthor;
        return this;
    }
    public Boolean getIsAuthor() {
        return this.isAuthor;
    }

    public PublishGoodRequest setAuthorCertName(String authorCertName) {
        this.authorCertName = authorCertName;
        return this;
    }
    public String getAuthorCertName() {
        return this.authorCertName;
    }

    public PublishGoodRequest setAuthorCertNo(String authorCertNo) {
        this.authorCertNo = authorCertNo;
        return this;
    }
    public String getAuthorCertNo() {
        return this.authorCertNo;
    }

    public PublishGoodRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public PublishGoodRequest setAuthInfo(java.util.List<AuthInfo> authInfo) {
        this.authInfo = authInfo;
        return this;
    }
    public java.util.List<AuthInfo> getAuthInfo() {
        return this.authInfo;
    }

}
