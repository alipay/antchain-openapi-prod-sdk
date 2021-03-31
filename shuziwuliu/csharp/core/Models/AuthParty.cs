// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 签署方
    public class AuthParty : TeaModel {
        // 签署方名称
        [NameInMap("sign_party_name")]
        [Validation(Required=true)]
        public string SignPartyName { get; set; }

        // 签署方证件类型
        [NameInMap("sign_party_cert_type")]
        [Validation(Required=true)]
        public string SignPartyCertType { get; set; }

        // 签署方证件号码
        [NameInMap("sign_party_cert_num")]
        [Validation(Required=true)]
        public string SignPartyCertNum { get; set; }

        // 签署结果（必填，FINISH,FAIL,REFUSE三者选一，分别表示签署完成、失败和拒签）
        [NameInMap("sign_result")]
        [Validation(Required=true)]
        public string SignResult { get; set; }

        // 签署失败或拒签原因（失败或拒签时必填）
        [NameInMap("sign_fail_reason")]
        [Validation(Required=false)]
        public string SignFailReason { get; set; }

        // 签署时间(13位毫秒时间戳)
        [NameInMap("sign_time")]
        [Validation(Required=true)]
        public string SignTime { get; set; }

    }

}
