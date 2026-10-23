// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class QueryAdvisormarketAnalysisResponse : TeaModel {
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

        // JSON 数组字符串，调用方需再次解析。示例：[{"task_id":"ana_01K5A1B2","display_name":"中心商圈","analysis_type":"YINLI_CROWD_ANALYSIS","status":"PROCESSING","result_url":null,"created_at":"2026-09-14 15:30:00"}]。无数据返回 []；仅 SUCCESS 任务的结果查询会返回 result_url。
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

    }

}
