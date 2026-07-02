// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ImportIotbasicDeviceorderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 链上hash地址
    @NameInMap("antchain_id")
    public String antchainId;

    // 代表接口是否处理成功
    @NameInMap("success")
    public Boolean success;

    public static ImportIotbasicDeviceorderResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportIotbasicDeviceorderResponse self = new ImportIotbasicDeviceorderResponse();
        return TeaModel.build(map, self);
    }

    public ImportIotbasicDeviceorderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ImportIotbasicDeviceorderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportIotbasicDeviceorderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ImportIotbasicDeviceorderResponse setAntchainId(String antchainId) {
        this.antchainId = antchainId;
        return this;
    }
    public String getAntchainId() {
        return this.antchainId;
    }

    public ImportIotbasicDeviceorderResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
