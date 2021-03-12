// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class GetMydidcommunWorkergroupSyncRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 计算集群群组代号
        [NameInMap("group_code")]
        [Validation(Required=true)]
        public string GroupCode { get; set; }

        // 环境名称
        [NameInMap("env")]
        [Validation(Required=true)]
        public string Env { get; set; }

        // 主节点
        [NameInMap("master_node")]
        [Validation(Required=true)]
        public string MasterNode { get; set; }

    }

}
