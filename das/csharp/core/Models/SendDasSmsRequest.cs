// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    public class SendDasSmsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 接收方电话号码
        [NameInMap("receive_phone_num")]
        [Validation(Required=true)]
        public long? ReceivePhoneNum { get; set; }

        // 授权实例ID
        [NameInMap("auth_instance_id")]
        [Validation(Required=true)]
        public string AuthInstanceId { get; set; }

    }

}
