// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    public class ReleaseAssetpledgeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 资金方的id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 质押Id
        [NameInMap("pledge_id")]
        [Validation(Required=true)]
        public string PledgeId { get; set; }

        // 放款时间
        [NameInMap("lend_date")]
        [Validation(Required=true)]
        public long? LendDate { get; set; }

        // 放款金额
        [NameInMap("value")]
        [Validation(Required=true)]
        public long? Value { get; set; }

        // 收款方名称
        [NameInMap("borrower_name")]
        [Validation(Required=true)]
        public string BorrowerName { get; set; }

        // 收款方账号
        [NameInMap("borrower_account")]
        [Validation(Required=true)]
        public string BorrowerAccount { get; set; }

        // 收款方银行
        [NameInMap("borrower_bank_info")]
        [Validation(Required=true)]
        public string BorrowerBankInfo { get; set; }

    }

}
