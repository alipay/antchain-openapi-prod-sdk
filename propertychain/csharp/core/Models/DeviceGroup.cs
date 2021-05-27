// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 设备组
    public class DeviceGroup : TeaModel {
        // 设备组id
        [NameInMap("group_id")]
        [Validation(Required=false)]
        public string GroupId { get; set; }

        // 设备组名称
        [NameInMap("group_name")]
        [Validation(Required=false)]
        public string GroupName { get; set; }

        // 设备id
        [NameInMap("things_did_list")]
        [Validation(Required=false)]
        public List<string> ThingsDidList { get; set; }

        // 设备其他信息
        [NameInMap("things_info_list")]
        [Validation(Required=false)]
        public List<DeviceInfoNoGroup> ThingsInfoList { get; set; }

    }

}
