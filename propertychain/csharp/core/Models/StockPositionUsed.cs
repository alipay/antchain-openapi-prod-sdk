// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 仓位使用情况
    public class StockPositionUsed : TeaModel {
        // 库位ID
        [NameInMap("position_id")]
        [Validation(Required=true)]
        public string PositionId { get; set; }

        // 已用容量，百分比的数值，如50%，则为50
        [NameInMap("used_capacity")]
        [Validation(Required=true)]
        public long? UsedCapacity { get; set; }

    }

}
