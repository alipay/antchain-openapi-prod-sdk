// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryBenefithubReportEffectiveResponse : TeaModel {
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

        // 是否存在有效订单0无1有
        [NameInMap("report_valid")]
        [Validation(Required=false)]
        public string ReportValid { get; set; }

        // 报告生成时间
        [NameInMap("report_valid_from")]
        [Validation(Required=false)]
        public string ReportValidFrom { get; set; }

        // 报告过期时间
        [NameInMap("report_valid_to")]
        [Validation(Required=false)]
        public string ReportValidTo { get; set; }

    }

}
