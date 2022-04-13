// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class DetailAppMetainfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间组的label：SIT, DEV, ...
        [NameInMap("workspace_group_label")]
        [Validation(Required=false)]
        public string WorkspaceGroupLabel { get; set; }

        // 应用名字
        // app:appService在此场景下为1:1，否则会报错
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

    }

}
