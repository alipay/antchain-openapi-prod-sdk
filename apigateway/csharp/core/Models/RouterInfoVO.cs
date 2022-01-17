// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // RouterInfoVO
    public class RouterInfoVO : TeaModel {
        // api数
        [NameInMap("api_count")]
        [Validation(Required=false)]
        public long? ApiCount { get; set; }

        // 是否可以删除
        [NameInMap("can_delete")]
        [Validation(Required=false)]
        public bool? CanDelete { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 更改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // operator
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // routerConfigs
        [NameInMap("router_configs")]
        [Validation(Required=false)]
        public List<RouterConfigVO> RouterConfigs { get; set; }

        // router_id
        [NameInMap("router_id")]
        [Validation(Required=false)]
        public string RouterId { get; set; }

        // routerName
        [NameInMap("router_name")]
        [Validation(Required=false)]
        public string RouterName { get; set; }

        // routerType
        [NameInMap("router_type")]
        [Validation(Required=false)]
        public string RouterType { get; set; }

        // upstream_protocol
        [NameInMap("upstream_protocol")]
        [Validation(Required=false)]
        public string UpstreamProtocol { get; set; }

        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

    }

}
