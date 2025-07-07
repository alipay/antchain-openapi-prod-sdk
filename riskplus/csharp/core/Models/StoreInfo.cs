// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 门店信息
    public class StoreInfo : TeaModel {
        // 品牌
        [NameInMap("store_brand")]
        [Validation(Required=true)]
        public string StoreBrand { get; set; }

        // 门店ID
        [NameInMap("store_id")]
        [Validation(Required=true)]
        public string StoreId { get; set; }

        // 门店名称
        [NameInMap("store_name")]
        [Validation(Required=true)]
        public string StoreName { get; set; }

        // 统一社会信用代码
        [NameInMap("usci")]
        [Validation(Required=true)]
        public string Usci { get; set; }

        // 门店-省，浙江省
        [NameInMap("province")]
        [Validation(Required=true)]
        public string Province { get; set; }

        // 门店-市，杭州市
        [NameInMap("city")]
        [Validation(Required=true)]
        public string City { get; set; }

        // 门店-区，滨江区
        [NameInMap("district")]
        [Validation(Required=true)]
        public string District { get; set; }

        // 门店-详细地址，
        // 望江路万达广场一层001号
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

        // 营业执照-开始时间，yyyy-MM-dd
        [NameInMap("store_start_date")]
        [Validation(Required=true)]
        public string StoreStartDate { get; set; }

        // 营业执照-结束时间，yyyy-MM-dd，长期上送：9999-12-31
        [NameInMap("store_end_date")]
        [Validation(Required=true)]
        public string StoreEndDate { get; set; }

        // 门店类型，
        // 个体、企业、其他
        [NameInMap("store_type")]
        [Validation(Required=true)]
        public string StoreType { get; set; }

        // 法人-姓名
        [NameInMap("legal_person_name")]
        [Validation(Required=true)]
        public string LegalPersonName { get; set; }

        // 法人-身份证号
        [NameInMap("legal_person_id_card")]
        [Validation(Required=true)]
        public string LegalPersonIdCard { get; set; }

        // 法人-手机号
        [NameInMap("legal_person_mobile")]
        [Validation(Required=true)]
        public string LegalPersonMobile { get; set; }

        // 法人-身份证有效期，，身份证反面格式：如yyyy.MM.dd-长期
        [NameInMap("effective_date")]
        [Validation(Required=true)]
        public string EffectiveDate { get; set; }

        // 对公-开户行名称
        [NameInMap("bank_name")]
        [Validation(Required=false)]
        public string BankName { get; set; }

        // 对公-支行名称
        [NameInMap("branch_name")]
        [Validation(Required=false)]
        public string BranchName { get; set; }

        // 对公-联行号
        [NameInMap("cnaps_code")]
        [Validation(Required=false)]
        public string CnapsCode { get; set; }

        // 对公-银行账户名称
        [NameInMap("account_name")]
        [Validation(Required=false)]
        public string AccountName { get; set; }

        // 对公-银行账户号
        [NameInMap("account_number")]
        [Validation(Required=false)]
        public string AccountNumber { get; set; }

        // 对公-开户行所在省，浙江
        [NameInMap("bank_province")]
        [Validation(Required=false)]
        public string BankProvince { get; set; }

        // 对公-开户行所在市，杭州
        [NameInMap("bank_city")]
        [Validation(Required=false)]
        public string BankCity { get; set; }

        // 对私-银行卡号
        [NameInMap("payee_bank_card")]
        [Validation(Required=false)]
        public string PayeeBankCard { get; set; }

        // 对私-银行名称
        [NameInMap("payee_bank_name")]
        [Validation(Required=false)]
        public string PayeeBankName { get; set; }

        // 蚂蚁数科入驻账号
        [NameInMap("login_tenant")]
        [Validation(Required=false)]
        public string LoginTenant { get; set; }

        // 入驻时间
        [NameInMap("login_date")]
        [Validation(Required=false)]
        public string LoginDate { get; set; }

    }

}
