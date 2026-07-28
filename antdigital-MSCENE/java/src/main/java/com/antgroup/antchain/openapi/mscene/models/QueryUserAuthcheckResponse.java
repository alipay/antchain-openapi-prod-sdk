// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mscene.models;

import com.aliyun.tea.*;

public class QueryUserAuthcheckResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求是否成功
    @NameInMap("success")
    public Boolean success;

    // 用户校验响应结果
    @NameInMap("mpaas_user_auth_check_response")
    public MpaasUserAuthCheckResponse mpaasUserAuthCheckResponse;

    public static QueryUserAuthcheckResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserAuthcheckResponse self = new QueryUserAuthcheckResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserAuthcheckResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUserAuthcheckResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUserAuthcheckResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUserAuthcheckResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryUserAuthcheckResponse setMpaasUserAuthCheckResponse(MpaasUserAuthCheckResponse mpaasUserAuthCheckResponse) {
        this.mpaasUserAuthCheckResponse = mpaasUserAuthCheckResponse;
        return this;
    }
    public MpaasUserAuthCheckResponse getMpaasUserAuthCheckResponse() {
        return this.mpaasUserAuthCheckResponse;
    }

}
