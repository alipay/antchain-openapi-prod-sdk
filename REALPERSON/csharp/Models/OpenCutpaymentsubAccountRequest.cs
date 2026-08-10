// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class OpenCutpaymentsubAccountRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
        [NameInMap("outer_order_no")]
        [Validation(Required=true)]
        public string OuterOrderNo { get; set; }

        // 登录号，商户自定义，要求全局唯一，长度11位以上
        [NameInMap("login_no")]
        [Validation(Required=true)]
        public string LoginNo { get; set; }

        // 邮箱
        [NameInMap("email")]
        [Validation(Required=true)]
        public string Email { get; set; }

        // 是否个体户企业为 false个体户为 true
        [NameInMap("self_employed")]
        [Validation(Required=true)]
        public bool? SelfEmployed { get; set; }

        // 商户名称（营业执照上的名称）
        [NameInMap("license_name")]
        [Validation(Required=true)]
        public string LicenseName { get; set; }

        // 营业执照号
        [NameInMap("license_no")]
        [Validation(Required=true)]
        public string LicenseNo { get; set; }

        // 法人姓名
        [NameInMap("cert_name")]
        [Validation(Required=true)]
        public string CertName { get; set; }

        // 法人身份证号
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 法人手机号
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 公司所属行业
        [NameInMap("industry_id")]
        [Validation(Required=true)]
        public string IndustryId { get; set; }

        // 银行卡号
        [NameInMap("bank_card")]
        [Validation(Required=true)]
        public string BankCard { get; set; }

        // 银行名称
        [NameInMap("bank_name")]
        [Validation(Required=true)]
        public string BankName { get; set; }

        // 开户行省份
        [NameInMap("bank_province")]
        [Validation(Required=true)]
        public string BankProvince { get; set; }

        // 开户行城市
        [NameInMap("bank_city")]
        [Validation(Required=true)]
        public string BankCity { get; set; }

        // 开户支行名称
        [NameInMap("bank_branch_name")]
        [Validation(Required=true)]
        public string BankBranchName { get; set; }

        // 持卡人姓名
        // 当开个体户且绑定对私卡时需传此字段,否则默认绑定对公卡
        [NameInMap("card_user_name")]
        [Validation(Required=false)]
        public string CardUserName { get; set; }

        // 一级商户商户号
        [NameInMap("first_level_memberid")]
        [Validation(Required=true)]
        public string FirstLevelMemberid { get; set; }

        // 一级商户终端号
        [NameInMap("first_level_terminalid")]
        [Validation(Required=true)]
        public string FirstLevelTerminalid { get; set; }

        // 扩展信息，预留字段
        [NameInMap("extern_param")]
        [Validation(Required=false)]
        public string ExternParam { get; set; }

    }

}
