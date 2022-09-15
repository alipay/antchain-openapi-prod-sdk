// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class ReceivedRecord extends TeaModel {
    // 执行记录id
    @NameInMap("id")
    @Validation(required = true, maxLength = 50)
    public String id;

    // 支付宝用户标识
    @NameInMap("receiver_alipay_user_id")
    @Validation(required = true, maxLength = 16, minLength = 16)
    public String receiverAlipayUserId;

    // 领取人姓名
    @NameInMap("receiver_name")
    @Validation(required = true, maxLength = 50)
    public String receiverName;

    // 领取人身份证号码
    @NameInMap("receiver_card_no")
    @Validation(required = true)
    public String receiverCardNo;

    // 联系号码 
    @NameInMap("receiver_phone_no")
    @Validation(maxLength = 20)
    public String receiverPhoneNo;

    // 是否是受益人本人 0本人，1代领
    @NameInMap("agent_flag")
    @Validation(required = true)
    public Long agentFlag;

    // 领取人和受益人关系
    @NameInMap("relationship")
    @Validation(maxLength = 100)
    public String relationship;

    // 受益人信息
    @NameInMap("beneficiary_message")
    @Validation(maxLength = 200)
    public String beneficiaryMessage;

    // 领取人所属机构
    @NameInMap("receiver_org")
    @Validation(maxLength = 100)
    public String receiverOrg;

    // 领取说明
    @NameInMap("receive_note")
    @Validation(maxLength = 100)
    public String receiveNote;

    // 受益人数
    @NameInMap("benefit_number")
    public Long benefitNumber;

    // 快递地址
    @NameInMap("express_address")
    @Validation(maxLength = 100)
    public String expressAddress;

    // 发放数量
    @NameInMap("issue_amount")
    public Long issueAmount;

    public static ReceivedRecord build(java.util.Map<String, ?> map) throws Exception {
        ReceivedRecord self = new ReceivedRecord();
        return TeaModel.build(map, self);
    }

    public ReceivedRecord setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ReceivedRecord setReceiverAlipayUserId(String receiverAlipayUserId) {
        this.receiverAlipayUserId = receiverAlipayUserId;
        return this;
    }
    public String getReceiverAlipayUserId() {
        return this.receiverAlipayUserId;
    }

    public ReceivedRecord setReceiverName(String receiverName) {
        this.receiverName = receiverName;
        return this;
    }
    public String getReceiverName() {
        return this.receiverName;
    }

    public ReceivedRecord setReceiverCardNo(String receiverCardNo) {
        this.receiverCardNo = receiverCardNo;
        return this;
    }
    public String getReceiverCardNo() {
        return this.receiverCardNo;
    }

    public ReceivedRecord setReceiverPhoneNo(String receiverPhoneNo) {
        this.receiverPhoneNo = receiverPhoneNo;
        return this;
    }
    public String getReceiverPhoneNo() {
        return this.receiverPhoneNo;
    }

    public ReceivedRecord setAgentFlag(Long agentFlag) {
        this.agentFlag = agentFlag;
        return this;
    }
    public Long getAgentFlag() {
        return this.agentFlag;
    }

    public ReceivedRecord setRelationship(String relationship) {
        this.relationship = relationship;
        return this;
    }
    public String getRelationship() {
        return this.relationship;
    }

    public ReceivedRecord setBeneficiaryMessage(String beneficiaryMessage) {
        this.beneficiaryMessage = beneficiaryMessage;
        return this;
    }
    public String getBeneficiaryMessage() {
        return this.beneficiaryMessage;
    }

    public ReceivedRecord setReceiverOrg(String receiverOrg) {
        this.receiverOrg = receiverOrg;
        return this;
    }
    public String getReceiverOrg() {
        return this.receiverOrg;
    }

    public ReceivedRecord setReceiveNote(String receiveNote) {
        this.receiveNote = receiveNote;
        return this;
    }
    public String getReceiveNote() {
        return this.receiveNote;
    }

    public ReceivedRecord setBenefitNumber(Long benefitNumber) {
        this.benefitNumber = benefitNumber;
        return this;
    }
    public Long getBenefitNumber() {
        return this.benefitNumber;
    }

    public ReceivedRecord setExpressAddress(String expressAddress) {
        this.expressAddress = expressAddress;
        return this;
    }
    public String getExpressAddress() {
        return this.expressAddress;
    }

    public ReceivedRecord setIssueAmount(Long issueAmount) {
        this.issueAmount = issueAmount;
        return this;
    }
    public Long getIssueAmount() {
        return this.issueAmount;
    }

}
