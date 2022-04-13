// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class DeleteAntvipDomainRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间组名称
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 应用名称
        [NameInMap("application")]
        [Validation(Required=true)]
        public string Application { get; set; }

        // 部署单元cell名称
        [NameInMap("cell")]
        [Validation(Required=true)]
        public string Cell { get; set; }

    }

}
