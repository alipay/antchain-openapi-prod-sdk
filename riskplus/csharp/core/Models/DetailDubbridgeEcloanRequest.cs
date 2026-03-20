// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class DetailDubbridgeEcloanRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务场景
        [NameInMap("business_scene")]
        [Validation(Required=true)]
        public string BusinessScene { get; set; }

        // 交易流水号
        [NameInMap("transaction_no")]
        [Validation(Required=true)]
        public string TransactionNo { get; set; }

        // 合同号
        [NameInMap("contract_no")]
        [Validation(Required=true)]
        public string ContractNo { get; set; }

        // 借据号
        [NameInMap("loan_no")]
        [Validation(Required=false)]
        public string LoanNo { get; set; }

    }

}
