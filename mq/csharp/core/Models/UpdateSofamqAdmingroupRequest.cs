// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class UpdateSofamqAdmingroupRequest : TeaModel {
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

        // group名
        [NameInMap("group_id")]
        [Validation(Required=true)]
        public string GroupId { get; set; }

        // 需创建的 Topic 所对应的实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 设置读消息开关
        [NameInMap("read_enable")]
        [Validation(Required=true)]
        public bool? ReadEnable { get; set; }

        // 生效范围，三板斧使用
        [NameInMap("scope")]
        [Validation(Required=false)]
        public string Scope { get; set; }

        // 重试队列读队列数
        [NameInMap("retry_read_queue_num")]
        [Validation(Required=false)]
        public long? RetryReadQueueNum { get; set; }

        // 重试队列写队列数
        [NameInMap("retry_write_queue_num")]
        [Validation(Required=false)]
        public long? RetryWriteQueueNum { get; set; }

        // 设置该重试队列的读写模式。取值说明：6：同时支持读写；4：禁写；2：禁读。
        [NameInMap("retry_perm")]
        [Validation(Required=false)]
        public long? RetryPerm { get; set; }

    }

}
