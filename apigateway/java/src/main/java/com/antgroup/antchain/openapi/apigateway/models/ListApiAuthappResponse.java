// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ListApiAuthappResponse extends TeaModel {
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
    public AuthAppInfoPagedListVO data;

    public static ListApiAuthappResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApiAuthappResponse self = new ListApiAuthappResponse();
        return TeaModel.build(map, self);
    }

    public ListApiAuthappResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListApiAuthappResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListApiAuthappResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListApiAuthappResponse setData(AuthAppInfoPagedListVO data) {
        this.data = data;
        return this;
    }
    public AuthAppInfoPagedListVO getData() {
        return this.data;
    }

}
