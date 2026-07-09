// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 用户操作集合
    public class IotBasicUserRequest : TeaModel {
        // 租户ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>XRE2DAS</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 金融云用户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>12321321</para>
        /// </summary>
        [NameInMap("cloud_user_id")]
        [Validation(Required=false)]
        public string CloudUserId { get; set; }

        // 登录名
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="mailto:test@alibaba-inc.com">test@alibaba-inc.com</a></para>
        /// </summary>
        [NameInMap("login_name")]
        [Validation(Required=false)]
        public string LoginName { get; set; }

    }

}
