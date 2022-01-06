// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ImportDrmDrmresourcesResponse extends TeaModel {
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

    public static ImportDrmDrmresourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportDrmDrmresourcesResponse self = new ImportDrmDrmresourcesResponse();
        return TeaModel.build(map, self);
    }

    public ImportDrmDrmresourcesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ImportDrmDrmresourcesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportDrmDrmresourcesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ImportDrmDrmresourcesResponse setImportResult(String importResult) {
        this.importResult = importResult;
        return this;
    }
    public String getImportResult() {
        return this.importResult;
    }

}
