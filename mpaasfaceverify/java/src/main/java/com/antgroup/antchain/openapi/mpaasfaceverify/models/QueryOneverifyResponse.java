// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mpaasfaceverify.models;

import com.aliyun.tea.*;

public class QueryOneverifyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 手机号
    @NameInMap("phone")
    public String phone;

    // 预留扩展结果
    @NameInMap("extern_info")
    public String externInfo;

    // 产品结果明细，不影响决策
    @NameInMap("result_code_sub")
    public String resultCodeSub;

    // result_code_sub对应的文案
    @NameInMap("result_msg_sub")
    public String resultMsgSub;

    public static QueryOneverifyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOneverifyResponse self = new QueryOneverifyResponse();
        return TeaModel.build(map, self);
    }

    public QueryOneverifyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryOneverifyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryOneverifyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryOneverifyResponse setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public QueryOneverifyResponse setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

    public QueryOneverifyResponse setResultCodeSub(String resultCodeSub) {
        this.resultCodeSub = resultCodeSub;
        return this;
    }
    public String getResultCodeSub() {
        return this.resultCodeSub;
    }

    public QueryOneverifyResponse setResultMsgSub(String resultMsgSub) {
        this.resultMsgSub = resultMsgSub;
        return this;
    }
    public String getResultMsgSub() {
        return this.resultMsgSub;
    }

}
