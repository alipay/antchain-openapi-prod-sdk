// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class QueryDciContentsecurityRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 任务ID(数登流水号)
        [NameInMap("flow_number")]
        [Validation(Required=true)]
        public string FlowNumber { get; set; }

        // 客户端令牌
        [NameInMap("client_token")]
        [Validation(Required=false)]
        public string ClientToken { get; set; }

        // 任务Id, 已废弃
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

        // 作品名，已废弃
        [NameInMap("work_name")]
        [Validation(Required=false)]
        public string WorkName { get; set; }

        // 作品Hash，已废弃
        [NameInMap("work_hash")]
        [Validation(Required=false)]
        public string WorkHash { get; set; }

        // 作品分类，已废弃
        [NameInMap("work_category")]
        [Validation(Required=false)]
        public string WorkCategory { get; set; }

    }

}
