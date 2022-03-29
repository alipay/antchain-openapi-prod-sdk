// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // group
    public class GroupDTO : TeaModel {
        // 集群名
        [NameInMap("cluster")]
        [Validation(Required=false)]
        public string Cluster { get; set; }

        // 删除标志
        [NameInMap("delete_mark")]
        [Validation(Required=false)]
        public string DeleteMark { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public long? GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public long? GmtModified { get; set; }

        // Group ID
        [NameInMap("group_id")]
        [Validation(Required=true)]
        public string GroupId { get; set; }

        // 查询的 Group ID 适用的协议。TCP 协议和 HTTP 协议的 Group ID 不可以共用，需要分别创建。取值说明如下：
        // 
        // tcp：表示该 Group ID 仅适用于 TCP 协议的消息收发。
        // http：表示该 Group ID 仅适用于 HTTP 协议的消息收发。
        [NameInMap("group_type")]
        [Validation(Required=true)]
        public string GroupType { get; set; }

        // 数据库 ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 读权限
        [NameInMap("read_enable")]
        [Validation(Required=false)]
        public bool? ReadEnable { get; set; }

        // Group 备注信息
        [NameInMap("remark")]
        [Validation(Required=true)]
        public string Remark { get; set; }

        // 生效范围
        [NameInMap("scope")]
        [Validation(Required=false)]
        public string Scope { get; set; }

        // 版本号
        [NameInMap("version")]
        [Validation(Required=false)]
        public long? Version { get; set; }

        // retry topic读队列数
        [NameInMap("retry_read_queue_num")]
        [Validation(Required=false)]
        public long? RetryReadQueueNum { get; set; }

        // retry topic写队列数
        [NameInMap("retry_write_queue_num")]
        [Validation(Required=false)]
        public long? RetryWriteQueueNum { get; set; }

        // retry topic读写权限
        [NameInMap("retry_perm")]
        [Validation(Required=false)]
        public long? RetryPerm { get; set; }

        // Group 所属的应用名称，要求应用名在 zappinfo 上可查
        [NameInMap("owner")]
        [Validation(Required=false)]
        public string Owner { get; set; }

    }

}
