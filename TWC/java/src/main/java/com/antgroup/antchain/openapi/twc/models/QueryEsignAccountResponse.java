// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryEsignAccountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 账号id
    @NameInMap("account_id")
    public String accountId;

    // 名称
    @NameInMap("name")
    public String name;

    // 证件类型
    @NameInMap("id_type")
    public String idType;

    // 证件号
    @NameInMap("id_number")
    public String idNumber;

    // 机构法定代表人证件号
    @NameInMap("org_legal_id_number")
    public String orgLegalIdNumber;

    // 机构法定代表人名称
    @NameInMap("org_legal_name")
    public String orgLegalName;

    // 创建账号的唯一标识
    @NameInMap("third_party_user_id")
    public String thirdPartyUserId;

    // 手机号
    @NameInMap("mobile")
    public String mobile;

    // 邮箱
    @NameInMap("email")
    public String email;

    public static QueryEsignAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEsignAccountResponse self = new QueryEsignAccountResponse();
        return TeaModel.build(map, self);
    }

    public QueryEsignAccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEsignAccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEsignAccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEsignAccountResponse setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public QueryEsignAccountResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryEsignAccountResponse setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public QueryEsignAccountResponse setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public QueryEsignAccountResponse setOrgLegalIdNumber(String orgLegalIdNumber) {
        this.orgLegalIdNumber = orgLegalIdNumber;
        return this;
    }
    public String getOrgLegalIdNumber() {
        return this.orgLegalIdNumber;
    }

    public QueryEsignAccountResponse setOrgLegalName(String orgLegalName) {
        this.orgLegalName = orgLegalName;
        return this;
    }
    public String getOrgLegalName() {
        return this.orgLegalName;
    }

    public QueryEsignAccountResponse setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public QueryEsignAccountResponse setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryEsignAccountResponse setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

}
