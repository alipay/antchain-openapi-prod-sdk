// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDidPersonFacevrfResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 认证是否通过。
    @NameInMap("passed")
    public String passed;

    // 认证材料哈希是否匹配。 如果有传入材料哈希参数，匹配则返回值为 T；不匹配则返回值为 F。如果无材料哈希参数传入，则返回空。
    @NameInMap("material_matched")
    public String materialMatched;

    // 身份信息，目前只有在ocr的场景下才有返回。
    // certName/certNo：本次认证通过的姓名和身份证；ocrInfo：本次OCR识别的结果，包含如下信息："address": 地址"nationality": 名族"num":身份证号码"sex":性别"name": 名称"birth": 生日"issue": 签发机关"endDate":到期日"startDate":发证日期；注意:认证通过的信息和OCR识别的信息可能不一致
    @NameInMap("identity_info")
    public String identityInfo;

    // 长度不超过128字符的分布式数字身份DID
    @NameInMap("did")
    public String did;

    public static QueryDidPersonFacevrfResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDidPersonFacevrfResponse self = new QueryDidPersonFacevrfResponse();
        return TeaModel.build(map, self);
    }

    public QueryDidPersonFacevrfResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDidPersonFacevrfResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDidPersonFacevrfResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDidPersonFacevrfResponse setPassed(String passed) {
        this.passed = passed;
        return this;
    }
    public String getPassed() {
        return this.passed;
    }

    public QueryDidPersonFacevrfResponse setMaterialMatched(String materialMatched) {
        this.materialMatched = materialMatched;
        return this;
    }
    public String getMaterialMatched() {
        return this.materialMatched;
    }

    public QueryDidPersonFacevrfResponse setIdentityInfo(String identityInfo) {
        this.identityInfo = identityInfo;
        return this;
    }
    public String getIdentityInfo() {
        return this.identityInfo;
    }

    public QueryDidPersonFacevrfResponse setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

}
