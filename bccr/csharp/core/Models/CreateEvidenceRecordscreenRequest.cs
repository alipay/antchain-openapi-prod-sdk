// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class CreateEvidenceRecordscreenRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 取证名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 取证用户id
        [NameInMap("evidence_user_id")]
        [Validation(Required=true)]
        public string EvidenceUserId { get; set; }

        // 取证公证处
        [NameInMap("notary_office")]
        [Validation(Required=true)]
        public string NotaryOffice { get; set; }

        // 取证网址信息
        [NameInMap("web_urls")]
        [Validation(Required=true)]
        public List<EvidenceWebUrlInfo> WebUrls { get; set; }

        // 取证三方账号信息
        [NameInMap("third_party_info")]
        [Validation(Required=true)]
        public EvidenceThirdPartyInfo ThirdPartyInfo { get; set; }

        // 取证服务器地域
        [NameInMap("area")]
        [Validation(Required=true)]
        public string Area { get; set; }

        // 最大录屏时间（单位：分钟）
        [NameInMap("max_time_in_min")]
        [Validation(Required=true)]
        public long? MaxTimeInMin { get; set; }

        // 服务器进入ready状态，指定时间未开始进入abort状态的等待时间，单位为分钟，默认1min，waitInMin不能小于1，不能大于10min
        [NameInMap("wait_in_min")]
        [Validation(Required=true)]
        public long? WaitInMin { get; set; }

        // 回调地址
        [NameInMap("callback_url")]
        [Validation(Required=true)]
        public string CallbackUrl { get; set; }

        // 幂等字段
        [NameInMap("client_token")]
        [Validation(Required=true)]
        public string ClientToken { get; set; }

    }

}
