// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryMydidcommunWorkergroupWorkflowRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 工作流对应的部署Id
        [NameInMap("pod_id")]
        [Validation(Required=true)]
        public long? PodId { get; set; }

        // 版本号
        [NameInMap("pod_version")]
        [Validation(Required=true)]
        public long? PodVersion { get; set; }

    }

}
