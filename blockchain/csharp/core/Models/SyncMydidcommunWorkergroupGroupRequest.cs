// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class SyncMydidcommunWorkergroupGroupRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 计算集群明称
        [NameInMap("worker_group")]
        [Validation(Required=true)]
        public string WorkerGroup { get; set; }

        // 计算集群环境
        [NameInMap("env")]
        [Validation(Required=true)]
        public string Env { get; set; }

        // 执行状态上报
        [NameInMap("metrics")]
        [Validation(Required=true)]
        public string Metrics { get; set; }

        // 执行器code
        [NameInMap("executor_list")]
        [Validation(Required=true)]
        public List<string> ExecutorList { get; set; }

        // 主节点名
        [NameInMap("master_node")]
        [Validation(Required=true)]
        public string MasterNode { get; set; }

    }

}
