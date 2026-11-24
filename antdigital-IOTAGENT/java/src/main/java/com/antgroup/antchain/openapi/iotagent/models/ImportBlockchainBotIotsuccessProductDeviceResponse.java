// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class ImportBlockchainBotIotsuccessProductDeviceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 已有导入链已提交的MAC，不等于注册完成或已激活
    @NameInMap("success_uid_list")
    @Validation(required = true)
    public java.util.List<String> successUidList;

    // 已有设备记录的MAC，可能仍在REGISTERING；沿旧名单语义
    @NameInMap("existed_uid_list")
    @Validation(required = true)
    public java.util.List<String> existedUidList;

    // 已有MAC校验判定无效的输入
    @NameInMap("invalid_uid_list")
    @Validation(required = true)
    public java.util.List<String> invalidUidList;

    public static ImportBlockchainBotIotsuccessProductDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportBlockchainBotIotsuccessProductDeviceResponse self = new ImportBlockchainBotIotsuccessProductDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ImportBlockchainBotIotsuccessProductDeviceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ImportBlockchainBotIotsuccessProductDeviceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportBlockchainBotIotsuccessProductDeviceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ImportBlockchainBotIotsuccessProductDeviceResponse setSuccessUidList(java.util.List<String> successUidList) {
        this.successUidList = successUidList;
        return this;
    }
    public java.util.List<String> getSuccessUidList() {
        return this.successUidList;
    }

    public ImportBlockchainBotIotsuccessProductDeviceResponse setExistedUidList(java.util.List<String> existedUidList) {
        this.existedUidList = existedUidList;
        return this;
    }
    public java.util.List<String> getExistedUidList() {
        return this.existedUidList;
    }

    public ImportBlockchainBotIotsuccessProductDeviceResponse setInvalidUidList(java.util.List<String> invalidUidList) {
        this.invalidUidList = invalidUidList;
        return this;
    }
    public java.util.List<String> getInvalidUidList() {
        return this.invalidUidList;
    }

}
