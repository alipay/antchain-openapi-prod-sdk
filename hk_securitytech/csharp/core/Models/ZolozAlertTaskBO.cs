// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.HK_SECURITYTECH.Models
{
    // ZolozAlertTaskBO
    public class ZolozAlertTaskBO : TeaModel {
        // request_id
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // decision
        [NameInMap("decision")]
        [Validation(Required=true)]
        public string Decision { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // taskId
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

        // type
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // userId
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // source
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // crrRiskLevel
        [NameInMap("crr_risk_level")]
        [Validation(Required=true)]
        public string CrrRiskLevel { get; set; }

        // createTime
        [NameInMap("create_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreateTime { get; set; }

        // updateTime
        [NameInMap("update_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UpdateTime { get; set; }

        // modifier
        [NameInMap("modifier")]
        [Validation(Required=true)]
        public string Modifier { get; set; }

    }

}
