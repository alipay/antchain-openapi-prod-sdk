// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryTrustiotMiniappResponse : TeaModel {
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

        // 一次性跳转链接。链接整体 24 小时有效（见 valid_to），令牌一次性消费、用后即失效
        [NameInMap("redirect_url")]
        [Validation(Required=false)]
        public string RedirectUrl { get; set; }

        // 链接生效时间，毫秒级时间戳
        [NameInMap("valid_from")]
        [Validation(Required=false)]
        public long? ValidFrom { get; set; }

        // 链接过期时间，毫秒级时间戳，valid_from 起 24 小时。过期后链接不可用
        [NameInMap("valid_to")]
        [Validation(Required=false)]
        public long? ValidTo { get; set; }

    }

}
