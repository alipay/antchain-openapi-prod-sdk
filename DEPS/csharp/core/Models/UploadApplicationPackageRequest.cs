// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class UploadApplicationPackageRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 目标应用完整名称
        [NameInMap("application_name")]
        [Validation(Required=false)]
        public string ApplicationName { get; set; }

        // 应用发布包名称。长度不超过100个双字节字符
        [NameInMap("package_name")]
        [Validation(Required=false, MaxLength=100)]
        public string PackageName { get; set; }

        // 目标租户名称
        [NameInMap("tenant")]
        [Validation(Required=false)]
        public string Tenant { get; set; }

        // 版本号。长度不超过50个单字节字符
        [NameInMap("version_no")]
        [Validation(Required=false, MaxLength=50)]
        public string VersionNo { get; set; }

        // 目标工作空间名称
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
