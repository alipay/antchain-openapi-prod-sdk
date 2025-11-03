// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class QueryMeiyouItagrelationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 主键id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 审核记录ID
        [NameInMap("audit_id")]
        [Validation(Required=false)]
        public long? AuditId { get; set; }

        // 主题ID
        [NameInMap("topic_id")]
        [Validation(Required=false)]
        public long? TopicId { get; set; }

        // itag任务ID
        [NameInMap("itag_task_id")]
        [Validation(Required=false)]
        public long? ItagTaskId { get; set; }

        // itag数据集ID
        [NameInMap("itag_dataset_id")]
        [Validation(Required=false)]
        public long? ItagDatasetId { get; set; }

        // itag数据ID
        [NameInMap("itag_data_id")]
        [Validation(Required=false)]
        public long? ItagDataId { get; set; }

        // 美柚任务审核结果推送状态
        [NameInMap("meiyou_audit_state")]
        [Validation(Required=false)]
        public string MeiyouAuditState { get; set; }

        // 审核记录状态
        [NameInMap("audit_state")]
        [Validation(Required=false)]
        public string AuditState { get; set; }

        // 主题记录状态
        [NameInMap("topic_state")]
        [Validation(Required=false)]
        public string TopicState { get; set; }

        // 更新时间-start
        [NameInMap("gmt_modified_start")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModifiedStart { get; set; }

        // 更新时间-end 
        [NameInMap("gmt_modified_end")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModifiedEnd { get; set; }

        // 操作人
        [NameInMap("audit_operator")]
        [Validation(Required=false)]
        public string AuditOperator { get; set; }

        // 数据来源
        [NameInMap("source")]
        [Validation(Required=false)]
        public string Source { get; set; }

    }

}
