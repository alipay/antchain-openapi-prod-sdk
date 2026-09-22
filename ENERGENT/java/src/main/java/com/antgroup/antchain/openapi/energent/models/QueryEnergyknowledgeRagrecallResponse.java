// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class QueryEnergyknowledgeRagrecallResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 出参数据
    @NameInMap("datalist")
    public java.util.List<RecallDataDetail> datalist;

    public static QueryEnergyknowledgeRagrecallResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEnergyknowledgeRagrecallResponse self = new QueryEnergyknowledgeRagrecallResponse();
        return TeaModel.build(map, self);
    }

    public QueryEnergyknowledgeRagrecallResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEnergyknowledgeRagrecallResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEnergyknowledgeRagrecallResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEnergyknowledgeRagrecallResponse setDatalist(java.util.List<RecallDataDetail> datalist) {
        this.datalist = datalist;
        return this;
    }
    public java.util.List<RecallDataDetail> getDatalist() {
        return this.datalist;
    }

}
