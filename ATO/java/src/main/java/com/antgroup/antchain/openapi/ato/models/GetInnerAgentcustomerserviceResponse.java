// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class GetInnerAgentcustomerserviceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 客诉问题
    @NameInMap("customer_complaint_issues")
    public String customerComplaintIssues;

    // 客诉处理人员信息
    @NameInMap("customer_person_info_list")
    public java.util.List<CustomerPersonInfo> customerPersonInfoList;

    public static GetInnerAgentcustomerserviceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInnerAgentcustomerserviceResponse self = new GetInnerAgentcustomerserviceResponse();
        return TeaModel.build(map, self);
    }

    public GetInnerAgentcustomerserviceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetInnerAgentcustomerserviceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetInnerAgentcustomerserviceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetInnerAgentcustomerserviceResponse setCustomerComplaintIssues(String customerComplaintIssues) {
        this.customerComplaintIssues = customerComplaintIssues;
        return this;
    }
    public String getCustomerComplaintIssues() {
        return this.customerComplaintIssues;
    }

    public GetInnerAgentcustomerserviceResponse setCustomerPersonInfoList(java.util.List<CustomerPersonInfo> customerPersonInfoList) {
        this.customerPersonInfoList = customerPersonInfoList;
        return this;
    }
    public java.util.List<CustomerPersonInfo> getCustomerPersonInfoList() {
        return this.customerPersonInfoList;
    }

}
