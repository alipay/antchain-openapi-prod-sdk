// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class AddContractSignfieldResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 业务码，0表示成功
    @NameInMap("code")
    public Long code;

    // 业务码信息
    @NameInMap("message")
    public String message;

    // 签署区列表数据
    @NameInMap("signfields")
    public java.util.List<ContractSignField> signfields;

    public static AddContractSignfieldResponse build(java.util.Map<String, ?> map) throws Exception {
        AddContractSignfieldResponse self = new AddContractSignfieldResponse();
        return TeaModel.build(map, self);
    }

    public AddContractSignfieldResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AddContractSignfieldResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddContractSignfieldResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AddContractSignfieldResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public AddContractSignfieldResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddContractSignfieldResponse setSignfields(java.util.List<ContractSignField> signfields) {
        this.signfields = signfields;
        return this;
    }
    public java.util.List<ContractSignField> getSignfields() {
        return this.signfields;
    }

}
