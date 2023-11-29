// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 部标设备信息
    public class JtDevice : TeaModel {
        // 设备ID
        [NameInMap("device_id")]
        [Validation(Required=true)]
        public string DeviceId { get; set; }

        // 场景码
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 可信设备ID
        [NameInMap("trustiot_device_id")]
        [Validation(Required=true)]
        public long? TrustiotDeviceId { get; set; }

        // 设备注册时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public long? GmtCreate { get; set; }

        // 设备是否在线
        [NameInMap("online")]
        [Validation(Required=true)]
        public bool? Online { get; set; }

        // 设备型号
        [NameInMap("device_model")]
        [Validation(Required=false)]
        public string DeviceModel { get; set; }

        // 终端型号
        [NameInMap("terminal_type")]
        [Validation(Required=false)]
        public string TerminalType { get; set; }

    }

}
