// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COLLABINV.Models
{
    public class SubmitModelInstanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户编码
        [NameInMap("tenant_code")]
        [Validation(Required=true)]
        public string TenantCode { get; set; }

        // 模型文件路径
        [NameInMap("model_file_path")]
        [Validation(Required=true)]
        public string ModelFilePath { get; set; }

        // 特征集路径
        [NameInMap("features_file_path")]
        [Validation(Required=true)]
        public string FeaturesFilePath { get; set; }

        // 示例文件路径
        [NameInMap("demo_file_path")]
        [Validation(Required=false)]
        public string DemoFilePath { get; set; }

        // 模型编码，同一租户下唯一，后续回溯生产调用标记
        [NameInMap("model_code")]
        [Validation(Required=true)]
        public string ModelCode { get; set; }

    }

}
