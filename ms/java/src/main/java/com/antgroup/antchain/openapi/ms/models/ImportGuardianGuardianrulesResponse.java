// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ImportGuardianGuardianrulesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 导入结果
    @NameInMap("import_result")
    public String importResult;

    public static ImportGuardianGuardianrulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportGuardianGuardianrulesResponse self = new ImportGuardianGuardianrulesResponse();
        return TeaModel.build(map, self);
    }

    public ImportGuardianGuardianrulesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ImportGuardianGuardianrulesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportGuardianGuardianrulesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ImportGuardianGuardianrulesResponse setImportResult(String importResult) {
        this.importResult = importResult;
        return this;
    }
    public String getImportResult() {
        return this.importResult;
    }

}
