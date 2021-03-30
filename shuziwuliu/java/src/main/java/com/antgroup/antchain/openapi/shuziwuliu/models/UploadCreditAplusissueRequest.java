// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UploadCreditAplusissueRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 批次id
    @NameInMap("batch_id")
    @Validation(required = true)
    public String batchId;

    // 发行结果信息回调地址
    @NameInMap("callback_url")
    @Validation(required = true)
    public String callbackUrl;

    // 货代did
    @NameInMap("consignor_did")
    @Validation(required = true)
    public String consignorDid;

    // 发行时直接进行快速提现：true ，
    // 发行后自主触发提现：false （默认）
    @NameInMap("easy_finance")
    public Boolean easyFinance;

    // 集团平台did
    @NameInMap("group_platform_did")
    @Validation(required = true)
    public String groupPlatformDid;

    // 发行信息列表
    @NameInMap("issue_apply_infos")
    @Validation(required = true)
    public java.util.List<IssueApplyInfoPlus> issueApplyInfos;

    // 业务承接方did
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 产品id
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    // 登录模式，返回的发行url指定使用何种模式登录。ORG:企业支付宝登录（缺省时默认ORG模式），USER_ACCOUNT:个人支付宝登录。
    @NameInMap("login_type")
    public String loginType;

    public static UploadCreditAplusissueRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadCreditAplusissueRequest self = new UploadCreditAplusissueRequest();
        return TeaModel.build(map, self);
    }

    public UploadCreditAplusissueRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadCreditAplusissueRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadCreditAplusissueRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public UploadCreditAplusissueRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public UploadCreditAplusissueRequest setConsignorDid(String consignorDid) {
        this.consignorDid = consignorDid;
        return this;
    }
    public String getConsignorDid() {
        return this.consignorDid;
    }

    public UploadCreditAplusissueRequest setEasyFinance(Boolean easyFinance) {
        this.easyFinance = easyFinance;
        return this;
    }
    public Boolean getEasyFinance() {
        return this.easyFinance;
    }

    public UploadCreditAplusissueRequest setGroupPlatformDid(String groupPlatformDid) {
        this.groupPlatformDid = groupPlatformDid;
        return this;
    }
    public String getGroupPlatformDid() {
        return this.groupPlatformDid;
    }

    public UploadCreditAplusissueRequest setIssueApplyInfos(java.util.List<IssueApplyInfoPlus> issueApplyInfos) {
        this.issueApplyInfos = issueApplyInfos;
        return this;
    }
    public java.util.List<IssueApplyInfoPlus> getIssueApplyInfos() {
        return this.issueApplyInfos;
    }

    public UploadCreditAplusissueRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public UploadCreditAplusissueRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public UploadCreditAplusissueRequest setLoginType(String loginType) {
        this.loginType = loginType;
        return this;
    }
    public String getLoginType() {
        return this.loginType;
    }

}
