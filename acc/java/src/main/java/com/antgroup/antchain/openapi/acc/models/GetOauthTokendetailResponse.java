// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class GetOauthTokendetailResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 授权token
    @NameInMap("access_token")
    public String accessToken;

    // 授权可查看的用户的信息
    @NameInMap("data_grant")
    public UserData dataGrant;

    public static GetOauthTokendetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOauthTokendetailResponse self = new GetOauthTokendetailResponse();
        return TeaModel.build(map, self);
    }

    public GetOauthTokendetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetOauthTokendetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetOauthTokendetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetOauthTokendetailResponse setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public GetOauthTokendetailResponse setDataGrant(UserData dataGrant) {
        this.dataGrant = dataGrant;
        return this;
    }
    public UserData getDataGrant() {
        return this.dataGrant;
    }

}
