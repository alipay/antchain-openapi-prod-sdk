// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ReplaceDistributedeviceBychainperipheralidRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 发行外围设备Id
        // 
        // 
        [NameInMap("distribute_device_id")]
        [Validation(Required=true)]
        public string DistributeDeviceId { get; set; }

        // 链上外围设备ID
        [NameInMap("chain_peripheral_id")]
        [Validation(Required=true)]
        public string ChainPeripheralId { get; set; }

    }

}
