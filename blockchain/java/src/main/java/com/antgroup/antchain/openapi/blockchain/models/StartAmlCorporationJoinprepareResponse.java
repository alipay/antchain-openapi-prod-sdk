// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartAmlCorporationJoinprepareResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 企业在反洗钱联盟中的唯一区块链标示，后续和平台的交互都要通过该标示
    @NameInMap("did")
    public String did;

    // mytf的认证信息，加盟方可以验证其有效性
    @NameInMap("mytf_info")
    public String mytfInfo;

    // 平台提供的各类tapp信息，入驻方需要从中选择自己使用的tapp，并记录下tapp的加密私钥和签名密钥；后续平台发给加盟放的所有信息都会携带签名；而所有发往TAPP的数据都需要使用对应加密公钥进行加密来保证数据安全
    @NameInMap("tapp_infos")
    public java.util.List<String> tappInfos;

    public static StartAmlCorporationJoinprepareResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAmlCorporationJoinprepareResponse self = new StartAmlCorporationJoinprepareResponse();
        return TeaModel.build(map, self);
    }

    public StartAmlCorporationJoinprepareResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartAmlCorporationJoinprepareResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartAmlCorporationJoinprepareResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartAmlCorporationJoinprepareResponse setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartAmlCorporationJoinprepareResponse setMytfInfo(String mytfInfo) {
        this.mytfInfo = mytfInfo;
        return this;
    }
    public String getMytfInfo() {
        return this.mytfInfo;
    }

    public StartAmlCorporationJoinprepareResponse setTappInfos(java.util.List<String> tappInfos) {
        this.tappInfos = tappInfos;
        return this;
    }
    public java.util.List<String> getTappInfos() {
        return this.tappInfos;
    }

}
