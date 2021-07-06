// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    public class QueryIndividualidInternalmaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用于内部统计的参数，外部用户请忽略
        [NameInMap("biz_info")]
        [Validation(Required=true)]
        public BizInfo BizInfo { get; set; }

        // 被核验人身份证号码后四位
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 被核验人手机号码
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 被核验人姓名的一部分
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

    }

}
