// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACOPM.Models
{
    public class ExecRobotBaasplusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 目标请求id
        [NameInMap("target_req_id")]
        [Validation(Required=false)]
        public string TargetReqId { get; set; }

        // 目标请求参数
        [NameInMap("target_param")]
        [Validation(Required=false)]
        public string TargetParam { get; set; }

        // 是否重试
        [NameInMap("retry_flag")]
        [Validation(Required=true)]
        public bool? RetryFlag { get; set; }

    }

}
