// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AICONUMDECISION.Models
{
    public class QueryAntcloudDtcallagentVoiceinspectionResponse : TeaModel {
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

        // qc_record_id
        [NameInMap("qc_record_id")]
        [Validation(Required=false)]
        public string QcRecordId { get; set; }

        // 异步任务状态，如 PROCESSING、COMPLETED、FAILED
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 100 分制总分
        [NameInMap("total_score")]
        [Validation(Required=false)]
        public long? TotalScore { get; set; }

        // result
        [NameInMap("result")]
        [Validation(Required=false)]
        public string Result { get; set; }

        // 质检规则命中明细
        [NameInMap("checklist")]
        [Validation(Required=false)]
        public List<string> Checklist { get; set; }

    }

}
