// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 代理信息
    public class ProxyData : TeaModel {
        // 金融云租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 租户名称
        [NameInMap("tenant_name")]
        [Validation(Required=true)]
        public string TenantName { get; set; }

        // 是否计量
        [NameInMap("if_measure")]
        [Validation(Required=false)]
        public bool? IfMeasure { get; set; }

    }

}
