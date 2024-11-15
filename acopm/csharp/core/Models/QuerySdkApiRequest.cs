// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACOPM.Models
{
    public class QuerySdkApiRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 商业能力id
        [NameInMap("ability_id")]
        [Validation(Required=true)]
        public string AbilityId { get; set; }

        // 发布版本号
        [NameInMap("publish_version")]
        [Validation(Required=true)]
        public string PublishVersion { get; set; }

    }

}
