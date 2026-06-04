// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractEsignuserResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // e签宝返回码
    @NameInMap("code")
    public Long code;

    // 业务描述信息
    @NameInMap("message")
    public String message;

    // 账号id
    @NameInMap("account_id")
    public String accountId;

    // 用户名称
    @NameInMap("name")
    public String name;

    // 证件类型
    @NameInMap("id_type")
    public String idType;

    // 证件号码
    @NameInMap("id_number")
    public String idNumber;

    // 手机号
    @NameInMap("mobile")
    public String mobile;

    // 邮箱
    @NameInMap("email")
    public String email;

    // 第三方平台的用户ID
    @NameInMap("third_party_user_id")
    public String thirdPartyUserId;

    public static QueryContractEsignuserResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContractEsignuserResponse self = new QueryContractEsignuserResponse();
        return TeaModel.build(map, self);
    }

    public QueryContractEsignuserResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryContractEsignuserResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryContractEsignuserResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryContractEsignuserResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public QueryContractEsignuserResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryContractEsignuserResponse setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public QueryContractEsignuserResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryContractEsignuserResponse setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public QueryContractEsignuserResponse setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public QueryContractEsignuserResponse setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryContractEsignuserResponse setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public QueryContractEsignuserResponse setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

}
