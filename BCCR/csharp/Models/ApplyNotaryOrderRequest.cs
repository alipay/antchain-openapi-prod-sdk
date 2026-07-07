// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class ApplyNotaryOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 公证出证申请信息
        [NameInMap("notary_apply_info")]
        [Validation(Required=true)]
        public NotaryApplyInfo NotaryApplyInfo { get; set; }

        // 公证出证收件信息
        [NameInMap("notary_receive_info")]
        [Validation(Required=true)]
        public NotaryReceiveInfo NotaryReceiveInfo { get; set; }

        // 用户预览签署文件的时间
        [NameInMap("preview_time")]
        [Validation(Required=true)]
        public long? PreviewTime { get; set; }

        // 用户签署文件时间
        [NameInMap("agree_time")]
        [Validation(Required=true)]
        public long? AgreeTime { get; set; }

        // 客户端令牌
        [NameInMap("client_token")]
        [Validation(Required=false)]
        public string ClientToken { get; set; }

    }

}
