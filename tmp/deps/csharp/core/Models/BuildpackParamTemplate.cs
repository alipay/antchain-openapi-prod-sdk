// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 技术栈版本的参数
    public class BuildpackParamTemplate : TeaModel {
        // 技术栈版本的id
        [NameInMap("buildpack_id")]
        [Validation(Required=false)]
        public string BuildpackId { get; set; }

        // 技术栈版本参数的默认值
        [NameInMap("default_value")]
        [Validation(Required=false)]
        public string DefaultValue { get; set; }

        // 技术栈版本参数的描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 技术栈版本参数的key
        [NameInMap("key")]
        [Validation(Required=false)]
        public string Key { get; set; }

        // 该技术栈版本参数是否是只读的
        [NameInMap("readonly")]
        [Validation(Required=false)]
        public bool? Readonly { get; set; }

        // 该技术栈版本参数是否是必须的
        [NameInMap("required")]
        [Validation(Required=false)]
        public bool? Required { get; set; }

    }

}
