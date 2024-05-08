// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class SubmitDciFeedbackRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务ID
        [NameInMap("service_id")]
        [Validation(Required=true)]
        public string ServiceId { get; set; }

        // 联系人
        [NameInMap("contact_name")]
        [Validation(Required=true)]
        public string ContactName { get; set; }

        // 联系电话
        [NameInMap("contact_phone_number")]
        [Validation(Required=true)]
        public string ContactPhoneNumber { get; set; }

        // 申诉原因
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

        // 幂等字段
        [NameInMap("client_token")]
        [Validation(Required=true)]
        public string ClientToken { get; set; }

        // 反馈类型
        [NameInMap("feedback_type")]
        [Validation(Required=true)]
        public string FeedbackType { get; set; }

        // 邮箱
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 代理信息
        [NameInMap("proxy_data")]
        [Validation(Required=false)]
        public ProxyData ProxyData { get; set; }

    }

}
