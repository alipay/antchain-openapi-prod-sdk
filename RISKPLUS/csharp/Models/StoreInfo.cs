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
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
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
        /// <summary>
        /// <b>Example:</b>
        /// <para>IFJRJTIJ</para>
        /// </summary>
        [NameInMap("traffic_platform")]
        [Validation(Required=false)]
        public string TrafficPlatform { get; set; }

        // 门店ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("store_id")]
        [Validation(Required=true)]
        public string StoreId { get; set; }

        // 门店名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("store_name")]
        [Validation(Required=true)]
        public string StoreName { get; set; }

        // 统一社会信用代码
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("usci")]
        [Validation(Required=true)]
        public string Usci { get; set; }

        // 门店-省，浙江省
        /// <summary>
        /// <b>Example:</b>
        /// <para>浙江省</para>
        /// </summary>
        [NameInMap("province")]
        [Validation(Required=true)]
        public string Province { get; set; }

        // 省编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>100001</para>
        /// </summary>
        [NameInMap("province_code")]
        [Validation(Required=false)]
        public string ProvinceCode { get; set; }

        // 门店-市，杭州市
        /// <summary>
        /// <b>Example:</b>
        /// <para>杭州市</para>
        /// </summary>
        [NameInMap("city")]
        [Validation(Required=true)]
        public string City { get; set; }

        // 市编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("city_code")]
        [Validation(Required=false)]
        public string CityCode { get; set; }

        // 门店-区，滨江区
        /// <summary>
        /// <b>Example:</b>
        /// <para>滨江区</para>
        /// </summary>
        [NameInMap("district")]
        [Validation(Required=true)]
        public string District { get; set; }

        // 区编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("district_code")]
        [Validation(Required=false)]
        public string DistrictCode { get; set; }

        // 门店-详细地址，
        // 望江路万达广场一层001号
        /// <summary>
        /// <b>Example:</b>
        /// <para>望江路万达广场一层001号</para>
        /// </summary>
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

        // 门店-经度
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("longitude")]
        [Validation(Required=false)]
        public string Longitude { get; set; }

        // 门店-纬度
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("latitude")]
        [Validation(Required=false)]
        public string Latitude { get; set; }

        // 营业执照-开始时间，yyyy-MM-dd
        /// <summary>
        /// <b>Example:</b>
        /// <para>yyyy-MM-dd</para>
        /// </summary>
        [NameInMap("store_start_date")]
        [Validation(Required=true)]
        public string StoreStartDate { get; set; }

        // 营业执照-结束时间，yyyy-MM-dd，长期上送：9999-12-31
        /// <summary>
        /// <b>Example:</b>
        /// <para>yyyy-MM-dd</para>
        /// </summary>
        [NameInMap("store_end_date")]
        [Validation(Required=true)]
        public string StoreEndDate { get; set; }

        // 门店类型，
        // 个体: 个体工商户；企业
        /// <summary>
        /// <b>Example:</b>
        /// <para>个体</para>
        /// </summary>
        [NameInMap("store_type")]
        [Validation(Required=true)]
        public string StoreType { get; set; }

        // 法人-姓名
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("legal_person_name")]
        [Validation(Required=true)]
        public string LegalPersonName { get; set; }

        // 法人-身份证号
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("legal_person_id_card")]
        [Validation(Required=true)]
        public string LegalPersonIdCard { get; set; }

        // 法人-手机号
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("legal_person_mobile")]
        [Validation(Required=true)]
        public string LegalPersonMobile { get; set; }

        // 法人-身份证有效期，，身份证反面格式：如yyyy.MM.dd-长期
        /// <summary>
        /// <b>Example:</b>
        /// <para>yyyy.MM.dd-长期</para>
        /// </summary>
        [NameInMap("effective_date")]
        [Validation(Required=true)]
        public string EffectiveDate { get; set; }

        // 对公-开户行名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("bank_name")]
        [Validation(Required=false)]
        public string BankName { get; set; }

        // 对公-开户行编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>ICBC</para>
        /// </summary>
        [NameInMap("bank_code")]
        [Validation(Required=false)]
        public string BankCode { get; set; }

        // 对公-支行名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("branch_name")]
        [Validation(Required=false)]
        public string BranchName { get; set; }

        // 对公-联行号
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("cnaps_code")]
        [Validation(Required=false)]
        public string CnapsCode { get; set; }

        // 对公-银行账户名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("account_name")]
        [Validation(Required=false)]
        public string AccountName { get; set; }

        // 对公-银行账户号
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("account_number")]
        [Validation(Required=false)]
        public string AccountNumber { get; set; }

        // 对公-开户行所在省，浙江
        /// <summary>
        /// <b>Example:</b>
        /// <para>浙江</para>
        /// </summary>
        [NameInMap("bank_province")]
        [Validation(Required=false)]
        public string BankProvince { get; set; }

        // 对公-开户行所在市，杭州
        /// <summary>
        /// <b>Example:</b>
        /// <para>杭州</para>
        /// </summary>
        [NameInMap("bank_city")]
        [Validation(Required=false)]
        public string BankCity { get; set; }

        // 对私-银行卡号
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("payee_bank_card")]
        [Validation(Required=false)]
        public string PayeeBankCard { get; set; }

        // 对私-银行名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("payee_bank_name")]
        [Validation(Required=false)]
        public string PayeeBankName { get; set; }

        // 对私-银行编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>ICBC</para>
        /// </summary>
        [NameInMap("payee_bank_code")]
        [Validation(Required=false)]
        public string PayeeBankCode { get; set; }

        // 蚂蚁数科入驻账号
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("login_tenant")]
        [Validation(Required=false)]
        public string LoginTenant { get; set; }

        // 入驻时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>yyyy-MM-dd</para>
        /// </summary>
        [NameInMap("login_date")]
        [Validation(Required=false)]
        public string LoginDate { get; set; }

        // 结算支付宝账户，交易资金结算的具体支付宝账号，商户入驻时必填
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="mailto:xxxx@126.com">xxxx@126.com</a></para>
        /// </summary>
        [NameInMap("alipay_logon_id")]
        [Validation(Required=false)]
        public string AlipayLogonId { get; set; }

        // 支付宝openId
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("info_source_open_id")]
        [Validation(Required=false)]
        public string InfoSourceOpenId { get; set; }

        // 签约支付宝账户，商户入驻时必填（接收支付宝下发的签约协议）
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("binding_alipay_logon_id")]
        [Validation(Required=false)]
        public string BindingAlipayLogonId { get; set; }

    }

}
