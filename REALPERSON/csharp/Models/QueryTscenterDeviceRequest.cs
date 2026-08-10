// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class QueryTscenterDeviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备token
        [NameInMap("apdid_token")]
        [Validation(Required=false)]
        public string ApdidToken { get; set; }

        // appname
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // app key client
        [NameInMap("app_key_client")]
        [Validation(Required=false)]
        public string AppKeyClient { get; set; }

        // app key server
        [NameInMap("app_key_server")]
        [Validation(Required=false)]
        public string AppKeyServer { get; set; }

    }

}
