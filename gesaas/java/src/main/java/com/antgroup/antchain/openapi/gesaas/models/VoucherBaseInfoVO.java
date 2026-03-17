// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class VoucherBaseInfoVO extends TeaModel {
    // 2088xxxxxx0001
    /**
     * <strong>example:</strong>
     * <p>用户ID</p>
     */
    @NameInMap("user_id")
    public String userId;

    // 手机号
    /**
     * <strong>example:</strong>
     * <p>15700001111</p>
     */
    @NameInMap("phone_number")
    public String phoneNumber;

    // 权益编号
    /**
     * <strong>example:</strong>
     * <p>RC188955110502576765</p>
     */
    @NameInMap("rights_code")
    @Validation(required = true)
    public String rightsCode;

    // 权益名称
    /**
     * <strong>example:</strong>
     * <p>满10元减2元</p>
     */
    @NameInMap("rights_name")
    @Validation(required = true)
    public String rightsName;

    // 券码
    /**
     * <strong>example:</strong>
     * <p>202601160007300227760ZT3CMQY</p>
     */
    @NameInMap("voucher_code")
    @Validation(required = true)
    public String voucherCode;

    // 券状态
    // WAIT_EFFECT：待生效 
    // WAIT_VERIFY：待核销 
    // EXPIRED：已过期 
    // VERIFY_SUCCESS：核销成功（已核销） 
    // 公域场景下只会包含以上四种状态，私域场景会包含下方状态基
    // FREEZE：已冻结 
    // VERIFYING：核销处理中 
    // VERIFY_FAIL：核销失败 
    // VERIFY_CANCELING：核销撤销中
    // INVALID：已失效 
    // NO_NEED_VERIFY：无需核销 
    /**
     * <strong>example:</strong>
     * <p>WAIT_VERIFY</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static VoucherBaseInfoVO build(java.util.Map<String, ?> map) throws Exception {
        VoucherBaseInfoVO self = new VoucherBaseInfoVO();
        return TeaModel.build(map, self);
    }

    public VoucherBaseInfoVO setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public VoucherBaseInfoVO setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public VoucherBaseInfoVO setRightsCode(String rightsCode) {
        this.rightsCode = rightsCode;
        return this;
    }
    public String getRightsCode() {
        return this.rightsCode;
    }

    public VoucherBaseInfoVO setRightsName(String rightsName) {
        this.rightsName = rightsName;
        return this;
    }
    public String getRightsName() {
        return this.rightsName;
    }

    public VoucherBaseInfoVO setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode;
        return this;
    }
    public String getVoucherCode() {
        return this.voucherCode;
    }

    public VoucherBaseInfoVO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
