// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class FinishMydidcommunWorkergroupSyncRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 部署ID
        [NameInMap("pod_id")]
        [Validation(Required=true)]
        public long? PodId { get; set; }

        // 任务ID
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public long? TaskId { get; set; }

        // 是否同步成功
        [NameInMap("is_success")]
        [Validation(Required=true)]
        public bool? IsSuccess { get; set; }

        // 处理消息
        [NameInMap("msg")]
        [Validation(Required=true)]
        public string Msg { get; set; }

        // 负责更新的节点名
        [NameInMap("master_node")]
        [Validation(Required=true)]
        public string MasterNode { get; set; }

    }

}
