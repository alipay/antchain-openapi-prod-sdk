// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueryMeshQueuerouteeditionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 路由版本
    @NameInMap("data")
    public java.util.List<QueueRouteEditionDTO> data;

    // 状态
    @NameInMap("state")
    public Long state;

    public static QueryMeshQueuerouteeditionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMeshQueuerouteeditionResponse self = new QueryMeshQueuerouteeditionResponse();
        return TeaModel.build(map, self);
    }

    public QueryMeshQueuerouteeditionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMeshQueuerouteeditionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMeshQueuerouteeditionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMeshQueuerouteeditionResponse setData(java.util.List<QueueRouteEditionDTO> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueueRouteEditionDTO> getData() {
        return this.data;
    }

    public QueryMeshQueuerouteeditionResponse setState(Long state) {
        this.state = state;
        return this;
    }
    public Long getState() {
        return this.state;
    }

}
