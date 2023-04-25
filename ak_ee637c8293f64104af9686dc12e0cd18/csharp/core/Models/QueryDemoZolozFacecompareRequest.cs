// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_ee637c8293f64104af9686dc12e0cd18.Models
{
    public class QueryDemoZolozFacecompareRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 123
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 123
        [NameInMap("face1")]
        [Validation(Required=false)]
        public FaceImage Face1 { get; set; }

        // 123
        [NameInMap("face2")]
        [Validation(Required=false)]
        public FaceImage Face2 { get; set; }

    }

}
