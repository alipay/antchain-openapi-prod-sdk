// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 应用参数配置管理-某个参数在某个 scope + scope id 中渲染后的值
    public class ParamVal : TeaModel {
        // 参数渲染后的值
        [NameInMap("render_val")]
        [Validation(Required=false)]
        public string RenderVal { get; set; }

        // 某个 scope_id
        [NameInMap("scope_id")]
        [Validation(Required=false)]
        public string ScopeId { get; set; }

        // scope 类型
        [NameInMap("scope")]
        [Validation(Required=false)]
        public string Scope { get; set; }

    }

}
