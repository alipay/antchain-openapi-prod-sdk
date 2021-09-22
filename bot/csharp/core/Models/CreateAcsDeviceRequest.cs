// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class CreateAcsDeviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备ID
        [NameInMap("device_id")]
        [Validation(Required=true)]
        public string DeviceId { get; set; }

        // 场景码-对应acs iot管控后台项目code
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 设备类型编码-对应acs iot管控后台设备类型编码
        [NameInMap("class_code")]
        [Validation(Required=true)]
        public string ClassCode { get; set; }

        // 设备注册信息
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 设备注册信息 签名
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

        // 设备名称
        [NameInMap("device_name")]
        [Validation(Required=true)]
        public string DeviceName { get; set; }

        // 设备单价 单位：分
        [NameInMap("initial_price")]
        [Validation(Required=false)]
        public long? InitialPrice { get; set; }

        // 设备出厂时间
        [NameInMap("factory_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string FactoryTime { get; set; }

        // 设备投放时间
        [NameInMap("release_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ReleaseTime { get; set; }

    }

}
