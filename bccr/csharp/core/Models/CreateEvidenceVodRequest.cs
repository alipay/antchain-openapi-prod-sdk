// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class CreateEvidenceVodRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 取证用户id
        [NameInMap("evidence_user_id")]
        [Validation(Required=true)]
        public string EvidenceUserId { get; set; }

        // 公证处code
        [NameInMap("notary_office")]
        [Validation(Required=true)]
        public string NotaryOffice { get; set; }

        // 取证类型（通用点播取证：DEFAULT，快手点播取证：KUAISHOU）
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 待取证点播网站网址
        [NameInMap("web_url")]
        [Validation(Required=true)]
        public EvidenceWebUrlInfo WebUrl { get; set; }

        // 幂等字段
        [NameInMap("client_token")]
        [Validation(Required=true)]
        public string ClientToken { get; set; }

        // 取证平台
        [NameInMap("obtain_platform")]
        [Validation(Required=true)]
        public long? ObtainPlatform { get; set; }

    }

}
