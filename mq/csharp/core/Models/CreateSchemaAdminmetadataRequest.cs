// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class CreateSchemaAdminmetadataRequest : TeaModel {
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

        // 应用名称
        [NameInMap("app")]
        [Validation(Required=true)]
        public string App { get; set; }

        // 兼容性策略
        [NameInMap("compatibility")]
        [Validation(Required=true)]
        public string Compatibility { get; set; }

        // 描述
        // 
        [NameInMap("description")]
        [Validation(Required=true)]
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

    }

}
