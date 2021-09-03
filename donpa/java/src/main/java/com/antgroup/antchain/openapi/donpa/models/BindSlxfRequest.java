// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.donpa.models;

import com.aliyun.tea.*;

public class BindSlxfRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 修复批次号
    @NameInMap("batch_id")
    @Validation(required = true)
    public String batchId;

    // 待 修 复 sha256 加 密身份证号
    @NameInMap("id_card")
    @Validation(required = true)
    public String idCard;

    // 脱敏后手机号码加密串， 需要拨打的该手机号码
    @NameInMap("unicom_customer_id")
    @Validation(required = true)
    public String unicomCustomerId;

    // 主叫号码，号码要求备案
    @NameInMap("seat_number")
    @Validation(required = true)
    public String seatNumber;

    // 外显号，外显号要求在外 显号池中
    @NameInMap("show_number")
    @Validation(required = true)
    public String showNumber;

    // 虚拟小号， 线下分 配
    @NameInMap("tel_x")
    @Validation(required = true)
    public String telX;

    public static BindSlxfRequest build(java.util.Map<String, ?> map) throws Exception {
        BindSlxfRequest self = new BindSlxfRequest();
        return TeaModel.build(map, self);
    }

    public BindSlxfRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindSlxfRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BindSlxfRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public BindSlxfRequest setIdCard(String idCard) {
        this.idCard = idCard;
        return this;
    }
    public String getIdCard() {
        return this.idCard;
    }

    public BindSlxfRequest setUnicomCustomerId(String unicomCustomerId) {
        this.unicomCustomerId = unicomCustomerId;
        return this;
    }
    public String getUnicomCustomerId() {
        return this.unicomCustomerId;
    }

    public BindSlxfRequest setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
        return this;
    }
    public String getSeatNumber() {
        return this.seatNumber;
    }

    public BindSlxfRequest setShowNumber(String showNumber) {
        this.showNumber = showNumber;
        return this;
    }
    public String getShowNumber() {
        return this.showNumber;
    }

    public BindSlxfRequest setTelX(String telX) {
        this.telX = telX;
        return this;
    }
    public String getTelX() {
        return this.telX;
    }

}
