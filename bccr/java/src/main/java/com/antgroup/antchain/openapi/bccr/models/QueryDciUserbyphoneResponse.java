// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryDciUserbyphoneResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // dci用户id	
    // 
    @NameInMap("dci_user_id")
    public String dciUserId;

    // dci用户状态	
    // 
    @NameInMap("dci_user_status")
    public String dciUserStatus;

    // 名称
    @NameInMap("name")
    public String name;

    // 证件类型
    // 
    @NameInMap("certificate_type")
    public String certificateType;

    // 证件号	
    // 
    @NameInMap("certificate_number")
    public String certificateNumber;

    // 地址
    @NameInMap("address")
    public String address;

    // 证件有效期开始时间
    // 
    @NameInMap("cert_start_time")
    public String certStartTime;

    // 证件有效期结束时间
    // 
    @NameInMap("cert_end_time")
    public String certEndTime;

    // 法人名称
    // 
    @NameInMap("legal_person")
    public String legalPerson;

    public static QueryDciUserbyphoneResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDciUserbyphoneResponse self = new QueryDciUserbyphoneResponse();
        return TeaModel.build(map, self);
    }

    public QueryDciUserbyphoneResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDciUserbyphoneResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDciUserbyphoneResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDciUserbyphoneResponse setDciUserId(String dciUserId) {
        this.dciUserId = dciUserId;
        return this;
    }
    public String getDciUserId() {
        return this.dciUserId;
    }

    public QueryDciUserbyphoneResponse setDciUserStatus(String dciUserStatus) {
        this.dciUserStatus = dciUserStatus;
        return this;
    }
    public String getDciUserStatus() {
        return this.dciUserStatus;
    }

    public QueryDciUserbyphoneResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryDciUserbyphoneResponse setCertificateType(String certificateType) {
        this.certificateType = certificateType;
        return this;
    }
    public String getCertificateType() {
        return this.certificateType;
    }

    public QueryDciUserbyphoneResponse setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
        return this;
    }
    public String getCertificateNumber() {
        return this.certificateNumber;
    }

    public QueryDciUserbyphoneResponse setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public QueryDciUserbyphoneResponse setCertStartTime(String certStartTime) {
        this.certStartTime = certStartTime;
        return this;
    }
    public String getCertStartTime() {
        return this.certStartTime;
    }

    public QueryDciUserbyphoneResponse setCertEndTime(String certEndTime) {
        this.certEndTime = certEndTime;
        return this;
    }
    public String getCertEndTime() {
        return this.certEndTime;
    }

    public QueryDciUserbyphoneResponse setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
        return this;
    }
    public String getLegalPerson() {
        return this.legalPerson;
    }

}
