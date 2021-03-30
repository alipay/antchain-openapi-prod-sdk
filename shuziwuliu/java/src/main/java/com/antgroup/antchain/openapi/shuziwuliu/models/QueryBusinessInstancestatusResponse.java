// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryBusinessInstancestatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 实例id
    @NameInMap("instance_id")
    public String instanceId;

    // 实例对应的租户id
    @NameInMap("instance_tenant")
    public String instanceTenant;

    // STARTED---运行中
    // STOPPED--已停服
    // RELEASED--已释放
    @NameInMap("instance_status")
    public String instanceStatus;

    public static QueryBusinessInstancestatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBusinessInstancestatusResponse self = new QueryBusinessInstancestatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryBusinessInstancestatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBusinessInstancestatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBusinessInstancestatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBusinessInstancestatusResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryBusinessInstancestatusResponse setInstanceTenant(String instanceTenant) {
        this.instanceTenant = instanceTenant;
        return this;
    }
    public String getInstanceTenant() {
        return this.instanceTenant;
    }

    public QueryBusinessInstancestatusResponse setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

}
