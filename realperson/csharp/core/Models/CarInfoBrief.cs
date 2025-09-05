// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    // 车辆资产验证简版车辆信息
    public class CarInfoBrief : TeaModel {
        // 生产时间
        [NameInMap("production_time")]
        [Validation(Required=false)]
        public string ProductionTime { get; set; }

        // 品牌名称
        [NameInMap("brand_name")]
        [Validation(Required=false)]
        public string BrandName { get; set; }

        // 车系名称
        [NameInMap("series_name")]
        [Validation(Required=false)]
        public string SeriesName { get; set; }

        // 燃料种类
        [NameInMap("fuel_type")]
        [Validation(Required=false)]
        public string FuelType { get; set; }

        // 轴数
        [NameInMap("axes_number")]
        [Validation(Required=false)]
        public string AxesNumber { get; set; }

        // 轴距
        [NameInMap("wheel_base")]
        [Validation(Required=false)]
        public string WheelBase { get; set; }

    }

}
