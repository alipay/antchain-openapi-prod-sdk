// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateBusinessContractGrantcorpResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 授权的字段列表
    @NameInMap("data")
    public java.util.List<String> data;

    // 是否授权给组织成功，0表示成功
    @NameInMap("status")
    public Long status;

    public static CreateBusinessContractGrantcorpResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBusinessContractGrantcorpResponse self = new CreateBusinessContractGrantcorpResponse();
        return TeaModel.build(map, self);
    }

    public CreateBusinessContractGrantcorpResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateBusinessContractGrantcorpResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateBusinessContractGrantcorpResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateBusinessContractGrantcorpResponse setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

    public CreateBusinessContractGrantcorpResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
