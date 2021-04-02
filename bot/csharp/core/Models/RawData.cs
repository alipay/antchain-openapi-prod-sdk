// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 原始数据包
    public class RawData : TeaModel {
        // 链上设备id
        [NameInMap("chain_device_id")]
        [Validation(Required=false)]
        public string ChainDeviceId { get; set; }

        // 数据内容
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 设备id
        [NameInMap("device_id")]
        [Validation(Required=false)]
        public string DeviceId { get; set; }

        // 上链哈希
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // 上链时间
        [NameInMap("tx_time")]
        [Validation(Required=true)]
        public long? TxTime { get; set; }

        // 链上外围设备ID
        [NameInMap("chain_peripheral_id")]
        [Validation(Required=false)]
        public string ChainPeripheralId { get; set; }

        // 外围设备ID
        [NameInMap("peripheral_id")]
        [Validation(Required=false)]
        public string PeripheralId { get; set; }

    }

}
