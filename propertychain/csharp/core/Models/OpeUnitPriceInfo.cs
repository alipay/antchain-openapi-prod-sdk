// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 操作费单价结构体
    public class OpeUnitPriceInfo : TeaModel {
        // 操作费单价 （分）
        [NameInMap("unit_price")]
        [Validation(Required=true)]
        public long? UnitPrice { get; set; }

        // 起始-天 （-999 表示无日期限制）
        [NameInMap("start_day")]
        [Validation(Required=true)]
        public long? StartDay { get; set; }

        // 终止-天 （-999 表示无日期限制）
        [NameInMap("end_day")]
        [Validation(Required=true)]
        public long? EndDay { get; set; }

    }

}
