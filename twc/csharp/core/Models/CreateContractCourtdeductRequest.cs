// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateContractCourtdeductRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 流程id
        [NameInMap("flow_id")]
        [Validation(Required=true)]
        public string FlowId { get; set; }

        // 客户自定义案件id
        [NameInMap("case_id")]
        [Validation(Required=true)]
        public string CaseId { get; set; }

        // 案件名称
        [NameInMap("case_name")]
        [Validation(Required=true)]
        public string CaseName { get; set; }

        // 收款方人姓名
        [NameInMap("payee_name")]
        [Validation(Required=true)]
        public string PayeeName { get; set; }

        // 收款方人银行账户
        [NameInMap("payee_account")]
        [Validation(Required=true)]
        public string PayeeAccount { get; set; }

        // 收款方银行类型
        [NameInMap("payee_bank_type")]
        [Validation(Required=true)]
        public string PayeeBankType { get; set; }

        // 付款方人姓名
        [NameInMap("payer_name")]
        [Validation(Required=true)]
        public string PayerName { get; set; }

        // 付款方银行账户
        [NameInMap("payer_account")]
        [Validation(Required=true)]
        public string PayerAccount { get; set; }

        // 付款方银行类型，例如：icbc（工行）
        [NameInMap("payer_bank_type")]
        [Validation(Required=true)]
        public string PayerBankType { get; set; }

        // 扣款计划详情列表
        [NameInMap("payment_detail_list")]
        [Validation(Required=true)]
        public List<PaymentDetail> PaymentDetailList { get; set; }

    }

}
