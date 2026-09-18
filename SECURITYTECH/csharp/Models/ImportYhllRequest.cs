// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class ImportYhllRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // shopUuid
        [NameInMap("shop_uuid")]
        [Validation(Required=true)]
        public string ShopUuid { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 任务类型
        [NameInMap("good_type")]
        [Validation(Required=true)]
        public string GoodType { get; set; }

        // 模板名
        [NameInMap("template_name")]
        [Validation(Required=true)]
        public string TemplateName { get; set; }

        // 行业
        [NameInMap("industry")]
        [Validation(Required=true)]
        public string Industry { get; set; }

        // 地址
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

        // 城市代码
        [NameInMap("city_code")]
        [Validation(Required=true)]
        public string CityCode { get; set; }

        // 经度
        [NameInMap("longitude")]
        [Validation(Required=false)]
        public string Longitude { get; set; }

        // 纬度
        [NameInMap("latitude")]
        [Validation(Required=false)]
        public string Latitude { get; set; }

        // 坐标范围
        [NameInMap("coordinate_range")]
        [Validation(Required=false)]
        public string CoordinateRange { get; set; }

        // 总量
        [NameInMap("total")]
        [Validation(Required=true)]
        public long? Total { get; set; }

        // 模板替换符
        [NameInMap("place_holder")]
        [Validation(Required=false)]
        public string PlaceHolder { get; set; }

        // 补充信息
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

    }

}
