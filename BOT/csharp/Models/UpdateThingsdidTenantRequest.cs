// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class UpdateThingsdidTenantRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 交易唯一ID
        [NameInMap("nonce")]
        [Validation(Required=true)]
        public string Nonce { get; set; }

        // 实体更新访问权限参与方的请求结构体
        [NameInMap("update_tenant_req")]
        [Validation(Required=true)]
        public DidUpdateTenantReq UpdateTenantReq { get; set; }

    }

}
