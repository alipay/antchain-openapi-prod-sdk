// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVERENDER.Models
{
    public class QueryAntcloudMarketingagentCreativeImageeditResponse : TeaModel {
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

        // 本次子图编辑任务的独立消息 ID。
        [NameInMap("message_id")]
        [Validation(Required=false)]
        public string MessageId { get; set; }

        // 本次编辑生成的新版本 ID，任务成功后可作为下一轮编辑的来源版本。
        [NameInMap("segment_version_id")]
        [Validation(Required=false)]
        public string SegmentVersionId { get; set; }

        // 任务状态：PROCESSING（处理中）、COMPLETED（成功）、FAILED（失败）。查询接口调用成功不代表任务生成成功。
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 编辑成功后的图片地址，仅在 status 为 COMPLETED 时返回。
        [NameInMap("result_url")]
        [Validation(Required=false)]
        public string ResultUrl { get; set; }

        // 编辑失败原因，在 status 为 FAILED 时返回。
        [NameInMap("fail_reason")]
        [Validation(Required=false)]
        public string FailReason { get; set; }

    }

}
