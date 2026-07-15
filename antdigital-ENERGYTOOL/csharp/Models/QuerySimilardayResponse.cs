// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    public class QuerySimilardayResponse : TeaModel {
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

        // 查询范围内容的最接近相似日，格式：yyyy-MM-dd
        [NameInMap("similar_day")]
        [Validation(Required=false)]
        public string SimilarDay { get; set; }

        // 相似日分析结果
        [NameInMap("analysis_result")]
        [Validation(Required=false)]
        public List<SimilarDayAnalysisData> AnalysisResult { get; set; }

    }

}
