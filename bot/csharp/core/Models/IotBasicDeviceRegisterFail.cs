// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 设备注册失败对象
    public class IotBasicDeviceRegisterFail : TeaModel {
        // 设备名称
        [NameInMap("device_name")]
        [Validation(Required=true)]
        public string DeviceName { get; set; }

        // 设备sn
        [NameInMap("device_sn")]
        [Validation(Required=true)]
        public string DeviceSn { get; set; }

        // 错误编码
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 错误描述
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

    }

}
