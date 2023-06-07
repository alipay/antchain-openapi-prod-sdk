// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 企业工商信息_自然人查询
    public class EnterprisePersonInfo : TeaModel {
        // 查询人对应企业名
        [NameInMap("org_name")]
        [Validation(Required=false)]
        public string OrgName { get; set; }

        // 查询人持股信息
        [NameInMap("stockholder")]
        [Validation(Required=false)]
        public StockHolder Stockholder { get; set; }

        // 查询人所在公司基本信息
        [NameInMap("basic_info")]
        [Validation(Required=false)]
        public EnterpriseBasicInfo BasicInfo { get; set; }

        // 查询人与这家企业的关联:sh 股东;lp 法人;tm 高管
        [NameInMap("relationship")]
        [Validation(Required=false)]
        public List<string> Relationship { get; set; }

    }

}
