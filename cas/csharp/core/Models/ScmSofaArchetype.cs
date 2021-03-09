// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // Sofa arche type
    public class ScmSofaArchetype : TeaModel {
        // 用户创建archetype必须要的参数
        [NameInMap("generate_code")]
        [Validation(Required=false)]
        public bool? GenerateCode { get; set; }

        // Maven代码框架使用 groupId
        [NameInMap("group_id")]
        [Validation(Required=false)]
        public string GroupId { get; set; }

        // Maven代码框架使用 artifactId
        [NameInMap("artifact_id")]
        [Validation(Required=true)]
        public string ArtifactId { get; set; }

        // Maven代码框架使用 codePackage
        [NameInMap("code_package")]
        [Validation(Required=false)]
        public string CodePackage { get; set; }

        // Sofa代码框架使用 projectType
        [NameInMap("project_type")]
        [Validation(Required=false)]
        public string ProjectType { get; set; }

        // Sofa代码框架使用 版本号
        [NameInMap("version")]
        [Validation(Required=true)]
        public string Version { get; set; }

        // Sofa代码框架使用 编码方式
        [NameInMap("encoding")]
        [Validation(Required=false)]
        public string Encoding { get; set; }

        // 是否使用私有maven
        [NameInMap("use_private_repo")]
        [Validation(Required=false)]
        public bool? UsePrivateRepo { get; set; }

        // 提供给快速研发平台使用，格式为JSON字符串
        [NameInMap("meta_data")]
        [Validation(Required=false)]
        public string MetaData { get; set; }

    }

}
