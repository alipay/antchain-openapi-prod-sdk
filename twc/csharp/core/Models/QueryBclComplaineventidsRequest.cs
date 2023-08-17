// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryBclComplaineventidsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 客诉单开始时间
        [NameInMap("start_date")]
        [Validation(Required=true, MaxLength=16)]
        public string StartDate { get; set; }

        // 客诉单结束时间
        [NameInMap("end_date")]
        [Validation(Required=true, MaxLength=16)]
        public string EndDate { get; set; }

        // 每页数量
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 页码
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

    }

}
