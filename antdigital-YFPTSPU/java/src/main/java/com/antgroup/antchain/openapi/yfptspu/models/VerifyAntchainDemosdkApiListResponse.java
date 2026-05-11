// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yfptspu.models;

import com.aliyun.tea.*;

public class VerifyAntchainDemosdkApiListResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 状态
    @NameInMap("stauts")
    public String stauts;

    // 描述
    @NameInMap("msg")
    public String msg;

    // copy
    @NameInMap("init_desc")
    public String initDesc;

    // 组合返回请求结果
    @NameInMap("init_pack")
    public InitPack initPack;

    public static VerifyAntchainDemosdkApiListResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyAntchainDemosdkApiListResponse self = new VerifyAntchainDemosdkApiListResponse();
        return TeaModel.build(map, self);
    }

    public VerifyAntchainDemosdkApiListResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifyAntchainDemosdkApiListResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifyAntchainDemosdkApiListResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VerifyAntchainDemosdkApiListResponse setStauts(String stauts) {
        this.stauts = stauts;
        return this;
    }
    public String getStauts() {
        return this.stauts;
    }

    public VerifyAntchainDemosdkApiListResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public VerifyAntchainDemosdkApiListResponse setInitDesc(String initDesc) {
        this.initDesc = initDesc;
        return this;
    }
    public String getInitDesc() {
        return this.initDesc;
    }

    public VerifyAntchainDemosdkApiListResponse setInitPack(InitPack initPack) {
        this.initPack = initPack;
        return this;
    }
    public InitPack getInitPack() {
        return this.initPack;
    }

}
