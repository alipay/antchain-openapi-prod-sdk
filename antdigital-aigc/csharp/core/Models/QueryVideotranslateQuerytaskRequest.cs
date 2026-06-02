// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AIGC.Models
{
    public class QueryVideotranslateQuerytaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 任务ID
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public long? TaskId { get; set; }

        // 子任务ID，不传则查询所有子任务
        [NameInMap("sub_task_id")]
        [Validation(Required=false)]
        public long? SubTaskId { get; set; }

    }

}
