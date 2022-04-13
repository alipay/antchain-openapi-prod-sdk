// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class UpdateBuildpackNativetechstackversionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 技术栈类别
        [NameInMap("tech_stack")]
        [Validation(Required=true)]
        public string TechStack { get; set; }

        // 云原生技术栈版本名称
        [NameInMap("tech_stack_version")]
        [Validation(Required=true)]
        public string TechStackVersion { get; set; }

        // 基础镜像名称
        [NameInMap("from_image")]
        [Validation(Required=true)]
        public string FromImage { get; set; }

        // 版本描述信息
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 扩展指令列表
        [NameInMap("ext_commands")]
        [Validation(Required=false)]
        public List<string> ExtCommands { get; set; }

        // 扩展属性 - 表现为Map<String,String>序列化后的字符串
        [NameInMap("extend_properties")]
        [Validation(Required=false)]
        public string ExtendProperties { get; set; }

    }

}
