// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    public class DetailAuthConfigRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据源可信空间id
        [NameInMap("source_service_node_id")]
        [Validation(Required=true)]
        public string SourceServiceNodeId { get; set; }

        // 数据源租户id
        [NameInMap("source_tenant_id")]
        [Validation(Required=true)]
        public string SourceTenantId { get; set; }

        // 场景码
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

    }

}
