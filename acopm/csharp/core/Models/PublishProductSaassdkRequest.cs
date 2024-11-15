// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACOPM.Models
{
    public class PublishProductSaassdkRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 要发布的共享能力名称
        [NameInMap("saas_code")]
        [Validation(Required=true)]
        public string SaasCode { get; set; }

        // 本次打包的版本
        [NameInMap("saassdk_version")]
        [Validation(Required=true)]
        public string SaassdkVersion { get; set; }

        // 是否发布
        [NameInMap("publish")]
        [Validation(Required=true)]
        public bool? Publish { get; set; }

    }

}
