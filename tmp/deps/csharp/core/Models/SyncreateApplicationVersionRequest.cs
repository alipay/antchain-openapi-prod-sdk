// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class SyncreateApplicationVersionRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 目标应用完整名称
        [NameInMap("application_name")]
        [Validation(Required=false)]
        public string ApplicationName { get; set; }

        // 应用部署包文件16字节md5值，以32位十六进制字符表示，不区分大小写。如果提供，将会以此md5值进行校验，检验不通过则认为创建失败
        //                                 
        [NameInMap("package_etag")]
        [Validation(Required=false)]
        public string PackageEtag { get; set; }

        // 应用发布包名称。长度不超过100个双字节字符
        [NameInMap("package_name")]
        [Validation(Required=false, MaxLength=100)]
        public string PackageName { get; set; }

        // 目标租户名称
        [NameInMap("tenant")]
        [Validation(Required=false)]
        public string Tenant { get; set; }

        // 应用发布包备注
        [NameInMap("version_memo")]
        [Validation(Required=false)]
        public string VersionMemo { get; set; }

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
