// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateLogisticFinanceCargopayorderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 银行流水号
        [NameInMap("bank_no")]
        [Validation(Required=true)]
        public string BankNo { get; set; }

        // 货源单号
        [NameInMap("cargo_order")]
        [Validation(Required=true)]
        public string CargoOrder { get; set; }

        // 费用类型   (运费、调度费、服务费)
        [NameInMap("expense_type")]
        [Validation(Required=true)]
        public string ExpenseType { get; set; }

        // 支付金额
        [NameInMap("payment")]
        [Validation(Required=true)]
        public string Payment { get; set; }

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

        // 收款方did
        [NameInMap("recv_did")]
        [Validation(Required=true)]
        public string RecvDid { get; set; }

    }

}
