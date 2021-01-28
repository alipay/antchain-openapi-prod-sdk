// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class AddContractFileRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 文件名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 模板编号
        [NameInMap("template_id")]
        [Validation(Required=true)]
        public string TemplateId { get; set; }

        // 输入项填充内容，以key:value传入
        [NameInMap("simple_form_fields")]
        [Validation(Required=true)]
        public string SimpleFormFields { get; set; }

    }

}
