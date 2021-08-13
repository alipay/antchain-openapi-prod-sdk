// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class SignIpOrdercontractResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 签署完成的文件OSS key。只有在签署流程全部完成后才会返回该数据。
    @NameInMap("signed_contract_file")
    public String signedContractFile;

    // 签署完成的文件下载链接。只有在签署流程全部完成后才会返回该数据。
    @NameInMap("signed_contract_file_url")
    public String signedContractFileUrl;

    public static SignIpOrdercontractResponse build(java.util.Map<String, ?> map) throws Exception {
        SignIpOrdercontractResponse self = new SignIpOrdercontractResponse();
        return TeaModel.build(map, self);
    }

    public SignIpOrdercontractResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SignIpOrdercontractResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SignIpOrdercontractResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SignIpOrdercontractResponse setSignedContractFile(String signedContractFile) {
        this.signedContractFile = signedContractFile;
        return this;
    }
    public String getSignedContractFile() {
        return this.signedContractFile;
    }

    public SignIpOrdercontractResponse setSignedContractFileUrl(String signedContractFileUrl) {
        this.signedContractFileUrl = signedContractFileUrl;
        return this;
    }
    public String getSignedContractFileUrl() {
        return this.signedContractFileUrl;
    }

}
