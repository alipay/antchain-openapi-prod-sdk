// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ListExternalauthResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // data
    @NameInMap("data")
    public ExternalAuthInfoPagedListVO data;

    public static ListExternalauthResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExternalauthResponse self = new ListExternalauthResponse();
        return TeaModel.build(map, self);
    }

    public ListExternalauthResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListExternalauthResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListExternalauthResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListExternalauthResponse setData(ExternalAuthInfoPagedListVO data) {
        this.data = data;
        return this;
    }
    public ExternalAuthInfoPagedListVO getData() {
        return this.data;
    }

}
