// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a34c7abe05104031aa18bb0861edbdba.models;

import com.aliyun.tea.*;

public class CustomerAuthResult extends TeaModel {
    // 账户ID
    @NameInMap("acc_id")
    public String accId;

    // 返回code 0:核验成功 1:企业信息有误 2:企业非正常营业
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 客户ID
    @NameInMap("customer_id")
    public String customerId;

    // 客户did
    @NameInMap("did")
    public String did;

    // 验证状态
    @NameInMap("enterprise_status")
    public String enterpriseStatus;

    // 开业时间
    @NameInMap("open_time")
    @Validation(required = true)
    public String openTime;

    // 认证结果，是否通过
    @NameInMap("pass")
    @Validation(required = true)
    public Boolean pass;

    // 业务ID
    @NameInMap("dis_req_msg_id")
    public String disReqMsgId;

    public static CustomerAuthResult build(java.util.Map<String, ?> map) throws Exception {
        CustomerAuthResult self = new CustomerAuthResult();
        return TeaModel.build(map, self);
    }

    public CustomerAuthResult setAccId(String accId) {
        this.accId = accId;
        return this;
    }
    public String getAccId() {
        return this.accId;
    }

    public CustomerAuthResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CustomerAuthResult setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public CustomerAuthResult setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public CustomerAuthResult setEnterpriseStatus(String enterpriseStatus) {
        this.enterpriseStatus = enterpriseStatus;
        return this;
    }
    public String getEnterpriseStatus() {
        return this.enterpriseStatus;
    }

    public CustomerAuthResult setOpenTime(String openTime) {
        this.openTime = openTime;
        return this;
    }
    public String getOpenTime() {
        return this.openTime;
    }

    public CustomerAuthResult setPass(Boolean pass) {
        this.pass = pass;
        return this;
    }
    public Boolean getPass() {
        return this.pass;
    }

    public CustomerAuthResult setDisReqMsgId(String disReqMsgId) {
        this.disReqMsgId = disReqMsgId;
        return this;
    }
    public String getDisReqMsgId() {
        return this.disReqMsgId;
    }

}
