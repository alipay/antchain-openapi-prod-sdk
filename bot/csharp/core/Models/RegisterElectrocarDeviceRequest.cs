// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class RegisterElectrocarDeviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备名称
        [NameInMap("device_name")]
        [Validation(Required=true)]
        public string DeviceName { get; set; }

        // 产品key
        [NameInMap("trust_product_key")]
        [Validation(Required=true)]
        public string TrustProductKey { get; set; }

        // 凭证申请参数
        [NameInMap("kyt_apply_params")]
        [Validation(Required=true)]
        public KytApplyParams KytApplyParams { get; set; }

    }

}
