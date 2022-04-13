// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 查询返回spanner cluster的详细信息
    public class QuerySpannerClusterDetail : TeaModel {
        // 用于描述联邦spanner 集群内容器实例采用内网还是外网 
        [NameInMap("address_type")]
        [Validation(Required=true)]
        public string AddressType { get; set; }

        // cpu 核数
        [NameInMap("cpu")]
        [Validation(Required=false)]
        public long? Cpu { get; set; }

        // 创建时间
        [NameInMap("create_timestamp")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreateTimestamp { get; set; }

        // 盘大小
        [NameInMap("disk")]
        [Validation(Required=false)]
        public long? Disk { get; set; }

        // 将cpu,mem,disk按照单位拼接起来
        [NameInMap("flavor")]
        [Validation(Required=true)]
        public string Flavor { get; set; }

        // 描述集群容器是否采用了host网络	
        // 
        [NameInMap("host_network")]
        [Validation(Required=true)]
        public bool? HostNetwork { get; set; }

        // 集群id
        [NameInMap("id")]
        [Validation(Required=true, MaxLength=256)]
        public string Id { get; set; }

        // 关联的实例数
        [NameInMap("instances")]
        [Validation(Required=true)]
        public long? Instances { get; set; }

        // mem 大小
        [NameInMap("mem")]
        [Validation(Required=false)]
        public long? Mem { get; set; }

        // 可能存在的错误信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 集群名称
        [NameInMap("name")]
        [Validation(Required=true, MaxLength=63)]
        public string Name { get; set; }

        // 描述集群状态	
        // 
        [NameInMap("state")]
        [Validation(Required=true, MaxLength=63)]
        public string State { get; set; }

        // 租户名称
        [NameInMap("tenant")]
        [Validation(Required=true)]
        public string Tenant { get; set; }

        // 最后更新的时间戳
        [NameInMap("update_timestamp")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UpdateTimestamp { get; set; }

        // 工作空间组
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 期望集群状态
        [NameInMap("expect_cluster_state")]
        [Validation(Required=false)]
        public string ExpectClusterState { get; set; }

    }

}
