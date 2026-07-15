// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractEsignorgResponse extends TeaModel {
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

    // 机构账户id
    @NameInMap("org_id")
    public String orgId;

    // 机构名称
    @NameInMap("name")
    public String name;

    // 证件类型
    @NameInMap("id_type")
    public String idType;

    // 证件号码
    @NameInMap("id_number")
    public String idNumber;

    // 法人证件号码
    @NameInMap("org_legal_id_number")
    public String orgLegalIdNumber;

    // 法人名称
    @NameInMap("org_legal_name")
    public String orgLegalName;

    // 第三方平台的用户ID
    @NameInMap("third_party_user_id")
    public String thirdPartyUserId;

    public static QueryContractEsignorgResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContractEsignorgResponse self = new QueryContractEsignorgResponse();
        return TeaModel.build(map, self);
    }

    public QueryContractEsignorgResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryContractEsignorgResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryContractEsignorgResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryContractEsignorgResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public QueryContractEsignorgResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryContractEsignorgResponse setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public QueryContractEsignorgResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryContractEsignorgResponse setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public QueryContractEsignorgResponse setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public QueryContractEsignorgResponse setOrgLegalIdNumber(String orgLegalIdNumber) {
        this.orgLegalIdNumber = orgLegalIdNumber;
        return this;
    }
    public String getOrgLegalIdNumber() {
        return this.orgLegalIdNumber;
    }

    public QueryContractEsignorgResponse setOrgLegalName(String orgLegalName) {
        this.orgLegalName = orgLegalName;
        return this;
    }
    public String getOrgLegalName() {
        return this.orgLegalName;
    }

    public QueryContractEsignorgResponse setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

}
