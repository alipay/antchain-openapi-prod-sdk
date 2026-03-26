// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 高德潜客请求req
    public class GdCustomerFlow : TeaModel {
        // 当前页面
        [NameInMap("current")]
        [Validation(Required=true)]
        public long? Current { get; set; }

        // 数据类型（SHOP：店铺；CITY：城市；PROVINCE：省份；COUNTRY：全国；SHOP_BRAND：店铺品牌(仅限竞品)）
        [NameInMap("data_type")]
        [Validation(Required=true)]
        public string DataType { get; set; }

        // 时间类型（DAY：天；WEEK：周；MONTH：月；仅针对城市和店铺品牌的竞品数据支持的时间类型为，季度：QUARTER；半年：HALF；年：YEAR）
        [NameInMap("time_type")]
        [Validation(Required=true)]
        public string TimeType { get; set; }

        // 主品牌id
        [NameInMap("main_brand")]
        [Validation(Required=true)]
        public string MainBrand { get; set; }

        // 时间（时间类型为天时：yyyyMMdd；时间类型为周时：yyyyWW；时间类型为月时：yyyyMM；时间类型为季度时：yyyyQQ；时间类型为半年时：yyyyBB；时间类型为年时：yyyy；）
        [NameInMap("time")]
        [Validation(Required=true)]
        public string Time { get; set; }

        // 品牌id，以”,”分隔
        [NameInMap("brand_limit")]
        [Validation(Required=true)]
        public string BrandLimit { get; set; }

        // 数据指数类型（pv、uv中选择，多个以”,”分隔）
        [NameInMap("data_limit")]
        [Validation(Required=true)]
        public string DataLimit { get; set; }

        // 数据统计逻辑（0：默认值，基于本品或竞品获取；1：基于本品获取）
        [NameInMap("base_self")]
        [Validation(Required=false)]
        public long? BaseSelf { get; set; }

    }

}
