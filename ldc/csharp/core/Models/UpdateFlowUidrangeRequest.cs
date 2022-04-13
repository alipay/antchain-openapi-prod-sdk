// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class UpdateFlowUidrangeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 部署单元组
        [NameInMap("cell_group")]
        [Validation(Required=true)]
        public string CellGroup { get; set; }

        // 是否灰度流量（默认false）
        [NameInMap("gray")]
        [Validation(Required=false)]
        public bool? Gray { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 是否压测流量（默认 false）
        [NameInMap("press")]
        [Validation(Required=false)]
        public bool? Press { get; set; }

        // uid 范围
        [NameInMap("uid_ranges")]
        [Validation(Required=true)]
        public UidShardList UidRanges { get; set; }

        // 工作空间组
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

    }

}
