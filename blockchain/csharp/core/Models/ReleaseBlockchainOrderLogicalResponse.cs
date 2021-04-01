// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class ReleaseBlockchainOrderLogicalResponse : TeaModel {
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

        // bid
        [NameInMap("bid")]
        [Validation(Required=false)]
        public string Bid { get; set; }

        // country
        [NameInMap("country")]
        [Validation(Required=false)]
        public string Country { get; set; }

        // data
        [NameInMap("data")]
        [Validation(Required=false)]
        public bool? Data { get; set; }

        // gmt_wakeup
        [NameInMap("gmt_wakeup")]
        [Validation(Required=false)]
        public string GmtWakeup { get; set; }

        // hid
        [NameInMap("hid")]
        [Validation(Required=false)]
        public long? Hid { get; set; }

        // interrupt
        [NameInMap("interrupt")]
        [Validation(Required=false)]
        public bool? Interrupt { get; set; }

        // invoker
        [NameInMap("invoker")]
        [Validation(Required=false)]
        public string Invoker { get; set; }

        // level
        [NameInMap("level")]
        [Validation(Required=false)]
        public long? Level { get; set; }

        // message
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // pk
        [NameInMap("pk")]
        [Validation(Required=false)]
        public string Pk { get; set; }

        // prompt
        [NameInMap("prompt")]
        [Validation(Required=false)]
        public string Prompt { get; set; }

        // reques_id
        [NameInMap("reques_id")]
        [Validation(Required=false)]
        public string RequesId { get; set; }

        // 阿里云请求返回结果
        [NameInMap("result")]
        [Validation(Required=false)]
        public ALiYunDeleteResource Result { get; set; }

        // task_extra_data
        [NameInMap("task_extra_data")]
        [Validation(Required=false)]
        public string TaskExtraData { get; set; }

        // task_identifier
        [NameInMap("task_identifier")]
        [Validation(Required=false)]
        public string TaskIdentifier { get; set; }

        // url
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

    }

}
