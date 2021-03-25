// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class ExistConfigGlobalRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 全局参数名称，同一个 scope + scopeId 下不能有同名的全局参数
        [NameInMap("key")]
        [Validation(Required=false)]
        public string Key { get; set; }

        // 作用域 id 数组，比如作用域类型（type）是 workspace，那么 scopeId 就是 workspace 的 id
        [NameInMap("scope_ids")]
        [Validation(Required=false)]
        public List<string> ScopeIds { get; set; }

        // 作用域类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
