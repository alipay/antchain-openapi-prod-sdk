// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    // 农民工工资发放
    public class WorkersWagePayment : TeaModel {
        // 薪资年月
        [NameInMap("pay_y_m")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string PayYM { get; set; }

        // 工资是否发放[已发放 未发放]
        [NameInMap("pay_wages")]
        [Validation(Required=true)]
        public string PayWages { get; set; }

    }

}
