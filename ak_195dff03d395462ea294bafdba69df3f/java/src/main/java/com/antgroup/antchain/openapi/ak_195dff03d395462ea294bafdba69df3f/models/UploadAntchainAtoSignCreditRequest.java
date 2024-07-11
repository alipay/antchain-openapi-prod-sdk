// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class UploadAntchainAtoSignCreditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号类型
    @NameInMap("order_no_type")
    @Validation(required = true)
    public String orderNoType;

    // 订单号，或资产包号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 凭证合同类型
    @NameInMap("credit_type")
    @Validation(required = true)
    public String creditType;

    // 凭证名称
    @NameInMap("credit_name")
    public String creditName;

    // 文本类型
    @NameInMap("content_type")
    @Validation(required = true)
    public String contentType;

    // 文本下载链接，如果类型是FILE则必填
    @NameInMap("file_url")
    public String fileUrl;

    // 内容数据，格式为JSON类型文本，如果类型是JSON_TEXT则必填
    @NameInMap("content")
    public String content;

    // 商户统一社会信用代码
    @NameInMap("merchant_id")
    public String merchantId;

    public static UploadAntchainAtoSignCreditRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadAntchainAtoSignCreditRequest self = new UploadAntchainAtoSignCreditRequest();
        return TeaModel.build(map, self);
    }

    public UploadAntchainAtoSignCreditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadAntchainAtoSignCreditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadAntchainAtoSignCreditRequest setOrderNoType(String orderNoType) {
        this.orderNoType = orderNoType;
        return this;
    }
    public String getOrderNoType() {
        return this.orderNoType;
    }

    public UploadAntchainAtoSignCreditRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public UploadAntchainAtoSignCreditRequest setCreditType(String creditType) {
        this.creditType = creditType;
        return this;
    }
    public String getCreditType() {
        return this.creditType;
    }

    public UploadAntchainAtoSignCreditRequest setCreditName(String creditName) {
        this.creditName = creditName;
        return this;
    }
    public String getCreditName() {
        return this.creditName;
    }

    public UploadAntchainAtoSignCreditRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public UploadAntchainAtoSignCreditRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public UploadAntchainAtoSignCreditRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UploadAntchainAtoSignCreditRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

}
