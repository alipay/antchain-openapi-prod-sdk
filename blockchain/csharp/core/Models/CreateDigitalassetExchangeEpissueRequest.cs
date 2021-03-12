// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateDigitalassetExchangeEpissueRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 版通锚定物
        [NameInMap("ep_anchor")]
        [Validation(Required=true)]
        public string EpAnchor { get; set; }

        // 版通代码
        [NameInMap("ep_code")]
        [Validation(Required=true)]
        public string EpCode { get; set; }

        // 版通首发量
        [NameInMap("ep_first_amount")]
        [Validation(Required=true)]
        public long? EpFirstAmount { get; set; }

        // 版通发行方账户
        [NameInMap("ep_issue_account")]
        [Validation(Required=true)]
        public string EpIssueAccount { get; set; }

        // 版通发行时间戳
        [NameInMap("ep_issue_date")]
        [Validation(Required=true)]
        public long? EpIssueDate { get; set; }

        // 版通名称
        [NameInMap("ep_name")]
        [Validation(Required=true)]
        public string EpName { get; set; }

        // 版通线下发行配额
        [NameInMap("ep_offline_issue_amount")]
        [Validation(Required=true)]
        public long? EpOfflineIssueAmount { get; set; }

        // 版通线下日解限比例
        [NameInMap("ep_offline_unfreeze")]
        [Validation(Required=true)]
        public long? EpOfflineUnfreeze { get; set; }

        // 版通线上发行配额
        [NameInMap("ep_online_issue_amount")]
        [Validation(Required=true)]
        public long? EpOnlineIssueAmount { get; set; }

        // 发行方版通自持量
        [NameInMap("ep_self_amount")]
        [Validation(Required=true)]
        public long? EpSelfAmount { get; set; }

        // 发行方版通日解限比例
        [NameInMap("ep_self_unfreeze")]
        [Validation(Required=true)]
        public long? EpSelfUnfreeze { get; set; }

        // 版通发行数量
        [NameInMap("ep_total_amount")]
        [Validation(Required=true)]
        public long? EpTotalAmount { get; set; }

        // 版通类型
        [NameInMap("ep_type")]
        [Validation(Required=true)]
        public string EpType { get; set; }

        // 交易所代码
        [NameInMap("exchange_code")]
        [Validation(Required=true)]
        public string ExchangeCode { get; set; }

        // 预留扩展字段
        [NameInMap("extend")]
        [Validation(Required=false)]
        public string Extend { get; set; }

    }

}
