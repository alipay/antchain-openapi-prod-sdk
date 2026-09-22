// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVERENDER.Models
{
    public class QueryAntcloudMarketingagentCreativeMaterialRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 页码，从1开始
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public long? PageNum { get; set; }

        // 每页条数
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // Creative 行业产品代码：FUND / RETAIL，查询时缺省为 RETAIL
        [NameInMap("product_code")]
        [Validation(Required=false)]
        public string ProductCode { get; set; }

        // 空间类型：PERSONAL / ENTERPRISE
        [NameInMap("space_type")]
        [Validation(Required=false)]
        public string SpaceType { get; set; }

        // 素材类型，如 IMAGE / ANIMATION / FONT
        [NameInMap("material_type")]
        [Validation(Required=false)]
        public string MaterialType { get; set; }

        // 使用场景
        [NameInMap("scene")]
        [Validation(Required=false)]
        public string Scene { get; set; }

        // 素材用途：REFERENCE_STYLE=参考样式，INPUT_ELEMENT=输入元素
        [NameInMap("material_usage")]
        [Validation(Required=false)]
        public string MaterialUsage { get; set; }

        // 行业
        [NameInMap("industry")]
        [Validation(Required=false)]
        public string Industry { get; set; }

        // 投放平台，支持多选，多个值使用英文逗号分隔
        [NameInMap("publish_platforms")]
        [Validation(Required=false)]
        public string PublishPlatforms { get; set; }

        // 尺寸类型（16:9、9:16、1:1、4:3、3:4、OTHER）
        [NameInMap("material_size_type")]
        [Validation(Required=false)]
        public string MaterialSizeType { get; set; }

        // 搜索关键词
        [NameInMap("keyword")]
        [Validation(Required=false)]
        public string Keyword { get; set; }

        // 是否平铺展示（true 时展开素材包子素材，不返回素材包父记录）
        [NameInMap("flatten")]
        [Validation(Required=false)]
        public bool? Flatten { get; set; }

    }

}
