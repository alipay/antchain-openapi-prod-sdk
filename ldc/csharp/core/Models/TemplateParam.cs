// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 发布模板参数
    public class TemplateParam : TeaModel {
        // 参数唯一标识
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 参数key
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 参数值
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

        // 参数中文名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 是否必填
        [NameInMap("required")]
        [Validation(Required=false)]
        public bool? Required { get; set; }

    }

}
