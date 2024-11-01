// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMOSDKSY.Models
{
    public class QueryBbbCccRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 姓名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // fd
        [NameInMap("tes")]
        [Validation(Required=false)]
        public string Tes { get; set; }

        // 测试
        [NameInMap("test_req")]
        [Validation(Required=true)]
        public TessReq TestReq { get; set; }

    }

}
