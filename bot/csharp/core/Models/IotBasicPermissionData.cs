// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // iot平台权限数据
    public class IotBasicPermissionData : TeaModel {
        // 权限编码
        [NameInMap("permission_code")]
        [Validation(Required=true)]
        public string PermissionCode { get; set; }

        // 权限名称
        [NameInMap("permission_name")]
        [Validation(Required=true)]
        public string PermissionName { get; set; }

        // 权限内容
        [NameInMap("permission_data")]
        [Validation(Required=true)]
        public string PermissionData { get; set; }

        // 权限类型
        [NameInMap("permission_type")]
        [Validation(Required=true)]
        public string PermissionType { get; set; }

        // 权限模块
        [NameInMap("module")]
        [Validation(Required=true)]
        public string Module { get; set; }

    }

}
