// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryLeaseRentalverifyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 约定的合约id
        [NameInMap("application_id")]
        [Validation(Required=true)]
        public string ApplicationId { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 核验类型
        [NameInMap("proof_type")]
        [Validation(Required=true)]
        public string ProofType { get; set; }

        // 还款流水号
        [NameInMap("return_voucher_serial")]
        [Validation(Required=true)]
        public string ReturnVoucherSerial { get; set; }

        // 归还期数
        [NameInMap("return_term")]
        [Validation(Required=true)]
        public long? ReturnTerm { get; set; }

        // 租赁商户的id
        [NameInMap("lease_id")]
        [Validation(Required=true)]
        public string LeaseId { get; set; }

    }

}
