// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENT.Models
{
    public class GetUserSharecodeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 分享者账号，如果账号类型为手机号则格式如 +86-11 位手机号，如果账号类型为支付宝账号，则填写邮箱地址或者 11 位手机号
        [NameInMap("sharer_id")]
        [Validation(Required=true)]
        public string SharerId { get; set; }

        // 分享者账号类型，PHONE：手机号，ALIPAY_LOGON_ID：支付宝账号
        [NameInMap("sharer_id_type")]
        [Validation(Required=true)]
        public string SharerIdType { get; set; }

    }

}
