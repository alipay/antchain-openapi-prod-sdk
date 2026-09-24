// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class QueryAasDataBankcardlivenessResponse : TeaModel {
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

        // 响应ID（安科req_msg_id），回传接口必传
        [NameInMap("history_request_id")]
        [Validation(Required=false)]
        public string HistoryRequestId { get; set; }

        // 银行活跃度详情（JSONArray，排最前最活跃）
        [NameInMap("liveness_info")]
        [Validation(Required=false)]
        public string LivenessInfo { get; set; }

    }

}
