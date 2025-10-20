// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // 工具入参的json schema
    public class JsonSchema : TeaModel {
        // 类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        //  Map<String, Object> 类型
        [NameInMap("properties")]
        [Validation(Required=true)]
        public string Properties { get; set; }

        // 必填项
        [NameInMap("required")]
        [Validation(Required=true)]
        public List<string> Required { get; set; }

        // 是否允许额外属性
        [NameInMap("additional_properties")]
        [Validation(Required=true)]
        public bool? AdditionalProperties { get; set; }

    }

}
