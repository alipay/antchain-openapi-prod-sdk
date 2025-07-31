// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 分销渠道
    public class SalesChannel : TeaModel {
        // 渠道码
        [NameInMap("channel_code")]
        [Validation(Required=true)]
        public string ChannelCode { get; set; }

        // 渠道名称
        [NameInMap("channel_name")]
        [Validation(Required=true)]
        public string ChannelName { get; set; }

        // 渠道级别，从小到大代表级别由高到低
        [NameInMap("channel_level")]
        [Validation(Required=true)]
        public long? ChannelLevel { get; set; }

    }

}
