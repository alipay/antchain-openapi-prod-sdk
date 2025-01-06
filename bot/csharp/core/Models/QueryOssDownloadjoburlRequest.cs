// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryOssDownloadjoburlRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 获取文件类型：DEVICE_INFO（设备信息）、DEVICE_DATA（状态数据）
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 文件所属日期，yyyymmdd
        [NameInMap("date")]
        [Validation(Required=true)]
        public string Date { get; set; }

        // 请求状态数据是，若导出周期为小时级，则必填；文件所属小时
        [NameInMap("hour")]
        [Validation(Required=false)]
        public string Hour { get; set; }

    }

}
