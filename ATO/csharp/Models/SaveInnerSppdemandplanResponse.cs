// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class SaveInnerSppdemandplanResponse : TeaModel {
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

        // 新增或编辑的计划编号
        [NameInMap("plan_id")]
        [Validation(Required=true)]
        public string PlanId { get; set; }

        // DRAFT 或 PENDING
        [NameInMap("audit_status")]
        [Validation(Required=true)]
        public string AuditStatus { get; set; }

        // PENDING
        [NameInMap("run_status")]
        [Validation(Required=true)]
        public string RunStatus { get; set; }

    }

}
