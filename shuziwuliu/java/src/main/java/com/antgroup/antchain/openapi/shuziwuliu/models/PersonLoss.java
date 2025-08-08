// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class PersonLoss extends TeaModel {
    // 伤情，HOSPITALIZE-住院，CLINIC-门诊，DEATH-死亡，ALLOWANCE-津贴
    /**
     * <strong>example:</strong>
     * <p>CLINIC</p>
     */
    @NameInMap("person_injured_condition")
    @Validation(required = true, maxLength = 50)
    public String personInjuredCondition;

    // 伤者姓名
    /**
     * <strong>example:</strong>
     * <p>王大毛</p>
     */
    @NameInMap("person_injured_name")
    @Validation(required = true, maxLength = 200)
    public String personInjuredName;

    // 损失预估，单位（元），最多支持2位小数
    /**
     * <strong>example:</strong>
     * <p>68.00</p>
     */
    @NameInMap("person_loss_estimate_amount")
    public String personLossEstimateAmount;

    public static PersonLoss build(java.util.Map<String, ?> map) throws Exception {
        PersonLoss self = new PersonLoss();
        return TeaModel.build(map, self);
    }

    public PersonLoss setPersonInjuredCondition(String personInjuredCondition) {
        this.personInjuredCondition = personInjuredCondition;
        return this;
    }
    public String getPersonInjuredCondition() {
        return this.personInjuredCondition;
    }

    public PersonLoss setPersonInjuredName(String personInjuredName) {
        this.personInjuredName = personInjuredName;
        return this;
    }
    public String getPersonInjuredName() {
        return this.personInjuredName;
    }

    public PersonLoss setPersonLossEstimateAmount(String personLossEstimateAmount) {
        this.personLossEstimateAmount = personLossEstimateAmount;
        return this;
    }
    public String getPersonLossEstimateAmount() {
        return this.personLossEstimateAmount;
    }

}
