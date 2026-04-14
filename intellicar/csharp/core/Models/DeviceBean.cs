// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 设备信息
    public class DeviceBean : TeaModel {
        // 选填其中一个：imeiMd5、macMd5、adid、adidMd5、did、idfa、idfaMd5、caid、caidMd5、oaid、oaidMd5、aaid、aaidMd5、gtcid、mb、pnSha256、cid、gid
        [NameInMap("device_id_type")]
        [Validation(Required=true)]
        public string DeviceIdType { get; set; }

        // 设备ID列表（最多200个，不要重复）
        [NameInMap("device_id_list")]
        [Validation(Required=true)]
        public List<string> DeviceIdList { get; set; }

    }

}
