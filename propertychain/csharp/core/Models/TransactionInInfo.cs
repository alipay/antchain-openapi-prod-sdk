// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 入库信息
    public class TransactionInInfo : TeaModel {
        // 入库信息表ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 仓库Did
        [NameInMap("warehouse_did")]
        [Validation(Required=false)]
        public string WarehouseDid { get; set; }

        // 仓库名称
        [NameInMap("warehouse_name")]
        [Validation(Required=false)]
        public string WarehouseName { get; set; }

        // 库位Did
        [NameInMap("location_did")]
        [Validation(Required=false)]
        public string LocationDid { get; set; }

        // 库位名称
        [NameInMap("location_name")]
        [Validation(Required=false)]
        public string LocationName { get; set; }

        // 设备Did
        [NameInMap("device_did")]
        [Validation(Required=false)]
        public string DeviceDid { get; set; }

        // 设备名称
        [NameInMap("device_name")]
        [Validation(Required=false)]
        public string DeviceName { get; set; }

        // 开始时间，单位：s
        [NameInMap("start_time")]
        [Validation(Required=false)]
        public long? StartTime { get; set; }

        // 结束时间, 单位：s
        [NameInMap("end_time")]
        [Validation(Required=false)]
        public long? EndTime { get; set; }

        // 入库视频信息url
        [NameInMap("video_url")]
        [Validation(Required=false)]
        public string VideoUrl { get; set; }

        // 存证交易hash
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

    }

}
