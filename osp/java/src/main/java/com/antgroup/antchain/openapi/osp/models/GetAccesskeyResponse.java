// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.osp.models;

import com.aliyun.tea.*;

public class GetAccesskeyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // AccessKey对象
    @NameInMap("accesskey")
    public AccessKey accesskey;

    public static GetAccesskeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccesskeyResponse self = new GetAccesskeyResponse();
        return TeaModel.build(map, self);
    }

    public GetAccesskeyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAccesskeyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAccesskeyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAccesskeyResponse setAccesskey(AccessKey accesskey) {
        this.accesskey = accesskey;
        return this;
    }
    public AccessKey getAccesskey() {
        return this.accesskey;
    }

}
