// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketing.models;

import com.aliyun.tea.*;

public class CreateLeadClueResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 成功与否
    @NameInMap("result")
    public Boolean result;

    // 客户id，行业线自己的会员id
    @NameInMap("customer_id")
    public String customerId;

    // 线索id，中台侧线索唯一号
    @NameInMap("lead_id")
    public String leadId;

    public static CreateLeadClueResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLeadClueResponse self = new CreateLeadClueResponse();
        return TeaModel.build(map, self);
    }

    public CreateLeadClueResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateLeadClueResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateLeadClueResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateLeadClueResponse setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public CreateLeadClueResponse setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public CreateLeadClueResponse setLeadId(String leadId) {
        this.leadId = leadId;
        return this;
    }
    public String getLeadId() {
        return this.leadId;
    }

}
