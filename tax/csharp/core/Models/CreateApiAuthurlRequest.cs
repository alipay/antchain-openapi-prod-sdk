// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class CreateApiAuthurlRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 01发票归集授权 02记账 03报销 11发票贷授权（0X发票相关授权，1X金融类授权）
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public string AuthType { get; set; }

        // 纳税人识别号
        [NameInMap("nsrsbh")]
        [Validation(Required=true)]
        public string Nsrsbh { get; set; }

        // 企业名称
        [NameInMap("corp_name")]
        [Validation(Required=true)]
        public string CorpName { get; set; }

        // 授权回调地址，授权成功后，会跳转该地址，该地址填接入方自己的接收授权结果的地址
        [NameInMap("call_back_url")]
        [Validation(Required=true)]
        public string CallBackUrl { get; set; }

        // 机构代码
        [NameInMap("inst_code")]
        [Validation(Required=true)]
        public string InstCode { get; set; }

        // 已认证的法人手机号
        [NameInMap("cognizant_mobile")]
        [Validation(Required=false)]
        public string CognizantMobile { get; set; }

        // 已认证的法人姓名
        [NameInMap("cognizant_name")]
        [Validation(Required=false)]
        public string CognizantName { get; set; }

        // 已认证的法人身份证号
        [NameInMap("identity_number")]
        [Validation(Required=false)]
        public string IdentityNumber { get; set; }

        // 订单号，用于幂等控制，每次新生成，如果不填我方会自动生成一个
        [NameInMap("order_no")]
        [Validation(Required=false)]
        public string OrderNo { get; set; }

        // 登录方式，ACCOUNT_PASS：账密，ALL：全部(包括账密和扫码)，默认为ALL（全部）
        [NameInMap("login_mode")]
        [Validation(Required=false)]
        public string LoginMode { get; set; }

    }

}
