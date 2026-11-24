// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVERENDER.Models
{
    public class QueryAntcloudMarketingagentVideoRemakeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 生视频返回的task_id回传
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

    }

}
