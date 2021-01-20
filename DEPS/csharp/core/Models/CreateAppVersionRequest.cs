// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class CreateAppVersionRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 目标应用完整名称
        [NameInMap("application_name")]
        [Validation(Required=false)]
        public string ApplicationName { get; set; }

        // 应用部署包文件16字节md5值，以32位十六进制字符表示，不区分大小写。如果提供，APPMS下载应用部署包完成后，将会以此md5值进行校验，检验不通过则认为下载失败
        //                         
        [NameInMap("file_md5")]
        [Validation(Required=false)]
        public string FileMd5 { get; set; }

        // 应用部署包文件路径。长度不超过1024个单字节字符
        [NameInMap("file_path")]
        [Validation(Required=false, MaxLength=1024)]
        public string FilePath { get; set; }

        // 应用部署包文件大小，单位字节。取值范围[1,524288000]，即最大支持500M, 524288000 = 500 x 1024 x 1024
        //                         
        [NameInMap("file_size")]
        [Validation(Required=false)]
        public int? FileSize { get; set; }

        // 文件交换源id
        [NameInMap("file_source")]
        [Validation(Required=false)]
        public string FileSource { get; set; }

        // 目标租户名称
        [NameInMap("tenant")]
        [Validation(Required=false)]
        public string Tenant { get; set; }

        // 版本备注。长度不超过100个双字节字符
        [NameInMap("version_memo")]
        [Validation(Required=false, MaxLength=100)]
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
