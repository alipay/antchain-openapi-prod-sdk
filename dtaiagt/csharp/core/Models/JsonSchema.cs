// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // 工具入参的json schema
    public class JsonSchema : TeaModel {
        // 工具属性，Map<String, Object> 类型，适配网关透出，使用字符串方式存储
        [NameInMap("properties_json")]
        [Validation(Required=true)]
        public string PropertiesJson { get; set; }

        // 类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

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
