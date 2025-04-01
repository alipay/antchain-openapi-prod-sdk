// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_ed7107878c564eda98e507d7451aae75.Models
{
    public class ListUniversalsaasDigitalhumanVoiceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户编码
        [NameInMap("tenant_code")]
        [Validation(Required=true)]
        public string TenantCode { get; set; }

        // common---内置音色
        // custom--我的音色
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 2d---2d音色
        // 3d---3d音色
        [NameInMap("classification")]
        [Validation(Required=true)]
        public string Classification { get; set; }

    }

}
