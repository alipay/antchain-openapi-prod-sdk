// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class QueryHrUserResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 查询用户信息结果
    @NameInMap("user_info_result")
    public UserInfoResult userInfoResult;

    public static QueryHrUserResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHrUserResponse self = new QueryHrUserResponse();
        return TeaModel.build(map, self);
    }

    public QueryHrUserResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryHrUserResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHrUserResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryHrUserResponse setUserInfoResult(UserInfoResult userInfoResult) {
        this.userInfoResult = userInfoResult;
        return this;
    }
    public UserInfoResult getUserInfoResult() {
        return this.userInfoResult;
    }

}
