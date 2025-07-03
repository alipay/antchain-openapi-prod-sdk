// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // 用户基础信息
    public class UserProfile : TeaModel {
        // 用户ID
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 用户身份证号
        [NameInMap("id_number")]
        [Validation(Required=false)]
        public string IdNumber { get; set; }

        // 手机号
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

        // 年龄
        [NameInMap("age")]
        [Validation(Required=false)]
        public long? Age { get; set; }

        // 信用评分
        [NameInMap("credit_score")]
        [Validation(Required=false)]
        public long? CreditScore { get; set; }

    }

}
