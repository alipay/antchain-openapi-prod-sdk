// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 承诺信息
    public class CommitmentInfo : TeaModel {
        // 租金总额
        [NameInMap("total_rent")]
        [Validation(Required=true)]
        public string TotalRent { get; set; }

        // 租赁分期信息
        [NameInMap("rental_staging_information")]
        [Validation(Required=true)]
        public List<RentalStagingInformation> RentalStagingInformation { get; set; }

    }

}
