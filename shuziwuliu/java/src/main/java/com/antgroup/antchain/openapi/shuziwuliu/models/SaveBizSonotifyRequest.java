// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class SaveBizSonotifyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
    @NameInMap("action")
    public String action;

    // so通知关联的订舱单 (业务必填)
    @NameInMap("booking_params")
    public java.util.List<SoNotifyBookingParam> bookingParams;

    // 联系人
    @NameInMap("contact_name")
    public String contactName;

    // 联系方式
    @NameInMap("contact_type")
    public String contactType;

    // 卸货港 业务必填	
    // 
    @NameInMap("discharge_port")
    public String dischargePort;

    // 货代did
    @NameInMap("forwarder_did")
    @Validation(required = true)
    public String forwarderDid;

    // 起运港 业务必填	
    // 
    @NameInMap("loading_port")
    public String loadingPort;

    // 	
    // 订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // soNotify 唯一标识code
    @NameInMap("so_notify_code")
    @Validation(required = true)
    public String soNotifyCode;

    public static SaveBizSonotifyRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBizSonotifyRequest self = new SaveBizSonotifyRequest();
        return TeaModel.build(map, self);
    }

    public SaveBizSonotifyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveBizSonotifyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveBizSonotifyRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public SaveBizSonotifyRequest setBookingParams(java.util.List<SoNotifyBookingParam> bookingParams) {
        this.bookingParams = bookingParams;
        return this;
    }
    public java.util.List<SoNotifyBookingParam> getBookingParams() {
        return this.bookingParams;
    }

    public SaveBizSonotifyRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public SaveBizSonotifyRequest setContactType(String contactType) {
        this.contactType = contactType;
        return this;
    }
    public String getContactType() {
        return this.contactType;
    }

    public SaveBizSonotifyRequest setDischargePort(String dischargePort) {
        this.dischargePort = dischargePort;
        return this;
    }
    public String getDischargePort() {
        return this.dischargePort;
    }

    public SaveBizSonotifyRequest setForwarderDid(String forwarderDid) {
        this.forwarderDid = forwarderDid;
        return this;
    }
    public String getForwarderDid() {
        return this.forwarderDid;
    }

    public SaveBizSonotifyRequest setLoadingPort(String loadingPort) {
        this.loadingPort = loadingPort;
        return this;
    }
    public String getLoadingPort() {
        return this.loadingPort;
    }

    public SaveBizSonotifyRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public SaveBizSonotifyRequest setSoNotifyCode(String soNotifyCode) {
        this.soNotifyCode = soNotifyCode;
        return this;
    }
    public String getSoNotifyCode() {
        return this.soNotifyCode;
    }

}
