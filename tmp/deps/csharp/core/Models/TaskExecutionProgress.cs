// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 任务执行进度
    public class TaskExecutionProgress : TeaModel {
        // 任务名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 显示名
        [NameInMap("show_name")]
        [Validation(Required=false)]
        public string ShowName { get; set; }

        // 业务类型
        [NameInMap("business_entity_code")]
        [Validation(Required=false)]
        public string BusinessEntityCode { get; set; }

        // 错误代码
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

        // 状态
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

        // 执行次数
        [NameInMap("execution_count")]
        [Validation(Required=false)]
        public string ExecutionCount { get; set; }

        // 详细信息
        [NameInMap("detail_msg")]
        [Validation(Required=false)]
        public string DetailMsg { get; set; }

        // 开始时间
        [NameInMap("started_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string StartedTime { get; set; }

        // 结束时间
        [NameInMap("finished_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string FinishedTime { get; set; }

        // 是否可独立执行
        [NameInMap("standalone_executable")]
        [Validation(Required=false)]
        public bool? StandaloneExecutable { get; set; }

        // ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

    }

}
