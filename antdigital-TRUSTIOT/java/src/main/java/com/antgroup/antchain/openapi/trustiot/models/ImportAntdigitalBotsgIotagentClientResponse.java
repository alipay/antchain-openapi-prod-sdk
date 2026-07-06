// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trustiot.models;

import com.aliyun.tea.*;

public class ImportAntdigitalBotsgIotagentClientResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 成功加白的UID列表
    @NameInMap("success_uid_list")
    public java.util.List<String> successUidList;

    // 已存在的UID列表
    @NameInMap("existed_uid_list")
    public java.util.List<String> existedUidList;

    // 无效的UID列表
    @NameInMap("invalid_uid_list")
    public java.util.List<String> invalidUidList;

    public static ImportAntdigitalBotsgIotagentClientResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportAntdigitalBotsgIotagentClientResponse self = new ImportAntdigitalBotsgIotagentClientResponse();
        return TeaModel.build(map, self);
    }

    public ImportAntdigitalBotsgIotagentClientResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ImportAntdigitalBotsgIotagentClientResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportAntdigitalBotsgIotagentClientResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ImportAntdigitalBotsgIotagentClientResponse setSuccessUidList(java.util.List<String> successUidList) {
        this.successUidList = successUidList;
        return this;
    }
    public java.util.List<String> getSuccessUidList() {
        return this.successUidList;
    }

    public ImportAntdigitalBotsgIotagentClientResponse setExistedUidList(java.util.List<String> existedUidList) {
        this.existedUidList = existedUidList;
        return this;
    }
    public java.util.List<String> getExistedUidList() {
        return this.existedUidList;
    }

    public ImportAntdigitalBotsgIotagentClientResponse setInvalidUidList(java.util.List<String> invalidUidList) {
        this.invalidUidList = invalidUidList;
        return this;
    }
    public java.util.List<String> getInvalidUidList() {
        return this.invalidUidList;
    }

}
