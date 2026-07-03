// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeEcrepayRequest : TeaModel {
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

        // 交易流水号 UUID
        [NameInMap("transaction_no")]
        [Validation(Required=true)]
        public string TransactionNo { get; set; }

        // 客户ID
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 合同编号
        [NameInMap("contract_no")]
        [Validation(Required=true)]
        public string ContractNo { get; set; }

        // 借据号
        [NameInMap("loan_no")]
        [Validation(Required=false)]
        public string LoanNo { get; set; }

        // 币种
        [NameInMap("currency")]
        [Validation(Required=true)]
        public string Currency { get; set; }

        // 查询开始时间 yyyy/MM/dd,不传时查询借据下所有还款记录
        [NameInMap("startdate")]
        [Validation(Required=false)]
        public string Startdate { get; set; }

        // 查询截至时间 yyyy/MM/dd,不传时查询借据下所有还款记录
        [NameInMap("enddate")]
        [Validation(Required=false)]
        public string Enddate { get; set; }

    }

}
