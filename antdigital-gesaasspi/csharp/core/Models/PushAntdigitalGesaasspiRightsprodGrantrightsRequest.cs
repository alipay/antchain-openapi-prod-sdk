// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAASSPI.Models
{
    public class PushAntdigitalGesaasspiRightsprodGrantrightsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户ID
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 手机号
        [NameInMap("phone_number")]
        [Validation(Required=false)]
        public string PhoneNumber { get; set; }

        // 商户编码
        [NameInMap("merchant_no")]
        [Validation(Required=false)]
        public string MerchantNo { get; set; }

        // 权益编码
        [NameInMap("rights_code")]
        [Validation(Required=true)]
        public string RightsCode { get; set; }

        // 发放数量，可根据权益信息grantMulti判断是否可发多张
        [NameInMap("grant_num")]
        [Validation(Required=false)]
        public long? GrantNum { get; set; }

        // 外部发放订单号
        [NameInMap("out_grant_order_no")]
        [Validation(Required=true)]
        public string OutGrantOrderNo { get; set; }

        // 发放扩展信息，如活动ID等信息，暂时可以不传
        [NameInMap("grant_info")]
        [Validation(Required=false)]
        public string GrantInfo { get; set; }

    }

}
