// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class UpdateCellRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 蓝绿着色信息。
        [NameInMap("color")]
        [Validation(Required=false)]
        public string Color { get; set; }

        // 是否灰度。
        [NameInMap("is_gray")]
        [Validation(Required=false)]
        public bool? IsGray { get; set; }

        // 部署单元名称。
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 默认权重。
        [NameInMap("weight")]
        [Validation(Required=false)]
        public long? Weight { get; set; }

        // 所属环境信息。
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 所属工作空间名称。
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

    }

}
