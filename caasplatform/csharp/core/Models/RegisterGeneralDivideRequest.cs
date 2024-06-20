// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAASPLATFORM.Models
{
    public class RegisterGeneralDivideRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 合约实例id
        [NameInMap("service_id")]
        [Validation(Required=true)]
        public string ServiceId { get; set; }

        // 自定义Id,重复则更新
        [NameInMap("id")]
        [Validation(Required=true, MaxLength=64)]
        public string Id { get; set; }

        // 企业营业证编号，或唯一ID
        [NameInMap("code")]
        [Validation(Required=true, MaxLength=100)]
        public string Code { get; set; }

        // 企业名称
        [NameInMap("name")]
        [Validation(Required=true, MaxLength=100)]
        public string Name { get; set; }

    }

}
