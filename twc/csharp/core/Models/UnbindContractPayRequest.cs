// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class UnbindContractPayRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户id，平台方用户创建时生成的id。用户解约失败时该字段会通过解约申请消息透传给商家。
        [NameInMap("user_tuid")]
        [Validation(Required=true)]
        public string UserTuid { get; set; }

        // 外部代扣协议号，用户解约失败时该字段会通过解约申请消息透传给商家。
        [NameInMap("external_agreement_no")]
        [Validation(Required=true)]
        public string ExternalAgreementNo { get; set; }

        // 是否允许解约
        [NameInMap("allow_unsign")]
        [Validation(Required=true)]
        public bool? AllowUnsign { get; set; }

    }

}
