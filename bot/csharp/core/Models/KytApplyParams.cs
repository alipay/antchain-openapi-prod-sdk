// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // kyt 凭证申请参数
    public class KytApplyParams : TeaModel {
        // 设备类型
        [NameInMap("device_type")]
        [Validation(Required=false)]
        public string DeviceType { get; set; }

        // 凭证类型
        [NameInMap("cred_type")]
        [Validation(Required=false)]
        public string CredType { get; set; }

        // 品牌
        [NameInMap("brand_id")]
        [Validation(Required=true)]
        public string BrandId { get; set; }

        // 凭证内容
        [NameInMap("generate_code")]
        [Validation(Required=false)]
        public string GenerateCode { get; set; }

        // 协议类型
        [NameInMap("protocol_type")]
        [Validation(Required=true)]
        public string ProtocolType { get; set; }

        // 无感参数
        [NameInMap("key_less")]
        [Validation(Required=true)]
        public string KeyLess { get; set; }

        // mac
        [NameInMap("mac")]
        [Validation(Required=true)]
        public string Mac { get; set; }

        // ble_name
        [NameInMap("ble_name")]
        [Validation(Required=true)]
        public string BleName { get; set; }

        // 通道
        [NameInMap("channel")]
        [Validation(Required=false)]
        public string Channel { get; set; }

    }

}
