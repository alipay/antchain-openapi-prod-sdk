// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 公司信息
    public class CompanyInfo : TeaModel {
        // 营业执照文件信息
        [NameInMap("business_license_file")]
        [Validation(Required=true)]
        public FileInfo BusinessLicenseFile { get; set; }

        // 业务类型 枚举
        [NameInMap("product_main_class")]
        [Validation(Required=true)]
        public string ProductMainClass { get; set; }

        // 公司名称
        [NameInMap("company_name")]
        [Validation(Required=true)]
        public string CompanyName { get; set; }

        // 公司别名
        [NameInMap("company_alias_name")]
        [Validation(Required=true)]
        public string CompanyAliasName { get; set; }

        // 公司数科租户id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 统一社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 商户类型： 01：企业；07：个体工商户
        // 默认不填为01
        [NameInMap("merchant_type")]
        [Validation(Required=false)]
        public string MerchantType { get; set; }

        // 公司联系电话
        [NameInMap("company_mobile")]
        [Validation(Required=true)]
        public string CompanyMobile { get; set; }

        // 公司联系地址
        [NameInMap("company_address")]
        [Validation(Required=true)]
        public string CompanyAddress { get; set; }

        // 联系人姓名
        [NameInMap("contact_name")]
        [Validation(Required=true)]
        public string ContactName { get; set; }

        // 联系人手机号码
        [NameInMap("contact_mobile")]
        [Validation(Required=true)]
        public string ContactMobile { get; set; }

        // 绑定企业支付宝账号
        [NameInMap("bind_alipay_no")]
        [Validation(Required=true)]
        public string BindAlipayNo { get; set; }

        // 结算企业支付宝账号
        [NameInMap("settle_alipay_no")]
        [Validation(Required=true)]
        public string SettleAlipayNo { get; set; }

        // 绑定支付宝uid
        [NameInMap("bind_alipay_uid")]
        [Validation(Required=true)]
        public string BindAlipayUid { get; set; }

    }

}
