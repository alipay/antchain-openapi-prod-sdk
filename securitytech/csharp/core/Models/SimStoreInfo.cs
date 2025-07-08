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

        // 是否签约 true已签约/false未签约
        [NameInMap("is_sign")]
        [Validation(Required=true)]
        public bool? IsSign { get; set; }

        // 支付宝H5签约链接 未签约时非空
        [NameInMap("sign_url")]
        [Validation(Required=false)]
        public string SignUrl { get; set; }

    }

}
