// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // 工具列表vo
    public class ToolInfoVO : TeaModel {
        // 工具名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 工具描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 工具入参的json schema
        [NameInMap("input_schema")]
        [Validation(Required=true)]
        public JsonSchema InputSchema { get; set; }

    }

}
