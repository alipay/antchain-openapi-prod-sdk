// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 用户价格
    public class UserPrice : TeaModel {
        // 具体价格
        [NameInMap("price")]
        [Validation(Required=true)]
        public string Price { get; set; }

        // 相对比例
        [NameInMap("ratio")]
        [Validation(Required=true)]
        public string Ratio { get; set; }

        // 对租户价格(需要和当前生效价格匹配)
        [NameInMap("snapshot_tenant_price")]
        [Validation(Required=true)]
        public string SnapshotTenantPrice { get; set; }

        // 价格类型(数值/比例)
        [NameInMap("user_price_type")]
        [Validation(Required=true)]
        public long? UserPriceType { get; set; }

        // 租户用户价格包括费率
        [NameInMap("user_price_with_commission")]
        [Validation(Required=true)]
        public string UserPriceWithCommission { get; set; }

    }

}
