// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RESOLVEAGENT.Models
{
    public class ImportCustomerRealtimeResponse : TeaModel {
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

        // 原样回传请求中的 requestId
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

        // 我方生成的批次流水号，用于对账与追踪
        [NameInMap("provider_batch_id")]
        [Validation(Required=false)]
        public string ProviderBatchId { get; set; }

        // 名单行总数（= custInfo 行数）
        [NameInMap("total_count")]
        [Validation(Required=false)]
        public long? TotalCount { get; set; }

        // 受理成功、进入外呼队列的行数
        [NameInMap("accepted_count")]
        [Validation(Required=false)]
        public long? AcceptedCount { get; set; }

        // 校验未通过被拒绝的行数
        [NameInMap("rejected_count")]
        [Validation(Required=false)]
        public long? RejectedCount { get; set; }

        // 受理成功的 serialNo 列表
        [NameInMap("accepted_serial_nos")]
        [Validation(Required=false)]
        public List<string> AcceptedSerialNos { get; set; }

        // 被拒绝的 serialNo → 拒绝原因
        [NameInMap("rejected_items")]
        [Validation(Required=false)]
        public string RejectedItems { get; set; }

    }

}
