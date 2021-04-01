// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateDigitalassetExchangeEpstockissueRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 版通代码
        [NameInMap("ep_code")]
        [Validation(Required=true)]
        public string EpCode { get; set; }

        // 版通发行方账户
        [NameInMap("ep_issue_account")]
        [Validation(Required=true)]
        public string EpIssueAccount { get; set; }

        // 版通存量发行线下量
        [NameInMap("ep_offline_issue_amount")]
        [Validation(Required=true)]
        public long? EpOfflineIssueAmount { get; set; }

        // 版通存量发行线上量
        [NameInMap("ep_online_issue_amount")]
        [Validation(Required=true)]
        public long? EpOnlineIssueAmount { get; set; }

        // 版通存量发行自持量
        [NameInMap("ep_self_issue_amount")]
        [Validation(Required=true)]
        public long? EpSelfIssueAmount { get; set; }

        // 交易所代码
        [NameInMap("exchange_code")]
        [Validation(Required=true)]
        public string ExchangeCode { get; set; }

    }

}
