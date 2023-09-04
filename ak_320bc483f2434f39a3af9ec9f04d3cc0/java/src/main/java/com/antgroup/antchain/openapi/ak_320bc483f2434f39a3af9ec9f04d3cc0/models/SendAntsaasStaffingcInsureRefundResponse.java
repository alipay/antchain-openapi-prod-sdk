// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class SendAntsaasStaffingcInsureRefundResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 失败原因列表
    @NameInMap("fail_order_info_list")
    public java.util.List<FailOrderInfo> failOrderInfoList;

    public static SendAntsaasStaffingcInsureRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        SendAntsaasStaffingcInsureRefundResponse self = new SendAntsaasStaffingcInsureRefundResponse();
        return TeaModel.build(map, self);
    }

    public SendAntsaasStaffingcInsureRefundResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SendAntsaasStaffingcInsureRefundResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SendAntsaasStaffingcInsureRefundResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SendAntsaasStaffingcInsureRefundResponse setFailOrderInfoList(java.util.List<FailOrderInfo> failOrderInfoList) {
        this.failOrderInfoList = failOrderInfoList;
        return this;
    }
    public java.util.List<FailOrderInfo> getFailOrderInfoList() {
        return this.failOrderInfoList;
    }

}
