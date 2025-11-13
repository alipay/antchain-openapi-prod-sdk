// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 租赁价格方案
    public class LeasePricePlan : TeaModel {
        // 租赁方案
        [NameInMap("rental_plan")]
        [Validation(Required=false)]
        public string RentalPlan { get; set; }

        // 租赁周期
        [NameInMap("rental_period")]
        [Validation(Required=false)]
        public long? RentalPeriod { get; set; }

        // 租赁价格属性列表
        [NameInMap("lease_price_prop_list")]
        [Validation(Required=false)]
        public List<LeasePriceProp> LeasePricePropList { get; set; }

    }

}
