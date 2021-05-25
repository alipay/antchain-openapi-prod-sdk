// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 增值服务加sku信息
    public class ValueAddedServiceInfoWithSku : TeaModel {
        // 增值服务信息
        [NameInMap("add_value_info")]
        [Validation(Required=true)]
        public ValueAddedServiceInfo AddValueInfo { get; set; }

        // sku信息
        [NameInMap("skus")]
        [Validation(Required=true)]
        public List<IpSkuEmphasisInfo> Skus { get; set; }

    }

}
