// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_9705ae7650f74f47b1e8158151cc122f.Models
{
    public class CreateBlockchainBccrDciRegistrationcertRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 任务ID
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

        // 版权用户ID
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // DCI码
        [NameInMap("dci_code")]
        [Validation(Required=true)]
        public string DciCode { get; set; }

        // 登记号
        [NameInMap("reg_number")]
        [Validation(Required=true)]
        public string RegNumber { get; set; }

        // 二维码
        [NameInMap("qr_code_url")]
        [Validation(Required=true)]
        public string QrCodeUrl { get; set; }

        // 客户端token
        [NameInMap("client_token")]
        [Validation(Required=false)]
        public string ClientToken { get; set; }

    }

}
