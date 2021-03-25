// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class GetTaskRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 请求的业务号，当`task_id`参数指定时该参数会被忽略
        [NameInMap("req_biz_id")]
        [Validation(Required=false)]
        public string ReqBizId { get; set; }

        // 异步请求的id， 当`req_biz_id`参数指定时可以不指定该参数，如果指定了该参数则忽略`req_biz_id`参数
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

    }

}
