// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class AddSidecaropsTemplateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // sidecar名称
        [NameInMap("sidecar_name")]
        [Validation(Required=true)]
        public string SidecarName { get; set; }

        // 镜像地址
        [NameInMap("image")]
        [Validation(Required=true)]
        public string Image { get; set; }

        // 新的模板
        [NameInMap("template")]
        [Validation(Required=false)]
        public string Template { get; set; }

        // 基线模板作用域范围，如：["gray", "prod"]，不填时默认全局
        [NameInMap("scope")]
        [Validation(Required=false)]
        public List<string> Scope { get; set; }

        // 版本描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

    }

}
