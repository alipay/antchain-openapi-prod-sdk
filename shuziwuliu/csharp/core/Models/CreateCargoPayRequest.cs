// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class CreateCargoPayRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        //  收款方银行账号
        [NameInMap("bank_account_of_payee")]
        [Validation(Required=false)]
        public string BankAccountOfPayee { get; set; }

        // 付款方银行账号,货主付款的开户银行账号
        [NameInMap("bank_account_of_payer")]
        [Validation(Required=false)]
        public string BankAccountOfPayer { get; set; }

        // 银行流水号
        [NameInMap("bank_no")]
        [Validation(Required=true)]
        public string BankNo { get; set; }

        // 收款方开户行（平台收款）
        // 取值：
        // MYBank_CloudCapital_2,  ## 云资金2.0
        [NameInMap("bank_of_payee")]
        [Validation(Required=false)]
        public string BankOfPayee { get; set; }

        // MYBank_CloudCapital_2,  ## 云资金2.0
        [NameInMap("bank_of_payer")]
        [Validation(Required=false)]
        public string BankOfPayer { get; set; }

        // 货源单号
        [NameInMap("cargo_order")]
        [Validation(Required=true)]
        public string CargoOrder { get; set; }

        // 核验渠道，请按取值约束值填入。
        // 
        // YBank_CloudCapital_2,  ## 云资金2.0
        [NameInMap("check_channel")]
        [Validation(Required=false)]
        public string CheckChannel { get; set; }

        // CNY、USD
        // 币种
        [NameInMap("currency")]
        [Validation(Required=false)]
        public string Currency { get; set; }

        // 费用类型 (运费、调度费、服务费)
        [NameInMap("expense_type")]
        [Validation(Required=true)]
        public string ExpenseType { get; set; }

        // 收款方名称
        [NameInMap("payee")]
        [Validation(Required=false)]
        public string Payee { get; set; }

        // 付款方名称
        [NameInMap("payer")]
        [Validation(Required=false)]
        public string Payer { get; set; }

        // 费用金额
        [NameInMap("payment")]
        [Validation(Required=true)]
        public string Payment { get; set; }

        // 是否核验
        [NameInMap("pay_check")]
        [Validation(Required=false)]
        public bool? PayCheck { get; set; }

        // 付款方did
        [NameInMap("pay_did")]
        [Validation(Required=true)]
        public string PayDid { get; set; }

        // 平台支付单号
        [NameInMap("pay_id")]
        [Validation(Required=true)]
        public string PayId { get; set; }

        // 支付备注
        [NameInMap("pay_note")]
        [Validation(Required=false)]
        public string PayNote { get; set; }

        // 支付时间
        [NameInMap("pay_time")]
        [Validation(Required=true)]
        public long? PayTime { get; set; }

        // 支付类型
        [NameInMap("pay_type")]
        [Validation(Required=false)]
        public string PayType { get; set; }

        // 收款方did
        [NameInMap("recv_did")]
        [Validation(Required=true)]
        public string RecvDid { get; set; }

        // 支持关联单个运单和多个运单
        [NameInMap("tax_waybill_ids")]
        [Validation(Required=true)]
        public List<string> TaxWaybillIds { get; set; }

    }

}
