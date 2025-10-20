// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    public class SubmitRightsprodGrantRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 2088xxxx123
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 用户手机号
        [NameInMap("phone_number")]
        [Validation(Required=false)]
        public string PhoneNumber { get; set; }

        // 商户编号
        [NameInMap("merchant_no")]
        [Validation(Required=false)]
        public string MerchantNo { get; set; }

        // 权益编码
        [NameInMap("rights_code")]
        [Validation(Required=true)]
        public string RightsCode { get; set; }

        // 发放数量
        [NameInMap("grant_num")]
        [Validation(Required=true)]
        public long? GrantNum { get; set; }

        // 面额，动态面额类型必传
        [NameInMap("face_value")]
        [Validation(Required=false)]
        public string FaceValue { get; set; }

        // 外部发放订单号
        [NameInMap("out_grant_order_no")]
        [Validation(Required=true)]
        public string OutGrantOrderNo { get; set; }

        // 扩展信息
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

        // 发放信息,如活动ID等信息
        [NameInMap("grant_info")]
        [Validation(Required=false)]
        public string GrantInfo { get; set; }

        // 技术租户ID、当开通权益中心产品在非数科的应用租户下时需要填写对应的技术租户ID（涉及到时技术对接时 技术会分配，如未分配则不需要传参数）
        [NameInMap("tech_tenant_id")]
        [Validation(Required=false)]
        public string TechTenantId { get; set; }

    }

}
