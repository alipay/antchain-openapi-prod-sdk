// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    // 个人授权
    public class StandardRealPersonAuthRequest : TeaModel {
        // 个人证件号
        [NameInMap("identity_id")]
        [Validation(Required=true)]
        public string IdentityId { get; set; }

        // 名字
        [NameInMap("identity_name")]
        [Validation(Required=true)]
        public string IdentityName { get; set; }

    }

}
