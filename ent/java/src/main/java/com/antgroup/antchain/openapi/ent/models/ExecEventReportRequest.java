// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class ExecEventReportRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 事件类型，目前支持类型 VISIT：访问事件，TRADE：交易事件，SHARE：分享事件
    @NameInMap("event_type")
    @Validation(required = true)
    public String eventType;

    // 事件实例编码，目前支持访问事件，VISIT类别包括MINI_HOME_PAGE：访问首页，CONTRACT_DETAIL_OAGE：访问项目详情页，SHARE_LANDING_PAGE：访问分享页，TRADE类别包括TRADE_SUCCESS：购买成功，REFUND_SUCCESS: 退货成功，SHARE类别包括SHARE_FROM_MERCHANT
    @NameInMap("event_instance_code")
    @Validation(required = true)
    public String eventInstanceCode;

    // 购买人或者访问者
    @NameInMap("event_child")
    public User eventChild;

    // 分享者
    @NameInMap("event_parent")
    public User eventParent;

    // 唯一业务单号
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 项目唯一编号，访问详情页和回流页、购买事件必填
    @NameInMap("project_id")
    public String projectId;

    // 到账类型，DIRECT：直接到账， TWO_STEP_MANUAL：手动到账，TWO_STEP：定时到账
    @NameInMap("confirm_type")
    public String confirmType;

    // 到账时间。当到账类型为定时到账时，该字段必填。
    @NameInMap("confirm_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String confirmTime;

    // 交易订单数据
    @NameInMap("trade_order")
    public TradeOrder tradeOrder;

    public static ExecEventReportRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecEventReportRequest self = new ExecEventReportRequest();
        return TeaModel.build(map, self);
    }

    public ExecEventReportRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecEventReportRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecEventReportRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public ExecEventReportRequest setEventInstanceCode(String eventInstanceCode) {
        this.eventInstanceCode = eventInstanceCode;
        return this;
    }
    public String getEventInstanceCode() {
        return this.eventInstanceCode;
    }

    public ExecEventReportRequest setEventChild(User eventChild) {
        this.eventChild = eventChild;
        return this;
    }
    public User getEventChild() {
        return this.eventChild;
    }

    public ExecEventReportRequest setEventParent(User eventParent) {
        this.eventParent = eventParent;
        return this;
    }
    public User getEventParent() {
        return this.eventParent;
    }

    public ExecEventReportRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecEventReportRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ExecEventReportRequest setConfirmType(String confirmType) {
        this.confirmType = confirmType;
        return this;
    }
    public String getConfirmType() {
        return this.confirmType;
    }

    public ExecEventReportRequest setConfirmTime(String confirmTime) {
        this.confirmTime = confirmTime;
        return this;
    }
    public String getConfirmTime() {
        return this.confirmTime;
    }

    public ExecEventReportRequest setTradeOrder(TradeOrder tradeOrder) {
        this.tradeOrder = tradeOrder;
        return this;
    }
    public TradeOrder getTradeOrder() {
        return this.tradeOrder;
    }

}
