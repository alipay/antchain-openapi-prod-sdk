// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryRbbGeneralRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 额外参数json
        [NameInMap("extension")]
        [Validation(Required=false)]
        public string Extension { get; set; }

        // 通用查询名称
        [NameInMap("queryname")]
        [Validation(Required=true, MaxLength=200)]
        public string Queryname { get; set; }

        // 查询参数JSON字符串
        [NameInMap("queryparas")]
        [Validation(Required=false)]
        public string Queryparas { get; set; }

    }

}
