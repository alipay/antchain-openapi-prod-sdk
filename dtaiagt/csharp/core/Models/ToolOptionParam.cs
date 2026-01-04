// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // Agent对话-对应的工具/工作流参数列表
    public class ToolOptionParam : TeaModel {
        // 参数名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 参数code
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 参数描述
        [NameInMap("desc")]
        [Validation(Required=true)]
        public string Desc { get; set; }

        // 参数值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
