// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateWithholdSignResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 签约字符串，当sign_str_type的值是H5_SIGN时，sign_str是h5签约地址，可以直接打开页面签约
    @NameInMap("sign_str")
    public String signStr;

    // 签约字符串类型。SIGN_ONLY:仅签约;PAY_SIGN:支付并签约;H5_SIGN h5签约
    @NameInMap("sign_str_type")
    public String signStrType;

    public static CreateWithholdSignResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWithholdSignResponse self = new CreateWithholdSignResponse();
        return TeaModel.build(map, self);
    }

    public CreateWithholdSignResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateWithholdSignResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateWithholdSignResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateWithholdSignResponse setSignStr(String signStr) {
        this.signStr = signStr;
        return this;
    }
    public String getSignStr() {
        return this.signStr;
    }

    public CreateWithholdSignResponse setSignStrType(String signStrType) {
        this.signStrType = signStrType;
        return this;
    }
    public String getSignStrType() {
        return this.signStrType;
    }

}
