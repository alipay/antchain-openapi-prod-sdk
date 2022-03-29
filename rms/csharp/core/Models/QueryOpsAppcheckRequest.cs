// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryOpsAppcheckRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间名称
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // 应用名称
        [NameInMap("app")]
        [Validation(Required=true)]
        public string App { get; set; }

        // 0：异常 1：正常
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

    }

}
