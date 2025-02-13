// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 两轮车一体机门店信息
    public class SimStoreInfo : TeaModel {
        // 门店对外业务id
        [NameInMap("store_id")]
        [Validation(Required=true)]
        public string StoreId { get; set; }

        // 门店名称
        [NameInMap("store_name")]
        [Validation(Required=true)]
        public string StoreName { get; set; }

    }

}
