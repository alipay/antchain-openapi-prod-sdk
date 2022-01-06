// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 服务同步状态信息
    public class ServiceSyncStatus : TeaModel {
        // 服务id
        [NameInMap("service_id")]
        [Validation(Required=true)]
        public string ServiceId { get; set; }

        // 服务所属的应用名
        [NameInMap("service_name")]
        [Validation(Required=true)]
        public string ServiceName { get; set; }

        // 当前同步状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 日期
        [NameInMap("date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string Date { get; set; }

    }

}
