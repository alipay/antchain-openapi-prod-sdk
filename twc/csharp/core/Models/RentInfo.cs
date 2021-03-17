// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 融资租赁商品出租详细信息
    public class RentInfo : TeaModel {
        // 租金
        [NameInMap("rent_price")]
        [Validation(Required=true)]
        public long? RentPrice { get; set; }

        // 租期
        [NameInMap("rent_term")]
        [Validation(Required=true)]
        public long? RentTerm { get; set; }

        // 手续费
        [NameInMap("commission")]
        [Validation(Required=true)]
        public long? Commission { get; set; }

        // 买断价
        [NameInMap("buyout_price")]
        [Validation(Required=true)]
        public long? BuyoutPrice { get; set; }

        // 留购价
        [NameInMap("retained_price")]
        [Validation(Required=true)]
        public long? RetainedPrice { get; set; }

    }

}
