// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class GetSafeCommunicationruleResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // {"id":1,"instance_id":"000001","name":"rule1","direction":1,"mode":1,"strategy":"1","enabled":0,"scope":1,"operator":"aaa","operate_time":"2020-10-22 11:33:22","labels":[{"key":"aa","value":"bb","type":1}],"label_code":"123123aac"}
    @NameInMap("model")
    public CommunicationRuleModel model;

    public static GetSafeCommunicationruleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSafeCommunicationruleResponse self = new GetSafeCommunicationruleResponse();
        return TeaModel.build(map, self);
    }

    public GetSafeCommunicationruleResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetSafeCommunicationruleResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetSafeCommunicationruleResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetSafeCommunicationruleResponse setModel(CommunicationRuleModel model) {
        this.model = model;
        return this;
    }
    public CommunicationRuleModel getModel() {
        return this.model;
    }

}
