// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 公司列表
    public class CompanyItems : TeaModel {
        // 公司id
        [NameInMap("company_id")]
        [Validation(Required=true)]
        public string CompanyId { get; set; }

        // 蚂蚁科技集团股份有限公司
        [NameInMap("company_name")]
        [Validation(Required=true)]
        public string CompanyName { get; set; }

        // 匹配名称
        [NameInMap("matching_name")]
        [Validation(Required=true)]
        public string MatchingName { get; set; }

        // 匹配类型
        [NameInMap("matching_type")]
        [Validation(Required=true)]
        public string MatchingType { get; set; }

        // 匹配值
        [NameInMap("matching_value")]
        [Validation(Required=true)]
        public string MatchingValue { get; set; }

        // 返回标识
        [NameInMap("uc_code")]
        [Validation(Required=true)]
        public string UcCode { get; set; }

    }

}
