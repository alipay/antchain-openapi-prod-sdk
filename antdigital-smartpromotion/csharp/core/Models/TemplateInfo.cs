// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SMARTPROMOTION.Models
{
    // 模板详情
    public class TemplateInfo : TeaModel {
        // 模板id
        [NameInMap("template_id")]
        [Validation(Required=true)]
        public string TemplateId { get; set; }

        // 模板版本，不传取最新模板
        [NameInMap("template_version")]
        [Validation(Required=false)]
        public long? TemplateVersion { get; set; }

        // 模板参数，JSON格式，其中key对应模板中的名称，value对应其要渲染的值
        [NameInMap("template_args")]
        [Validation(Required=false)]
        public string TemplateArgs { get; set; }

        // 模板所属商户id
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

    }

}
