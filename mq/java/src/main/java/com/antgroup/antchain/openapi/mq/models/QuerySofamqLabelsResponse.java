// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySofamqLabelsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 资源标签
    @NameInMap("labels")
    public java.util.List<ResourceLabelsDTO> labels;

    public static QuerySofamqLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqLabelsResponse self = new QuerySofamqLabelsResponse();
        return TeaModel.build(map, self);
    }

    public QuerySofamqLabelsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySofamqLabelsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySofamqLabelsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySofamqLabelsResponse setLabels(java.util.List<ResourceLabelsDTO> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<ResourceLabelsDTO> getLabels() {
        return this.labels;
    }

}
