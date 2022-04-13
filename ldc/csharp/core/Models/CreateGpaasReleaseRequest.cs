// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class CreateGpaasReleaseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // aig
        [NameInMap("app_instance_group")]
        [Validation(Required=true)]
        public string AppInstanceGroup { get; set; }

        // 应用名字
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 发布批次分组
        [NameInMap("batches")]
        [Validation(Required=true)]
        public List<ReleaseBatchObj> Batches { get; set; }

        // 是否是第一次发布
        [NameInMap("is_first_release")]
        [Validation(Required=true)]
        public bool? IsFirstRelease { get; set; }

        // operator
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 发布单名字，或者说标题
        [NameInMap("release_name")]
        [Validation(Required=true)]
        public string ReleaseName { get; set; }

        // 发布版本信息，包括镜像等
        [NameInMap("release_version")]
        [Validation(Required=true)]
        public ReleaseVersion ReleaseVersion { get; set; }

        // 工作空间组
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

    }

}
