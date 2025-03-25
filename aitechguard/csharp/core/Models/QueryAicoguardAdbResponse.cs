// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECHGUARD.Models
{
    public class QueryAicoguardAdbResponse : TeaModel {
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

        // 查询向量库的提问内容
        [NameInMap("question")]
        [Validation(Required=false)]
        public string Question { get; set; }

        // 向量库匹配到的代答结果
        [NameInMap("answer")]
        [Validation(Required=false)]
        public string Answer { get; set; }

        // 本次匹配分数
        [NameInMap("score")]
        [Validation(Required=false)]
        public string Score { get; set; }

        // 本次查询adb的请求id
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

    }

}
