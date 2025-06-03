// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ABC.Models
{
    public class PreviewDemoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 字符串入参
        [NameInMap("input_string")]
        [Validation(Required=true, MaxLength=1000)]
        public string InputString { get; set; }

        // Long型入参
        [NameInMap("input_number")]
        [Validation(Required=false)]
        public long? InputNumber { get; set; }

        // 布尔型入参
        [NameInMap("input_boolean")]
        [Validation(Required=true)]
        public bool? InputBoolean { get; set; }

        // ISO8601格式字符串：yyyy-MM-dd_T_HH:mm:ss_Z_
        [NameInMap("input_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string InputDate { get; set; }

        // 字符串列表入参
        [NameInMap("input_string_list")]
        [Validation(Required=false)]
        public List<string> InputStringList { get; set; }

        // 示例结构体入参
        [NameInMap("input_struct")]
        [Validation(Required=true)]
        public AbcDemoStruct InputStruct { get; set; }

        // 结构体数组入参
        [NameInMap("input_struct_list")]
        [Validation(Required=true)]
        public List<AbcDemoStruct> InputStructList { get; set; }

        // 123
        /// <summary>
        /// 待上传文件
        /// </summary>
        [NameInMap("fileObject")]
        [Validation(Required=false)]
        public Stream FileObject { get; set; }

        /// <summary>
        /// 待上传文件名
        /// </summary>
        [NameInMap("fileObjectName")]
        [Validation(Required=false)]
        public string FileObjectName { get; set; }

        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

    }

}
