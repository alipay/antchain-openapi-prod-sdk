// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_9705ae7650f74f47b1e8158151cc122f.models;

import com.aliyun.tea.*;

public class GetBlockchainBccrDciPayurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数登申请id
    @NameInMap("digital_register_id")
    @Validation(required = true)
    public String digitalRegisterId;

    // 幂等字段
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    // 废弃待删除
    @NameInMap("dci_user_id")
    public String dciUserId;

    // 废弃待删除
    @NameInMap("dci_content_id")
    public String dciContentId;

    // 废弃待删除
    @NameInMap("pay_ment")
    public String payMent;

    // 废弃待删除
    @NameInMap("invoice_info")
    public InvoiceInfo invoiceInfo;

    public static GetBlockchainBccrDciPayurlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBlockchainBccrDciPayurlRequest self = new GetBlockchainBccrDciPayurlRequest();
        return TeaModel.build(map, self);
    }

    public GetBlockchainBccrDciPayurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetBlockchainBccrDciPayurlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetBlockchainBccrDciPayurlRequest setDigitalRegisterId(String digitalRegisterId) {
        this.digitalRegisterId = digitalRegisterId;
        return this;
    }
    public String getDigitalRegisterId() {
        return this.digitalRegisterId;
    }

    public GetBlockchainBccrDciPayurlRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetBlockchainBccrDciPayurlRequest setDciUserId(String dciUserId) {
        this.dciUserId = dciUserId;
        return this;
    }
    public String getDciUserId() {
        return this.dciUserId;
    }

    public GetBlockchainBccrDciPayurlRequest setDciContentId(String dciContentId) {
        this.dciContentId = dciContentId;
        return this;
    }
    public String getDciContentId() {
        return this.dciContentId;
    }

    public GetBlockchainBccrDciPayurlRequest setPayMent(String payMent) {
        this.payMent = payMent;
        return this;
    }
    public String getPayMent() {
        return this.payMent;
    }

    public GetBlockchainBccrDciPayurlRequest setInvoiceInfo(InvoiceInfo invoiceInfo) {
        this.invoiceInfo = invoiceInfo;
        return this;
    }
    public InvoiceInfo getInvoiceInfo() {
        return this.invoiceInfo;
    }

}
