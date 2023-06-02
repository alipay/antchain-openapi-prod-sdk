// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    // 操作类型
    public class OperationType : TeaModel {
        // 操作描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 展示名称
        [NameInMap("display_name")]
        [Validation(Required=true)]
        public string DisplayName { get; set; }

        // 是否启用
        [NameInMap("enabled")]
        [Validation(Required=true)]
        public string Enabled { get; set; }

        // 操作名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 产品码
        [NameInMap("product")]
        [Validation(Required=true)]
        public string Product { get; set; }

        // 操作来源
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // Onex接口额外信息
        [NameInMap("onex_extra_info")]
        [Validation(Required=false)]
        public OnexExtraInfo OnexExtraInfo { get; set; }

        // 资源类型
        [NameInMap("resource_type")]
        [Validation(Required=false)]
        public string ResourceType { get; set; }

        // 资源表达式
        [NameInMap("resource_exp")]
        [Validation(Required=false)]
        public string ResourceExp { get; set; }

    }

}
