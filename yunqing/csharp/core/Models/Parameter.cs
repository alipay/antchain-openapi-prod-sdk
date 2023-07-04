// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 参数
    public class Parameter : TeaModel {
        // 参数默认值
        [NameInMap("default")]
        [Validation(Required=true)]
        public string Default { get; set; }

        // 参数key
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        //  参数描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 参数类型        MANUAL("manual"),
        //         CONSTANT("constant"),
        //         EXPRESSION("expression");
        [NameInMap("kind")]
        [Validation(Required=true)]
        public string Kind { get; set; }

        // 是否必须
        [NameInMap("required")]
        [Validation(Required=true)]
        public bool? Required { get; set; }

        // 参数模版
        [NameInMap("parameters")]
        [Validation(Required=true)]
        public List<ParameterTemplate> Parameters { get; set; }

        //         STRING("string"),
        //         SECRET("secret"),
        //         INT("int"),
        //         FLOAT("float"),
        //         ANY("any");
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
