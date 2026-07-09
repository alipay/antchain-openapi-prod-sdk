// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class GetIdsquaredOtpRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备侧鉴权码
        [NameInMap("device_auth_code")]
        [Validation(Required=true)]
        public string DeviceAuthCode { get; set; }

        // API接口版本号
        [NameInMap("api_version")]
        [Validation(Required=true)]
        public string ApiVersion { get; set; }

    }

}
