// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云联盟成员信息
    public class ALiYunMember : TeaModel {
        // 加入时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>11231231231</para>
        /// </summary>
        [NameInMap("join_time")]
        [Validation(Required=false)]
        public long? JoinTime { get; set; }

        // 成员id
        /// <summary>
        /// <b>Example:</b>
        /// <para>成员id</para>
        /// </summary>
        [NameInMap("member_id")]
        [Validation(Required=false)]
        public string MemberId { get; set; }

        // 成员名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>成员名称</para>
        /// </summary>
        [NameInMap("member_name")]
        [Validation(Required=false)]
        public string MemberName { get; set; }

        // 角色
        /// <summary>
        /// <b>Example:</b>
        /// <para>角色</para>
        /// </summary>
        [NameInMap("role")]
        [Validation(Required=false)]
        public string Role { get; set; }

        // 状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>状态</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
