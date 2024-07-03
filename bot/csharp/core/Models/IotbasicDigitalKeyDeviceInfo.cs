// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // iotbasic数控设备信息
    public class IotbasicDigitalKeyDeviceInfo : TeaModel {
        // 设备id
        [NameInMap("devid")]
        [Validation(Required=true)]
        public string Devid { get; set; }

        // 设备名称
        [NameInMap("dev_name")]
        [Validation(Required=true)]
        public string DevName { get; set; }

        // 设备sn
        [NameInMap("sn")]
        [Validation(Required=true)]
        public string Sn { get; set; }

        // Ccid
        [NameInMap("ccid")]
        [Validation(Required=true)]
        public string Ccid { get; set; }

        // Msisdn
        [NameInMap("msisdn")]
        [Validation(Required=true)]
        public string Msisdn { get; set; }

        // tbox固件版本号(16进制)
        [NameInMap("ver")]
        [Validation(Required=true)]
        public string Ver { get; set; }

    }

}
