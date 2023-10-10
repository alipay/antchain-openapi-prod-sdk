// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class SyncRiskEvaluationResponse : TeaModel {
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

        // 1322324243	unix秒时间戳,查询时间，用来对账使用
        [NameInMap("query_time")]
        [Validation(Required=false)]
        public string QueryTime { get; set; }

        // 内容，List<JsonObject>
        [NameInMap("biz_content")]
        [Validation(Required=false)]
        public string BizContent { get; set; }

    }

}
