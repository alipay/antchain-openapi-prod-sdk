// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class SetLeaseRepaymentstatusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租赁机构金融科技租户Id
        [NameInMap("lease_id")]
        [Validation(Required=true)]
        public string LeaseId { get; set; }

        // 融资租赁对应的合约id
        [NameInMap("application_id")]
        [Validation(Required=false)]
        public string ApplicationId { get; set; }

        // 融资租赁对应的订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // finish只能为0或1，0表示订单重置此状态下订单可以被再次操作【如清分记录上传、还款记录上传等】，1表示订单结束，在1的状态下不会再进行清分、还款记录上传等操作
        [NameInMap("finish")]
        [Validation(Required=true)]
        public long? Finish { get; set; }

        // 原所有权人金融科技租户id
        [NameInMap("old_ownership_id")]
        [Validation(Required=false)]
        public string OldOwnershipId { get; set; }

        // 新所有权人租户id
        [NameInMap("new_ownership_id")]
        [Validation(Required=false)]
        public string NewOwnershipId { get; set; }

    }

}
