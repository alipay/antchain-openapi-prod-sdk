// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 工作空间
    public class Workspace : TeaModel {
        // ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 展示名称
        [NameInMap("display_name")]
        [Validation(Required=true)]
        public string DisplayName { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public long? TenantId { get; set; }

        // outsideWsId
        [NameInMap("outside_ws_id")]
        [Validation(Required=true)]
        public string OutsideWsId { get; set; }

        // outsideTenantId
        [NameInMap("outside_tenant_id")]
        [Validation(Required=true)]
        public string OutsideTenantId { get; set; }

    }

}
