// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_faa507f3bcf74109812a97f8296f54ca.Models
{
    public class AuthBlockchainTaxIcmInvoiceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求号，调用方企业保证每次调用唯一，蚂蚁发票平台通过该字段和app_id两个字段做幂等判断
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 查询的企业纳税人识别号
        // 
        [NameInMap("nsrsbh")]
        [Validation(Required=true)]
        public string Nsrsbh { get; set; }

        // 企业名称
        [NameInMap("corp_name")]
        [Validation(Required=true)]
        public string CorpName { get; set; }

        // 身份证号
        [NameInMap("identity_number")]
        [Validation(Required=true)]
        public string IdentityNumber { get; set; }

        // 已认证的法人手机号
        [NameInMap("cognizant_mobile")]
        [Validation(Required=true)]
        public string CognizantMobile { get; set; }

        // 已认证的法人姓名
        [NameInMap("cognizant_name")]
        [Validation(Required=true)]
        public string CognizantName { get; set; }

        // 透传字段
        [NameInMap("biz_context")]
        [Validation(Required=false)]
        public string BizContext { get; set; }

        // 授权业务类型
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public string AuthType { get; set; }

    }

}
