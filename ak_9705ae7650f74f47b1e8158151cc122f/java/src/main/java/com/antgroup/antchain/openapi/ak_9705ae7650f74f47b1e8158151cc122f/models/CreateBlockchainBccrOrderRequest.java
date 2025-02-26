// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_9705ae7650f74f47b1e8158151cc122f.models;

import com.aliyun.tea.*;

public class CreateBlockchainBccrOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 幂等字段
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    // 幂等id【标废弃， 幂等id已client_token为准】
    @NameInMap("request_id")
    public String requestId;

    // 发票信息
    @NameInMap("invoice_info")
    @Validation(required = true)
    public InvoiceInfo invoiceInfo;

    // 订单明细列表
    @NameInMap("order_item")
    @Validation(required = true)
    public java.util.List<OrderItem> orderItem;

    public static CreateBlockchainBccrOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBlockchainBccrOrderRequest self = new CreateBlockchainBccrOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateBlockchainBccrOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBlockchainBccrOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBlockchainBccrOrderRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateBlockchainBccrOrderRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBlockchainBccrOrderRequest setInvoiceInfo(InvoiceInfo invoiceInfo) {
        this.invoiceInfo = invoiceInfo;
        return this;
    }
    public InvoiceInfo getInvoiceInfo() {
        return this.invoiceInfo;
    }

    public CreateBlockchainBccrOrderRequest setOrderItem(java.util.List<OrderItem> orderItem) {
        this.orderItem = orderItem;
        return this;
    }
    public java.util.List<OrderItem> getOrderItem() {
        return this.orderItem;
    }

}
