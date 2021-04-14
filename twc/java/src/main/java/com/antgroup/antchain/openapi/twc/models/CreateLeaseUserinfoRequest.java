// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateLeaseUserinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 支付宝账号信息
    @NameInMap("alipay_uid")
    @Validation(required = true)
    public String alipayUid;

    // 融资租赁业务id，由资方控制台生成返回
    @NameInMap("application_id")
    public String applicationId;

    // 是否启动异步
    @NameInMap("async")
    public Long async;

    // 融资租赁用户信息额外字段
    @NameInMap("extra_info")
    public String extraInfo;

    // 承租企业统一社会信用代码 长度不可超过50
    @NameInMap("lease_corp_id")
    @Validation(required = true)
    public String leaseCorpId;

    // 承租企业名称 长度不可超过50
    @NameInMap("lease_corp_name")
    @Validation(required = true)
    public String leaseCorpName;

    // 承租法定代表人姓名 长度不可超过50
    @NameInMap("lease_corp_owner_name")
    @Validation(required = true)
    public String leaseCorpOwnerName;

    // 用户登录名，租赁平台会员ID/支付宝ID 长度不可超过50
    @NameInMap("login_id")
    @Validation(required = true)
    public String loginId;

    // 用户登录时间 格式为2019-8-31 12:00:00
    @NameInMap("login_time")
    @Validation(required = true)
    public String loginTime;

    // 用户登录名类型 1.商户会员2.支付宝3.其他
    @NameInMap("login_type")
    @Validation(required = true)
    public Long loginType;

    // 订单id 长度不可超过50
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 区块链认证Hash，若为支付宝实人，必填
    @NameInMap("user_blockchain_verify_hash")
    public String userBlockchainVerifyHash;

    // 承租人电子邮件，法院/仲裁电子送达必填项，长度不超过5
    @NameInMap("user_email")
    public String userEmail;

    // 承租人身份证
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 承租人身份证照片哈希
    @NameInMap("user_image_hash")
    @Validation(required = true)
    public String userImageHash;

    // 承租人身份证照片存证交易哈希
    @NameInMap("user_image_tx_hash")
    @Validation(required = true)
    public String userImageTxHash;

    // 承租人姓名 长度不可超过10
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 承租人手机号
    @NameInMap("user_phone_number")
    @Validation(required = true)
    public String userPhoneNumber;

    // 身份认证类型 1支付宝实人，2芝麻实人，3非蚂蚁实人
    @NameInMap("user_type")
    @Validation(required = true)
    public Long userType;

    // 额外通知第三方，如果需要通知相关方外的第三方，需要在此设置关联方的租户id，若不设置则只通知资方
    @NameInMap("related_notify")
    public java.util.List<String> relatedNotify;

    public static CreateLeaseUserinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLeaseUserinfoRequest self = new CreateLeaseUserinfoRequest();
        return TeaModel.build(map, self);
    }

    public CreateLeaseUserinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLeaseUserinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLeaseUserinfoRequest setAlipayUid(String alipayUid) {
        this.alipayUid = alipayUid;
        return this;
    }
    public String getAlipayUid() {
        return this.alipayUid;
    }

    public CreateLeaseUserinfoRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateLeaseUserinfoRequest setAsync(Long async) {
        this.async = async;
        return this;
    }
    public Long getAsync() {
        return this.async;
    }

    public CreateLeaseUserinfoRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public CreateLeaseUserinfoRequest setLeaseCorpId(String leaseCorpId) {
        this.leaseCorpId = leaseCorpId;
        return this;
    }
    public String getLeaseCorpId() {
        return this.leaseCorpId;
    }

    public CreateLeaseUserinfoRequest setLeaseCorpName(String leaseCorpName) {
        this.leaseCorpName = leaseCorpName;
        return this;
    }
    public String getLeaseCorpName() {
        return this.leaseCorpName;
    }

    public CreateLeaseUserinfoRequest setLeaseCorpOwnerName(String leaseCorpOwnerName) {
        this.leaseCorpOwnerName = leaseCorpOwnerName;
        return this;
    }
    public String getLeaseCorpOwnerName() {
        return this.leaseCorpOwnerName;
    }

    public CreateLeaseUserinfoRequest setLoginId(String loginId) {
        this.loginId = loginId;
        return this;
    }
    public String getLoginId() {
        return this.loginId;
    }

    public CreateLeaseUserinfoRequest setLoginTime(String loginTime) {
        this.loginTime = loginTime;
        return this;
    }
    public String getLoginTime() {
        return this.loginTime;
    }

    public CreateLeaseUserinfoRequest setLoginType(Long loginType) {
        this.loginType = loginType;
        return this;
    }
    public Long getLoginType() {
        return this.loginType;
    }

    public CreateLeaseUserinfoRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateLeaseUserinfoRequest setUserBlockchainVerifyHash(String userBlockchainVerifyHash) {
        this.userBlockchainVerifyHash = userBlockchainVerifyHash;
        return this;
    }
    public String getUserBlockchainVerifyHash() {
        return this.userBlockchainVerifyHash;
    }

    public CreateLeaseUserinfoRequest setUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }
    public String getUserEmail() {
        return this.userEmail;
    }

    public CreateLeaseUserinfoRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateLeaseUserinfoRequest setUserImageHash(String userImageHash) {
        this.userImageHash = userImageHash;
        return this;
    }
    public String getUserImageHash() {
        return this.userImageHash;
    }

    public CreateLeaseUserinfoRequest setUserImageTxHash(String userImageTxHash) {
        this.userImageTxHash = userImageTxHash;
        return this;
    }
    public String getUserImageTxHash() {
        return this.userImageTxHash;
    }

    public CreateLeaseUserinfoRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateLeaseUserinfoRequest setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
        return this;
    }
    public String getUserPhoneNumber() {
        return this.userPhoneNumber;
    }

    public CreateLeaseUserinfoRequest setUserType(Long userType) {
        this.userType = userType;
        return this;
    }
    public Long getUserType() {
        return this.userType;
    }

    public CreateLeaseUserinfoRequest setRelatedNotify(java.util.List<String> relatedNotify) {
        this.relatedNotify = relatedNotify;
        return this;
    }
    public java.util.List<String> getRelatedNotify() {
        return this.relatedNotify;
    }

}
