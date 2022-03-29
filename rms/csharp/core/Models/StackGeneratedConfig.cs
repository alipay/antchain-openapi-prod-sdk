// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 技术栈产品配置
    public class StackGeneratedConfig : TeaModel {
        // 配置 ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 所属技术栈 ID
        [NameInMap("stack_id")]
        [Validation(Required=true)]
        public long? StackId { get; set; }

        // 技术栈名称
        [NameInMap("stack_name")]
        [Validation(Required=true)]
        public string StackName { get; set; }

        // 技术栈版本
        [NameInMap("stack_version")]
        [Validation(Required=true)]
        public string StackVersion { get; set; }

        // 栈的一个实体对象 ID
        [NameInMap("stack_entity_id")]
        [Validation(Required=true)]
        public long? StackEntityId { get; set; }

        // 栈的一个实体对象名称
        [NameInMap("stack_entity_name")]
        [Validation(Required=true)]
        public string StackEntityName { get; set; }

        // 实体的一个监控项 ID
        [NameInMap("stack_monitor_item_id")]
        [Validation(Required=true)]
        public long? StackMonitorItemId { get; set; }

        // 实体的一个监控项名称
        [NameInMap("stack_monitor_item_name")]
        [Validation(Required=true)]
        public string StackMonitorItemName { get; set; }

        // 栈实体
        [NameInMap("stack_universal_table_id")]
        [Validation(Required=true)]
        public string StackUniversalTableId { get; set; }

        // xflush应用名称
        [NameInMap("xflush_app")]
        [Validation(Required=true)]
        public string XflushApp { get; set; }

        // 是否迁移过来
        [NameInMap("xflush_move")]
        [Validation(Required=true)]
        public bool? XflushMove { get; set; }

        // xflush_type
        [NameInMap("xflush_type")]
        [Validation(Required=true)]
        public string XflushType { get; set; }

        // 是否开启
        [NameInMap("is_open")]
        [Validation(Required=true)]
        public bool? IsOpen { get; set; }

        // 存储规则(JSON String, 使用前需要解析)
        [NameInMap("storage_config")]
        [Validation(Required=true)]
        public string StorageConfig { get; set; }

        // 是否自定义
        [NameInMap("use_custom")]
        [Validation(Required=true)]
        public bool? UseCustom { get; set; }

        // xflush配置(JSON String, 使用前需要解析)
        [NameInMap("xflush_config")]
        [Validation(Required=false)]
        public string XflushConfig { get; set; }

    }

}
