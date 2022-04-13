// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 云原生技术栈版本
    public class NativeTechStackVersion : TeaModel {
        // 版本描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 用户扩展的自定义Dockerfile指令
        [NameInMap("extend_commands")]
        [Validation(Required=true)]
        public List<string> ExtendCommands { get; set; }

        // 版本扩展信息，e.g 公共环境变量
        [NameInMap("extend_properties")]
        [Validation(Required=true)]
        public string ExtendProperties { get; set; }

        // 基础镜像存放地址
        [NameInMap("from_image")]
        [Validation(Required=true)]
        public string FromImage { get; set; }

        // 唯一标识ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 可见范围：全局可见|租户内可见
        [NameInMap("scope")]
        [Validation(Required=true)]
        public string Scope { get; set; }

        // 所属技术栈
        [NameInMap("tech_stack")]
        [Validation(Required=true)]
        public string TechStack { get; set; }

        // 所属技术栈标识id
        [NameInMap("tech_stack_id")]
        [Validation(Required=true)]
        public string TechStackId { get; set; }

        // 技术栈版本
        [NameInMap("version")]
        [Validation(Required=true)]
        public string Version { get; set; }

        // 创建时间（UTC）
        [NameInMap("utc_created")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcCreated { get; set; }

        // 最近修改时间（UTC）
        [NameInMap("utc_modified")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcModified { get; set; }

    }

}
