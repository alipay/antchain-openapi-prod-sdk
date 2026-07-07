// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.resolveservice.models;

import com.aliyun.tea.*;

public class QueryCustomerTransartificialResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // S:成功,F:失败
    @NameInMap("flag")
    public String flag;

    // 0:成功,1:失败
    @NameInMap("code")
    public Long code;

    // 成功or失败
    @NameInMap("msg")
    public String msg;

    // SON字符串，返回是否可提前转人工
    // transArtificial : 默认N-不转人工，Y-转人工
    // eg：
    // {"custNo":"CT001","transArtificial":"Y"}
    @NameInMap("data")
    public String data;

    public static QueryCustomerTransartificialResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomerTransartificialResponse self = new QueryCustomerTransartificialResponse();
        return TeaModel.build(map, self);
    }

    public QueryCustomerTransartificialResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCustomerTransartificialResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCustomerTransartificialResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCustomerTransartificialResponse setFlag(String flag) {
        this.flag = flag;
        return this;
    }
    public String getFlag() {
        return this.flag;
    }

    public QueryCustomerTransartificialResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public QueryCustomerTransartificialResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public QueryCustomerTransartificialResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
