// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class UpdateMeiyouAuditRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 主题ID
        [NameInMap("topic_ids")]
        [Validation(Required=false)]
        public List<long?> TopicIds { get; set; }

        // 美柚itag关联状态
        [NameInMap("topic_state")]
        [Validation(Required=false)]
        public string TopicState { get; set; }

        // 审核记录ID
        [NameInMap("audit_ids")]
        [Validation(Required=false)]
        public List<long?> AuditIds { get; set; }

        // 美柚itag关联状态
        [NameInMap("audit_state")]
        [Validation(Required=false)]
        public string AuditState { get; set; }

        // itag任务ID
        [NameInMap("itag_task_id")]
        [Validation(Required=false)]
        public long? ItagTaskId { get; set; }

        // itag数据集ID
        [NameInMap("itag_dataset_id")]
        [Validation(Required=false)]
        public long? ItagDatasetId { get; set; }

        // 数据来源
        [NameInMap("source")]
        [Validation(Required=false)]
        public string Source { get; set; }

    }

}
