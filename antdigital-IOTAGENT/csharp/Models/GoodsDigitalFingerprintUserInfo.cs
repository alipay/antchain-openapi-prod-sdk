// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 商品数字指纹注册用户信息
    public class GoodsDigitalFingerprintUserInfo : TeaModel {
        // 平台注册用户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>12207</para>
        /// </summary>
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 用户角色
        /// <summary>
        /// <b>Example:</b>
        /// <para>渠道商/平台</para>
        /// </summary>
        [NameInMap("user_role")]
        [Validation(Required=true)]
        public string UserRole { get; set; }

        // 用户登录id来源
        /// <summary>
        /// <b>Example:</b>
        /// <para>用户登录id来源</para>
        /// </summary>
        [NameInMap("channel")]
        [Validation(Required=true)]
        public string Channel { get; set; }

        // 作为平台使用方，提供对应的渠道用户id列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>[&quot;1001&quot;,&quot;1002&quot;]</para>
        /// </summary>
        [NameInMap("relation_user_id_list")]
        [Validation(Required=false)]
        public List<string> RelationUserIdList { get; set; }

    }

}
