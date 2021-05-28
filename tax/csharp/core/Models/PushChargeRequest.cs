// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class PushChargeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户
        [NameInMap("biz_tenant")]
        [Validation(Required=true)]
        public string BizTenant { get; set; }

        // 平台分发,子业务类型，对应原来的authType.
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 用户ID，根据业务对主体定义决定，比如票据业务的纳税人识别号
        [NameInMap("customer_id")]
        [Validation(Required=true)]
        public string CustomerId { get; set; }

        // 系统编码,平台分发，定义枚举，全局用
        [NameInMap("system_code")]
        [Validation(Required=true)]
        public string SystemCode { get; set; }

        // 请求id
        [NameInMap("task_request_id")]
        [Validation(Required=true)]
        public string TaskRequestId { get; set; }

    }

}
