// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class CreateElectrocarApplycarkeycertificateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求唯一标识Id 调用方生成，需要保证唯一性
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 模式 默认为false，产线申请未true
        [NameInMap("online_flag")]
        [Validation(Required=false)]
        public string OnlineFlag { get; set; }

        // 设备类型 默认为4-芯片SE，联系技术配置具体的设备类型
        [NameInMap("device_type")]
        [Validation(Required=false)]
        public string DeviceType { get; set; }

        // 凭证类型，默认se_dk_cred，如果是MCU，则mcu_dk_cred
        [NameInMap("cred_type")]
        [Validation(Required=false)]
        public string CredType { get; set; }

        // 品牌Id
        [NameInMap("brand_id")]
        [Validation(Required=true)]
        public string BrandId { get; set; }

        // 凭证内容
        // 集合结构[0,1,2,3]
        // 0:IIFAA根密钥
        // 1:企业业务密钥
        // 2:设备密钥
        // 3:无感控车
        // 如果此字段为空，则默认生成0，1，2
        [NameInMap("generate_code")]
        [Validation(Required=false)]
        public string GenerateCode { get; set; }

        // 协议类型
        // 蓝牙：ble
        // 4G: 4G
        // 蓝牙+4G：ble|4G
        // 如果此字段为空，默认为ble
        [NameInMap("protocol_type")]
        [Validation(Required=true)]
        public string ProtocolType { get; set; }

        // 无感控车设备端数据，当generateCode包含3的时候，此字段不能为空
        [NameInMap("key_less")]
        [Validation(Required=false)]
        public string KeyLess { get; set; }

        // mac
        [NameInMap("mac")]
        [Validation(Required=true)]
        public string Mac { get; set; }

        // ble_mac
        [NameInMap("ble_mac")]
        [Validation(Required=true)]
        public string BleMac { get; set; }

        // 设备sn 
        [NameInMap("device_sn")]
        [Validation(Required=true)]
        public string DeviceSn { get; set; }

        // 接入场景码
        [NameInMap("access_scene")]
        [Validation(Required=true)]
        public string AccessScene { get; set; }

    }

}
