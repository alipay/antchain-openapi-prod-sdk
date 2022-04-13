// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class DisableFlowElasticuidRequest : TeaModel {
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

        // 弹回的 UID 分片
        [NameInMap("resume_uids")]
        [Validation(Required=true)]
        public List<long?> ResumeUids { get; set; }

        // 是否压测（默认 false）
        [NameInMap("press")]
        [Validation(Required=false)]
        public bool? Press { get; set; }

        // 是否灰度（默认 false）
        [NameInMap("gray")]
        [Validation(Required=false)]
        public bool? Gray { get; set; }

    }

}
