// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PARTNER.Models
{
    // 合作方（伙伴、商家）基本信息
    public class PartnerBasicInformation : TeaModel {
        // 行业类型，值列表详见文档：https://yuque.antfin-inc.com/docs/share/684c97a8-bd5f-40e0-aab6-a1a69bc3d881?#
        [NameInMap("industry")]
        [Validation(Required=true)]
        public string Industry { get; set; }

        // 企业法人
        [NameInMap("enterprise_legal_person")]
        [Validation(Required=true)]
        public string EnterpriseLegalPerson { get; set; }

        // 注册资本
        [NameInMap("registered_capital")]
        [Validation(Required=true)]
        public string RegisteredCapital { get; set; }

        // 人员规模
        [NameInMap("employee_count")]
        [Validation(Required=true)]
        public string EmployeeCount { get; set; }

        // 企业注册省份
        [NameInMap("enterprise_register_province")]
        [Validation(Required=true)]
        public string EnterpriseRegisterProvince { get; set; }

        // 企业注册城市
        [NameInMap("enterprise_register_city")]
        [Validation(Required=true)]
        public string EnterpriseRegisterCity { get; set; }

        // 公司官网地址
        [NameInMap("company_url")]
        [Validation(Required=true)]
        public string CompanyUrl { get; set; }

        // 是否上市公司
        [NameInMap("listed")]
        [Validation(Required=true)]
        public bool? Listed { get; set; }

        // 企业简介
        [NameInMap("brief_introduction")]
        [Validation(Required=true)]
        public string BriefIntroduction { get; set; }

        // 二级行业，值列表详见文档：https://yuque.antfin-inc.com/docs/share/684c97a8-bd5f-40e0-aab6-a1a69bc3d881?# 《合作方企业基本信息说明》
        [NameInMap("sub_industry")]
        [Validation(Required=false)]
        public string SubIndustry { get; set; }

    }

}
