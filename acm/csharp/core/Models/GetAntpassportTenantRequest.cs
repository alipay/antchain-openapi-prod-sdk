// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    public class GetAntpassportTenantRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 蚂蚁通行证uid
        [NameInMap("ant_uid")]
        [Validation(Required=true)]
        public string AntUid { get; set; }

    }

}
