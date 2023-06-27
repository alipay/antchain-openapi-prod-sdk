// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_31dc9f55b9684fe29acc7c0125a5d7a2.Models
{
    public class QueryAntcloudAdomAppmarketPrivacyresultResponse : TeaModel {
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

        // 隐私计算模型执行状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 结果文件路径
        [NameInMap("result_url")]
        [Validation(Required=false)]
        public string ResultUrl { get; set; }

        // 失败的原因
        [NameInMap("failed_reason")]
        [Validation(Required=false)]
        public string FailedReason { get; set; }

    }

}
