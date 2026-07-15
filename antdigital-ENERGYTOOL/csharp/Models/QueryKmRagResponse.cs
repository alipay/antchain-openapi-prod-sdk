// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    public class QueryKmRagResponse : TeaModel {
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

        // 答案
        [NameInMap("answer")]
        [Validation(Required=false)]
        public string Answer { get; set; }

        // 置信度
        [NameInMap("confidence")]
        [Validation(Required=false)]
        public long? Confidence { get; set; }

        // 引用来源
        [NameInMap("references")]
        [Validation(Required=false)]
        public List<string> References { get; set; }

    }

}
