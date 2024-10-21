// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class PagequeryIssuerSubuserResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 二级用户列表
    @NameInMap("data")
    public SubUserAccountPageData data;

    public static PagequeryIssuerSubuserResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryIssuerSubuserResponse self = new PagequeryIssuerSubuserResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryIssuerSubuserResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryIssuerSubuserResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryIssuerSubuserResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryIssuerSubuserResponse setData(SubUserAccountPageData data) {
        this.data = data;
        return this;
    }
    public SubUserAccountPageData getData() {
        return this.data;
    }

}
