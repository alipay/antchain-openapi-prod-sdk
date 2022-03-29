// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class UpdateSchemaAdminmetadataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // SOFAMQ实例ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 应用名
        [NameInMap("app")]
        [Validation(Required=false)]
        public string App { get; set; }

        // 兼容性
        [NameInMap("compatibility")]
        [Validation(Required=false)]
        public string Compatibility { get; set; }

        // 依赖坐标
        [NameInMap("coordinate")]
        [Validation(Required=false)]
        public string Coordinate { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 命名空间
        [NameInMap("namespace")]
        [Validation(Required=false)]
        public string Namespace { get; set; }

        // 租户
        [NameInMap("schema_tenant")]
        [Validation(Required=false)]
        public string SchemaTenant { get; set; }

        // 状态
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

        // 同步站点
        [NameInMap("sync_sites")]
        [Validation(Required=false)]
        public string SyncSites { get; set; }

    }

}
