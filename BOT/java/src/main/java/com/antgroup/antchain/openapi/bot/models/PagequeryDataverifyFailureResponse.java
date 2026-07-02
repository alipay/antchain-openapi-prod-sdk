// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PagequeryDataverifyFailureResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数据
    @NameInMap("data")
    public DataVerifyFailureDataPageResponse data;

    public static PagequeryDataverifyFailureResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryDataverifyFailureResponse self = new PagequeryDataverifyFailureResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryDataverifyFailureResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryDataverifyFailureResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryDataverifyFailureResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryDataverifyFailureResponse setData(DataVerifyFailureDataPageResponse data) {
        this.data = data;
        return this;
    }
    public DataVerifyFailureDataPageResponse getData() {
        return this.data;
    }

}
