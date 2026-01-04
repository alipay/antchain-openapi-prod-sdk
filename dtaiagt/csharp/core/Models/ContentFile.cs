// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // 知识库-文档列表-文档分页对象
    public class ContentFile : TeaModel {
        // 文档所属知识库ID
        [NameInMap("library_id")]
        [Validation(Required=false)]
        public long? LibraryId { get; set; }

        // 文档ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 文档文件名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 文档类型
        [NameInMap("typ")]
        [Validation(Required=false)]
        public string Typ { get; set; }

        // 文档标签列表
        [NameInMap("tag_list")]
        [Validation(Required=false)]
        public List<string> TagList { get; set; }

        // 发布状态
        [NameInMap("publish_status")]
        [Validation(Required=false)]
        public string PublishStatus { get; set; }

    }

}
