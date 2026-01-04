// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class ListLibraryTaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 知识库-任务列表result
    @NameInMap("data")
    public LibraryContentTaskPageResult data;

    public static ListLibraryTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLibraryTaskResponse self = new ListLibraryTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListLibraryTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListLibraryTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLibraryTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListLibraryTaskResponse setData(LibraryContentTaskPageResult data) {
        this.data = data;
        return this;
    }
    public LibraryContentTaskPageResult getData() {
        return this.data;
    }

}
