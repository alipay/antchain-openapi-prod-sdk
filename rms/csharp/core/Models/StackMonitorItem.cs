// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 技术栈监控项
    public class StackMonitorItem : TeaModel {
        // 监控项 ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 技术栈 ID
        [NameInMap("stack_id")]
        [Validation(Required=true)]
        public long? StackId { get; set; }

        // 名称，必须是英文
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 显示名
        [NameInMap("display_name")]
        [Validation(Required=true)]
        public string DisplayName { get; set; }

        // 能否自定义
        [NameInMap("can_custom")]
        [Validation(Required=true)]
        public bool? CanCustom { get; set; }

        // 管理实体 ID
        [NameInMap("manage_entity_id")]
        [Validation(Required=true)]
        public long? ManageEntityId { get; set; }

        // metric类型(dependency、error、service、resource等)
        [NameInMap("metric_type")]
        [Validation(Required=false)]
        public string MetricType { get; set; }

        // 配置(JSON String, 使用前需要解析)
        [NameInMap("config")]
        [Validation(Required=false)]
        public string Config { get; set; }

        // 标题
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

    }

}
