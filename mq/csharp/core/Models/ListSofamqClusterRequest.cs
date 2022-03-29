// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class ListSofamqClusterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // cluster
        [NameInMap("cluster")]
        [Validation(Required=false)]
        public string Cluster { get; set; }

        // appkey
        [NameInMap("appkey")]
        [Validation(Required=false)]
        public string Appkey { get; set; }

    }

}
