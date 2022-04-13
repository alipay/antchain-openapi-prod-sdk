// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class UpdateSidecaropsTemplateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 要更新的sidecar名称
        [NameInMap("sidecar_name")]
        [Validation(Required=true)]
        public string SidecarName { get; set; }

        // 指定要更新的sidecar版本
        [NameInMap("sidecar_version")]
        [Validation(Required=false)]
        public string SidecarVersion { get; set; }

        // 根据image筛选要更新的基线
        [NameInMap("image")]
        [Validation(Required=false)]
        public string Image { get; set; }

        // 要更新的sidecar模板
        [NameInMap("template")]
        [Validation(Required=false)]
        public string Template { get; set; }

        // 要设置成的scope
        [NameInMap("scope")]
        [Validation(Required=false)]
        public List<string> Scope { get; set; }

    }

}
