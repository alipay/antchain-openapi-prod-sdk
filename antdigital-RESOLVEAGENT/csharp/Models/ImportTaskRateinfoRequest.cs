// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RESOLVEAGENT.Models
{
    public class ImportTaskRateinfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 客户号
        [NameInMap("cus_no")]
        [Validation(Required=true)]
        public string CusNo { get; set; }

        // 借据信息
        [NameInMap("loan_info_list")]
        [Validation(Required=true)]
        public List<string> LoanInfoList { get; set; }

    }

}
