// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 租赁合同信息
    public class RentContractInfo : TeaModel {
        // 租赁合同ID
        [NameInMap("contract_id")]
        [Validation(Required=true)]
        public string ContractId { get; set; }

        // 租约时间 
        [NameInMap("lease_time")]
        [Validation(Required=true)]
        public string LeaseTime { get; set; }

        // 入住时间
        [NameInMap("checkin_date")]
        [Validation(Required=true)]
        public string CheckinDate { get; set; }

        // 退租时间
        [NameInMap("checkout_date")]
        [Validation(Required=true)]
        public string CheckoutDate { get; set; }

    }

}
