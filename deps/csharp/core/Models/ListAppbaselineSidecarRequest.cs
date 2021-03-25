// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class ListAppbaselineSidecarRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // sidecar类型
        [NameInMap("category")]
        [Validation(Required=false)]
        public string Category { get; set; }

        // 过滤条件，网商仅能指定workspaceGroups属性
        [NameInMap("condition")]
        [Validation(Required=false)]
        public SidecarCondition Condition { get; set; }

        // sidecar版本号
        [NameInMap("sidecar_version")]
        [Validation(Required=false)]
        public string SidecarVersion { get; set; }

    }

}
