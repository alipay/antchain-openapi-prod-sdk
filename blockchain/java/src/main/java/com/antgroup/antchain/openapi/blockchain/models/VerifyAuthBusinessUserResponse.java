// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class VerifyAuthBusinessUserResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户当前记录状态
    @NameInMap("record_type")
    public String recordType;

    // 加密后的用户授权记录id
    @NameInMap("encrypt_biz_id")
    public String encryptBizId;

    // 授权协议信息列表
    @NameInMap("agreement_config_info_list")
    public java.util.List<AgreementConfigInfoDTO> agreementConfigInfoList;

    public static VerifyAuthBusinessUserResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyAuthBusinessUserResponse self = new VerifyAuthBusinessUserResponse();
        return TeaModel.build(map, self);
    }

    public VerifyAuthBusinessUserResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifyAuthBusinessUserResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifyAuthBusinessUserResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VerifyAuthBusinessUserResponse setRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }
    public String getRecordType() {
        return this.recordType;
    }

    public VerifyAuthBusinessUserResponse setEncryptBizId(String encryptBizId) {
        this.encryptBizId = encryptBizId;
        return this;
    }
    public String getEncryptBizId() {
        return this.encryptBizId;
    }

    public VerifyAuthBusinessUserResponse setAgreementConfigInfoList(java.util.List<AgreementConfigInfoDTO> agreementConfigInfoList) {
        this.agreementConfigInfoList = agreementConfigInfoList;
        return this;
    }
    public java.util.List<AgreementConfigInfoDTO> getAgreementConfigInfoList() {
        return this.agreementConfigInfoList;
    }

}
