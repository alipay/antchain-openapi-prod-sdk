// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MARKETING.Models
{
    // 目录对象
    public class CategoryVO : TeaModel {
        // 内部id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 内容库id
        [NameInMap("site_id")]
        [Validation(Required=false)]
        public long? SiteId { get; set; }

        // 站点
        [NameInMap("site")]
        [Validation(Required=false)]
        public string Site { get; set; }

        // language
        [NameInMap("language")]
        [Validation(Required=false)]
        public string Language { get; set; }

        // title
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        // 类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public long? Type { get; set; }

        // 展示类型 1为左侧展示2为列表展示
        [NameInMap("show_type")]
        [Validation(Required=false)]
        public long? ShowType { get; set; }

        // 排序
        [NameInMap("sort")]
        [Validation(Required=false)]
        public long? Sort { get; set; }

        // 目录层级
        [NameInMap("level")]
        [Validation(Required=false)]
        public long? Level { get; set; }

        // 外标id
        [NameInMap("ext_id")]
        [Validation(Required=false)]
        public string ExtId { get; set; }

        // 父id
        [NameInMap("parent_id")]
        [Validation(Required=false)]
        public string ParentId { get; set; }

        // 来源类型
        [NameInMap("source_type")]
        [Validation(Required=false)]
        public long? SourceType { get; set; }

        // 版本
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

        // 语雀目录有无数据判定
        [NameInMap("catalogue_type")]
        [Validation(Required=false)]
        public long? CatalogueType { get; set; }

    }

}
