// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.zolozfaceverify.models;

import com.aliyun.tea.*;

public class RecognizeFaceauthOcrResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // Map的json格式,预留
    @NameInMap("extern_info")
    public String externInfo;

    // Map的json格式：里面存储ocr识别的结果：
    // 
    // name:姓名
    // 
    // sex：性别
    // 
    // num：身份证号码
    // 
    // birth：出生年月日
    // 
    // address：地址
    // 
    // nationality：名族
    // 
    // start_date：身份证有效期开始时间
    // 
    // end_date：身份证有效期截止时间
    // 
    // issue：备案公安局
    @NameInMap("ocr_info")
    public String ocrInfo;

    // 返回码
    @NameInMap("ret_code")
    public String retCode;

    // 业务返回码
    // 
    @NameInMap("ret_code_sub")
    public String retCodeSub;

    // 业务返回码描述
    // 
    @NameInMap("ret_message_sub")
    public String retMessageSub;

    // face: 身份证正面 back: 身份证反面 缺省值是：face
    // 
    @NameInMap("side")
    public String side;

    // zimid
    @NameInMap("zim_id")
    public String zimId;

    public static RecognizeFaceauthOcrResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFaceauthOcrResponse self = new RecognizeFaceauthOcrResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeFaceauthOcrResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RecognizeFaceauthOcrResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RecognizeFaceauthOcrResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RecognizeFaceauthOcrResponse setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

    public RecognizeFaceauthOcrResponse setOcrInfo(String ocrInfo) {
        this.ocrInfo = ocrInfo;
        return this;
    }
    public String getOcrInfo() {
        return this.ocrInfo;
    }

    public RecognizeFaceauthOcrResponse setRetCode(String retCode) {
        this.retCode = retCode;
        return this;
    }
    public String getRetCode() {
        return this.retCode;
    }

    public RecognizeFaceauthOcrResponse setRetCodeSub(String retCodeSub) {
        this.retCodeSub = retCodeSub;
        return this;
    }
    public String getRetCodeSub() {
        return this.retCodeSub;
    }

    public RecognizeFaceauthOcrResponse setRetMessageSub(String retMessageSub) {
        this.retMessageSub = retMessageSub;
        return this;
    }
    public String getRetMessageSub() {
        return this.retMessageSub;
    }

    public RecognizeFaceauthOcrResponse setSide(String side) {
        this.side = side;
        return this;
    }
    public String getSide() {
        return this.side;
    }

    public RecognizeFaceauthOcrResponse setZimId(String zimId) {
        this.zimId = zimId;
        return this;
    }
    public String getZimId() {
        return this.zimId;
    }

}
