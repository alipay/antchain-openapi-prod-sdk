// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class CountIpAccountResponse : TeaModel {
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

        // 用户数量
        [NameInMap("user_count")]
        [Validation(Required=false)]
        public long? UserCount { get; set; }

        // 版权方数量
        [NameInMap("seller_count")]
        [Validation(Required=false)]
        public long? SellerCount { get; set; }

        // 版权方数量
        [NameInMap("buyer_count")]
        [Validation(Required=false)]
        public long? BuyerCount { get; set; }

    }

}
