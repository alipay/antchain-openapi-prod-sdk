// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 发行数据包
    public class DistributeDataPackage : TeaModel {
        // 原始数据
        [NameInMap("data_list")]
        [Validation(Required=true)]
        public List<RawData> DataList { get; set; }

        // 发行设备Id
        [NameInMap("distribute_device_id")]
        [Validation(Required=true)]
        public string DistributeDeviceId { get; set; }

        // 打包时间
        [NameInMap("package_time")]
        [Validation(Required=true)]
        public long? PackageTime { get; set; }

    }

}
