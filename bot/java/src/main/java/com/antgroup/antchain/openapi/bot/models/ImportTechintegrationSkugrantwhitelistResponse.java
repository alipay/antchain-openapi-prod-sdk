// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ImportTechintegrationSkugrantwhitelistResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 成功导入的sn列表
    @NameInMap("success_sn_list")
    public java.util.List<String> successSnList;

    // 已经存在的sn列表（不会导入）
    @NameInMap("existed_sn_list")
    public java.util.List<String> existedSnList;

    // 不合法的sn列表（不会导入）
    @NameInMap("invalid_sn_list")
    public java.util.List<String> invalidSnList;

    public static ImportTechintegrationSkugrantwhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportTechintegrationSkugrantwhitelistResponse self = new ImportTechintegrationSkugrantwhitelistResponse();
        return TeaModel.build(map, self);
    }

    public ImportTechintegrationSkugrantwhitelistResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ImportTechintegrationSkugrantwhitelistResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportTechintegrationSkugrantwhitelistResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ImportTechintegrationSkugrantwhitelistResponse setSuccessSnList(java.util.List<String> successSnList) {
        this.successSnList = successSnList;
        return this;
    }
    public java.util.List<String> getSuccessSnList() {
        return this.successSnList;
    }

    public ImportTechintegrationSkugrantwhitelistResponse setExistedSnList(java.util.List<String> existedSnList) {
        this.existedSnList = existedSnList;
        return this;
    }
    public java.util.List<String> getExistedSnList() {
        return this.existedSnList;
    }

    public ImportTechintegrationSkugrantwhitelistResponse setInvalidSnList(java.util.List<String> invalidSnList) {
        this.invalidSnList = invalidSnList;
        return this;
    }
    public java.util.List<String> getInvalidSnList() {
        return this.invalidSnList;
    }

}
