// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class SendAntsaasStaffingcInsureResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 投保失败人员信息，extra_msg会返回failReason，投保失败原因
    @NameInMap("fail_employee_list")
    public java.util.List<InsureEmployeeInfo> failEmployeeList;

    public static SendAntsaasStaffingcInsureResponse build(java.util.Map<String, ?> map) throws Exception {
        SendAntsaasStaffingcInsureResponse self = new SendAntsaasStaffingcInsureResponse();
        return TeaModel.build(map, self);
    }

    public SendAntsaasStaffingcInsureResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SendAntsaasStaffingcInsureResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SendAntsaasStaffingcInsureResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SendAntsaasStaffingcInsureResponse setFailEmployeeList(java.util.List<InsureEmployeeInfo> failEmployeeList) {
        this.failEmployeeList = failEmployeeList;
        return this;
    }
    public java.util.List<InsureEmployeeInfo> getFailEmployeeList() {
        return this.failEmployeeList;
    }

}
