// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class PushRefinanceInvalidorderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 资产包id
        [NameInMap("package_id")]
        [Validation(Required=true, MaxLength=64)]
        public string PackageId { get; set; }

        // 无效资产订单id列表，单次不限笔数，如果没有无效资产，传空列表即可
        [NameInMap("order_id_list")]
        [Validation(Required=false)]
        public List<string> OrderIdList { get; set; }

    }

}
