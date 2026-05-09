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
        /// <summary>
        /// <b>Example:</b>
        /// <para>1234567890</para>
        /// </summary>
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 用户身份证号
        /// <summary>
        /// <b>Example:</b>
        /// <para>110101199003072516</para>
        /// </summary>
        [NameInMap("id_number")]
        [Validation(Required=false)]
        public string IdNumber { get; set; }

        // 手机号
        /// <summary>
        /// <b>Example:</b>
        /// <para>13800138000</para>
        /// </summary>
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

        // 年龄
        /// <summary>
        /// <b>Example:</b>
        /// <para>32</para>
        /// </summary>
        [NameInMap("age")]
        [Validation(Required=false)]
        public long? Age { get; set; }

        // 信用评分
        /// <summary>
        /// <b>Example:</b>
        /// <para>720</para>
        /// </summary>
        [NameInMap("credit_score")]
        [Validation(Required=false)]
        public long? CreditScore { get; set; }

    }

}
