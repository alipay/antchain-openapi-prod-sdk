// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // iot平台权限数据
    public class IotBasicPermissionData : TeaModel {
        // 权限编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>ADD_DEVICE</para>
        /// </summary>
        [NameInMap("permission_code")]
        [Validation(Required=true)]
        public string PermissionCode { get; set; }

        // 权限名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>注册设备</para>
        /// </summary>
        [NameInMap("permission_name")]
        [Validation(Required=true)]
        public string PermissionName { get; set; }

        // 权限内容
        /// <summary>
        /// <b>Example:</b>
        /// <para>权限内容</para>
        /// </summary>
        [NameInMap("permission_data")]
        [Validation(Required=true)]
        public string PermissionData { get; set; }

        // 权限类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>权限类型</para>
        /// </summary>
        [NameInMap("permission_type")]
        [Validation(Required=true)]
        public string PermissionType { get; set; }

        // 权限模块
        /// <summary>
        /// <b>Example:</b>
        /// <para>权限模块</para>
        /// </summary>
        [NameInMap("module")]
        [Validation(Required=true)]
        public string Module { get; set; }

    }

}
