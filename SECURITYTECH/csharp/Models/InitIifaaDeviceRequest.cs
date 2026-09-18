// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class InitIifaaDeviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 产商code
        [NameInMap("corp_code")]
        [Validation(Required=true)]
        public string CorpCode { get; set; }

        // 设备类型
        [NameInMap("device_type")]
        [Validation(Required=true)]
        public string DeviceType { get; set; }

        // 设备信息
        [NameInMap("device_info")]
        [Validation(Required=true)]
        public string DeviceInfo { get; set; }

        // 产品code
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 用于加密回传数据的公钥
        [NameInMap("pub_key")]
        [Validation(Required=false)]
        public string PubKey { get; set; }

    }

}
