// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    public class RepayAssetpledgeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 申请方
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 质押id
        [NameInMap("pledge_id")]
        [Validation(Required=true)]
        public string PledgeId { get; set; }

        // 收款方银行
        [NameInMap("recipient_bank")]
        [Validation(Required=true)]
        public string RecipientBank { get; set; }

        // 收款方账号
        [NameInMap("recipient_account")]
        [Validation(Required=true)]
        public string RecipientAccount { get; set; }

        // 金额
        [NameInMap("value")]
        [Validation(Required=true)]
        public long? Value { get; set; }

        // 还款时间
        [NameInMap("repay_date")]
        [Validation(Required=true)]
        public long? RepayDate { get; set; }

    }

}
