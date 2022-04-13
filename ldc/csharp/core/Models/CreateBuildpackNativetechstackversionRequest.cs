// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class CreateBuildpackNativetechstackversionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // ce4456_jdk8_tengine6
        [NameInMap("display_version")]
        [Validation(Required=true)]
        public string DisplayVersion { get; set; }

        // 版本描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 完整的镜像地址
        [NameInMap("from_image")]
        [Validation(Required=true)]
        public string FromImage { get; set; }

        // 所属技术栈大类
        [NameInMap("tech_stack")]
        [Validation(Required=true)]
        public string TechStack { get; set; }

        // 技术栈大类对应的id，如不填写，后台默认根据名称校验所属技术栈大类
        [NameInMap("tech_stack_id")]
        [Validation(Required=false)]
        public string TechStackId { get; set; }

        // 指定该版本可见范围：
        // PUBLIC - 全站点各个租户都可见；
        // TENANT - 仅创建改版本对应的租户内可见
        [NameInMap("scope")]
        [Validation(Required=true)]
        public string Scope { get; set; }

        // 扩展的Dockerfile指令。
        // 用于在FromImage的基础上扩展Dockerfile指令
        [NameInMap("ext_commands")]
        [Validation(Required=false)]
        public List<string> ExtCommands { get; set; }

        // 扩展属性 - 表现为Map<String,String>序列化后的字符串
        [NameInMap("extend_properties")]
        [Validation(Required=false)]
        public string ExtendProperties { get; set; }

    }

}
