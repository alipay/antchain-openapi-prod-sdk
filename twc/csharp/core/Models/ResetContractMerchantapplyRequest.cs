// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class ResetContractMerchantapplyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 进件或进件修改申请订单id，从进件申请接口的返回字段中获取
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 进件类型,1 创建、2 修改、3 申请创建、4 申请修改
        [NameInMap("apply_type")]
        [Validation(Required=true)]
        public long? ApplyType { get; set; }

    }

}
