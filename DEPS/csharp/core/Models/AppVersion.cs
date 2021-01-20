// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 应用版本构建和发布包信息
    public class AppVersion : TeaModel {
        // 所属应用id `内部id对用户无用，不应返回，应使用应用名称`
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // 从源代码构建时标识代码分支，上传新版本时为空 `混淆了应用版本和编译任务；目前没必要返回`
        [NameInMap("branch")]
        [Validation(Required=false)]
        public string Branch { get; set; }

        // 应用发布包构建类型:**scm**(源代码构建)，**upload_file**(发布包上传包括本地上传和从某个文件交换源上传) `混淆了应用版本和编译任务；目前没必要返回`
        //                 
        [NameInMap("build_type")]
        [Validation(Required=false)]
        public string BuildType { get; set; }

        // 从源代码构建时标识代码版本，上传新版本时为空 `混淆了应用版本和编译任务；目前没必要返回`
        [NameInMap("code_version")]
        [Validation(Required=false)]
        public string CodeVersion { get; set; }

        // 版本描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 新版本构建的错误码，成功则为空 `混淆了应用版本和编译任务`
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

        // 新版本构建的错误提示信息，成功则为空 `混淆了应用版本和编译任务`
        [NameInMap("error_msg")]
        [Validation(Required=false)]
        public string ErrorMsg { get; set; }

        // 构建成功后标识应用发布包的md5
        [NameInMap("etag")]
        [Validation(Required=false)]
        public string Etag { get; set; }

        // 应用版本id `内部id对用户无用，不应返回`
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 应用构建状态:**doing**(进行中),**success**(成功),**failed**(失败)
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 本次应用发布包构建后台任务的id `混淆了应用版本和构建任务，应使用2个不同的模型`
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

        // 创建时间 `命名建议为create_time`
        [NameInMap("utc_create")]
        [Validation(Required=false)]
        public string UtcCreate { get; set; }

        // 应用版本号
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

        // 所属工作空间 `内部id对用户无用，不应返回，应使用workspace unique名称`
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

    }

}
