// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENT.Models
{
    // 用户资产信息
    public class AssetDetail : TeaModel {
        // Token获得类型
        [NameInMap("gain_type")]
        [Validation(Required=true)]
        public string GainType { get; set; }

        // Token发放状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 购票数
        [NameInMap("ticket_number")]
        [Validation(Required=true)]
        public long? TicketNumber { get; set; }

        // Token数，单位为分个，1分个=0.01个
        [NameInMap("token")]
        [Validation(Required=true)]
        public long? Token { get; set; }

        // Token展示数
        [NameInMap("token_display")]
        [Validation(Required=true)]
        public string TokenDisplay { get; set; }

        // 用户昵称
        [NameInMap("nickname")]
        [Validation(Required=true)]
        public string Nickname { get; set; }

    }

}
