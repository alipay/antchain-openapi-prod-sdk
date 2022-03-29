// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class ImportDmsBindingResponse : TeaModel {
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

        // 导入总数
        [NameInMap("total_count")]
        [Validation(Required=false)]
        public long? TotalCount { get; set; }

        // 导入成功总数
        [NameInMap("success_count")]
        [Validation(Required=false)]
        public long? SuccessCount { get; set; }

        // 格式化或者参数错误元素列表
        [NameInMap("format_error_records")]
        [Validation(Required=false)]
        public List<BindingDTO> FormatErrorRecords { get; set; }

        // 导入错误元素列表
        [NameInMap("process_error_records")]
        [Validation(Required=false)]
        public List<BindingDTO> ProcessErrorRecords { get; set; }

        // 已存在元素列表
        [NameInMap("exist_records")]
        [Validation(Required=false)]
        public List<BindingDTO> ExistRecords { get; set; }

    }

}
