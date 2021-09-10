// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 人员伤残情况
    public class PersonLoss : TeaModel {
        // 伤情，HOSPITALIZE-住院，CLINIC-门诊，DEATH-死亡，ALLOWANCE-津贴
        [NameInMap("person_injured_condition")]
        [Validation(Required=true, MaxLength=50)]
        public string PersonInjuredCondition { get; set; }

        // 伤者姓名
        [NameInMap("person_injured_name")]
        [Validation(Required=true, MaxLength=200)]
        public string PersonInjuredName { get; set; }

        // 损失预估，单位（元），最多支持2位小数
        [NameInMap("person_loss_estimate_amount")]
        [Validation(Required=false)]
        public string PersonLossEstimateAmount { get; set; }

    }

}
