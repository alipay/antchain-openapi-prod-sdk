// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 租户信息
    public class PermissionedTenantModel : TeaModel {
        // 主键Id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 租户名称
        [NameInMap("tenant_name")]
        [Validation(Required=true)]
        public string TenantName { get; set; }

        // 公司名称
        [NameInMap("org_name")]
        [Validation(Required=true)]
        public string OrgName { get; set; }

        // 租户所有人标识
        [NameInMap("owner")]
        [Validation(Required=false)]
        public string Owner { get; set; }

        // 网关私钥
        [NameInMap("gateway_private_key")]
        [Validation(Required=false)]
        public string GatewayPrivateKey { get; set; }

        // 网关公钥
        [NameInMap("gateway_public_key")]
        [Validation(Required=false)]
        public string GatewayPublicKey { get; set; }

    }

}
