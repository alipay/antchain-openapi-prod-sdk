// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 账户入驻的渠道表
    public class AccountInChannels : TeaModel {
        // 天猫渠道
        [NameInMap("channel_name")]
        [Validation(Required=true)]
        public string ChannelName { get; set; }

        // 是否入驻
        [NameInMap("is_settled")]
        [Validation(Required=true)]
        public bool? IsSettled { get; set; }

        // WAIT_CHECK:渠道已申请开通但未审核，SUCCESS:渠道开通审核成功，渠道开通
        [NameInMap("settled_status")]
        [Validation(Required=false)]
        public string SettledStatus { get; set; }

    }

}
