// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class QueryTwevTaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 任务ID。和tuid二选一
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

        // 智能中控ID，和任务ID二选一
        [NameInMap("tuid")]
        [Validation(Required=false)]
        public string Tuid { get; set; }

        // json，扩展预留
        [NameInMap("extern_info")]
        [Validation(Required=true)]
        public string ExternInfo { get; set; }

    }

}
