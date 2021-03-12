// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateNotaryRawTextResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 存证使用的链上账户
        [NameInMap("account_id")]
        [Validation(Required=false)]
        public string AccountId { get; set; }

        // 存证哈希
        [NameInMap("transaction_hash")]
        [Validation(Required=false)]
        public string TransactionHash { get; set; }

    }

}
