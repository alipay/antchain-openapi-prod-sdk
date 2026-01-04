// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    public class ExecLibraryDocsplitRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 知识库ID
        [NameInMap("library_id")]
        [Validation(Required=true)]
        public long? LibraryId { get; set; }

        // 使用的切分器名称
        [NameInMap("splitter")]
        [Validation(Required=true)]
        public string Splitter { get; set; }

        // 切片类型
        [NameInMap("section_type")]
        [Validation(Required=true)]
        public string SectionType { get; set; }

        // 切分字数（智能分片/按规则分片）
        [NameInMap("chunk_size")]
        [Validation(Required=true)]
        public long? ChunkSize { get; set; }

        // 块之间的最大重叠字符数（智能分片）
        [NameInMap("chunk_overlap")]
        [Validation(Required=true)]
        public long? ChunkOverlap { get; set; }

        // 最小标题级别，0为全部拍平（智能分片）
        [NameInMap("min_leve")]
        [Validation(Required=false)]
        public long? MinLeve { get; set; }

        // 自定义切分规则正则表达式（按规则分片）
        [NameInMap("regex")]
        [Validation(Required=true)]
        public string Regex { get; set; }

        // 任务名称
        [NameInMap("task_name")]
        [Validation(Required=true)]
        public string TaskName { get; set; }

        // 文件信息列表
        [NameInMap("files")]
        [Validation(Required=true)]
        public List<FileReq> Files { get; set; }

    }

}
