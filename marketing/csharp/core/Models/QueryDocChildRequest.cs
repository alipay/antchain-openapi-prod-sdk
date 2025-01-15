// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MARKETING.Models
{
    public class QueryDocChildRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 文档id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 目录id
        [NameInMap("site_id")]
        [Validation(Required=true)]
        public string SiteId { get; set; }

    }

}
