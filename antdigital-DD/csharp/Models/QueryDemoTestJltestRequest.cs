// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    public class QueryDemoTestJltestRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

        // 数据bbb
        [NameInMap("datax")]
        [Validation(Required=true)]
        public string Datax { get; set; }

        // 数据bbb
        [NameInMap("datay")]
        [Validation(Required=true)]
        public string Datay { get; set; }

        // 数据ddd
        [NameInMap("dataa")]
        [Validation(Required=true)]
        public string Dataa { get; set; }

    }

}
