// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COLLABINV.Models
{
    public class BatchqueryCarloanPrdRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 日期
        [NameInMap("date")]
        [Validation(Required=true)]
        public string Date { get; set; }

        // 查询条数
        [NameInMap("data_num")]
        [Validation(Required=true)]
        public long? DataNum { get; set; }

    }

}
