// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class DetailEcarAvitivedataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 排放数据录入明细编码
        [NameInMap("emission_data_entry_item_no")]
        [Validation(Required=false)]
        public string EmissionDataEntryItemNo { get; set; }

        // 企业业务单号
        [NameInMap("enterprise_biz_no")]
        [Validation(Required=false)]
        public string EnterpriseBizNo { get; set; }

    }

}
