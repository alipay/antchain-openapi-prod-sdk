// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 数字票根计量字段
    public class MetricInfo : TeaModel {
        // 实际计收金额，单位：分。如传100，即为100分，1元
        [NameInMap("collect_amount")]
        [Validation(Required=true)]
        public long? CollectAmount { get; set; }

        // 计收受理时间
        [NameInMap("collect_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CollectTime { get; set; }

        // 计收的订单流水号
        [NameInMap("collect_serial_number")]
        [Validation(Required=true)]
        public string CollectSerialNumber { get; set; }

    }

}
