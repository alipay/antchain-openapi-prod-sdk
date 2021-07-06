// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    public class QueryBaicorpInternalevaluationasyncRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 产品ID
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // bizinfo
        [NameInMap("biz_info")]
        [Validation(Required=true)]
        public BizInfo BizInfo { get; set; }

        // 基于安全考虑，填充NonceId
        [NameInMap("custom_id")]
        [Validation(Required=true)]
        public string CustomId { get; set; }

        // 监测任务Id
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

    }

}
