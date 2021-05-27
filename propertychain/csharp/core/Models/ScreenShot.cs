// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 快照
    public class ScreenShot : TeaModel {
        // id
        [NameInMap("file_id")]
        [Validation(Required=false)]
        public string FileId { get; set; }

        // url
        [NameInMap("file_url")]
        [Validation(Required=false)]
        public string FileUrl { get; set; }

        // 时间
        [NameInMap("screenshot_time")]
        [Validation(Required=false)]
        public long? ScreenshotTime { get; set; }

        // 上链txHash
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 设备名称
        [NameInMap("device_name")]
        [Validation(Required=false)]
        public string DeviceName { get; set; }

        // 关联仓位名称列表
        [NameInMap("location_name_list")]
        [Validation(Required=false)]
        public List<string> LocationNameList { get; set; }

    }

}
