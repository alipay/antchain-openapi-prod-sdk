// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 租户应用发布状态
    public class TenantAppReleasePipeline : TeaModel {
        // 机构名称
        [NameInMap("tenant")]
        [Validation(Required=true)]
        public string Tenant { get; set; }

        // 环境
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 应用发布releaseId
        [NameInMap("release_id")]
        [Validation(Required=true)]
        public string ReleaseId { get; set; }

        // 发布单序列号
        [NameInMap("release_time_series_id")]
        [Validation(Required=true)]
        public string ReleaseTimeSeriesId { get; set; }

        // 应用发布状态
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // 应用发布单详情url
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

        // 应用列表
        [NameInMap("apps")]
        [Validation(Required=true)]
        public List<string> Apps { get; set; }

        // 操作人员
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 发布单ID
        [NameInMap("approve_plan_id")]
        [Validation(Required=false)]
        public string ApprovePlanId { get; set; }

        // 发布审批单Url
        [NameInMap("approve_plan_url")]
        [Validation(Required=false)]
        public string ApprovePlanUrl { get; set; }

    }

}
