// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_20ab7e4471e24e8fbfaa7df4ba0613c8.models;

import com.aliyun.tea.*;

public class CreateBaasDidCorporateWiththreemetaResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 生成的did
    @NameInMap("did")
    public String did;

    // 颁发的vcId
    @NameInMap("vc_id")
    public String vcId;

    public static CreateBaasDidCorporateWiththreemetaResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBaasDidCorporateWiththreemetaResponse self = new CreateBaasDidCorporateWiththreemetaResponse();
        return TeaModel.build(map, self);
    }

    public CreateBaasDidCorporateWiththreemetaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateBaasDidCorporateWiththreemetaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateBaasDidCorporateWiththreemetaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateBaasDidCorporateWiththreemetaResponse setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public CreateBaasDidCorporateWiththreemetaResponse setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

}
