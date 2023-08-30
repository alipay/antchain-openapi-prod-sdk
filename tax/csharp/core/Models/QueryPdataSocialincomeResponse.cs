// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class QueryPdataSocialincomeResponse : TeaModel {
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

        // 查询结果
        [NameInMap("score_result")]
        [Validation(Required=false)]
        public string ScoreResult { get; set; }

        // 收入评分
        [NameInMap("range_score")]
        [Validation(Required=false)]
        public string RangeScore { get; set; }

        // 历史稳定性评估
        [NameInMap("history_score")]
        [Validation(Required=false)]
        public string HistoryScore { get; set; }

        // 近期稳定性评估
        [NameInMap("stability_score")]
        [Validation(Required=false)]
        public string StabilityScore { get; set; }

    }

}
