// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class SubmitEcarLcaorderwithcustomerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 订单编号
    @NameInMap("order_no")
    public String orderNo;

    // 来源于三方平台的订单编号
    @NameInMap("source_order_no")
    public String sourceOrderNo;

    // 碳账户编号，碳矩阵为客户分配的碳账户编号
    @NameInMap("carbon_account_no")
    public String carbonAccountNo;

    // 订单状态，Pending——处理中，Closed——已关闭，Finished——已完成
    @NameInMap("order_status")
    public String orderStatus;

    public static SubmitEcarLcaorderwithcustomerResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitEcarLcaorderwithcustomerResponse self = new SubmitEcarLcaorderwithcustomerResponse();
        return TeaModel.build(map, self);
    }

    public SubmitEcarLcaorderwithcustomerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SubmitEcarLcaorderwithcustomerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SubmitEcarLcaorderwithcustomerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SubmitEcarLcaorderwithcustomerResponse setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public SubmitEcarLcaorderwithcustomerResponse setSourceOrderNo(String sourceOrderNo) {
        this.sourceOrderNo = sourceOrderNo;
        return this;
    }
    public String getSourceOrderNo() {
        return this.sourceOrderNo;
    }

    public SubmitEcarLcaorderwithcustomerResponse setCarbonAccountNo(String carbonAccountNo) {
        this.carbonAccountNo = carbonAccountNo;
        return this;
    }
    public String getCarbonAccountNo() {
        return this.carbonAccountNo;
    }

    public SubmitEcarLcaorderwithcustomerResponse setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

}
