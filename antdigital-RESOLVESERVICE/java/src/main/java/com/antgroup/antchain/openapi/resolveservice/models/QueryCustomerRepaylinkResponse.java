// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.resolveservice.models;

import com.aliyun.tea.*;

public class QueryCustomerRepaylinkResponse extends TeaModel {
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

    // 生成的链接码，如果生成失败返回null , shortLink-短信链接，checkCode-校验码
    // eg：
    // {"custNo":"CT001","shortLink":"https://lawyer.360-jr.com/common/index","checkCode":"awdwa232"}
    @NameInMap("data")
    public String data;

    public static QueryCustomerRepaylinkResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomerRepaylinkResponse self = new QueryCustomerRepaylinkResponse();
        return TeaModel.build(map, self);
    }

    public QueryCustomerRepaylinkResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCustomerRepaylinkResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCustomerRepaylinkResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCustomerRepaylinkResponse setFlag(String flag) {
        this.flag = flag;
        return this;
    }
    public String getFlag() {
        return this.flag;
    }

    public QueryCustomerRepaylinkResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public QueryCustomerRepaylinkResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public QueryCustomerRepaylinkResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
