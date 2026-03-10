// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeUsecreditstatusLxResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用信审批状态，
    // 0、成功
    // 1、失败
    // 2、审批中
    // 3、查无此单(重新发起用信申请接口,需要保证用信申请幂等)
    @NameInMap("status")
    public Long status;

    // 用信审批描述，失败时，需给出的错误描述
    @NameInMap("msg")
    public String msg;

    public static QueryDubbridgeUsecreditstatusLxResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeUsecreditstatusLxResponse self = new QueryDubbridgeUsecreditstatusLxResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeUsecreditstatusLxResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeUsecreditstatusLxResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeUsecreditstatusLxResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeUsecreditstatusLxResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public QueryDubbridgeUsecreditstatusLxResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
