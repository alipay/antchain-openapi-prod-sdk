// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class CreateApplicationRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 应用别称。最大60个UTF-8字符
        [NameInMap("alias")]
        [Validation(Required=false)]
        public string Alias { get; set; }

        // 创建的应用名称。最大60个UTF-8字符
        [NameInMap("application_name")]
        [Validation(Required=false)]
        public string ApplicationName { get; set; }

        // 技术栈架构版本，默认使用BUILDPACK_V1，取值列表：BUILDPACK_V1、BUILDPACK_V2
        [NameInMap("buildpack_arch")]
        [Validation(Required=false)]
        public string BuildpackArch { get; set; }

        // 应用使用的技术栈名称
        [NameInMap("buildpack_name")]
        [Validation(Required=false)]
        public string BuildpackName { get; set; }

        // 应用使用的技术栈版本
        [NameInMap("buildpack_version")]
        [Validation(Required=false)]
        public string BuildpackVersion { get; set; }

        // 应用描述。最大200个UTF-8字符
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 应用负责人登录名
        [NameInMap("owner_login_name")]
        [Validation(Required=false)]
        public string OwnerLoginName { get; set; }

        // 应用发布类型，默认不填入表示包发布，支持 mixed,image,workload
        [NameInMap("deploy_type")]
        [Validation(Required=false)]
        public string DeployType { get; set; }

        // 是否允许公网访问
        [NameInMap("default_route")]
        [Validation(Required=false)]
        public bool? DefaultRoute { get; set; }

    }

}
