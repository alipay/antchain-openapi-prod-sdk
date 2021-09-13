// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    public class CreateOrderWorkflowRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 待开通类商品列表
        [NameInMap("product_list")]
        [Validation(Required=true)]
        public List<string> ProductList { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 下单交易流水号，唯一
        [NameInMap("biz_no")]
        [Validation(Required=true)]
        public string BizNo { get; set; }

        // 标签对象
        [NameInMap("instance_labels")]
        [Validation(Required=true)]
        public List<InstanceLabel> InstanceLabels { get; set; }

    }

}
