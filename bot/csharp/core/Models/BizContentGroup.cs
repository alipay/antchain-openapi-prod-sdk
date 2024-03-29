// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 设备业务数据
    public class BizContentGroup : TeaModel {
        // 设备链上ID（与scene参数、可信设备ID至少有一个参数不为空）
        [NameInMap("chain_device_id")]
        [Validation(Required=false)]
        public string ChainDeviceId { get; set; }

        // 可信设备ID（与scene参数、设备链上ID至少有一个参数不为空）
        [NameInMap("trustiot_device_id")]
        [Validation(Required=false)]
        public long? TrustiotDeviceId { get; set; }

        // 业务Id
        // 
        // 
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 业务类型
        // 
        // 
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 数据内容 JSON字符串
        // 
        // 
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

    }

}
