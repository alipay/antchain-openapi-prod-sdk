// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class FeedbackInnerMermngcontractauditincompleteResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数量
    @NameInMap("count")
    public Long count;

    public static FeedbackInnerMermngcontractauditincompleteResponse build(java.util.Map<String, ?> map) throws Exception {
        FeedbackInnerMermngcontractauditincompleteResponse self = new FeedbackInnerMermngcontractauditincompleteResponse();
        return TeaModel.build(map, self);
    }

    public FeedbackInnerMermngcontractauditincompleteResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public FeedbackInnerMermngcontractauditincompleteResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public FeedbackInnerMermngcontractauditincompleteResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public FeedbackInnerMermngcontractauditincompleteResponse setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

}
