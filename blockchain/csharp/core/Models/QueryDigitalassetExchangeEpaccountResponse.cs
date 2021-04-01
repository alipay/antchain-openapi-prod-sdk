// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryDigitalassetExchangeEpaccountResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 账户状态 0:正常 1:锁定
        [NameInMap("account_status")]
        [Validation(Required=false)]
        public long? AccountStatus { get; set; }

        // 版通回购账户信息
        [NameInMap("buyback_accounts")]
        [Validation(Required=false)]
        public List<AccountInfo> BuybackAccounts { get; set; }

        // 版通限制交易账户信息
        [NameInMap("constrained_accounts")]
        [Validation(Required=false)]
        public List<AccountInfo> ConstrainedAccounts { get; set; }

        // 版通可交易账户信息
        [NameInMap("trade_accounts")]
        [Validation(Required=false)]
        public List<AccountInfo> TradeAccounts { get; set; }

    }

}
