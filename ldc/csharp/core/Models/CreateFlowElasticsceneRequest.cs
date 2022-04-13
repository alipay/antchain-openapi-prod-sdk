// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class CreateFlowElasticsceneRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间组
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 场景名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 场景状态，可选值（VALID，INVALID）
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
