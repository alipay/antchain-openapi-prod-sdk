// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class CreateDciRegistrationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // DC456
        [NameInMap("dci_content_id")]
        [Validation(Required=true)]
        public string DciContentId { get; set; }

        // 作品创作申明
        [NameInMap("creation_statement")]
        [Validation(Required=true)]
        public string CreationStatement { get; set; }

        // 补充授权文件
        [NameInMap("ancillary_evidence_path_list")]
        [Validation(Required=false)]
        public List<string> AncillaryEvidencePathList { get; set; }

        // 客户端令牌
        [NameInMap("client_token")]
        [Validation(Required=false)]
        public string ClientToken { get; set; }

    }

}
