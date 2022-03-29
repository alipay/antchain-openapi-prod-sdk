// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueryMeshQueuerouterulesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 路由规则信息
    @NameInMap("data")
    public QueueRouteRulesPageDTO data;

    // 状态
    @NameInMap("state")
    public Long state;

    public static QueryMeshQueuerouterulesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMeshQueuerouterulesResponse self = new QueryMeshQueuerouterulesResponse();
        return TeaModel.build(map, self);
    }

    public QueryMeshQueuerouterulesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMeshQueuerouterulesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMeshQueuerouterulesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMeshQueuerouterulesResponse setData(QueueRouteRulesPageDTO data) {
        this.data = data;
        return this;
    }
    public QueueRouteRulesPageDTO getData() {
        return this.data;
    }

    public QueryMeshQueuerouterulesResponse setState(Long state) {
        this.state = state;
        return this;
    }
    public Long getState() {
        return this.state;
    }

}
