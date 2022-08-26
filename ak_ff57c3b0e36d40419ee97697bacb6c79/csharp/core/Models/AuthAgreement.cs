// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_ff57c3b0e36d40419ee97697bacb6c79.Models
{
    // 授权协议
    public class AuthAgreement : TeaModel {
        // 授权协议code
        [NameInMap("auth_agreement_code")]
        [Validation(Required=true)]
        public string AuthAgreementCode { get; set; }

        // 授权协议类型：
        // TIME、时间授权
        // COUNT、次数授权
        // TIME_COUNT、时间范围内次数授权
        [NameInMap("auth_agreement_type")]
        [Validation(Required=true)]
        public string AuthAgreementType { get; set; }

        // 授权开始ishi见
        [NameInMap("auth_begin_time")]
        [Validation(Required=false)]
        public string AuthBeginTime { get; set; }

        // 授权截止日期
        // 
        // 
        [NameInMap("auth_end_time")]
        [Validation(Required=false)]
        public string AuthEndTime { get; set; }

        // 授权次数
        // 
        // 
        [NameInMap("auth_count")]
        [Validation(Required=false)]
        public long? AuthCount { get; set; }

        // 剩余授权次数
        [NameInMap("auth_balance_count")]
        [Validation(Required=false)]
        public long? AuthBalanceCount { get; set; }

    }

}
