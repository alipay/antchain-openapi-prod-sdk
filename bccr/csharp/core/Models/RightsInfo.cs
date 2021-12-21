// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 权利信息
    public class RightsInfo : TeaModel {
        // 作品名称（最长128个字符）
        [NameInMap("work_name")]
        [Validation(Required=true, MaxLength=128)]
        public string WorkName { get; set; }

        // 作品类型
        [NameInMap("work_type")]
        [Validation(Required=true)]
        public string WorkType { get; set; }

        // 作品创作完成时间
        [NameInMap("completed_time")]
        [Validation(Required=true)]
        public long? CompletedTime { get; set; }

        // 作品创作完成地点（最长128个字符）
        [NameInMap("completed_place")]
        [Validation(Required=true, MaxLength=128)]
        public string CompletedPlace { get; set; }

        // 是否发表
        [NameInMap("is_publish")]
        [Validation(Required=true)]
        public bool? IsPublish { get; set; }

        // 发表时间（如果isPublish为true则必填）
        [NameInMap("publish_time")]
        [Validation(Required=false)]
        public long? PublishTime { get; set; }

        // 发表地点（如果isPublish为true则必填，最长128个字符）
        [NameInMap("publish_place")]
        [Validation(Required=false, MaxLength=128)]
        public string PublishPlace { get; set; }

        // 发表网址（如果isPublish为true则必填，最长1024个字符）
        [NameInMap("publish_web")]
        [Validation(Required=false, MaxLength=1024)]
        public string PublishWeb { get; set; }

        // 是否是作者
        [NameInMap("is_author")]
        [Validation(Required=true)]
        public bool? IsAuthor { get; set; }

        // 作者姓名（如果isAuthor为true则必填，最长32个字符）
        [NameInMap("author_cert_name")]
        [Validation(Required=false, MaxLength=32)]
        public string AuthorCertName { get; set; }

        // 作者身份证号（如果isAuthor为true则必填）
        [NameInMap("author_cert_no")]
        [Validation(Required=false, MaxLength=30)]
        public string AuthorCertNo { get; set; }

    }

}
