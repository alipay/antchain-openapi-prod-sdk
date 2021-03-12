// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 可验证声明的完整内容以及状态，当前持有者的did等信息
    public class VcContent : TeaModel {
        // 可验证声明的唯一标识id，status 为 “1” 时候非空
        [NameInMap("vc_id")]
        [Validation(Required=true)]
        public string VcId { get; set; }

        // 可验证声明完整内容， status 为 “1” 时候非空
        [NameInMap("vc_content")]
        [Validation(Required=true)]
        public string VcContent_ { get; set; }

        // 可验证声明的颁发状态说明： -1：颁发失败，0：未授权 1：授权成功，此时vc_content字段会包含授权后的声明内容，其它状态码，待定义后增加。
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 被颁发当前可验证声明的目标did
        [NameInMap("did")]
        [Validation(Required=false)]
        public string Did { get; set; }

        // 如果status 是 “-1”，则说明当前可验证声明颁发失败，此字段说明失败原因。
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

    }

}
