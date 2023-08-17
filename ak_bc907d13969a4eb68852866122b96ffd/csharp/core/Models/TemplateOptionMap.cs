// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_bc907d13969a4eb68852866122b96ffd.Models
{
    // 模板选项配置映射
    public class TemplateOptionMap : TeaModel {
        // Map<String, TaskTemplateOptionConfig> templateOptionMap中的key
        [NameInMap("key")]
        [Validation(Required=false)]
        public string Key { get; set; }

        // TaskTemplateOptionConfig
        [NameInMap("value")]
        [Validation(Required=false)]
        public TaskTemplateOptionConfig Value { get; set; }

    }

}
