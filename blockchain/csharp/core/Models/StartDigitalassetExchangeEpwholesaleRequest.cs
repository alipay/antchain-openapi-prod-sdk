// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartDigitalassetExchangeEpwholesaleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 批发账户信息列表
        [NameInMap("account_list")]
        [Validation(Required=true)]
        public List<AccountWholesaleParam> AccountList { get; set; }

        // 版通代码
        [NameInMap("ep_code")]
        [Validation(Required=true)]
        public string EpCode { get; set; }

        // 版通发行方账户
        [NameInMap("ep_issue_account")]
        [Validation(Required=true)]
        public string EpIssueAccount { get; set; }

        // 交易所代码
        [NameInMap("exchange_code")]
        [Validation(Required=true)]
        public string ExchangeCode { get; set; }

    }

}
