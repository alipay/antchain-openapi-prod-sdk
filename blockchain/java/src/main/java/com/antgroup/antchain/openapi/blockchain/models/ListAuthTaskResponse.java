// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ListAuthTaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 任务分页列表返回体
    @NameInMap("data")
    public PageTaskListDTO data;

    public static ListAuthTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthTaskResponse self = new ListAuthTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListAuthTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAuthTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListAuthTaskResponse setData(PageTaskListDTO data) {
        this.data = data;
        return this;
    }
    public PageTaskListDTO getData() {
        return this.data;
    }

}
