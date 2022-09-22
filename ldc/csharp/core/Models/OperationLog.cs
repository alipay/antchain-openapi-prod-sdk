// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 操作日志信息
    public class OperationLog : TeaModel {
        // 工作空间组id
        [NameInMap("workspace_group_id")]
        [Validation(Required=false)]
        public string WorkspaceGroupId { get; set; }

        // LDC_PLAN或者LDC_SERVICE
        [NameInMap("entity")]
        [Validation(Required=false)]
        public string Entity { get; set; }

        // 操作。
        [NameInMap("action")]
        [Validation(Required=false)]
        public string Action { get; set; }

        // 发布单plan_id或者lks_service_id
        [NameInMap("target_id")]
        [Validation(Required=false)]
        public string TargetId { get; set; }

        // operatorId
        [NameInMap("operator_id")]
        [Validation(Required=false)]
        public string OperatorId { get; set; }

        // operatorName
        [NameInMap("operator_name")]
        [Validation(Required=false)]
        public string OperatorName { get; set; }

        // sourceSystem
        [NameInMap("source_system")]
        [Validation(Required=false)]
        public string SourceSystem { get; set; }

        // context
        [NameInMap("context")]
        [Validation(Required=false)]
        public string Context { get; set; }

        // 集群id
        [NameInMap("cluster_id")]
        [Validation(Required=false)]
        public string ClusterId { get; set; }

        // pod名称
        [NameInMap("pod_name")]
        [Validation(Required=false)]
        public string PodName { get; set; }

        // 操作内容
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 创建时间
        [NameInMap("create_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreateTime { get; set; }

    }

}
