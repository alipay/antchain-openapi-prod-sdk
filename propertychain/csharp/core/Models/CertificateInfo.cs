// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 物权信息
    public class CertificateInfo : TeaModel {
        // 模板id
        [NameInMap("template_id")]
        [Validation(Required=true)]
        public string TemplateId { get; set; }

        // 字典模板定义的数据，key-value的json对象
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 自定义序列（不能重复）
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public long? BizId { get; set; }

    }

}
