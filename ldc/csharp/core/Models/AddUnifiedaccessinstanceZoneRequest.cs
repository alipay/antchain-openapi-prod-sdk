// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class AddUnifiedaccessinstanceZoneRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间组
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 统一接入实例名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 可用区（机房）列表
        [NameInMap("zones")]
        [Validation(Required=true)]
        public List<string> Zones { get; set; }

    }

}
