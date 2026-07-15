// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class UpdateContractPlatformResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 状态码
    @NameInMap("code")
    public String code;

    // 状态信息
    @NameInMap("message")
    public String message;

    // 更新后平台方企业信息
    @NameInMap("platform")
    public ContractPlatformApplication platform;

    // 更新后平台方经办人信息
    @NameInMap("creator")
    public ContractCreatorApplication creator;

    public static UpdateContractPlatformResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateContractPlatformResponse self = new UpdateContractPlatformResponse();
        return TeaModel.build(map, self);
    }

    public UpdateContractPlatformResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateContractPlatformResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateContractPlatformResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateContractPlatformResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateContractPlatformResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateContractPlatformResponse setPlatform(ContractPlatformApplication platform) {
        this.platform = platform;
        return this;
    }
    public ContractPlatformApplication getPlatform() {
        return this.platform;
    }

    public UpdateContractPlatformResponse setCreator(ContractCreatorApplication creator) {
        this.creator = creator;
        return this;
    }
    public ContractCreatorApplication getCreator() {
        return this.creator;
    }

}
