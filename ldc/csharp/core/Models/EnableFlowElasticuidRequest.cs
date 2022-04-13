// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class EnableFlowElasticuidRequest : TeaModel {
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

        // 弹出的 UID 信息
        [NameInMap("pop_out_uids")]
        [Validation(Required=true)]
        public List<PopOutUid> PopOutUids { get; set; }

        // 是否压测流量（默认 false）
        [NameInMap("press")]
        [Validation(Required=false)]
        public bool? Press { get; set; }

        // 是否灰度流量（默认 false）
        [NameInMap("gray")]
        [Validation(Required=false)]
        public bool? Gray { get; set; }

    }

}
