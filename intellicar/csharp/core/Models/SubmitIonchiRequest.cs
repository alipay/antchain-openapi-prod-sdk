// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    public class SubmitIonchiRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 线索唯一标识
        [NameInMap("submit_id")]
        [Validation(Required=true)]
        public string SubmitId { get; set; }

        // 手机号md5
        [NameInMap("mobile_md5")]
        [Validation(Required=true)]
        public string MobileMd5 { get; set; }

    }

}
