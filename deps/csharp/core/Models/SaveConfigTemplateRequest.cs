// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class SaveConfigTemplateRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 应用名称
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 描述
        [NameInMap("comment")]
        [Validation(Required=false)]
        public string Comment { get; set; }

        // 参数定义列表
        [NameInMap("params")]
        [Validation(Required=false)]
        public List<TemplateParamDef> Params { get; set; }

        // 参数模板 id
        [NameInMap("tpl_id")]
        [Validation(Required=false)]
        public string TplId { get; set; }

    }

}
