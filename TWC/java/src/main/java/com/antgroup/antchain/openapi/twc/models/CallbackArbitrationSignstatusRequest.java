// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CallbackArbitrationSignstatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 案件号
    @NameInMap("case_no")
    @Validation(required = true)
    public String caseNo;

    // 签署文件代码 01 申请书 04 撤案申请书
    @NameInMap("doc_code")
    @Validation(required = true)
    public String docCode;

    // 处理结果码 10000成功 其余都是签署失败
    @NameInMap("res_code")
    @Validation(required = true)
    public String resCode;

    // 失败原因
    @NameInMap("message")
    @Validation(required = true)
    public String message;

    // 发送时间 yyyy-MM-dd
    @NameInMap("send_time")
    @Validation(required = true)
    public String sendTime;

    // 签名,采用公钥验签
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    public static CallbackArbitrationSignstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackArbitrationSignstatusRequest self = new CallbackArbitrationSignstatusRequest();
        return TeaModel.build(map, self);
    }

    public CallbackArbitrationSignstatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackArbitrationSignstatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackArbitrationSignstatusRequest setCaseNo(String caseNo) {
        this.caseNo = caseNo;
        return this;
    }
    public String getCaseNo() {
        return this.caseNo;
    }

    public CallbackArbitrationSignstatusRequest setDocCode(String docCode) {
        this.docCode = docCode;
        return this;
    }
    public String getDocCode() {
        return this.docCode;
    }

    public CallbackArbitrationSignstatusRequest setResCode(String resCode) {
        this.resCode = resCode;
        return this;
    }
    public String getResCode() {
        return this.resCode;
    }

    public CallbackArbitrationSignstatusRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CallbackArbitrationSignstatusRequest setSendTime(String sendTime) {
        this.sendTime = sendTime;
        return this;
    }
    public String getSendTime() {
        return this.sendTime;
    }

    public CallbackArbitrationSignstatusRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
