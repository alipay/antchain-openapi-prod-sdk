// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // instance
    public class InstanceDTO : TeaModel {
        // 集群名
        [NameInMap("cluster")]
        [Validation(Required=true)]
        public string Cluster { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public long? GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public long? GmtModified { get; set; }

        // 实例ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 实例状态。取值说明如下： 0、部署中 1、已欠费
        [NameInMap("instance_status")]
        [Validation(Required=true)]
        public long? InstanceStatus { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 用户id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // workspace名
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // 数据库id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

    }

}
