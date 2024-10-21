// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SP.Models
{
    public class CheckSpProductOrderparameterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        [NameInMap("product_access_code")]
        [Validation(Required=false)]
        public string ProductAccessCode { get; set; }

        // 加载业务的场景。具体内容同产品方定义，但产品下需保证唯一。
        [NameInMap("business_action")]
        [Validation(Required=true)]
        public string BusinessAction { get; set; }

        // 用于加载对应场景数据的上下文（JSON格式具体同产品方定义）
        [NameInMap("business_context")]
        [Validation(Required=true)]
        public string BusinessContext { get; set; }

        // 业务流水号。
        [NameInMap("order_no")]
        [Validation(Required=false)]
        public string OrderNo { get; set; }

        // 商品的渠道产品码
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 地域。支持不同地域显示不同内容。
        [NameInMap("region")]
        [Validation(Required=false)]
        public string Region { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 需要校验的数据
        [NameInMap("input")]
        [Validation(Required=true)]
        public string Input { get; set; }

    }

}
