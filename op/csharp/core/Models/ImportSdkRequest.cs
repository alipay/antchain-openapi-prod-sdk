// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.OP.Models
{
    public class ImportSdkRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 产品码
        [NameInMap("prod_code")]
        [Validation(Required=true)]
        public string ProdCode { get; set; }

        // SDK语言
        [NameInMap("sdk_language")]
        [Validation(Required=true)]
        public string SdkLanguage { get; set; }

        // 版本
        [NameInMap("version_of_sdk")]
        [Validation(Required=true)]
        public string VersionOfSdk { get; set; }

        // 依赖详情
        [NameInMap("dependency_detail")]
        [Validation(Required=true)]
        public string DependencyDetail { get; set; }

    }

}
