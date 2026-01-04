// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class ListLibraryDocResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 响应体
    @NameInMap("data")
    public LibraryDocPageResult data;

    public static ListLibraryDocResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLibraryDocResponse self = new ListLibraryDocResponse();
        return TeaModel.build(map, self);
    }

    public ListLibraryDocResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListLibraryDocResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLibraryDocResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListLibraryDocResponse setData(LibraryDocPageResult data) {
        this.data = data;
        return this;
    }
    public LibraryDocPageResult getData() {
        return this.data;
    }

}
