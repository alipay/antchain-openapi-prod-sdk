// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class ApplyIpCodeResponse : TeaModel {
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

        // 正版码的批次ID
        [NameInMap("code_batch_id")]
        [Validation(Required=false)]
        public string CodeBatchId { get; set; }

        // 正版码左区间
        [NameInMap("code_batch_start")]
        [Validation(Required=false)]
        public long? CodeBatchStart { get; set; }

        // 正版码右区间
        [NameInMap("code_batch_end")]
        [Validation(Required=false)]
        public long? CodeBatchEnd { get; set; }

    }

}
