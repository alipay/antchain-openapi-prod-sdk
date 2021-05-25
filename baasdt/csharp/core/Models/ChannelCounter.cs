// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 渠道统计结果
    public class ChannelCounter : TeaModel {
        // 渠道名字
        [NameInMap("channel_name")]
        [Validation(Required=true)]
        public string ChannelName { get; set; }

        // 统计值
        [NameInMap("counter")]
        [Validation(Required=true)]
        public long? Counter { get; set; }

        // 月份。如果月份有具体值则数据为该月份数据，月份为空则为全部统计数据。
        [NameInMap("month")]
        [Validation(Required=false)]
        public string Month { get; set; }

        // 渠道交易金额
        [NameInMap("total_price")]
        [Validation(Required=false)]
        public string TotalPrice { get; set; }

    }

}
