// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 应用发布任务，发布详情可操作(跳过、确认、重试等)单元
    public class AppDeployTask : TeaModel {
        // 操作code
        [NameInMap("action_code")]
        [Validation(Required=true)]
        public string ActionCode { get; set; }

        // 当前任务的发布单元列表
        [NameInMap("app_deploy_cells")]
        [Validation(Required=true)]
        public List<AppDeployCell> AppDeployCells { get; set; }

        // 是否支持确认操作
        [NameInMap("confirm_supported")]
        [Validation(Required=true)]
        public bool? ConfirmSupported { get; set; }

        // 上下文数据，json字符串
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 是否支持跳过操作
        [NameInMap("ignore_supported")]
        [Validation(Required=true)]
        public bool? IgnoreSupported { get; set; }

        // 是否支持重试操作
        [NameInMap("retry_supported")]
        [Validation(Required=true)]
        public bool? RetrySupported { get; set; }

        // 当前状态
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // 开始时间。
        [NameInMap("started_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartedTime { get; set; }

        // 结束时间。
        [NameInMap("finished_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string FinishedTime { get; set; }

        // message detail
        [NameInMap("message_detail")]
        [Validation(Required=false)]
        public string MessageDetail { get; set; }

        // 任务类型
        [NameInMap("task_type")]
        [Validation(Required=false)]
        public string TaskType { get; set; }

        // 任务显示名称，自定义卡点任务才会有值
        [NameInMap("task_display_name")]
        [Validation(Required=false)]
        public string TaskDisplayName { get; set; }

    }

}
