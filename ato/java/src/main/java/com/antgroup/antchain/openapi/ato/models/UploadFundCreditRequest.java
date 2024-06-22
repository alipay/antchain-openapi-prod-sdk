// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class UploadFundCreditRequest extends TeaModel {
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

    // 资方统一社会信用代码
    @NameInMap("fund_id")
    @Validation(required = true)
    public String fundId;

    // 凭证类型
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

    public static UploadFundCreditRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadFundCreditRequest self = new UploadFundCreditRequest();
        return TeaModel.build(map, self);
    }

    public UploadFundCreditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadFundCreditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadFundCreditRequest setOrderNoType(String orderNoType) {
        this.orderNoType = orderNoType;
        return this;
    }
    public String getOrderNoType() {
        return this.orderNoType;
    }

    public UploadFundCreditRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public UploadFundCreditRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public UploadFundCreditRequest setCreditType(String creditType) {
        this.creditType = creditType;
        return this;
    }
    public String getCreditType() {
        return this.creditType;
    }

    public UploadFundCreditRequest setCreditName(String creditName) {
        this.creditName = creditName;
        return this;
    }
    public String getCreditName() {
        return this.creditName;
    }

    public UploadFundCreditRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public UploadFundCreditRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public UploadFundCreditRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
