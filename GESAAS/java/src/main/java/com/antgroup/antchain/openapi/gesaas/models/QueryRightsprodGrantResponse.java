// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class QueryRightsprodGrantResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 权益发放结果
    @NameInMap("rights_grant_result")
    public RightsGrantResultVO rightsGrantResult;

    public static QueryRightsprodGrantResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRightsprodGrantResponse self = new QueryRightsprodGrantResponse();
        return TeaModel.build(map, self);
    }

    public QueryRightsprodGrantResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRightsprodGrantResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRightsprodGrantResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRightsprodGrantResponse setRightsGrantResult(RightsGrantResultVO rightsGrantResult) {
        this.rightsGrantResult = rightsGrantResult;
        return this;
    }
    public RightsGrantResultVO getRightsGrantResult() {
        return this.rightsGrantResult;
    }

}
