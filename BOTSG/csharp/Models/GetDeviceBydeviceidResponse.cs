// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOTSG.Models
{
    public class GetDeviceBydeviceidResponse : TeaModel {
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

        // 	
        // 设备详情
        [NameInMap("device_list")]
        [Validation(Required=false)]
        public List<Device> DeviceList { get; set; }

        // 设备信息不存在的deviceId集合
        [NameInMap("miss_device_id_list")]
        [Validation(Required=false)]
        public List<string> MissDeviceIdList { get; set; }

        // 成功获取到设备信息的deviceid集合
        [NameInMap("success_device_id_list")]
        [Validation(Required=false)]
        public List<string> SuccessDeviceIdList { get; set; }

    }

}
