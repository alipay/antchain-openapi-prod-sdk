// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class ExecRtopGenericInvokeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // {"platformId":1234}
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 这个账号的所有权限点，逗号分隔
        [NameInMap("permission")]
        [Validation(Required=true)]
        public string Permission { get; set; }

        // title
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

    }

}
