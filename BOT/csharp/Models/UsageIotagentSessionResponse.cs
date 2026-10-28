// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class UsageIotagentSessionResponse : TeaModel {
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

        // 会话总量（全量聚合，不随分页变化）
        [NameInMap("session_usage")]
        [Validation(Required=false)]
        public SessionUsage SessionUsage { get; set; }

        // 总轮次数
        [NameInMap("total")]
        [Validation(Required=false)]
        public long? Total { get; set; }

        // 本页轮次明细
        [NameInMap("turns")]
        [Validation(Required=false)]
        public List<TurnModelCallsUsages> Turns { get; set; }

    }

}
