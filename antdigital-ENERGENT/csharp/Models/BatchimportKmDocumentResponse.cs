// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGENT.Models
{
    public class BatchimportKmDocumentResponse : TeaModel {
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

        // 成功数量
        [NameInMap("success_count")]
        [Validation(Required=false)]
        public long? SuccessCount { get; set; }

        // 失败数量
        [NameInMap("failed_count")]
        [Validation(Required=false)]
        public long? FailedCount { get; set; }

        // 跳过数量(MD5重复)
        [NameInMap("skip_count")]
        [Validation(Required=false)]
        public long? SkipCount { get; set; }

        // 入库成功文档JSON数组(KbDocumentDTO字段定义见文档)
        [NameInMap("documents")]
        [Validation(Required=false)]
        public string Documents { get; set; }

    }

}
