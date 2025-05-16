// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class UploadSimQrcodeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备号
        [NameInMap("device_id")]
        [Validation(Required=true)]
        public string DeviceId { get; set; }

        // 登录态token
        [NameInMap("token")]
        [Validation(Required=true)]
        public string Token { get; set; }

        // 车型
        [NameInMap("vehicle_model")]
        [Validation(Required=true)]
        public string VehicleModel { get; set; }

        // 解析类型
        [NameInMap("parse_type")]
        [Validation(Required=true)]
        public string ParseType { get; set; }

        // base64后的图象数据
        [NameInMap("base64_data")]
        [Validation(Required=true)]
        public string Base64Data { get; set; }

    }

}
