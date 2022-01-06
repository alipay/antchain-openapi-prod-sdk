// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class GetSgRouterrulesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 路由规则
    @NameInMap("router_rule_group_model")
    public RouterRuleGroupModel routerRuleGroupModel;

    public static GetSgRouterrulesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSgRouterrulesResponse self = new GetSgRouterrulesResponse();
        return TeaModel.build(map, self);
    }

    public GetSgRouterrulesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetSgRouterrulesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetSgRouterrulesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetSgRouterrulesResponse setRouterRuleGroupModel(RouterRuleGroupModel routerRuleGroupModel) {
        this.routerRuleGroupModel = routerRuleGroupModel;
        return this;
    }
    public RouterRuleGroupModel getRouterRuleGroupModel() {
        return this.routerRuleGroupModel;
    }

}
