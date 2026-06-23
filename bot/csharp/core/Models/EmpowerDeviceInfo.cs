// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 获取设备授权返回信息
    public class EmpowerDeviceInfo : TeaModel {
        // 设备ID
        [NameInMap("device_id")]
        [Validation(Required=true)]
        public string DeviceId { get; set; }

        // ACCEPTED(接受)/REVOKED(撤销)
        [NameInMap("auth_status")]
        [Validation(Required=true)]
        public string AuthStatus { get; set; }

        // 移除授权时间，毫秒级时间戳
        [NameInMap("remove_time")]
        [Validation(Required=false)]
        public long? RemoveTime { get; set; }

    }

}
