// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ExecElectrocarOtataskconfirmResponse : TeaModel {
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

        // 确认操作是否成功
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        // BLE 固件下载地址；4G 通道确认时为空
        [NameInMap("firmware_url")]
        [Validation(Required=false)]
        public string FirmwareUrl { get; set; }

        // BLE 固件文件大小，单位 B
        [NameInMap("firmware_size")]
        [Validation(Required=false)]
        public long? FirmwareSize { get; set; }

        // BLE 固件 MD5
        [NameInMap("firmware_md5")]
        [Validation(Required=false)]
        public string FirmwareMd5 { get; set; }

        // 本次任务目标版本号
        [NameInMap("dest_version")]
        [Validation(Required=false)]
        public string DestVersion { get; set; }

        // BLE 固件分包数据，按端侧传输协议编码后的字符串列表
        [NameInMap("firmware_data")]
        [Validation(Required=false)]
        public List<string> FirmwareData { get; set; }

    }

}
