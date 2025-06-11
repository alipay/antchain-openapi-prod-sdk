// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryCyclinginsuranceOrderdetailResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 订单号
    @NameInMap("order_id")
    public String orderId;

    // 订单账号
    @NameInMap("acoount_id")
    public String acoountId;

    // 商品码
    @NameInMap("item_code")
    public String itemCode;

    // 商品属性
    // serviceStartTime:服务开始时间
    // serviceEndTime:服务结束时间
    // tenantAddress:上门地址
    // tenantPhone:租赁人电话
    // insurancePolicyId:保险单号
    // batteryType:电池型号
    @NameInMap("item_attributes")
    public String itemAttributes;

    // 订单履约流程信息
    // workerName:上门师傅姓名
    // workerPhone:上门师傅电话
    // batteryCode:电池码
    // batteryPackagingCode:电池外包装码
    @NameInMap("fulfillment_process_info")
    public String fulfillmentProcessInfo;

    // 附件
    // installImages: 上门安装图片
    @NameInMap("attachments")
    public String attachments;

    // waitDoorToDoor 待配送
    // doorToDoorFinish 已完成
    // doorToDoorCancel 已取消
    @NameInMap("order_status")
    public String orderStatus;

    public static QueryCyclinginsuranceOrderdetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCyclinginsuranceOrderdetailResponse self = new QueryCyclinginsuranceOrderdetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryCyclinginsuranceOrderdetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCyclinginsuranceOrderdetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCyclinginsuranceOrderdetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCyclinginsuranceOrderdetailResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryCyclinginsuranceOrderdetailResponse setAcoountId(String acoountId) {
        this.acoountId = acoountId;
        return this;
    }
    public String getAcoountId() {
        return this.acoountId;
    }

    public QueryCyclinginsuranceOrderdetailResponse setItemCode(String itemCode) {
        this.itemCode = itemCode;
        return this;
    }
    public String getItemCode() {
        return this.itemCode;
    }

    public QueryCyclinginsuranceOrderdetailResponse setItemAttributes(String itemAttributes) {
        this.itemAttributes = itemAttributes;
        return this;
    }
    public String getItemAttributes() {
        return this.itemAttributes;
    }

    public QueryCyclinginsuranceOrderdetailResponse setFulfillmentProcessInfo(String fulfillmentProcessInfo) {
        this.fulfillmentProcessInfo = fulfillmentProcessInfo;
        return this;
    }
    public String getFulfillmentProcessInfo() {
        return this.fulfillmentProcessInfo;
    }

    public QueryCyclinginsuranceOrderdetailResponse setAttachments(String attachments) {
        this.attachments = attachments;
        return this;
    }
    public String getAttachments() {
        return this.attachments;
    }

    public QueryCyclinginsuranceOrderdetailResponse setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

}
