// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DONPA.Models
{
    public class BindMyslxfRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 批次ID
        [NameInMap("batch_id")]
        [Validation(Required=true)]
        public string BatchId { get; set; }

        // 身份证号码
        [NameInMap("id_card")]
        [Validation(Required=true)]
        public string IdCard { get; set; }

        // 绑定哪个手机号码，需要提供修复结果的序号，从1开始。
        [NameInMap("seq")]
        [Validation(Required=true)]
        public long? Seq { get; set; }

        // 呼叫号码。必须预先注册
        [NameInMap("call_number")]
        [Validation(Required=true)]
        public string CallNumber { get; set; }

        // 外显号码，必须预先平台注册
        [NameInMap("display_number")]
        [Validation(Required=true)]
        public string DisplayNumber { get; set; }

    }

}
