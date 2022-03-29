// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class BatchcreateTraasmetaTenantRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 租户列表
        [NameInMap("tenants")]
        [Validation(Required=true)]
        public List<TraasTenantDto> Tenants { get; set; }

    }

}
