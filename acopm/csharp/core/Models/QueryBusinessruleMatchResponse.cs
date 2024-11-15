// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACOPM.Models
{
    public class QueryBusinessruleMatchResponse : TeaModel {
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

        // 最终匹配结果
        [NameInMap("match_result")]
        [Validation(Required=false)]
        public string MatchResult { get; set; }

        // 出入参信息
        [NameInMap("http_content")]
        [Validation(Required=false)]
        public string HttpContent { get; set; }

        // 防控结果
        [NameInMap("prevent_result")]
        [Validation(Required=false)]
        public string PreventResult { get; set; }

        // 匹配到的L5
        [NameInMap("match_business_code")]
        [Validation(Required=false)]
        public string MatchBusinessCode { get; set; }

        // 匹配到的实例id
        [NameInMap("match_instance_id")]
        [Validation(Required=false)]
        public string MatchInstanceId { get; set; }

        // 规则引擎耗时
        [NameInMap("engine_time")]
        [Validation(Required=false)]
        public string EngineTime { get; set; }

    }

}
