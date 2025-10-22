// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    public class UpdateIssuerPriceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 项目ID
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 项目净值
        [NameInMap("net_value")]
        [Validation(Required=true)]
        public string NetValue { get; set; }

        // 要修改的价格类型（必须与项目创建时设定的类型一致）
        [NameInMap("price_type")]
        [Validation(Required=true)]
        public string PriceType { get; set; }

        // 修改说明或备注
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

    }

}
