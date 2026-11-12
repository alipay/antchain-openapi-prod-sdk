// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class RentalSignSchemeCreateResp extends TeaModel {
    // 签约单号，供对账与排查；后续改方案、发起、查询均以 order_id 定位
    /**
     * <strong>example:</strong>
     * <p>RS20261112000123</p>
     */
    @NameInMap("sign_no")
    public String signNo;

    // 签约单状态，见 SignStatusEnum；创建成功后为 INIT，重复建单回显当前实际状态
    /**
     * <strong>example:</strong>
     * <p>INIT</p>
     */
    @NameInMap("sign_status")
    public String signStatus;

    // 落库的押金方案,DEPOSIT_FREE（仅免押）/ PREAUTH_ONLY（仅预授权）/ FREE_WITH_PREAUTH（免押&预授权）
    /**
     * <strong>example:</strong>
     * <p>DEPOSIT_FREE</p>
     */
    @NameInMap("deposit_type")
    public String depositType;

    // 落库的信用减免金额（分），供确认页与合同展示
    /**
     * <strong>example:</strong>
     * <p>20000</p>
     */
    @NameInMap("credit_reduce_amount")
    public Long creditReduceAmount;

    // 动作集：是否需要预授权冻结（INIT 阶段由改方案重算，发起后不可变）
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("need_preauth")
    public Boolean needPreauth;

    // 动作集：是否需要代扣签约（含信用减免的方案为 true）
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("need_withhold")
    public Boolean needWithhold;

    // 动作集：是否需要合同签署（由订单进件时的 contractEnabled 决定，不由本接口修改）
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("need_contract")
    public Boolean needContract;

    public static RentalSignSchemeCreateResp build(java.util.Map<String, ?> map) throws Exception {
        RentalSignSchemeCreateResp self = new RentalSignSchemeCreateResp();
        return TeaModel.build(map, self);
    }

    public RentalSignSchemeCreateResp setSignNo(String signNo) {
        this.signNo = signNo;
        return this;
    }
    public String getSignNo() {
        return this.signNo;
    }

    public RentalSignSchemeCreateResp setSignStatus(String signStatus) {
        this.signStatus = signStatus;
        return this;
    }
    public String getSignStatus() {
        return this.signStatus;
    }

    public RentalSignSchemeCreateResp setDepositType(String depositType) {
        this.depositType = depositType;
        return this;
    }
    public String getDepositType() {
        return this.depositType;
    }

    public RentalSignSchemeCreateResp setCreditReduceAmount(Long creditReduceAmount) {
        this.creditReduceAmount = creditReduceAmount;
        return this;
    }
    public Long getCreditReduceAmount() {
        return this.creditReduceAmount;
    }

    public RentalSignSchemeCreateResp setNeedPreauth(Boolean needPreauth) {
        this.needPreauth = needPreauth;
        return this;
    }
    public Boolean getNeedPreauth() {
        return this.needPreauth;
    }

    public RentalSignSchemeCreateResp setNeedWithhold(Boolean needWithhold) {
        this.needWithhold = needWithhold;
        return this;
    }
    public Boolean getNeedWithhold() {
        return this.needWithhold;
    }

    public RentalSignSchemeCreateResp setNeedContract(Boolean needContract) {
        this.needContract = needContract;
        return this;
    }
    public Boolean getNeedContract() {
        return this.needContract;
    }

}
