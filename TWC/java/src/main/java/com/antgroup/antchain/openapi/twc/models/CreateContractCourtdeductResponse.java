// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateContractCourtdeductResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 给工行上传的调解书文件名
    @NameInMap("file_name")
    public String fileName;

    // 存证txHash，存证核验时需要
    @NameInMap("tx_hash")
    public String txHash;

    // 存证原文
    @NameInMap("notary_content")
    public String notaryContent;

    // 存证原文hash
    @NameInMap("notary_content_hash")
    public String notaryContentHash;

    public static CreateContractCourtdeductResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateContractCourtdeductResponse self = new CreateContractCourtdeductResponse();
        return TeaModel.build(map, self);
    }

    public CreateContractCourtdeductResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateContractCourtdeductResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateContractCourtdeductResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateContractCourtdeductResponse setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateContractCourtdeductResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public CreateContractCourtdeductResponse setNotaryContent(String notaryContent) {
        this.notaryContent = notaryContent;
        return this;
    }
    public String getNotaryContent() {
        return this.notaryContent;
    }

    public CreateContractCourtdeductResponse setNotaryContentHash(String notaryContentHash) {
        this.notaryContentHash = notaryContentHash;
        return this;
    }
    public String getNotaryContentHash() {
        return this.notaryContentHash;
    }

}
