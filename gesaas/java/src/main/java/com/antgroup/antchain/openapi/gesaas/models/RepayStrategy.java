// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class RepayStrategy extends TeaModel {
    // 应付租金时间，精确到天 格式为yyyy-MM-dd
    /**
     * <strong>example:</strong>
     * <p>2025-09-19</p>
     */
    @NameInMap("pay_day")
    @Validation(required = true)
    public String payDay;

    // 用户还款期数，从1开始
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("term_index")
    @Validation(required = true)
    public Long termIndex;

    // 应付租金，精确到分，即1234表示12.34元 大于0
    /**
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("rental_money")
    @Validation(required = true)
    public Long rentalMoney;

    // 是否经营分账, Y-是、N-否 为空代表否
    /**
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("operate_divide_flag")
    public String operateDivideFlag;

    // 经营分账收入方列表
    // 当operateDivideFlag 为Y时必填
    @NameInMap("operate_divide_trans_in_list")
    @Validation(required = true)
    public java.util.List<OperateDivideTransInModel> operateDivideTransInList;

    public static RepayStrategy build(java.util.Map<String, ?> map) throws Exception {
        RepayStrategy self = new RepayStrategy();
        return TeaModel.build(map, self);
    }

    public RepayStrategy setPayDay(String payDay) {
        this.payDay = payDay;
        return this;
    }
    public String getPayDay() {
        return this.payDay;
    }

    public RepayStrategy setTermIndex(Long termIndex) {
        this.termIndex = termIndex;
        return this;
    }
    public Long getTermIndex() {
        return this.termIndex;
    }

    public RepayStrategy setRentalMoney(Long rentalMoney) {
        this.rentalMoney = rentalMoney;
        return this;
    }
    public Long getRentalMoney() {
        return this.rentalMoney;
    }

    public RepayStrategy setOperateDivideFlag(String operateDivideFlag) {
        this.operateDivideFlag = operateDivideFlag;
        return this;
    }
    public String getOperateDivideFlag() {
        return this.operateDivideFlag;
    }

    public RepayStrategy setOperateDivideTransInList(java.util.List<OperateDivideTransInModel> operateDivideTransInList) {
        this.operateDivideTransInList = operateDivideTransInList;
        return this;
    }
    public java.util.List<OperateDivideTransInModel> getOperateDivideTransInList() {
        return this.operateDivideTransInList;
    }

}
