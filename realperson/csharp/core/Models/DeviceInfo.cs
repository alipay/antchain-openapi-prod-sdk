// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    // 风险咨询设备信息
    public class DeviceInfo : TeaModel {
        // 设备指纹
        [NameInMap("device_fingerprint")]
        [Validation(Required=false)]
        public string DeviceFingerprint { get; set; }

        // 设备制造商
        [NameInMap("device_brand")]
        [Validation(Required=false)]
        public string DeviceBrand { get; set; }

        // 设备具体型号
        [NameInMap("device_model")]
        [Validation(Required=false)]
        public string DeviceModel { get; set; }

        // 操作系统类型
        [NameInMap("os")]
        [Validation(Required=false)]
        public string Os { get; set; }

        // 操作系统版本
        [NameInMap("os_version")]
        [Validation(Required=false)]
        public string OsVersion { get; set; }

        // 设备rom版本
        [NameInMap("rom_model")]
        [Validation(Required=false)]
        public string RomModel { get; set; }

        // 设备硬盘信息
        [NameInMap("hard_disk")]
        [Validation(Required=false)]
        public string HardDisk { get; set; }

        // 内存容量
        [NameInMap("memory")]
        [Validation(Required=false)]
        public string Memory { get; set; }

        // 设备网络ip
        [NameInMap("camera_info")]
        [Validation(Required=false)]
        public string CameraInfo { get; set; }

        // 网关入口ip
        [NameInMap("gateway_ip")]
        [Validation(Required=false)]
        public string GatewayIp { get; set; }

    }

}
