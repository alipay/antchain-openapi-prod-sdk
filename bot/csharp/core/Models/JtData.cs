// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 部标设备数据
    public class JtData : TeaModel {
        // 数据的可信平台唯一ID
        [NameInMap("trustiot_id")]
        [Validation(Required=true)]
        public long? TrustiotId { get; set; }

        // IoT可信平台设备唯一ID
        [NameInMap("trustiot_entity_id")]
        [Validation(Required=true)]
        public long? TrustiotEntityId { get; set; }

        // 上报原文解析处理之后的数据
        [NameInMap("processed_content")]
        [Validation(Required=true)]
        public string ProcessedContent { get; set; }

        // 和上一次上报数据里程对比，新增的里程数
        [NameInMap("delta_mileage")]
        [Validation(Required=false)]
        public long? DeltaMileage { get; set; }

    }

}
