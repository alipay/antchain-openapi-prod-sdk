// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_bc907d13969a4eb68852866122b96ffd.Models
{
    public class QueryItagAntitagTaskDownloadRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // iTAG租户ID
        [NameInMap("tntinstid")]
        [Validation(Required=false)]
        public string Tntinstid { get; set; }

        // runinstid
        [NameInMap("runinstid")]
        [Validation(Required=false)]
        public string Runinstid { get; set; }

        // 任务ID
        [NameInMap("taskid")]
        [Validation(Required=false)]
        public string Taskid { get; set; }

    }

}
