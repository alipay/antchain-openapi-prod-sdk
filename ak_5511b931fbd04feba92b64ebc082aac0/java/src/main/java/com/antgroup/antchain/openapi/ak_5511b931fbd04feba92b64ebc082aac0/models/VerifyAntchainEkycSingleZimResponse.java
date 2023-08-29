// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_5511b931fbd04feba92b64ebc082aac0.models;

import com.aliyun.tea.*;

public class VerifyAntchainEkycSingleZimResponse extends TeaModel {
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

    // 产品返回明细码
    @NameInMap("product_ret_code")
    public String productRetCode;

    // 验证返回明细码
    @NameInMap("validation_ret_code")
    public String validationRetCode;

    // 明细返回码
    @NameInMap("ret_code_sub")
    public String retCodeSub;

    // 明细返回码对应的文案
    @NameInMap("ret_message_sub")
    public String retMessageSub;

    public static VerifyAntchainEkycSingleZimResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyAntchainEkycSingleZimResponse self = new VerifyAntchainEkycSingleZimResponse();
        return TeaModel.build(map, self);
    }

    public VerifyAntchainEkycSingleZimResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifyAntchainEkycSingleZimResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifyAntchainEkycSingleZimResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VerifyAntchainEkycSingleZimResponse setExtParams(String extParams) {
        this.extParams = extParams;
        return this;
    }
    public String getExtParams() {
        return this.extParams;
    }

    public VerifyAntchainEkycSingleZimResponse setProductRetCode(String productRetCode) {
        this.productRetCode = productRetCode;
        return this;
    }
    public String getProductRetCode() {
        return this.productRetCode;
    }

    public VerifyAntchainEkycSingleZimResponse setValidationRetCode(String validationRetCode) {
        this.validationRetCode = validationRetCode;
        return this;
    }
    public String getValidationRetCode() {
        return this.validationRetCode;
    }

    public VerifyAntchainEkycSingleZimResponse setRetCodeSub(String retCodeSub) {
        this.retCodeSub = retCodeSub;
        return this;
    }
    public String getRetCodeSub() {
        return this.retCodeSub;
    }

    public VerifyAntchainEkycSingleZimResponse setRetMessageSub(String retMessageSub) {
        this.retMessageSub = retMessageSub;
        return this;
    }
    public String getRetMessageSub() {
        return this.retMessageSub;
    }

}
