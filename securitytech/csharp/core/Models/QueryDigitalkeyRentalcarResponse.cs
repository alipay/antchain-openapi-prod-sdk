// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class QueryDigitalkeyRentalcarResponse : TeaModel {
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

        // 车架号
        [NameInMap("frame_no")]
        [Validation(Required=false)]
        public string FrameNo { get; set; }

        // 中控编号
        [NameInMap("tuid")]
        [Validation(Required=false)]
        public string Tuid { get; set; }

        // 在线状态：online/offline
        [NameInMap("online_status")]
        [Validation(Required=false)]
        public string OnlineStatus { get; set; }

        // 经度（WGS84）
        [NameInMap("longitude")]
        [Validation(Required=false)]
        public string Longitude { get; set; }

        // 纬度（WGS84）
        [NameInMap("latitude")]
        [Validation(Required=false)]
        public string Latitude { get; set; }

        // 启动状态（0-断电; 1-上电）
        [NameInMap("running_status")]
        [Validation(Required=false)]
        public string RunningStatus { get; set; }

    }

}
