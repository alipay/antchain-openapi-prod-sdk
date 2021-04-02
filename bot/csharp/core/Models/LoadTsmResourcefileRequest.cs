// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class LoadTsmResourcefileRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // BOT
        [NameInMap("device_code")]
        [Validation(Required=true)]
        public string DeviceCode { get; set; }

        // H0
        [NameInMap("device_model")]
        [Validation(Required=true)]
        public string DeviceModel { get; set; }

        // SE
        [NameInMap("device_module")]
        [Validation(Required=true)]
        public string DeviceModule { get; set; }

        // version
        [NameInMap("file_version")]
        [Validation(Required=false)]
        public string FileVersion { get; set; }

    }

}
