// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 用户
    public class User : TeaModel {
        // 用户ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>0000460699</para>
        /// </summary>
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 用户名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 登录名
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="mailto:xsh@digital-engine.com">xsh@digital-engine.com</a></para>
        /// </summary>
        [NameInMap("login_name")]
        [Validation(Required=true)]
        public string LoginName { get; set; }

    }

}
