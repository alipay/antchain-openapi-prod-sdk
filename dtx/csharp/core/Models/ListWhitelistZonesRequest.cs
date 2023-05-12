// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    public class ListWhitelistZonesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // aaaaa
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // app
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // ds
        [NameInMap("ds_name")]
        [Validation(Required=true)]
        public string DsName { get; set; }

    }

}
