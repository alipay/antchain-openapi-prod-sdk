// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class QueryAntdigitalWebttsDacWhitelistorderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 机构id
    @NameInMap("cif_id")
    public String cifId;

    // 白名单订单号
    @NameInMap("order_id")
    public String orderId;

    // 链名称
    @NameInMap("blockchain")
    public String blockchain;

    // 白名单地址
    @NameInMap("whitelist_address")
    public String whitelistAddress;

    // 别名
    @NameInMap("nickname")
    public String nickname;

    // 钱包拥有人
    @NameInMap("wallet_owner")
    public String walletOwner;

    // 验证类型：SIGNATURE/DEPOSIT
    @NameInMap("verify_type")
    public String verifyType;

    // 订单状态
    @NameInMap("status")
    public String status;

    // 审核结果：PASS/REFUSE
    @NameInMap("checker_result")
    public String checkerResult;

    // 备注
    @NameInMap("remark")
    public String remark;

    // 链上签名信息（SIGNATURE类型时返回，EIP712结构化JSON）
    @NameInMap("sign_message")
    public String signMessage;

    // 验证过期时间
    @NameInMap("expire_time")
    public String expireTime;

    // 创建时间
    @NameInMap("create_time")
    public String createTime;

    // checker审批备注
    @NameInMap("checker_remark")
    public String checkerRemark;

    public static QueryAntdigitalWebttsDacWhitelistorderResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntdigitalWebttsDacWhitelistorderResponse self = new QueryAntdigitalWebttsDacWhitelistorderResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntdigitalWebttsDacWhitelistorderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntdigitalWebttsDacWhitelistorderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntdigitalWebttsDacWhitelistorderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntdigitalWebttsDacWhitelistorderResponse setCifId(String cifId) {
        this.cifId = cifId;
        return this;
    }
    public String getCifId() {
        return this.cifId;
    }

    public QueryAntdigitalWebttsDacWhitelistorderResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryAntdigitalWebttsDacWhitelistorderResponse setBlockchain(String blockchain) {
        this.blockchain = blockchain;
        return this;
    }
    public String getBlockchain() {
        return this.blockchain;
    }

    public QueryAntdigitalWebttsDacWhitelistorderResponse setWhitelistAddress(String whitelistAddress) {
        this.whitelistAddress = whitelistAddress;
        return this;
    }
    public String getWhitelistAddress() {
        return this.whitelistAddress;
    }

    public QueryAntdigitalWebttsDacWhitelistorderResponse setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
    public String getNickname() {
        return this.nickname;
    }

    public QueryAntdigitalWebttsDacWhitelistorderResponse setWalletOwner(String walletOwner) {
        this.walletOwner = walletOwner;
        return this;
    }
    public String getWalletOwner() {
        return this.walletOwner;
    }

    public QueryAntdigitalWebttsDacWhitelistorderResponse setVerifyType(String verifyType) {
        this.verifyType = verifyType;
        return this;
    }
    public String getVerifyType() {
        return this.verifyType;
    }

    public QueryAntdigitalWebttsDacWhitelistorderResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryAntdigitalWebttsDacWhitelistorderResponse setCheckerResult(String checkerResult) {
        this.checkerResult = checkerResult;
        return this;
    }
    public String getCheckerResult() {
        return this.checkerResult;
    }

    public QueryAntdigitalWebttsDacWhitelistorderResponse setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public QueryAntdigitalWebttsDacWhitelistorderResponse setSignMessage(String signMessage) {
        this.signMessage = signMessage;
        return this;
    }
    public String getSignMessage() {
        return this.signMessage;
    }

    public QueryAntdigitalWebttsDacWhitelistorderResponse setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public QueryAntdigitalWebttsDacWhitelistorderResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public QueryAntdigitalWebttsDacWhitelistorderResponse setCheckerRemark(String checkerRemark) {
        this.checkerRemark = checkerRemark;
        return this;
    }
    public String getCheckerRemark() {
        return this.checkerRemark;
    }

}
