// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 天枢-电商-额度返回
    public class DubheEcQuota : TeaModel {
        // 交易流水号,与上面的交易流水号一致
        [NameInMap("transaction_no")]
        [Validation(Required=true)]
        public string TransactionNo { get; set; }

        // 业务状态同步接口中，客户签约成功后的合同编号，在后续查询类接口都需要使用。
        [NameInMap("contract_no")]
        [Validation(Required=true)]
        public string ContractNo { get; set; }

        // 客户对应合同的总额度，单位：元，格式：数字，小数点后两位。
        [NameInMap("amt")]
        [Validation(Required=true)]
        public long? Amt { get; set; }

        // 客户对应合同的可用额度，单位：元，格式：数字，小数点后两位
        [NameInMap("avail_credit_amt")]
        [Validation(Required=true)]
        public long? AvailCreditAmt { get; set; }

        // 客户对应合同的已用额度，单位：元，格式：数字，小数点后两位
        [NameInMap("engross_amt")]
        [Validation(Required=true)]
        public long? EngrossAmt { get; set; }

        // 合同目前的额度状态 
        [NameInMap("credit_status")]
        [Validation(Required=true)]
        public string CreditStatus { get; set; }

        // 授信开始时间  格式: yyyy/MM/dd。额度有效时返回
        [NameInMap("contract_effect_date")]
        [Validation(Required=false)]
        public string ContractEffectDate { get; set; }

        // 授信结束时间 格式:yyyy/MM/dd。额度有效时返回
        [NameInMap("maturity_date")]
        [Validation(Required=false)]
        public string MaturityDate { get; set; }

    }

}
