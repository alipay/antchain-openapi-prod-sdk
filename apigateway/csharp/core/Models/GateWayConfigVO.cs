// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // GateWayConfigVO
    public class GateWayConfigVO : TeaModel {
        // 唯一标识
        [NameInMap("gateway_id")]
        [Validation(Required=false)]
        public string GatewayId { get; set; }

        // host
        [NameInMap("host")]
        [Validation(Required=false)]
        public string Host { get; set; }

        // 唯一性标识
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // zone名称、网关名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 注册中心
        [NameInMap("routers")]
        [Validation(Required=false)]
        public List<RegistryVO> Routers { get; set; }

        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // zone
        [NameInMap("zone")]
        [Validation(Required=false)]
        public string Zone { get; set; }

        // 流量比例
        [NameInMap("weight")]
        [Validation(Required=false)]
        public long? Weight { get; set; }

    }

}
