// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class DetailIssuerProjectwithroleResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 项目id
    @NameInMap("project_id")
    public String projectId;

    // 项目名称
    @NameInMap("projcet_name")
    public String projcetName;

    // 描述
    @NameInMap("description")
    public String description;

    // token名称
    @NameInMap("token_name")
    public String tokenName;

    // 最大供应量
    @NameInMap("capacity")
    public String capacity;

    // 净值
    @NameInMap("net_value")
    public String netValue;

    // 价格类型
    @NameInMap("price_type")
    public String priceType;

    // 项目净值
    @NameInMap("project_net_value")
    public String projectNetValue;

    // 购买最大限额
    @NameInMap("max_subscription_amount")
    public String maxSubscriptionAmount;

    // 部署类型  DIRECT_PUBLIC_CHAIN 直发公链，NORMAL 普通模式
    @NameInMap("deployment_type")
    public String deploymentType;

    // 项目所在链
    @NameInMap("chain_type")
    public String chainType;

    // 操作员list
    @NameInMap("user_operator_list")
    public UserOperatorInfoBO userOperatorList;

    // 代销者机构代销者机构
    @NameInMap("participant_infos")
    public ParticipantInfo participantInfos;

    public static DetailIssuerProjectwithroleResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailIssuerProjectwithroleResponse self = new DetailIssuerProjectwithroleResponse();
        return TeaModel.build(map, self);
    }

    public DetailIssuerProjectwithroleResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailIssuerProjectwithroleResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailIssuerProjectwithroleResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailIssuerProjectwithroleResponse setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DetailIssuerProjectwithroleResponse setProjcetName(String projcetName) {
        this.projcetName = projcetName;
        return this;
    }
    public String getProjcetName() {
        return this.projcetName;
    }

    public DetailIssuerProjectwithroleResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DetailIssuerProjectwithroleResponse setTokenName(String tokenName) {
        this.tokenName = tokenName;
        return this;
    }
    public String getTokenName() {
        return this.tokenName;
    }

    public DetailIssuerProjectwithroleResponse setCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }
    public String getCapacity() {
        return this.capacity;
    }

    public DetailIssuerProjectwithroleResponse setNetValue(String netValue) {
        this.netValue = netValue;
        return this;
    }
    public String getNetValue() {
        return this.netValue;
    }

    public DetailIssuerProjectwithroleResponse setPriceType(String priceType) {
        this.priceType = priceType;
        return this;
    }
    public String getPriceType() {
        return this.priceType;
    }

    public DetailIssuerProjectwithroleResponse setProjectNetValue(String projectNetValue) {
        this.projectNetValue = projectNetValue;
        return this;
    }
    public String getProjectNetValue() {
        return this.projectNetValue;
    }

    public DetailIssuerProjectwithroleResponse setMaxSubscriptionAmount(String maxSubscriptionAmount) {
        this.maxSubscriptionAmount = maxSubscriptionAmount;
        return this;
    }
    public String getMaxSubscriptionAmount() {
        return this.maxSubscriptionAmount;
    }

    public DetailIssuerProjectwithroleResponse setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
        return this;
    }
    public String getDeploymentType() {
        return this.deploymentType;
    }

    public DetailIssuerProjectwithroleResponse setChainType(String chainType) {
        this.chainType = chainType;
        return this;
    }
    public String getChainType() {
        return this.chainType;
    }

    public DetailIssuerProjectwithroleResponse setUserOperatorList(UserOperatorInfoBO userOperatorList) {
        this.userOperatorList = userOperatorList;
        return this;
    }
    public UserOperatorInfoBO getUserOperatorList() {
        return this.userOperatorList;
    }

    public DetailIssuerProjectwithroleResponse setParticipantInfos(ParticipantInfo participantInfos) {
        this.participantInfos = participantInfos;
        return this;
    }
    public ParticipantInfo getParticipantInfos() {
        return this.participantInfos;
    }

}
