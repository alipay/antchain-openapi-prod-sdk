// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ListSgRouterrulegroupsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 路由规则组列表
    @NameInMap("list")
    public java.util.List<RouterRuleGroupVO> list;

    public static ListSgRouterrulegroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSgRouterrulegroupsResponse self = new ListSgRouterrulegroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListSgRouterrulegroupsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSgRouterrulegroupsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSgRouterrulegroupsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSgRouterrulegroupsResponse setList(java.util.List<RouterRuleGroupVO> list) {
        this.list = list;
        return this;
    }
    public java.util.List<RouterRuleGroupVO> getList() {
        return this.list;
    }

}
