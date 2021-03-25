// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 技术栈信息
    public class Techstack : TeaModel {
        // 描述信息
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // extraInfo
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // 技术栈ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 标识符
        [NameInMap("identity")]
        [Validation(Required=false)]
        public string Identity { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 作用域
        [NameInMap("scope")]
        [Validation(Required=false)]
        public string Scope { get; set; }

        // 技术栈状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
