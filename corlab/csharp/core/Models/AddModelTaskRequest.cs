// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CORLAB.Models
{
    public class AddModelTaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 客户号
        [NameInMap("customer_id")]
        [Validation(Required=true)]
        public string CustomerId { get; set; }

        // 回执单号
        [NameInMap("receipt_no")]
        [Validation(Required=true)]
        public string ReceiptNo { get; set; }

        // 模型名称
        [NameInMap("model_name")]
        [Validation(Required=true)]
        public string ModelName { get; set; }

        // 模型文件的路径
        [NameInMap("model_file_oss_path")]
        [Validation(Required=true)]
        public string ModelFileOssPath { get; set; }

        // 验证文件的oss路径	
        [NameInMap("validate_file_oss_path")]
        [Validation(Required=true)]
        public string ValidateFileOssPath { get; set; }

        // 模型输出参数名称
        [NameInMap("model_output_lable_name")]
        [Validation(Required=true)]
        public string ModelOutputLableName { get; set; }

        // 验证文件的输出列名
        [NameInMap("csv_output_lable_name")]
        [Validation(Required=true)]
        public string CsvOutputLableName { get; set; }

        // 验签字段
        [NameInMap("sign_info")]
        [Validation(Required=true)]
        public string SignInfo { get; set; }

    }

}
