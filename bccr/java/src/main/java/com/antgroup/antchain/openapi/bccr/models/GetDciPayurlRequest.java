// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class GetDciPayurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // dci用户id
    @NameInMap("dci_user_id")
    @Validation(required = true)
    public String dciUserId;

    // dci内容id
    @NameInMap("dci_content_id")
    @Validation(required = true)
    public String dciContentId;

    // 支付方式 0：支付宝
    @NameInMap("pay_ment")
    public String payMent;

    // 发票信息-当前支持普票
    @NameInMap("invoice_info")
    public InvoiceInfo invoiceInfo;

    public static GetDciPayurlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDciPayurlRequest self = new GetDciPayurlRequest();
        return TeaModel.build(map, self);
    }

    public GetDciPayurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetDciPayurlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetDciPayurlRequest setDciUserId(String dciUserId) {
        this.dciUserId = dciUserId;
        return this;
    }
    public String getDciUserId() {
        return this.dciUserId;
    }

    public GetDciPayurlRequest setDciContentId(String dciContentId) {
        this.dciContentId = dciContentId;
        return this;
    }
    public String getDciContentId() {
        return this.dciContentId;
    }

    public GetDciPayurlRequest setPayMent(String payMent) {
        this.payMent = payMent;
        return this;
    }
    public String getPayMent() {
        return this.payMent;
    }

    public GetDciPayurlRequest setInvoiceInfo(InvoiceInfo invoiceInfo) {
        this.invoiceInfo = invoiceInfo;
        return this;
    }
    public InvoiceInfo getInvoiceInfo() {
        return this.invoiceInfo;
    }

}
