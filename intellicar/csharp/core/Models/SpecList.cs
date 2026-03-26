// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 城市列表
    public class SpecList : TeaModel {
        // 品牌Id
        [NameInMap("brand_id")]
        [Validation(Required=true)]
        public string BrandId { get; set; }

        // 品牌名称
        [NameInMap("brand_name")]
        [Validation(Required=true)]
        public string BrandName { get; set; }

        // 厂商id
        [NameInMap("factory_id")]
        [Validation(Required=true)]
        public string FactoryId { get; set; }

        // 厂商名称
        [NameInMap("factory_name")]
        [Validation(Required=true)]
        public string FactoryName { get; set; }

        // 车系id
        [NameInMap("series_id")]
        [Validation(Required=true)]
        public string SeriesId { get; set; }

        // 车系名称
        [NameInMap("series_name")]
        [Validation(Required=true)]
        public string SeriesName { get; set; }

        // 车型Id
        [NameInMap("spec_id")]
        [Validation(Required=true)]
        public string SpecId { get; set; }

        // 车型名称
        [NameInMap("spec_name")]
        [Validation(Required=true)]
        public string SpecName { get; set; }

    }

}
