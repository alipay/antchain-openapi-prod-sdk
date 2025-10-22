// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class MatchCarloanUsersResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 成功或者失败
    @NameInMap("is_success")
    public String isSuccess;

    public static MatchCarloanUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        MatchCarloanUsersResponse self = new MatchCarloanUsersResponse();
        return TeaModel.build(map, self);
    }

    public MatchCarloanUsersResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public MatchCarloanUsersResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public MatchCarloanUsersResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public MatchCarloanUsersResponse setIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public String getIsSuccess() {
        return this.isSuccess;
    }

}
