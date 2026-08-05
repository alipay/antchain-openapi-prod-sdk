// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class DeactivateAntchainDasKyaDidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // did
    @NameInMap("did")
    public String did;

    // resolver 权威版本号
    @NameInMap("version_id")
    public String versionId;

    // 是否停用
    @NameInMap("deactivated")
    public Boolean deactivated;

    public static DeactivateAntchainDasKyaDidResponse build(java.util.Map<String, ?> map) throws Exception {
        DeactivateAntchainDasKyaDidResponse self = new DeactivateAntchainDasKyaDidResponse();
        return TeaModel.build(map, self);
    }

    public DeactivateAntchainDasKyaDidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DeactivateAntchainDasKyaDidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeactivateAntchainDasKyaDidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DeactivateAntchainDasKyaDidResponse setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public DeactivateAntchainDasKyaDidResponse setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public DeactivateAntchainDasKyaDidResponse setDeactivated(Boolean deactivated) {
        this.deactivated = deactivated;
        return this;
    }
    public Boolean getDeactivated() {
        return this.deactivated;
    }

}
