// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateJusticeCasetemplateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 案件要素模板名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 模板业务类型名称
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 全流程存证模板ID列表，多个用“,”隔开
        [NameInMap("flow_templates")]
        [Validation(Required=true)]
        public string FlowTemplates { get; set; }

        // 模板文件下载地址
        [NameInMap("template_file_url")]
        [Validation(Required=true)]
        public string TemplateFileUrl { get; set; }

    }

}
