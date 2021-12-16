// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class BatchqueryTradecoreSoldspecinstanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 某开发商已售给某商户的所有规格实例信息
    @NameInMap("sold_spec_instances")
    public java.util.List<SoldSpecInstance> soldSpecInstances;

    public static BatchqueryTradecoreSoldspecinstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryTradecoreSoldspecinstanceResponse self = new BatchqueryTradecoreSoldspecinstanceResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryTradecoreSoldspecinstanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryTradecoreSoldspecinstanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryTradecoreSoldspecinstanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryTradecoreSoldspecinstanceResponse setSoldSpecInstances(java.util.List<SoldSpecInstance> soldSpecInstances) {
        this.soldSpecInstances = soldSpecInstances;
        return this;
    }
    public java.util.List<SoldSpecInstance> getSoldSpecInstances() {
        return this.soldSpecInstances;
    }

}
