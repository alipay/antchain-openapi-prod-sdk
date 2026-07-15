// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 用户身份、账户及手机号信息
    public class UserInfoParam : TeaModel {
        // 用户手机号信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>13222222222</para>
        /// </summary>
        [NameInMap("phone")]
        [Validation(Required=true)]
        public string Phone { get; set; }

        // 用户账号信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>13222222222</para>
        /// </summary>
        [NameInMap("user_account")]
        [Validation(Required=true)]
        public string UserAccount { get; set; }

        // 用户名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>wangerxiao</para>
        /// </summary>
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

    }

}
