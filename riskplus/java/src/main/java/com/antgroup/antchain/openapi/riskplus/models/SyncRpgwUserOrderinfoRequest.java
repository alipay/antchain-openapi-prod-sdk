// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class SyncRpgwUserOrderinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号
    @NameInMap("order_number")
    @Validation(required = true)
    public String orderNumber;

    // REGISTER与PURCHASE二选一
    @NameInMap("order_type")
    @Validation(required = true)
    public String orderType;

    // 时间，格式为yyyy-MM-dd HH:mm:ss
    @NameInMap("order_time")
    @Validation(required = true)
    public String orderTime;

    // 邀请人id
    @NameInMap("inviter_id")
    @Validation(required = true)
    public String inviterId;

    // 邀请人姓名
    @NameInMap("inviter_name")
    @Validation(required = true)
    public String inviterName;

    // 邀请人手机号
    @NameInMap("inviter_phone_number")
    @Validation(required = true)
    public String inviterPhoneNumber;

    // 邀请人身份证号
    @NameInMap("inviter_id_number")
    @Validation(required = true)
    public String inviterIdNumber;

    // 邀请码
    @NameInMap("invitation_code")
    public String invitationCode;

    // 被邀请人id
    @NameInMap("invitee_id")
    @Validation(required = true)
    public String inviteeId;

    // 被邀请人姓名
    @NameInMap("invitee_name")
    public String inviteeName;

    // 被邀请人手机号
    @NameInMap("invitee_phone_number")
    @Validation(required = true)
    public String inviteePhoneNumber;

    // 被邀请人身份证
    @NameInMap("invitee_id_number")
    public String inviteeIdNumber;

    public static SyncRpgwUserOrderinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncRpgwUserOrderinfoRequest self = new SyncRpgwUserOrderinfoRequest();
        return TeaModel.build(map, self);
    }

    public SyncRpgwUserOrderinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncRpgwUserOrderinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncRpgwUserOrderinfoRequest setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }
    public String getOrderNumber() {
        return this.orderNumber;
    }

    public SyncRpgwUserOrderinfoRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public SyncRpgwUserOrderinfoRequest setOrderTime(String orderTime) {
        this.orderTime = orderTime;
        return this;
    }
    public String getOrderTime() {
        return this.orderTime;
    }

    public SyncRpgwUserOrderinfoRequest setInviterId(String inviterId) {
        this.inviterId = inviterId;
        return this;
    }
    public String getInviterId() {
        return this.inviterId;
    }

    public SyncRpgwUserOrderinfoRequest setInviterName(String inviterName) {
        this.inviterName = inviterName;
        return this;
    }
    public String getInviterName() {
        return this.inviterName;
    }

    public SyncRpgwUserOrderinfoRequest setInviterPhoneNumber(String inviterPhoneNumber) {
        this.inviterPhoneNumber = inviterPhoneNumber;
        return this;
    }
    public String getInviterPhoneNumber() {
        return this.inviterPhoneNumber;
    }

    public SyncRpgwUserOrderinfoRequest setInviterIdNumber(String inviterIdNumber) {
        this.inviterIdNumber = inviterIdNumber;
        return this;
    }
    public String getInviterIdNumber() {
        return this.inviterIdNumber;
    }

    public SyncRpgwUserOrderinfoRequest setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
        return this;
    }
    public String getInvitationCode() {
        return this.invitationCode;
    }

    public SyncRpgwUserOrderinfoRequest setInviteeId(String inviteeId) {
        this.inviteeId = inviteeId;
        return this;
    }
    public String getInviteeId() {
        return this.inviteeId;
    }

    public SyncRpgwUserOrderinfoRequest setInviteeName(String inviteeName) {
        this.inviteeName = inviteeName;
        return this;
    }
    public String getInviteeName() {
        return this.inviteeName;
    }

    public SyncRpgwUserOrderinfoRequest setInviteePhoneNumber(String inviteePhoneNumber) {
        this.inviteePhoneNumber = inviteePhoneNumber;
        return this;
    }
    public String getInviteePhoneNumber() {
        return this.inviteePhoneNumber;
    }

    public SyncRpgwUserOrderinfoRequest setInviteeIdNumber(String inviteeIdNumber) {
        this.inviteeIdNumber = inviteeIdNumber;
        return this;
    }
    public String getInviteeIdNumber() {
        return this.inviteeIdNumber;
    }

}
