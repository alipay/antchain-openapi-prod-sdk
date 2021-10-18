// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACS_IOT.Models
{
    // 收集数据(免签名)
    public class CollectContentNoSign : TeaModel {
        // 链上设备Id
        // 
        [NameInMap("chain_device_id")]
        [Validation(Required=true)]
        public string ChainDeviceId { get; set; }

        // 收集内容
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 服务端发送的扩展数据（非可信设备直接产生的数据）
        [NameInMap("extra_data")]
        [Validation(Required=false)]
        public string ExtraData { get; set; }

    }

}
