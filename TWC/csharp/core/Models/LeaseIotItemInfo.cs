// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 融资租赁中IOT设备详情
    public class LeaseIotItemInfo : TeaModel {
        // 证据的时间
        [NameInMap("date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string Date { get; set; }

        // 证据的txHash
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // 证据的原始数据，默认为空或加密状态，除非调用方为授权用户（如出资方等
        [NameInMap("raw_data")]
        [Validation(Required=true)]
        public string RawData { get; set; }

    }

}
