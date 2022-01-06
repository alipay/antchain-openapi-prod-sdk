// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class GetSgRelationswitchResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 显示关系切换
    @NameInMap("resp")
    public String resp;

    public static GetSgRelationswitchResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSgRelationswitchResponse self = new GetSgRelationswitchResponse();
        return TeaModel.build(map, self);
    }

    public GetSgRelationswitchResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetSgRelationswitchResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetSgRelationswitchResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetSgRelationswitchResponse setResp(String resp) {
        this.resp = resp;
        return this;
    }
    public String getResp() {
        return this.resp;
    }

}
