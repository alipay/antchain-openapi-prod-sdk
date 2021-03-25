// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // sidecar版本模板配置
    public class SidecarTemplateConfig : TeaModel {
        // 类型：默认、透明劫持
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 模板内容
        [NameInMap("template")]
        [Validation(Required=false)]
        public string Template { get; set; }

    }

}
