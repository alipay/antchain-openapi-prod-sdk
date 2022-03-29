// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySofamqConnectorprocessResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 工单详情
    @NameInMap("process_infos")
    public java.util.List<ProcessDTO> processInfos;

    public static QuerySofamqConnectorprocessResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqConnectorprocessResponse self = new QuerySofamqConnectorprocessResponse();
        return TeaModel.build(map, self);
    }

    public QuerySofamqConnectorprocessResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySofamqConnectorprocessResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySofamqConnectorprocessResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySofamqConnectorprocessResponse setProcessInfos(java.util.List<ProcessDTO> processInfos) {
        this.processInfos = processInfos;
        return this;
    }
    public java.util.List<ProcessDTO> getProcessInfos() {
        return this.processInfos;
    }

}
