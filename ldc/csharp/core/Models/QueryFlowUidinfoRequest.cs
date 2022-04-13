// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class QueryFlowUidinfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 是否弹性（默认 false）
        [NameInMap("elastic")]
        [Validation(Required=false)]
        public bool? Elastic { get; set; }

        // 是否灰度（默认 false）
        [NameInMap("gray")]
        [Validation(Required=false)]
        public bool? Gray { get; set; }

        // 是否压测（默认 false）
        [NameInMap("press")]
        [Validation(Required=false)]
        public bool? Press { get; set; }

        // 工作空间组
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

    }

}
