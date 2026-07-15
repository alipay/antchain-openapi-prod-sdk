// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class QueryInstanceCapacityResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 实例容量列表
    @NameInMap("instance_capacitys")
    public java.util.List<InstanceCapacity> instanceCapacitys;

    public static QueryInstanceCapacityResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceCapacityResponse self = new QueryInstanceCapacityResponse();
        return TeaModel.build(map, self);
    }

    public QueryInstanceCapacityResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInstanceCapacityResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInstanceCapacityResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInstanceCapacityResponse setInstanceCapacitys(java.util.List<InstanceCapacity> instanceCapacitys) {
        this.instanceCapacitys = instanceCapacitys;
        return this;
    }
    public java.util.List<InstanceCapacity> getInstanceCapacitys() {
        return this.instanceCapacitys;
    }

}
