// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryOpenchainUserDataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户数据
    @NameInMap("user_data")
    public java.util.List<OCUserData> userData;

    public static QueryOpenchainUserDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOpenchainUserDataResponse self = new QueryOpenchainUserDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryOpenchainUserDataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryOpenchainUserDataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryOpenchainUserDataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryOpenchainUserDataResponse setUserData(java.util.List<OCUserData> userData) {
        this.userData = userData;
        return this;
    }
    public java.util.List<OCUserData> getUserData() {
        return this.userData;
    }

}
