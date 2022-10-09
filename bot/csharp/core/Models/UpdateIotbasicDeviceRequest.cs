// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class UpdateIotbasicDeviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备did
        [NameInMap("device_did")]
        [Validation(Required=true)]
        public string DeviceDid { get; set; }

        // 设备名称
        [NameInMap("device_name")]
        [Validation(Required=false)]
        public string DeviceName { get; set; }

        // 安装位置
        [NameInMap("location")]
        [Validation(Required=false)]
        public string Location { get; set; }

        // 设备扩展信息
        [NameInMap("device_ext")]
        [Validation(Required=false)]
        public string DeviceExt { get; set; }

        // 设备标签
        [NameInMap("nick_name")]
        [Validation(Required=false)]
        public string NickName { get; set; }

        // 设备签名
        [NameInMap("device_signature")]
        [Validation(Required=true)]
        public string DeviceSignature { get; set; }

    }

}
