// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COLLABINV.Models
{
    public class ImportIdmapSamplefileRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // oss文件名称
        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

        // 项目ID
        [NameInMap("project_info_id")]
        [Validation(Required=true)]
        public string ProjectInfoId { get; set; }

        // 查询列
        [NameInMap("param_type")]
        [Validation(Required=true)]
        public string ParamType { get; set; }

        // 结果列
        [NameInMap("result_type")]
        [Validation(Required=true)]
        public string ResultType { get; set; }

        // 样本Code
        [NameInMap("sample_code")]
        [Validation(Required=true)]
        public string SampleCode { get; set; }

        // 样本任务Code
        [NameInMap("sample_task_code")]
        [Validation(Required=true)]
        public string SampleTaskCode { get; set; }

        // oss文件路径
        [NameInMap("file_path")]
        [Validation(Required=true)]
        public string FilePath { get; set; }

    }

}
