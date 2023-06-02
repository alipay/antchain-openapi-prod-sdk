// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class QueryOperationtypeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 操作类型列表
    @NameInMap("operation_types")
    public java.util.List<OperationType> operationTypes;

    public static QueryOperationtypeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOperationtypeResponse self = new QueryOperationtypeResponse();
        return TeaModel.build(map, self);
    }

    public QueryOperationtypeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryOperationtypeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryOperationtypeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryOperationtypeResponse setOperationTypes(java.util.List<OperationType> operationTypes) {
        this.operationTypes = operationTypes;
        return this;
    }
    public java.util.List<OperationType> getOperationTypes() {
        return this.operationTypes;
    }

}
