// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 发布模板
    public class DeploymentTemplate : TeaModel {
        // 模板编码
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 中文名称
        [NameInMap("display_name")]
        [Validation(Required=true)]
        public string DisplayName { get; set; }

        // 模板描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 是否覆盖版本中的发布策略
        [NameInMap("override_deploy_config")]
        [Validation(Required=true)]
        public bool? OverrideDeployConfig { get; set; }

        // 发布策略
        [NameInMap("deploy_config")]
        [Validation(Required=false)]
        public DeployConfig DeployConfig { get; set; }

        // 是否开启变更卡点
        [NameInMap("enable_custom_hook")]
        [Validation(Required=true)]
        public bool? EnableCustomHook { get; set; }

        // 卡点类型：api或has
        [NameInMap("hook_type")]
        [Validation(Required=false)]
        public string HookType { get; set; }

        // 自定义卡点配置列表
        // 
        [NameInMap("custom_hooks")]
        [Validation(Required=false)]
        public List<CustomHook> CustomHooks { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 创建时间
        [NameInMap("created_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreatedTime { get; set; }

        // 更新时间
        [NameInMap("modified_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ModifiedTime { get; set; }

        // 版本号
        [NameInMap("version")]
        [Validation(Required=false)]
        public long? Version { get; set; }

    }

}
