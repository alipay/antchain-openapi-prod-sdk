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

        // 品牌，商户入驻时需填写，
        // TBJHF: 赛鸽出行
        // AIJNBJ: 智迈电动车
        // KJOKJBO: 金箭出行
        // IFJRJTIJ: 骑士智行
        // KVMPOH: 巨龙智行
        // NPGBRVBO: 摩生态A
        [NameInMap("traffic_platform")]
        [Validation(Required=false)]
        public string TrafficPlatform { get; set; }

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

        // 省编码
        [NameInMap("province_code")]
        [Validation(Required=false)]
        public string ProvinceCode { get; set; }

        // 门店-市，杭州市
        [NameInMap("city")]
        [Validation(Required=true)]
        public string City { get; set; }

        // 市编码
        [NameInMap("city_code")]
        [Validation(Required=false)]
        public string CityCode { get; set; }

        // 门店-区，滨江区
        [NameInMap("district")]
        [Validation(Required=true)]
        public string District { get; set; }

        // 区编码
        [NameInMap("district_code")]
        [Validation(Required=false)]
        public string DistrictCode { get; set; }

        // 门店-详细地址，
        // 望江路万达广场一层001号
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

        // 门店-经度
        [NameInMap("longitude")]
        [Validation(Required=false)]
        public string Longitude { get; set; }

        // 门店-纬度
        [NameInMap("latitude")]
        [Validation(Required=false)]
        public string Latitude { get; set; }

        // 营业执照-开始时间，yyyy-MM-dd
        [NameInMap("store_start_date")]
        [Validation(Required=true)]
        public string StoreStartDate { get; set; }

        // 营业执照-结束时间，yyyy-MM-dd，长期上送：9999-12-31
        [NameInMap("store_end_date")]
        [Validation(Required=true)]
        public string StoreEndDate { get; set; }

        // 门店类型，
        // 个体: 个体工商户；企业
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

        // 对公-开户行编码
        [NameInMap("bank_code")]
        [Validation(Required=false)]
        public string BankCode { get; set; }

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

        // 对私-银行编码
        [NameInMap("payee_bank_code")]
        [Validation(Required=false)]
        public string PayeeBankCode { get; set; }

        // 蚂蚁数科入驻账号
        [NameInMap("login_tenant")]
        [Validation(Required=false)]
        public string LoginTenant { get; set; }

        // 入驻时间
        [NameInMap("login_date")]
        [Validation(Required=false)]
        public string LoginDate { get; set; }

        // 结算支付宝账户，交易资金结算的具体支付宝账号，商户入驻时必填
        [NameInMap("alipay_logon_id")]
        [Validation(Required=false)]
        public string AlipayLogonId { get; set; }

        // 支付宝openId
        [NameInMap("info_source_open_id")]
        [Validation(Required=false)]
        public string InfoSourceOpenId { get; set; }

        // 签约支付宝账户，商户入驻时必填（接收支付宝下发的签约协议）
        [NameInMap("binding_alipay_logon_id")]
        [Validation(Required=false)]
        public string BindingAlipayLogonId { get; set; }

    }

}
