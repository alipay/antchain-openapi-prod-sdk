// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryDidNotificationDideventResponse : TeaModel {
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

        // 相关事件列表
        [NameInMap("events")]
        [Validation(Required=false)]
        public List<DidEvent> Events { get; set; }

        // 是否还有待同步事件
        [NameInMap("has_more")]
        [Validation(Required=false)]
        public bool? HasMore { get; set; }

        // 下次事件拉取开始的offset
        [NameInMap("next_offset")]
        [Validation(Required=false)]
        public long? NextOffset { get; set; }

    }

}
