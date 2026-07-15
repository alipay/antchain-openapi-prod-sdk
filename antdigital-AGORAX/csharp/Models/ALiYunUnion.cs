// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云联盟返回结果
    public class ALiYunUnion : TeaModel {
        // 联盟内链的集合
        /// <summary>
        /// <b>Example:</b>
        /// <para>联盟内链的集合</para>
        /// </summary>
        [NameInMap("ant_chains")]
        [Validation(Required=false)]
        public List<ALiYunAntChain> AntChains { get; set; }

        // 联盟信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>联盟信息</para>
        /// </summary>
        [NameInMap("ant_consortiums")]
        [Validation(Required=false)]
        public List<ALiYunAntConsortium> AntConsortiums { get; set; }

        // 联盟Id
        /// <summary>
        /// <b>Example:</b>
        /// <para>联盟Id</para>
        /// </summary>
        [NameInMap("consortium_id")]
        [Validation(Required=false)]
        public string ConsortiumId { get; set; }

        // 联盟成员信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>联盟成员信息</para>
        /// </summary>
        [NameInMap("members")]
        [Validation(Required=false)]
        public List<ALiYunMember> Members { get; set; }

        // 阿里云分页属性
        /// <summary>
        /// <b>Example:</b>
        /// <para>阿里云分页属性</para>
        /// </summary>
        [NameInMap("pagination")]
        [Validation(Required=false)]
        public ALiYunPagination Pagination { get; set; }

        // is_exist
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("is_exist")]
        [Validation(Required=false)]
        public bool? IsExist { get; set; }

    }

}
