// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // Agent对话-引用工具/工作流列表
    public class ToolOptionInfo : TeaModel {
        // plugin = 工具；workflow = 工作流
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 对应的工具/工作流名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 对应的工具/工作流名称
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 对应的工具/工作流参数列表
        [NameInMap("params")]
        [Validation(Required=true)]
        public List<ToolOptionParam> Params { get; set; }

    }

}
