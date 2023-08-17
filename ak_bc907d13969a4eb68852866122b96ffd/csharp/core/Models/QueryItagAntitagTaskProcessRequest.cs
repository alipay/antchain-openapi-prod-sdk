// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_bc907d13969a4eb68852866122b96ffd.Models
{
    public class QueryItagAntitagTaskProcessRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // TntInstId
        [NameInMap("tntinstid")]
        [Validation(Required=false)]
        public string Tntinstid { get; set; }

        // taskid
        [NameInMap("taskid")]
        [Validation(Required=false)]
        public string Taskid { get; set; }

    }

}
