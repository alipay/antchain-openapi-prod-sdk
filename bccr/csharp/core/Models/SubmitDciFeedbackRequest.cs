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

        // 作品名称
        [NameInMap("work_name")]
        [Validation(Required=true)]
        public string WorkName { get; set; }

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

    }

}
