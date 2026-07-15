// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 用户密钥信息
    public class UserBizKeyInfo : TeaModel {
        // 拥有该密钥的用户列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>CZKZJVCN</para>
        /// </summary>
        [NameInMap("granted_user")]
        [Validation(Required=true)]
        public List<string> GrantedUser { get; set; }

        // 密钥名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>subunion_a_key</para>
        /// </summary>
        [NameInMap("key_name")]
        [Validation(Required=true)]
        public string KeyName { get; set; }

    }

}
