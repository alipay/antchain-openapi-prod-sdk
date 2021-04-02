// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 更新设备和空间关联请求结构体
    public class UpdateDeviceSpaceReq : TeaModel {
        // API要更新的设备DID
        [NameInMap("device_did")]
        [Validation(Required=true)]
        public string DeviceDid { get; set; }

        // 0-全部更新 (暂不支持)
        // 1-添加  
        // 2-删除
        // 
        [NameInMap("update_mode")]
        [Validation(Required=true)]
        public long? UpdateMode { get; set; }

        // API要更新的设备部署库位
        [NameInMap("device_space")]
        [Validation(Required=true)]
        public List<string> DeviceSpace { get; set; }

    }

}
