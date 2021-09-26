// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 发行设备
    public class DistributeDevice : TeaModel {
        // 链上设备Id  （deviceType=DEVICE 时有值)
        [NameInMap("chain_device_id")]
        [Validation(Required=false)]
        public string ChainDeviceId { get; set; }

        // 设备id
        [NameInMap("device_id")]
        [Validation(Required=true)]
        public string DeviceId { get; set; }

        // 发行设备Id
        [NameInMap("distribute_device_id")]
        [Validation(Required=true)]
        public string DistributeDeviceId { get; set; }

        // 场景码
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 设备类型 DEVICE : 设备 、PERIPHERAL : 外围设备
        [NameInMap("device_type")]
        [Validation(Required=true)]
        public string DeviceType { get; set; }

        // 链上外围设备Id（deviceType=PERIPHERAL 时有值)
        [NameInMap("chain_peripheral_id")]
        [Validation(Required=false)]
        public string ChainPeripheralId { get; set; }

        // 设备状态，取值范围：NORMAL、OFFLINE、UNREGISTER
        [NameInMap("device_status")]
        [Validation(Required=false)]
        public string DeviceStatus { get; set; }

    }

}
