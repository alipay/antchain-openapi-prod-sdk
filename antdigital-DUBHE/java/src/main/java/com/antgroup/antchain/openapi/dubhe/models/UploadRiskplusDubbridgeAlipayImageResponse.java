// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dubhe.models;

import com.aliyun.tea.*;

public class UploadRiskplusDubbridgeAlipayImageResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 图片上传后的标识
    @NameInMap("image_id")
    public String imageId;

    public static UploadRiskplusDubbridgeAlipayImageResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadRiskplusDubbridgeAlipayImageResponse self = new UploadRiskplusDubbridgeAlipayImageResponse();
        return TeaModel.build(map, self);
    }

    public UploadRiskplusDubbridgeAlipayImageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UploadRiskplusDubbridgeAlipayImageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadRiskplusDubbridgeAlipayImageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UploadRiskplusDubbridgeAlipayImageResponse setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

}
