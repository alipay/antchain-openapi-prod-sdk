// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PagequeryProductkeyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 分页查询结果
    @NameInMap("data")
    public ProductKeyPageResponse data;

    public static PagequeryProductkeyResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryProductkeyResponse self = new PagequeryProductkeyResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryProductkeyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryProductkeyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryProductkeyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryProductkeyResponse setData(ProductKeyPageResponse data) {
        this.data = data;
        return this;
    }
    public ProductKeyPageResponse getData() {
        return this.data;
    }

}
