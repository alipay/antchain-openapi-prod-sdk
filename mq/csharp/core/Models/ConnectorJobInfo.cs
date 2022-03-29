// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 连接器任务信息
    public class ConnectorJobInfo : TeaModel {
        // 任务名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 任务的调度类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 任务描述
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

        // 任务状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 所属应用
        [NameInMap("app")]
        [Validation(Required=true)]
        public string App { get; set; }

        // 工单状态
        [NameInMap("process_status")]
        [Validation(Required=true)]
        public string ProcessStatus { get; set; }

        // 系统标签
        [NameInMap("sys_labels")]
        [Validation(Required=false)]
        public List<string> SysLabels { get; set; }

        // 应用标签
        [NameInMap("user_labels")]
        [Validation(Required=false)]
        public List<string> UserLabels { get; set; }

        // 事件订阅是否开启
        [NameInMap("event_sub_enabled")]
        [Validation(Required=false)]
        public bool? EventSubEnabled { get; set; }

    }

}
