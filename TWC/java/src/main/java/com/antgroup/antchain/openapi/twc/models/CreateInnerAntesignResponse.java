// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateInnerAntesignResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 法务电子签章图片信息
    @NameInMap("sign_png_details")
    public PngDetails signPngDetails;

    public static CreateInnerAntesignResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInnerAntesignResponse self = new CreateInnerAntesignResponse();
        return TeaModel.build(map, self);
    }

    public CreateInnerAntesignResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateInnerAntesignResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateInnerAntesignResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateInnerAntesignResponse setSignPngDetails(PngDetails signPngDetails) {
        this.signPngDetails = signPngDetails;
        return this;
    }
    public PngDetails getSignPngDetails() {
        return this.signPngDetails;
    }

}
