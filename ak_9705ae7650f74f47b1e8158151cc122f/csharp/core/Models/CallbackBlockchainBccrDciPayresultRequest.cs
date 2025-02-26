// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_9705ae7650f74f47b1e8158151cc122f.Models
{
    public class CallbackBlockchainBccrDciPayresultRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 与中心约定的任务ID，同一个作品可能会发起多次登记
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

        // 平台Id
        [NameInMap("app_id")]
        [Validation(Required=true)]
        public string AppId { get; set; }

        // 订单ID 
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 支付方式 (ALIPAY,0,支付宝)
        [NameInMap("pay_ment")]
        [Validation(Required=true)]
        public string PayMent { get; set; }

        // 订单金额
        [NameInMap("money")]
        [Validation(Required=true)]
        public string Money { get; set; }

        // 结果描述，如：支付成功
        [NameInMap("result_content")]
        [Validation(Required=true)]
        public string ResultContent { get; set; }

        // 状态，2001代表支付成功
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

    }

}
