// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // ApiCrossZoneVO
    public class ApiCrossZoneVO : TeaModel {
        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // api_id
        [NameInMap("api_id")]
        [Validation(Required=false)]
        public string ApiId { get; set; }

        // gw_id
        [NameInMap("gw_id")]
        [Validation(Required=false)]
        public string GwId { get; set; }

        // 注册中心类型
        [NameInMap("sys_type")]
        [Validation(Required=false)]
        public string SysType { get; set; }

        // 网关类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 更新时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // registry_id
        [NameInMap("registry_id")]
        [Validation(Required=false)]
        public string RegistryId { get; set; }

    }

}
