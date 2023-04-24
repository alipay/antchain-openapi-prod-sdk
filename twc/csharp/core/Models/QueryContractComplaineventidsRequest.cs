// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryContractComplaineventidsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 客诉单创建开始日期
        [NameInMap("complain_start_date")]
        [Validation(Required=true)]
        public string ComplainStartDate { get; set; }

        // 客诉单创建开始日期
        [NameInMap("complain_end_date")]
        [Validation(Required=true)]
        public string ComplainEndDate { get; set; }

    }

}
