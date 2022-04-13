// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class GetClusterBasicinfoResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // cell infos
        [NameInMap("cell_infos")]
        [Validation(Required=false)]
        public List<CellInfo> CellInfos { get; set; }

        // created time
        [NameInMap("created_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreatedTime { get; set; }

        // cluster display name
        [NameInMap("display_name")]
        [Validation(Required=false)]
        public string DisplayName { get; set; }

        // network info
        [NameInMap("network_info")]
        [Validation(Required=false)]
        public NetworkInfo NetworkInfo { get; set; }

        // region info
        [NameInMap("region_info")]
        [Validation(Required=false)]
        public RegionInfo RegionInfo { get; set; }

        // secured group infos
        [NameInMap("secured_group_infos")]
        [Validation(Required=false)]
        public List<SecuredGroupInfo> SecuredGroupInfos { get; set; }

        // cluster status
        // 
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // zone info
        [NameInMap("zone_info")]
        [Validation(Required=false)]
        public ZoneInfo ZoneInfo { get; set; }

    }

}
