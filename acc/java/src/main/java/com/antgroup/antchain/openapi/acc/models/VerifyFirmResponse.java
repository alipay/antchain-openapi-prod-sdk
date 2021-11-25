// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class VerifyFirmResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 企业分布式did
    @NameInMap("did")
    public String did;

    // 法人认证信息
    @NameInMap("certify_lp_dto")
    public CertifyLPDTO certifyLpDto;

    public static VerifyFirmResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyFirmResponse self = new VerifyFirmResponse();
        return TeaModel.build(map, self);
    }

    public VerifyFirmResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifyFirmResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifyFirmResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VerifyFirmResponse setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public VerifyFirmResponse setCertifyLpDto(CertifyLPDTO certifyLpDto) {
        this.certifyLpDto = certifyLpDto;
        return this;
    }
    public CertifyLPDTO getCertifyLpDto() {
        return this.certifyLpDto;
    }

}
