// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 资费项账单
    public class PayBillTariffParam : TeaModel {
        // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        [NameInMap("action")]
        [Validation(Required=false)]
        public string Action { get; set; }

        // 账单金额 业务必填
        [NameInMap("bill_amount")]
        [Validation(Required=false)]
        public string BillAmount { get; set; }

        // 应付账单、应付资费项 多对多code
        [NameInMap("pay_bill_tariff_code")]
        [Validation(Required=true)]
        public string PayBillTariffCode { get; set; }

        //  资费项金额 业务必填
        [NameInMap("pay_tariff_amount")]
        [Validation(Required=false)]
        public string PayTariffAmount { get; set; }

        // 应付资费项编号 业务必填
        [NameInMap("pay_tariff_code")]
        [Validation(Required=false)]
        public string PayTariffCode { get; set; }

    }

}
