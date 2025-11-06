// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    // 合同签署模板和渲染参数
    public class TemplateArgs : TeaModel {
        // 模板id
        [NameInMap("template_id")]
        [Validation(Required=true)]
        public string TemplateId { get; set; }

        // 模板版本
        [NameInMap("template_version")]
        [Validation(Required=false)]
        public string TemplateVersion { get; set; }

        // 模板参数，JSON格式，其中key对应模板中的名称，value对应其要渲染的值
        [NameInMap("template_args")]
        [Validation(Required=false)]
        public string TemplateArgs_ { get; set; }

    }

}
