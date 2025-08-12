// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COLLABINV.Models
{
    public class ImportIdmapPsiresultfileRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 文件路径
        [NameInMap("file_path")]
        [Validation(Required=true)]
        public string FilePath { get; set; }

        // 文件名称
        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

        // 项目唯一标识
        [NameInMap("project_info_id")]
        [Validation(Required=true)]
        public string ProjectInfoId { get; set; }

        // 样本编码
        [NameInMap("sample_code")]
        [Validation(Required=true)]
        public string SampleCode { get; set; }

        // 样本任务编码
        [NameInMap("sample_task_code")]
        [Validation(Required=true)]
        public string SampleTaskCode { get; set; }

        // 数据源编码
        [NameInMap("data_source")]
        [Validation(Required=true)]
        public string DataSource { get; set; }

    }

}
