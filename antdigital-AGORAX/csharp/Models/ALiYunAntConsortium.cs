// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云联盟信息
    public class ALiYunAntConsortium : TeaModel {
        // 链的数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>2</para>
        /// </summary>
        [NameInMap("chain_num")]
        [Validation(Required=false)]
        public long? ChainNum { get; set; }

        // 成员数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>5</para>
        /// </summary>
        [NameInMap("member_num")]
        [Validation(Required=false)]
        public long? MemberNum { get; set; }

        // 时间戳
        /// <summary>
        /// <b>Example:</b>
        /// <para>时间戳</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // 角色
        /// <summary>
        /// <b>Example:</b>
        /// <para>角色</para>
        /// </summary>
        [NameInMap("role")]
        [Validation(Required=false)]
        public string Role { get; set; }

        // 联盟id
        /// <summary>
        /// <b>Example:</b>
        /// <para>联盟id</para>
        /// </summary>
        [NameInMap("consortium_id")]
        [Validation(Required=false)]
        public string ConsortiumId { get; set; }

        // 状态值
        /// <summary>
        /// <b>Example:</b>
        /// <para>状态值</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 联盟名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>联盟名称</para>
        /// </summary>
        [NameInMap("consortium_name")]
        [Validation(Required=false)]
        public string ConsortiumName { get; set; }

        // 联盟描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>联盟描述</para>
        /// </summary>
        [NameInMap("consortium_description")]
        [Validation(Required=false)]
        public string ConsortiumDescription { get; set; }

        // 是否为空联盟
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("is_empty_consortium")]
        [Validation(Required=false)]
        public bool? IsEmptyConsortium { get; set; }

    }

}
