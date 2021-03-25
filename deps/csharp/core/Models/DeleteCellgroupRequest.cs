// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class DeleteCellgroupRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 逻辑单元名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 所属环境名称
        [NameInMap("workspace_group")]
        [Validation(Required=false)]
        public string WorkspaceGroup { get; set; }

    }

}
