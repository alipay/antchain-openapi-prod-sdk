// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateLeaseAuditRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 融资租赁业务id，由资方控制台创建返回
        [NameInMap("application_id")]
        [Validation(Required=false)]
        public string ApplicationId { get; set; }

        // 是否启动订单的异步处理
        [NameInMap("async")]
        [Validation(Required=false)]
        public long? Async { get; set; }

        // 融资机构审核批次
        // 
        [NameInMap("batch_index")]
        [Validation(Required=false)]
        public string BatchIndex { get; set; }

        // 当前订单处于本批次中的index
        [NameInMap("current_audit_index")]
        [Validation(Required=false)]
        public long? CurrentAuditIndex { get; set; }

        // 融资租赁额外字段
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // 租赁服务平台ID 长度不可超过50
        [NameInMap("lease_id")]
        [Validation(Required=true)]
        public string LeaseId { get; set; }

        // 融资机构审核状态，0.审核中1.审核失败2.审核成功
        [NameInMap("manual_audit")]
        [Validation(Required=true)]
        public long? ManualAudit { get; set; }

        // 融资结构审核说明，非必填，审核失败必填失败原因
        [NameInMap("manual_audit_comments")]
        [Validation(Required=false)]
        public string ManualAuditComments { get; set; }

        // 订单id 长度不可超过50
        // 
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 总审核的个数
        [NameInMap("total_audit_number")]
        [Validation(Required=false)]
        public long? TotalAuditNumber { get; set; }

        // 额外通知第三方，如果需要通知相关方外的第三方，需要在此设置关联方的租户id，若不设置则只通知资方	
        // 
        [NameInMap("related_notify")]
        [Validation(Required=false)]
        public List<string> RelatedNotify { get; set; }

    }

}
