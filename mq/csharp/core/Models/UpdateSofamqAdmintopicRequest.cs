// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class UpdateSofamqAdmintopicRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 集群名
        [NameInMap("cluster")]
        [Validation(Required=true)]
        public string Cluster { get; set; }

        // 需创建的 Topic 所对应的实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 设置该 Topic 的读写模式。取值说明：6：同时支持读写；4：禁写；2：禁读。
        [NameInMap("perm")]
        [Validation(Required=false)]
        public long? Perm { get; set; }

        // 读队列数
        [NameInMap("read_queue_num")]
        [Validation(Required=false)]
        public long? ReadQueueNum { get; set; }

        // topic名
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

        // 写队列数
        [NameInMap("write_queue_num")]
        [Validation(Required=false)]
        public long? WriteQueueNum { get; set; }

        // 生效范围，三板斧使用
        [NameInMap("scope")]
        [Validation(Required=false)]
        public string Scope { get; set; }

        // 标识该 topic 的消息是否具有优先级
        [NameInMap("priority")]
        [Validation(Required=false)]
        public bool? Priority { get; set; }

    }

}
