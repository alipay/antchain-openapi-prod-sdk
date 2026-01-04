// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class PagequeryMcpMymcpResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // MyMCP分页对象
    @NameInMap("data")
    public MyMcpPageRestult data;

    public static PagequeryMcpMymcpResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryMcpMymcpResponse self = new PagequeryMcpMymcpResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryMcpMymcpResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryMcpMymcpResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryMcpMymcpResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryMcpMymcpResponse setData(MyMcpPageRestult data) {
        this.data = data;
        return this;
    }
    public MyMcpPageRestult getData() {
        return this.data;
    }

}
