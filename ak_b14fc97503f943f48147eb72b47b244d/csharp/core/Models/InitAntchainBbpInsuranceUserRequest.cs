// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_b14fc97503f943f48147eb72b47b244d.Models
{
    public class InitAntchainBbpInsuranceUserRequest : TeaModel {
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

        // 三方Id，此处为天猫id
        [NameInMap("third_part_id")]
        [Validation(Required=true)]
        public string ThirdPartId { get; set; }

        // 来源渠道，TIANMAO（天猫）
        [NameInMap("channel")]
        [Validation(Required=true)]
        public string Channel { get; set; }

        // 埋点信息，JSON格式字符串
        [NameInMap("burieds")]
        [Validation(Required=false)]
        public string Burieds { get; set; }

    }

}
