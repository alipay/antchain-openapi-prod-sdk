// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    public class CreateTenantRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 蚂蚁通行证uid
        [NameInMap("ant_uid")]
        [Validation(Required=true)]
        public string AntUid { get; set; }

        // 金融云官网:ANTCLOUD, 蚂蚁开放平台：ANTOPEN, 口碑：KOUBEI
        [NameInMap("business_owner_id")]
        [Validation(Required=false)]
        public string BusinessOwnerId { get; set; }

    }

}
