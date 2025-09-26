// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.zolozfaceverify.models;

import com.aliyun.tea.*;

public class VerifyFaceauthZimResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 预留扩展结果
    @NameInMap("ext_params")
    public String extParams;

    // ""
    @NameInMap("has_next")
    public String hasNext;

    // ""
    @NameInMap("next_protocol")
    public String nextProtocol;

    // 产品返回明细码
    @NameInMap("product_ret_code")
    public String productRetCode;

    // 明细返回码
    @NameInMap("ret_code_sub")
    public String retCodeSub;

    // 明细返回码对应的文案
    @NameInMap("ret_message_sub")
    public String retMessageSub;

    // 验证返回明细码
    @NameInMap("validation_ret_code")
    public String validationRetCode;

    // 返回的身份信息
    @NameInMap("identity_info")
    public String identityInfo;

    public static VerifyFaceauthZimResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyFaceauthZimResponse self = new VerifyFaceauthZimResponse();
        return TeaModel.build(map, self);
    }

    public VerifyFaceauthZimResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifyFaceauthZimResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifyFaceauthZimResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VerifyFaceauthZimResponse setExtParams(String extParams) {
        this.extParams = extParams;
        return this;
    }
    public String getExtParams() {
        return this.extParams;
    }

    public VerifyFaceauthZimResponse setHasNext(String hasNext) {
        this.hasNext = hasNext;
        return this;
    }
    public String getHasNext() {
        return this.hasNext;
    }

    public VerifyFaceauthZimResponse setNextProtocol(String nextProtocol) {
        this.nextProtocol = nextProtocol;
        return this;
    }
    public String getNextProtocol() {
        return this.nextProtocol;
    }

    public VerifyFaceauthZimResponse setProductRetCode(String productRetCode) {
        this.productRetCode = productRetCode;
        return this;
    }
    public String getProductRetCode() {
        return this.productRetCode;
    }

    public VerifyFaceauthZimResponse setRetCodeSub(String retCodeSub) {
        this.retCodeSub = retCodeSub;
        return this;
    }
    public String getRetCodeSub() {
        return this.retCodeSub;
    }

    public VerifyFaceauthZimResponse setRetMessageSub(String retMessageSub) {
        this.retMessageSub = retMessageSub;
        return this;
    }
    public String getRetMessageSub() {
        return this.retMessageSub;
    }

    public VerifyFaceauthZimResponse setValidationRetCode(String validationRetCode) {
        this.validationRetCode = validationRetCode;
        return this;
    }
    public String getValidationRetCode() {
        return this.validationRetCode;
    }

    public VerifyFaceauthZimResponse setIdentityInfo(String identityInfo) {
        this.identityInfo = identityInfo;
        return this;
    }
    public String getIdentityInfo() {
        return this.identityInfo;
    }

}
