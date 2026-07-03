// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class PushCreditshieldReturncaseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 退案
        [NameInMap("query_code")]
        [Validation(Required=true)]
        public string QueryCode { get; set; }

        // 请求信息json
        [NameInMap("query_infos")]
        [Validation(Required=true)]
        public List<string> QueryInfos { get; set; }

    }

}
