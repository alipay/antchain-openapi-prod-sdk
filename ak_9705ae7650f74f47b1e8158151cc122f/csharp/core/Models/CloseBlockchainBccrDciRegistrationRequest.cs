// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_9705ae7650f74f47b1e8158151cc122f.Models
{
    public class CloseBlockchainBccrDciRegistrationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数登id
        [NameInMap("digital_register_id")]
        [Validation(Required=true)]
        public string DigitalRegisterId { get; set; }

        // 退费人名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 联系手机号
        [NameInMap("mobile_no")]
        [Validation(Required=true)]
        public string MobileNo { get; set; }

        // 幂等字段
        [NameInMap("client_token")]
        [Validation(Required=true)]
        public string ClientToken { get; set; }

    }

}
