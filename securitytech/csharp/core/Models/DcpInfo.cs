// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 车队信息结构体
    public class DcpInfo : TeaModel {
        // 企业入驻租户ID
        [NameInMap("dcp_tenant_id")]
        [Validation(Required=true)]
        public string DcpTenantId { get; set; }

        // 企业名称
        [NameInMap("dcp_name")]
        [Validation(Required=true)]
        public string DcpName { get; set; }

    }

}
