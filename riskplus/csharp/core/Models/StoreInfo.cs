// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 门店信息
    public class StoreInfo : TeaModel {
        // 门店ID
        [NameInMap("store_id")]
        [Validation(Required=true)]
        public string StoreId { get; set; }

        // 蚂蚁数科入驻账号
        [NameInMap("login_tenant")]
        [Validation(Required=true)]
        public string LoginTenant { get; set; }

        // 收款账号
        [NameInMap("payee_bank_card")]
        [Validation(Required=true)]
        public string PayeeBankCard { get; set; }

        // 收款人
        [NameInMap("payee_name")]
        [Validation(Required=true)]
        public string PayeeName { get; set; }

        // 门店名称
        [NameInMap("store_name")]
        [Validation(Required=true)]
        public string StoreName { get; set; }

        // 销售ID
        [NameInMap("salesman")]
        [Validation(Required=false)]
        public string Salesman { get; set; }

        // 销售设备编号
        [NameInMap("device")]
        [Validation(Required=false)]
        public string Device { get; set; }

    }

}
