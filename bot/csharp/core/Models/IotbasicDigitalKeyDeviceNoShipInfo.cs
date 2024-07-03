// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // iotbasic数控设备信息（不包含出库信息）
    public class IotbasicDigitalKeyDeviceNoShipInfo : TeaModel {
        // 设备id
        [NameInMap("devid")]
        [Validation(Required=true)]
        public string Devid { get; set; }

        // 设备sn
        [NameInMap("sn")]
        [Validation(Required=true)]
        public string Sn { get; set; }

        // ccid
        [NameInMap("ccid")]
        [Validation(Required=true)]
        public string Ccid { get; set; }

        // imei
        [NameInMap("imei")]
        [Validation(Required=true)]
        public string Imei { get; set; }

        // tbox固件版本号(16进制)
        [NameInMap("ver")]
        [Validation(Required=true)]
        public string Ver { get; set; }

        // PEPS系统固件版本号(16进制)
        [NameInMap("peps_ver")]
        [Validation(Required=true)]
        public string PepsVer { get; set; }

        // 蓝牙固件版本号(16进制)
        [NameInMap("ble_ver")]
        [Validation(Required=true)]
        public string BleVer { get; set; }

    }

}
