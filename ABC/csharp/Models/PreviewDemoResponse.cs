// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ABC.Models
{
    public class PreviewDemoResponse : TeaModel {
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

        // 字符串回参
        [NameInMap("output_string")]
        [Validation(Required=false)]
        public string OutputString { get; set; }

        // Long型回参
        [NameInMap("output_number")]
        [Validation(Required=false)]
        public long? OutputNumber { get; set; }

        // 布尔型回参
        [NameInMap("output_boolean")]
        [Validation(Required=false)]
        public bool? OutputBoolean { get; set; }

        // ISO8602格式字符串：yyyy-MM-dd_T_HH:mm:ss_Z_
        [NameInMap("output_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string OutputDate { get; set; }

        // 字符串数组
        [NameInMap("output_string_list")]
        [Validation(Required=false)]
        public List<string> OutputStringList { get; set; }

        // 结构体回参
        [NameInMap("output_struct")]
        [Validation(Required=false)]
        public AbcDemoStruct OutputStruct { get; set; }

        // 结构体列表回参
        [NameInMap("output_struct_list")]
        [Validation(Required=false)]
        public List<AbcDemoStruct> OutputStructList { get; set; }

    }

}
