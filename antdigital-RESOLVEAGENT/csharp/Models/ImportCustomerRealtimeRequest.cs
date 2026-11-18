// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RESOLVEAGENT.Models
{
    public class ImportCustomerRealtimeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 批次幂等键（≤64 字符)
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 挂靠的任务 ID
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

        // 名单行 JSON 数组，每个元素为一名单行 JSON 字符串
        [NameInMap("cust_info")]
        [Validation(Required=true)]
        public List<string> CustInfo { get; set; }

    }

}
