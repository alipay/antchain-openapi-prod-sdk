// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_e94e2404d4b449ba90e0886673004f6b.Models
{
    public class QueryAntcloudTapchainprodDataproducttemplateApiRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 接口模板编码，用于标识接口参数模板
        [NameInMap("template_id")]
        [Validation(Required=true)]
        public string TemplateId { get; set; }

        // 请求参数，json参数，根据不同模板入参数定义。
        [NameInMap("biz_content")]
        [Validation(Required=true)]
        public string BizContent { get; set; }

    }

}
