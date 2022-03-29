// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueryMeshQueuelimitvalueResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 限流域值
    @NameInMap("data")
    public java.util.List<QueueLimitValueDTO> data;

    // 状态
    @NameInMap("state")
    public Long state;

    public static QueryMeshQueuelimitvalueResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMeshQueuelimitvalueResponse self = new QueryMeshQueuelimitvalueResponse();
        return TeaModel.build(map, self);
    }

    public QueryMeshQueuelimitvalueResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMeshQueuelimitvalueResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMeshQueuelimitvalueResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMeshQueuelimitvalueResponse setData(java.util.List<QueueLimitValueDTO> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueueLimitValueDTO> getData() {
        return this.data;
    }

    public QueryMeshQueuelimitvalueResponse setState(Long state) {
        this.state = state;
        return this;
    }
    public Long getState() {
        return this.state;
    }

}
