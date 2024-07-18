// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    //  公司信息修改
    public class CompanyInfoUpdate : TeaModel {
        // 营业执照文件信息
        [NameInMap("business_license_file")]
        [Validation(Required=false)]
        public FileInfo BusinessLicenseFile { get; set; }

        // 业务类型 枚举
        [NameInMap("product_main_class")]
        [Validation(Required=false)]
        public string ProductMainClass { get; set; }

        // 公司名称
        [NameInMap("company_name")]
        [Validation(Required=false)]
        public string CompanyName { get; set; }

        // 公司别名
        [NameInMap("company_alias_name")]
        [Validation(Required=false)]
        public string CompanyAliasName { get; set; }

        // 公司数科租户id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 公司联系电话
        [NameInMap("company_mobile")]
        [Validation(Required=false)]
        public string CompanyMobile { get; set; }

        // 公司联系地址
        [NameInMap("company_address")]
        [Validation(Required=false)]
        public string CompanyAddress { get; set; }

        // 联系人姓名
        [NameInMap("contact_name")]
        [Validation(Required=false)]
        public string ContactName { get; set; }

        // 联系人手机号码
        [NameInMap("contact_mobile")]
        [Validation(Required=false)]
        public string ContactMobile { get; set; }

    }

}
