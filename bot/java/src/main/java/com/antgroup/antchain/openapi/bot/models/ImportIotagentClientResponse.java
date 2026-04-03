// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ImportIotagentClientResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 成功导入的设备标识列表
    @NameInMap("success_uid_list")
    public java.util.List<String> successUidList;

    // 已经存在的设备标识列表（不会导入）
    @NameInMap("existed_uid_list")
    public java.util.List<String> existedUidList;

    // 不合法的设备标识列表（不会导入）
    @NameInMap("invalid_uid_list")
    public java.util.List<String> invalidUidList;

    public static ImportIotagentClientResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportIotagentClientResponse self = new ImportIotagentClientResponse();
        return TeaModel.build(map, self);
    }

    public ImportIotagentClientResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ImportIotagentClientResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportIotagentClientResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ImportIotagentClientResponse setSuccessUidList(java.util.List<String> successUidList) {
        this.successUidList = successUidList;
        return this;
    }
    public java.util.List<String> getSuccessUidList() {
        return this.successUidList;
    }

    public ImportIotagentClientResponse setExistedUidList(java.util.List<String> existedUidList) {
        this.existedUidList = existedUidList;
        return this;
    }
    public java.util.List<String> getExistedUidList() {
        return this.existedUidList;
    }

    public ImportIotagentClientResponse setInvalidUidList(java.util.List<String> invalidUidList) {
        this.invalidUidList = invalidUidList;
        return this;
    }
    public java.util.List<String> getInvalidUidList() {
        return this.invalidUidList;
    }

}
