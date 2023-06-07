// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 查询人所在公司基本信息
    public class EnterpriseBasicInfo : TeaModel {
        // 企业状态
        [NameInMap("reg_status")]
        [Validation(Required=false)]
        public string RegStatus { get; set; }

        // 成立日期(注册日期)
        [NameInMap("establish_time")]
        [Validation(Required=false)]
        public string EstablishTime { get; set; }

        // 注册资本
        [NameInMap("reg_capital")]
        [Validation(Required=false)]
        public string RegCapital { get; set; }

        // 行业
        [NameInMap("industry")]
        [Validation(Required=false)]
        public string Industry { get; set; }

        // 主要人员
        [NameInMap("staff_list")]
        [Validation(Required=false)]
        public List<EnterpriseStaff> StaffList { get; set; }

        // 法人类型，1-人;2-公司
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 注册资本币种:人民币、美元、欧元等
        [NameInMap("reg_capital_currency")]
        [Validation(Required=false)]
        public string RegCapitalCurrency { get; set; }

        // 法人姓名
        [NameInMap("legal_person_name")]
        [Validation(Required=false)]
        public string LegalPersonName { get; set; }

        // 注册号
        [NameInMap("reg_number")]
        [Validation(Required=false)]
        public string RegNumber { get; set; }

        // 统一社会信用代码
        [NameInMap("credit_code")]
        [Validation(Required=false)]
        public string CreditCode { get; set; }

        // 企业名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 企业类型
        [NameInMap("company_org_type")]
        [Validation(Required=false)]
        public string CompanyOrgType { get; set; }

        // 省份简称
        [NameInMap("base")]
        [Validation(Required=false)]
        public string Base { get; set; }

    }

}
