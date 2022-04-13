// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class CreateCellRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 所属逻辑单元名称[单元化模式特有]。
        [NameInMap("cell_group")]
        [Validation(Required=false)]
        public string CellGroup { get; set; }

        // 蓝绿着色信息[单元化模式特有]。
        [NameInMap("color")]
        [Validation(Required=false)]
        public string Color { get; set; }

        // 部署单元标识。
        [NameInMap("identity")]
        [Validation(Required=true)]
        public string Identity { get; set; }

        // 是否灰度[单元化模式特有]。
        [NameInMap("is_gray")]
        [Validation(Required=false)]
        public bool? IsGray { get; set; }

        // 部署单元名称。
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 部署单元类型[单元化模式特有]。
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 权重[单元化模式特有]。
        [NameInMap("weight")]
        [Validation(Required=false)]
        public long? Weight { get; set; }

        // 所属环境名称。
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 所属机房。
        [NameInMap("zone")]
        [Validation(Required=true)]
        public string Zone { get; set; }

        // 所属工作空间名称。
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

    }

}
