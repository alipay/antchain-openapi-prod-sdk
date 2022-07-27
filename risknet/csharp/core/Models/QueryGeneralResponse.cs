// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKNET.Models
{
    public class QueryGeneralResponse : TeaModel {
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

        // 风险咨询是否查得
        [NameInMap("found")]
        [Validation(Required=false)]
        public string Found { get; set; }

        // 风险咨询结果
        [NameInMap("risk_result")]
        [Validation(Required=false)]
        public string RiskResult { get; set; }

        // 风险咨询结果补充讯息
        [NameInMap("risk_result_ext")]
        [Validation(Required=false)]
        public string RiskResultExt { get; set; }

    }

}
