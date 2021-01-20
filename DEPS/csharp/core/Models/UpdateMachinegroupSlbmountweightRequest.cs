// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class UpdateMachinegroupSlbmountweightRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // from_aliyun
        [NameInMap("from_aliyun")]
        [Validation(Required=false)]
        public bool? FromAliyun { get; set; }

        // 分组 ID
        [NameInMap("machine_group_id")]
        [Validation(Required=false)]
        public string MachineGroupId { get; set; }

        // 挂载权重信息列表
        [NameInMap("slb_mount_info_list")]
        [Validation(Required=false)]
        public List<string> SlbMountInfoList { get; set; }

        // workspace
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
