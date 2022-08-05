// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BBP.Models
{
    public class QueryInsuranceRecordsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 第三方Id，此处为天猫uid
        [NameInMap("source_uid")]
        [Validation(Required=true)]
        public string SourceUid { get; set; }

        // 保司编码
        [NameInMap("mechanism_code")]
        [Validation(Required=true)]
        public string MechanismCode { get; set; }

    }

}
