// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // iot平台用户信息
    // 
    public class IotBasicUserInfo : TeaModel {
        // 租户ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>DWWS2D</para>
        /// </summary>
        [NameInMap("tenant")]
        [Validation(Required=true)]
        public string Tenant { get; set; }

        // 金融云用户Id
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>12321321</para>
        /// </summary>
        [NameInMap("cloud_user_id")]
        [Validation(Required=true)]
        public string CloudUserId { get; set; }

        // 金融云平台的登录名
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="mailto:xxx@alitest.com">xxx@alitest.com</a></para>
        /// </summary>
        [NameInMap("login_name")]
        [Validation(Required=true)]
        public string LoginName { get; set; }

        // 权限集合
        [NameInMap("permission_list")]
        [Validation(Required=true)]
        public List<IotBasicRolePermission> PermissionList { get; set; }

    }

}
