// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // sofa mq
    public class TopicDTO : TeaModel {
        // 集群名称
        [NameInMap("cluster")]
        [Validation(Required=false)]
        public string Cluster { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public long? GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public long? GmtModified { get; set; }

        // 数据库 ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 消息类型。取值说明如下：
        // 
        // 0：普通消息
        // 1：分区顺序消息
        // 2：全局顺序消息
        // 4：事务消息
        // 5：定时/延时消息
        [NameInMap("message_type")]
        [Validation(Required=true)]
        public long? MessageType { get; set; }

        // 创建人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 设置该 Topic 的读写模式。取值说明如下：
        // 
        // 6：同时支持读写
        // 4：禁写
        // 2：禁读
        [NameInMap("perm")]
        [Validation(Required=true)]
        public long? Perm { get; set; }

        // 读分区数
        [NameInMap("read_queue_num")]
        [Validation(Required=false)]
        public long? ReadQueueNum { get; set; }

        // Topic 备注信息
        [NameInMap("remark")]
        [Validation(Required=true)]
        public string Remark { get; set; }

        // Topic 名称
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

        // 写分区数
        [NameInMap("write_queue_num")]
        [Validation(Required=false)]
        public long? WriteQueueNum { get; set; }

        // 生效范围
        [NameInMap("scope")]
        [Validation(Required=false)]
        public string Scope { get; set; }

        // 版本号
        [NameInMap("version")]
        [Validation(Required=false)]
        public long? Version { get; set; }

        // 删除标志
        [NameInMap("delete_mark")]
        [Validation(Required=false)]
        public string DeleteMark { get; set; }

        // true标识该topic带有schema，否则不带schema
        [NameInMap("schema_mark")]
        [Validation(Required=false)]
        public bool? SchemaMark { get; set; }

        // Topic对应Schema配置的序列化方式
        [NameInMap("schema_serialization")]
        [Validation(Required=false)]
        public string SchemaSerialization { get; set; }

        // Topic对应的Schema的兼容性策略
        [NameInMap("schema_compatibility")]
        [Validation(Required=false)]
        public string SchemaCompatibility { get; set; }

        // Topic 所属的应用名称，要求 app name 在 zappinfo 上可查
        [NameInMap("owner")]
        [Validation(Required=false)]
        public string Owner { get; set; }

    }

}
