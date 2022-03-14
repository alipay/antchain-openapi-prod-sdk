// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryIotbasicDeviceResponse : TeaModel {
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

        // 当前页号。
        // 
        // 
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // 总页数
        [NameInMap("page_count")]
        [Validation(Required=false)]
        public long? PageCount { get; set; }

        // 每页显示条数
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 总记录数
        [NameInMap("total")]
        [Validation(Required=false)]
        public long? Total { get; set; }

        // 设备列表
        [NameInMap("device_list")]
        [Validation(Required=false)]
        public List<IotBasicDeviceQueryResponse> DeviceList { get; set; }

    }

}
