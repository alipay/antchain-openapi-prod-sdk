// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class GetOrderCreateorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 幂等字段
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    // 幂等id
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 发票信息
    @NameInMap("invoice_info")
    public InvoiceInfo invoiceInfo;

    // 订单明细列表
    @NameInMap("order_item")
    public java.util.List<OrderItem> orderItem;

    public static GetOrderCreateorderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOrderCreateorderRequest self = new GetOrderCreateorderRequest();
        return TeaModel.build(map, self);
    }

    public GetOrderCreateorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetOrderCreateorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetOrderCreateorderRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetOrderCreateorderRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOrderCreateorderRequest setInvoiceInfo(InvoiceInfo invoiceInfo) {
        this.invoiceInfo = invoiceInfo;
        return this;
    }
    public InvoiceInfo getInvoiceInfo() {
        return this.invoiceInfo;
    }

    public GetOrderCreateorderRequest setOrderItem(java.util.List<OrderItem> orderItem) {
        this.orderItem = orderItem;
        return this;
    }
    public java.util.List<OrderItem> getOrderItem() {
        return this.orderItem;
    }

}
