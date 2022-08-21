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

        // 任务ID
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

        // 作品名称
        [NameInMap("work_name")]
        [Validation(Required=true)]
        public string WorkName { get; set; }

        // 作品哈希
        [NameInMap("work_hash")]
        [Validation(Required=true)]
        public string WorkHash { get; set; }

        // 作品类型
        [NameInMap("work_category")]
        [Validation(Required=true)]
        public string WorkCategory { get; set; }

        // 客户端令牌
        [NameInMap("client_token")]
        [Validation(Required=false)]
        public string ClientToken { get; set; }

    }

}
