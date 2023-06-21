// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 订单查询承诺信息
    public class BclPromiseInfo : TeaModel {
        // 承诺租期 单位
        // 月 MONTH
        [NameInMap("rent_unit")]
        [Validation(Required=true)]
        public string RentUnit { get; set; }

        // 总期数
        [NameInMap("rent_term")]
        [Validation(Required=true)]
        public long? RentTerm { get; set; }

        // 总金额 单位分
        [NameInMap("total_rent_money")]
        [Validation(Required=true)]
        public long? TotalRentMoney { get; set; }

        // 承诺履约详情
        [NameInMap("promise_details")]
        [Validation(Required=true)]
        public List<BclPromiseDetailInfo> PromiseDetails { get; set; }

    }

}
