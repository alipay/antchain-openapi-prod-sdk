// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractCompanyfourmetacheckResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否验证通过: true-通过, false-不通过
    @NameInMap("pass")
    public Boolean pass;

    // 验证信息: pass=false生效
    @NameInMap("message")
    public String message;

    public static QueryContractCompanyfourmetacheckResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContractCompanyfourmetacheckResponse self = new QueryContractCompanyfourmetacheckResponse();
        return TeaModel.build(map, self);
    }

    public QueryContractCompanyfourmetacheckResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryContractCompanyfourmetacheckResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryContractCompanyfourmetacheckResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryContractCompanyfourmetacheckResponse setPass(Boolean pass) {
        this.pass = pass;
        return this;
    }
    public Boolean getPass() {
        return this.pass;
    }

    public QueryContractCompanyfourmetacheckResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
