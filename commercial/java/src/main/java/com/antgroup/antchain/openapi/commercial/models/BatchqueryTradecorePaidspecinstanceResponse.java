// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class BatchqueryTradecorePaidspecinstanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 所有符合条件的规格实例的部分信息
    @NameInMap("paid_spec_instances")
    public java.util.List<PaidSpecInstance> paidSpecInstances;

    public static BatchqueryTradecorePaidspecinstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryTradecorePaidspecinstanceResponse self = new BatchqueryTradecorePaidspecinstanceResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryTradecorePaidspecinstanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryTradecorePaidspecinstanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryTradecorePaidspecinstanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryTradecorePaidspecinstanceResponse setPaidSpecInstances(java.util.List<PaidSpecInstance> paidSpecInstances) {
        this.paidSpecInstances = paidSpecInstances;
        return this;
    }
    public java.util.List<PaidSpecInstance> getPaidSpecInstances() {
        return this.paidSpecInstances;
    }

}
