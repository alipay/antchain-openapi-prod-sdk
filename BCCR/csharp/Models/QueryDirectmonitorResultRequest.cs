// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class QueryDirectmonitorResultRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 监测任务id
        [NameInMap("monitor_task_id")]
        [Validation(Required=true)]
        public string MonitorTaskId { get; set; }

        // 页面大小(1-200)
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 页码(>0)
        [NameInMap("page_index")]
        [Validation(Required=true)]
        public long? PageIndex { get; set; }

    }

}
