// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTX.Models
{
    public class SyncOrderDataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 接入方的订单号
        [NameInMap("external_order_no")]
        [Validation(Required=true)]
        public string ExternalOrderNo { get; set; }

        // 目前支持两种状态 PAID、PAY_CANCEL 
        [NameInMap("external_order_status")]
        [Validation(Required=true)]
        public string ExternalOrderStatus { get; set; }

        // 鲸探开放平台订单号
        [NameInMap("open_order_no")]
        [Validation(Required=true)]
        public string OpenOrderNo { get; set; }

        // 鲸探授权的用户加密的uid
        [NameInMap("open_user_id")]
        [Validation(Required=true)]
        public string OpenUserId { get; set; }

        // 同步改状态时的事件毫秒时间戳
        [NameInMap("update_time")]
        [Validation(Required=true)]
        public long? UpdateTime { get; set; }

    }

}
