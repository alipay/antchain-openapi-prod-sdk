// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DATACOLLECTION.Models
{
    public class TriggerTaskInstRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 任务 id
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

        // 附加参数
        [NameInMap("extra")]
        [Validation(Required=false)]
        public string Extra { get; set; }

        // 幂等 id，若传了，则unique_id=inst_id
        [NameInMap("unique_id")]
        [Validation(Required=false)]
        public string UniqueId { get; set; }

    }

}
