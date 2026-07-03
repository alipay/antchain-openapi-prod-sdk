// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 租赁合同信息
    public class RentContractInfo : TeaModel {
        // 租赁合同ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>2c952456827828cdedad06afccef75a9f2c2840cbb6b0b659f653da1e5916cb2</para>
        /// </summary>
        [NameInMap("contract_id")]
        [Validation(Required=true)]
        public string ContractId { get; set; }

        // 租约时间 
        /// <summary>
        /// <b>Example:</b>
        /// <para>6个月 或 1年</para>
        /// </summary>
        [NameInMap("lease_time")]
        [Validation(Required=true)]
        public string LeaseTime { get; set; }

        // 入住时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2006-01-02 15:04:05</para>
        /// </summary>
        [NameInMap("checkin_date")]
        [Validation(Required=true)]
        public string CheckinDate { get; set; }

        // 退租时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("checkout_date")]
        [Validation(Required=true)]
        public string CheckoutDate { get; set; }

    }

}
