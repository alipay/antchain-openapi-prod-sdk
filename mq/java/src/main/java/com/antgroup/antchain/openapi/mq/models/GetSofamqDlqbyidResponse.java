// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class GetSofamqDlqbyidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 查询结果
    @NameInMap("data")
    public MessageGetDTO data;

    public static GetSofamqDlqbyidResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSofamqDlqbyidResponse self = new GetSofamqDlqbyidResponse();
        return TeaModel.build(map, self);
    }

    public GetSofamqDlqbyidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetSofamqDlqbyidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetSofamqDlqbyidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetSofamqDlqbyidResponse setData(MessageGetDTO data) {
        this.data = data;
        return this;
    }
    public MessageGetDTO getData() {
        return this.data;
    }

}
