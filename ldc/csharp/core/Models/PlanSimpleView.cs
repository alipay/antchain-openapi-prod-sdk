// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 发布单摘要信息
    public class PlanSimpleView : TeaModel {
        // 发布单涉及的应用个数
        [NameInMap("app_count")]
        [Validation(Required=true)]
        public long? AppCount { get; set; }

        // 创建时间
        [NameInMap("created_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreatedTime { get; set; }

        // 执行人
        [NameInMap("executor")]
        [Validation(Required=true)]
        public string Executor { get; set; }

        // 结束时间
        [NameInMap("finished_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string FinishedTime { get; set; }

        // 发布单id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 运维单类型
        [NameInMap("mode")]
        [Validation(Required=true)]
        public string Mode { get; set; }

        // 发布单标题
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 开始时间
        [NameInMap("started_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartedTime { get; set; }

        // 发布单状态
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // 发布单号
        [NameInMap("time_series_id")]
        [Validation(Required=true)]
        public string TimeSeriesId { get; set; }

        // 发布单类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 工作空间组id
        [NameInMap("workspace_group_id")]
        [Validation(Required=false)]
        public string WorkspaceGroupId { get; set; }

        // Pod 数量
        [NameInMap("pod_count")]
        [Validation(Required=false)]
        public long? PodCount { get; set; }

    }

}
