// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryServiceProcesslogResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // Log列表
    @NameInMap("log_list")
    public java.util.List<ServiceProcessLog> logList;

    public static QueryServiceProcesslogResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryServiceProcesslogResponse self = new QueryServiceProcesslogResponse();
        return TeaModel.build(map, self);
    }

    public QueryServiceProcesslogResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryServiceProcesslogResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryServiceProcesslogResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryServiceProcesslogResponse setLogList(java.util.List<ServiceProcessLog> logList) {
        this.logList = logList;
        return this;
    }
    public java.util.List<ServiceProcessLog> getLogList() {
        return this.logList;
    }

}
