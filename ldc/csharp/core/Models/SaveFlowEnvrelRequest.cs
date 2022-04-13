// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class SaveFlowEnvrelRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 目标环境
        [NameInMap("dest")]
        [Validation(Required=true)]
        public string Dest { get; set; }

        // 源环境
        [NameInMap("src")]
        [Validation(Required=true)]
        public string Src { get; set; }

        // 关联关系：可选（PROD，GRAY）
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 环境
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

    }

}
