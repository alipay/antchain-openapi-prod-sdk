// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class CreateEvidenceLiveRequest : TeaModel {
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

        // 取证公证处
        [NameInMap("notary_office")]
        [Validation(Required=true)]
        public string NotaryOffice { get; set; }

        // 取证类型（通用直播取证：DEFAULT）
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 取证网址信息
        [NameInMap("web_url")]
        [Validation(Required=true)]
        public EvidenceWebUrlInfo WebUrl { get; set; }

        // 幂等字段
        [NameInMap("client_token")]
        [Validation(Required=true)]
        public string ClientToken { get; set; }

        // 主播 ID
        [NameInMap("profile_id")]
        [Validation(Required=false)]
        public string ProfileId { get; set; }

        // 预定时间：分钟，建议传值范围5-20分钟
        [NameInMap("expected_duration")]
        [Validation(Required=false)]
        public long? ExpectedDuration { get; set; }

    }

}
