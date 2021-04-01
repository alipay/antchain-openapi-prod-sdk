// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryConsumecardReceiptcontractResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 签约ID= platform_tenant_id+product_code+certification_id+sales_plan(分库分表路由)
    @NameInMap("uid")
    public String uid;

    // 平台租户ID
    @NameInMap("platform_tenant_id")
    public String platformTenantId;

    // 场景码(需要申请)
    @NameInMap("product_code")
    public String productCode;

    // 认证平台ID，本期支付宝用户ID（分库分表路由字段）
    @NameInMap("certification_id")
    public String certificationId;

    // 合同编号
    @NameInMap("contract_number")
    public String contractNumber;

    // 证件编号
    @NameInMap("id_number")
    public String idNumber;

    // 证件类型
    @NameInMap("id_type")
    public Long idType;

    // 用户姓名/企业名称
    @NameInMap("name")
    public String name;

    // 客户编号（链上账号）
    // 
    // 已经创建成功的链上账户
    @NameInMap("account_id")
    public String accountId;

    // 客户编号（业务系统）
    // 
    // 平台业务系统IP
    @NameInMap("user_id")
    public String userId;

    // 签约状态
    // 
    // 0：未签约 1：已签约 2：已解约（主动解约、过期解约）
    @NameInMap("status")
    public Long status;

    // 签约日期
    // 
    @NameInMap("sign_date")
    public String signDate;

    // 解约日期
    // 
    // 
    @NameInMap("cancel_date")
    public String cancelDate;

    public static QueryConsumecardReceiptcontractResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumecardReceiptcontractResponse self = new QueryConsumecardReceiptcontractResponse();
        return TeaModel.build(map, self);
    }

    public QueryConsumecardReceiptcontractResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryConsumecardReceiptcontractResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryConsumecardReceiptcontractResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryConsumecardReceiptcontractResponse setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public QueryConsumecardReceiptcontractResponse setPlatformTenantId(String platformTenantId) {
        this.platformTenantId = platformTenantId;
        return this;
    }
    public String getPlatformTenantId() {
        return this.platformTenantId;
    }

    public QueryConsumecardReceiptcontractResponse setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public QueryConsumecardReceiptcontractResponse setCertificationId(String certificationId) {
        this.certificationId = certificationId;
        return this;
    }
    public String getCertificationId() {
        return this.certificationId;
    }

    public QueryConsumecardReceiptcontractResponse setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
        return this;
    }
    public String getContractNumber() {
        return this.contractNumber;
    }

    public QueryConsumecardReceiptcontractResponse setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public QueryConsumecardReceiptcontractResponse setIdType(Long idType) {
        this.idType = idType;
        return this;
    }
    public Long getIdType() {
        return this.idType;
    }

    public QueryConsumecardReceiptcontractResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryConsumecardReceiptcontractResponse setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public QueryConsumecardReceiptcontractResponse setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryConsumecardReceiptcontractResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public QueryConsumecardReceiptcontractResponse setSignDate(String signDate) {
        this.signDate = signDate;
        return this;
    }
    public String getSignDate() {
        return this.signDate;
    }

    public QueryConsumecardReceiptcontractResponse setCancelDate(String cancelDate) {
        this.cancelDate = cancelDate;
        return this;
    }
    public String getCancelDate() {
        return this.cancelDate;
    }

}
