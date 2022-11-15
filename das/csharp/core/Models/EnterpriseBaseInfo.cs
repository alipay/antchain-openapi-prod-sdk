// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 企业基本信息
    public class EnterpriseBaseInfo : TeaModel {
        // 机构名称
        [NameInMap("org_name")]
        [Validation(Required=true)]
        public string OrgName { get; set; }

        // 统一社会信用代码
        [NameInMap("credit_code")]
        [Validation(Required=true)]
        public string CreditCode { get; set; }

        // 企业公司注册证号
        [NameInMap("reg_number")]
        [Validation(Required=true)]
        public string RegNumber { get; set; }

        // 持股比例
        [NameInMap("invest_rate")]
        [Validation(Required=false)]
        public string InvestRate { get; set; }

        // 查询人与这家企业的关联
        [NameInMap("relationship")]
        [Validation(Required=false)]
        public string Relationship { get; set; }

    }

}
