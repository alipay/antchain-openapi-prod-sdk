// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CreateIpCopyrightResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 版权登记id
    @NameInMap("copyright_register_id")
    public String copyrightRegisterId;

    public static CreateIpCopyrightResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIpCopyrightResponse self = new CreateIpCopyrightResponse();
        return TeaModel.build(map, self);
    }

    public CreateIpCopyrightResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateIpCopyrightResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateIpCopyrightResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateIpCopyrightResponse setCopyrightRegisterId(String copyrightRegisterId) {
        this.copyrightRegisterId = copyrightRegisterId;
        return this;
    }
    public String getCopyrightRegisterId() {
        return this.copyrightRegisterId;
    }

}
