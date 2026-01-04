// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_eed2ee0664ac41b78f2c14f3ffa051e7.Models
{
    public class InitDemoBbpInsuranceUserRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 保司编码
        [NameInMap("business_code")]
        [Validation(Required=true)]
        public string BusinessCode { get; set; }

        // 第三方id，此处为天猫uid
        [NameInMap("third_part_id")]
        [Validation(Required=true)]
        public string ThirdPartId { get; set; }

        // 来源渠道
        [NameInMap("channel")]
        [Validation(Required=true)]
        public string Channel { get; set; }

        // 埋点信息
        [NameInMap("burieds")]
        [Validation(Required=true)]
        public QueryMap Burieds { get; set; }

    }

}
