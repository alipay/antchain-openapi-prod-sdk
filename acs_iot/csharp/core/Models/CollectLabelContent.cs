// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACS_IOT.Models
{
    // 收集标签数据
    public class CollectLabelContent : TeaModel {
        // 链上设备ID
        [NameInMap("chain_device_id")]
        [Validation(Required=true)]
        public string ChainDeviceId { get; set; }

        // 1.设备端上报数据内容 2.与设备上报的数据一致，服务...
        // 
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // content的签名 与设备上报的签名保持一致，服务端不可修改
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

        // 未经设备签名的附加数据JSON String 注意：如果 content 批量解析 ，extraData也会批量复制融入解析后的content
        [NameInMap("extra_data")]
        [Validation(Required=false)]
        public string ExtraData { get; set; }

    }

}
