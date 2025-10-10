// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class ApplyDigitalkeyCredRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备类型
        [NameInMap("device_type")]
        [Validation(Required=false)]
        public string DeviceType { get; set; }

        // 凭证类型
        [NameInMap("cred_type")]
        [Validation(Required=false)]
        public string CredType { get; set; }

        // 需要生成的内容
        [NameInMap("generate_code")]
        [Validation(Required=false)]
        public string GenerateCode { get; set; }

        // 客户身份ID
        [NameInMap("secret_id")]
        [Validation(Required=true)]
        public string SecretId { get; set; }

        // 设备SN号
        [NameInMap("device_sn")]
        [Validation(Required=false)]
        public string DeviceSn { get; set; }

        // MAC地址
        [NameInMap("mac")]
        [Validation(Required=false)]
        public string Mac { get; set; }

        // ble名称
        [NameInMap("ble_nme")]
        [Validation(Required=true)]
        public string BleNme { get; set; }

        // 无感控车数据
        [NameInMap("key_less")]
        [Validation(Required=false)]
        public string KeyLess { get; set; }

        // 凭证格式
        [NameInMap("format_type")]
        [Validation(Required=false)]
        public string FormatType { get; set; }

        // 加密类型
        [NameInMap("enc_type")]
        [Validation(Required=false)]
        public string EncType { get; set; }

        // 协议类型
        [NameInMap("protocol_type")]
        [Validation(Required=false)]
        public string ProtocolType { get; set; }

        // 品牌ID
        [NameInMap("brand_id")]
        [Validation(Required=true)]
        public string BrandId { get; set; }

        // IOT通道
        [NameInMap("channel")]
        [Validation(Required=false)]
        public string Channel { get; set; }

    }

}
