// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_912f8ba016a046c6b5a6b1252cc63591.models;

import com.aliyun.tea.*;

public class Reconciliation extends TeaModel {
    // 供应商
    @NameInMap("sup_code")
    @Validation(required = true)
    public String supCode;

    // 供应商名称
    @NameInMap("sup_name")
    @Validation(required = true)
    public String supName;

    // 结算金额(单位分)
    @NameInMap("settlement_amount")
    @Validation(required = true)
    public Long settlementAmount;

    // 长城确认时间
    @NameInMap("confirm_date_gw")
    @Validation(required = true)
    public String confirmDateGw;

    // 长城方确认人
    @NameInMap("confirmer_gw")
    @Validation(required = true)
    public String confirmerGw;

    // 长城确认状态
    @NameInMap("confirm_state_gw")
    @Validation(required = true)
    public String confirmStateGw;

    // 服务方确认时间
    @NameInMap("confirm_date_sup")
    @Validation(required = true)
    public String confirmDateSup;

    // 服务方确认人
    @NameInMap("confirmer_sup")
    @Validation(required = true)
    public String confirmerSup;

    // 服务方确认状态
    @NameInMap("confirm_state_sup")
    @Validation(required = true)
    public String confirmStateSup;

    // 计算时间
    @NameInMap("socre_date")
    @Validation(required = true)
    public String socreDate;

    public static Reconciliation build(java.util.Map<String, ?> map) throws Exception {
        Reconciliation self = new Reconciliation();
        return TeaModel.build(map, self);
    }

    public Reconciliation setSupCode(String supCode) {
        this.supCode = supCode;
        return this;
    }
    public String getSupCode() {
        return this.supCode;
    }

    public Reconciliation setSupName(String supName) {
        this.supName = supName;
        return this;
    }
    public String getSupName() {
        return this.supName;
    }

    public Reconciliation setSettlementAmount(Long settlementAmount) {
        this.settlementAmount = settlementAmount;
        return this;
    }
    public Long getSettlementAmount() {
        return this.settlementAmount;
    }

    public Reconciliation setConfirmDateGw(String confirmDateGw) {
        this.confirmDateGw = confirmDateGw;
        return this;
    }
    public String getConfirmDateGw() {
        return this.confirmDateGw;
    }

    public Reconciliation setConfirmerGw(String confirmerGw) {
        this.confirmerGw = confirmerGw;
        return this;
    }
    public String getConfirmerGw() {
        return this.confirmerGw;
    }

    public Reconciliation setConfirmStateGw(String confirmStateGw) {
        this.confirmStateGw = confirmStateGw;
        return this;
    }
    public String getConfirmStateGw() {
        return this.confirmStateGw;
    }

    public Reconciliation setConfirmDateSup(String confirmDateSup) {
        this.confirmDateSup = confirmDateSup;
        return this;
    }
    public String getConfirmDateSup() {
        return this.confirmDateSup;
    }

    public Reconciliation setConfirmerSup(String confirmerSup) {
        this.confirmerSup = confirmerSup;
        return this;
    }
    public String getConfirmerSup() {
        return this.confirmerSup;
    }

    public Reconciliation setConfirmStateSup(String confirmStateSup) {
        this.confirmStateSup = confirmStateSup;
        return this;
    }
    public String getConfirmStateSup() {
        return this.confirmStateSup;
    }

    public Reconciliation setSocreDate(String socreDate) {
        this.socreDate = socreDate;
        return this;
    }
    public String getSocreDate() {
        return this.socreDate;
    }

}
