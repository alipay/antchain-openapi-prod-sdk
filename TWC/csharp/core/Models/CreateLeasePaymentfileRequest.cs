// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateLeasePaymentfileRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 融资租赁业务id，由资方控制台生成
        [NameInMap("application_id")]
        [Validation(Required=false)]
        public string ApplicationId { get; set; }

        // 是否启动订单的异步处理
        [NameInMap("async")]
        [Validation(Required=false)]
        public long? Async { get; set; }

        // 融资租赁额外字段
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // 租赁服务平台ID 长度不可超过50
        [NameInMap("lease_id")]
        [Validation(Required=true)]
        public string LeaseId { get; set; }

        // 订单id 长度不可超过50
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 付款通知书加签完电子签名后，PDF文件hash
        [NameInMap("payment_file_hash")]
        [Validation(Required=false)]
        public string PaymentFileHash { get; set; }

        // 付款通知书存证交易哈希
        [NameInMap("payment_file_tx_hash")]
        [Validation(Required=false)]
        public string PaymentFileTxHash { get; set; }

        // 付款通知所在路径
        [NameInMap("payment_url")]
        [Validation(Required=false)]
        public string PaymentUrl { get; set; }

        // 额外通知第三方，如果需要通知相关方外的第三方，需要在此设置关联方的租户id，若不设置则只通知资方	
        // 
        [NameInMap("related_notify")]
        [Validation(Required=false)]
        public List<string> RelatedNotify { get; set; }

    }

}
