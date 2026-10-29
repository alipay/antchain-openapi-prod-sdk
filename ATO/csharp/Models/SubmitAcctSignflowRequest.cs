// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class SubmitAcctSignflowRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单号
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // CRED_PSN_CH_IDCARD大陆身份证
        [NameInMap("user_id_type")]
        [Validation(Required=false)]
        public string UserIdType { get; set; }

        // 用户证件号，需要采用RSA加密传输
        [NameInMap("user_id_number")]
        [Validation(Required=false)]
        public string UserIdNumber { get; set; }

        // 姓名，需要采用RSA加密传输
        [NameInMap("user_name")]
        [Validation(Required=false)]
        public string UserName { get; set; }

        // 用户手机号，可不传；传的话需要采用RSA加密传输
        [NameInMap("user_mobile")]
        [Validation(Required=false)]
        public string UserMobile { get; set; }

        // 业务场景，电子合同签署协议的时候的标题
        [NameInMap("business_scene")]
        [Validation(Required=true)]
        public string BusinessScene { get; set; }

        // 签署完成跳转链接
        [NameInMap("signed_redirect_url")]
        [Validation(Required=false)]
        public string SignedRedirectUrl { get; set; }

        // 签署的电子合同模板信息，JSONArray格式，可以传入多个templateId和templateArgs。注意templateArgs的格式为key-value，其中key为模板文件中表单域的名称，value为需要填充的值。
        [NameInMap("template_list")]
        [Validation(Required=true)]
        public string TemplateList { get; set; }

        // 公司名称
        [NameInMap("merchant_name")]
        [Validation(Required=true)]
        public string MerchantName { get; set; }

        // 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
        [NameInMap("merchant_tag")]
        [Validation(Required=false)]
        public string MerchantTag { get; set; }

        // CRED_ORG_USCC：统一社会信用代码
        [NameInMap("merchant_id_type")]
        [Validation(Required=true)]
        public string MerchantIdType { get; set; }

        // 商户证件号，需要采用RSA加密传输
        [NameInMap("merchant_id_number")]
        [Validation(Required=true)]
        public string MerchantIdNumber { get; set; }

        // 法人姓名，需要RSA加密传输
        [NameInMap("merchant_legal_name")]
        [Validation(Required=false)]
        public string MerchantLegalName { get; set; }

        // 法人证件号，需要采用RSA加密传输
        [NameInMap("merchant_legal_id_number")]
        [Validation(Required=false)]
        public string MerchantLegalIdNumber { get; set; }

        // 法人手机号，需RSA加密
        [NameInMap("merchant_legal_mobile")]
        [Validation(Required=false)]
        public string MerchantLegalMobile { get; set; }

        // 0-手绘签名 1-模板印章签名 多种类型时逗号分割，为空不限制
        [NameInMap("seal_type")]
        [Validation(Required=false)]
        public string SealType { get; set; }

    }

}
