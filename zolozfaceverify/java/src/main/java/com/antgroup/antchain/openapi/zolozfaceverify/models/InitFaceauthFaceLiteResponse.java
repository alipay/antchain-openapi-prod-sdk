// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.zolozfaceverify.models;

import com.aliyun.tea.*;

public class InitFaceauthFaceLiteResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 扩展结果
    @NameInMap("extern_info")
    public String externInfo;

    // 人脸协议
    @NameInMap("protocol")
    public String protocol;

    // 产品结果明细，不影响决策
    @NameInMap("result_code_sub")
    public String resultCodeSub;

    // 明细返回码对应的文案
    @NameInMap("result_msg_sub")
    public String resultMsgSub;

    // 刷脸认证唯一标识。如果初始化失败则为空，可通过返回码分析具体原因
    @NameInMap("zim_id")
    public String zimId;

    public static InitFaceauthFaceLiteResponse build(java.util.Map<String, ?> map) throws Exception {
        InitFaceauthFaceLiteResponse self = new InitFaceauthFaceLiteResponse();
        return TeaModel.build(map, self);
    }

    public InitFaceauthFaceLiteResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public InitFaceauthFaceLiteResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public InitFaceauthFaceLiteResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public InitFaceauthFaceLiteResponse setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

    public InitFaceauthFaceLiteResponse setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public InitFaceauthFaceLiteResponse setResultCodeSub(String resultCodeSub) {
        this.resultCodeSub = resultCodeSub;
        return this;
    }
    public String getResultCodeSub() {
        return this.resultCodeSub;
    }

    public InitFaceauthFaceLiteResponse setResultMsgSub(String resultMsgSub) {
        this.resultMsgSub = resultMsgSub;
        return this;
    }
    public String getResultMsgSub() {
        return this.resultMsgSub;
    }

    public InitFaceauthFaceLiteResponse setZimId(String zimId) {
        this.zimId = zimId;
        return this;
    }
    public String getZimId() {
        return this.zimId;
    }

}
