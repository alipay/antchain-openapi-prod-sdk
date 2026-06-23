// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 计量域成员信息
    public class MeterDomainMember : TeaModel {
        // 角色
        /// <summary>
        /// <b>Example:</b>
        /// <para>develooper</para>
        /// </summary>
        [NameInMap("role")]
        [Validation(Required=false)]
        public string Role { get; set; }

        // 成员id
        /// <summary>
        /// <b>Example:</b>
        /// <para>workNo</para>
        /// </summary>
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 成员昵称
        /// <summary>
        /// <b>Example:</b>
        /// <para>成员昵称</para>
        /// </summary>
        [NameInMap("nick_name")]
        [Validation(Required=false)]
        public string NickName { get; set; }

        // 成员姓名
        /// <summary>
        /// <b>Example:</b>
        /// <para>成员姓名</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

    }

}
