// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class QueryWareslifeInstanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 实例列表
    @NameInMap("instances")
    public java.util.List<Instance> instances;

    public static QueryWareslifeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWareslifeInstanceResponse self = new QueryWareslifeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryWareslifeInstanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryWareslifeInstanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryWareslifeInstanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryWareslifeInstanceResponse setInstances(java.util.List<Instance> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<Instance> getInstances() {
        return this.instances;
    }

}
