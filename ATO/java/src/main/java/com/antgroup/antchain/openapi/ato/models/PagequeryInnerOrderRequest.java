// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 订单id
    @NameInMap("order_id")
    public String orderId;

    // 支付宝代扣协议号
    @NameInMap("agreement_no")
    public String agreementNo;

    // 订单创建时间开始
    @NameInMap("order_create_time_start")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String orderCreateTimeStart;

    // 订单创建时间结束
    @NameInMap("order_create_time_end")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String orderCreateTimeEnd;

    // 订单状态
    @NameInMap("order_status")
    public String orderStatus;

    // 分页
    @NameInMap("page_info")
    @Validation(required = true)
    public PageQuery pageInfo;

    public static PagequeryInnerOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerOrderRequest self = new PagequeryInnerOrderRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryInnerOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryInnerOrderRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PagequeryInnerOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public PagequeryInnerOrderRequest setAgreementNo(String agreementNo) {
        this.agreementNo = agreementNo;
        return this;
    }
    public String getAgreementNo() {
        return this.agreementNo;
    }

    public PagequeryInnerOrderRequest setOrderCreateTimeStart(String orderCreateTimeStart) {
        this.orderCreateTimeStart = orderCreateTimeStart;
        return this;
    }
    public String getOrderCreateTimeStart() {
        return this.orderCreateTimeStart;
    }

    public PagequeryInnerOrderRequest setOrderCreateTimeEnd(String orderCreateTimeEnd) {
        this.orderCreateTimeEnd = orderCreateTimeEnd;
        return this;
    }
    public String getOrderCreateTimeEnd() {
        return this.orderCreateTimeEnd;
    }

    public PagequeryInnerOrderRequest setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public PagequeryInnerOrderRequest setPageInfo(PageQuery pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageQuery getPageInfo() {
        return this.pageInfo;
    }

}
