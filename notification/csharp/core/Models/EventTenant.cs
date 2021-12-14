// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NOTIFICATION.Models
{
    // 事件租户
    public class EventTenant : TeaModel {
        // 智科租户2088 ID，tenant_id/tenant_name二选一
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 租户8位字母，tenant_id/tenant_name二选一
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

    }

}
