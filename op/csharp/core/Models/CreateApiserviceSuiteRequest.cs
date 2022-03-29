// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.OP.Models
{
    public class CreateApiserviceSuiteRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 默认为1.0.0
        [NameInMap("suite_version")]
        [Validation(Required=false)]
        public string SuiteVersion { get; set; }

        // 所属产品名
        [NameInMap("provider_name")]
        [Validation(Required=true)]
        public string ProviderName { get; set; }

        // 是否已经发布
        [NameInMap("released")]
        [Validation(Required=true)]
        public bool? Released { get; set; }

    }

}
