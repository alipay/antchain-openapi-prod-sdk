// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 贷后异常监控
    public class LoanMonitorCust : TeaModel {
        // 合同编号
        [NameInMap("contract_no")]
        [Validation(Required=true)]
        public string ContractNo { get; set; }

        // 商户GMV 单位：元
        [NameInMap("gross_merc_volume")]
        [Validation(Required=true)]
        public string GrossMercVolume { get; set; }

        // 实际销售结算金额 单位：元，格式：数字，小数点后两位
        [NameInMap("act_sale_amt")]
        [Validation(Required=true)]
        public string ActSaleAmt { get; set; }

        // 退货率 单位：%
        [NameInMap("return_rate")]
        [Validation(Required=true)]
        public string ReturnRate { get; set; }

        // 已发货未收款金额 单位：元，格式：数字，小数点后两位
        [NameInMap("accounts_receivable")]
        [Validation(Required=true)]
        public string AccountsReceivable { get; set; }

    }

}
