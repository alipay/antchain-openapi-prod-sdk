// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AIIDENTIFY.Models
{
    public class OperateIdentifyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 品类名称
        [NameInMap("category_name")]
        [Validation(Required=true)]
        public string CategoryName { get; set; }

        // 品牌名称
        [NameInMap("brand_name")]
        [Validation(Required=true)]
        public string BrandName { get; set; }

        // 款式名称
        [NameInMap("style_name")]
        [Validation(Required=true)]
        public string StyleName { get; set; }

        // 款式编号
        [NameInMap("style_code")]
        [Validation(Required=false)]
        public string StyleCode { get; set; }

        // 鉴定点信息列表
        [NameInMap("identify_point_list")]
        [Validation(Required=false)]
        public List<IdentifyPointReq> IdentifyPointList { get; set; }

        // 鉴定点图片列表，当不能提供完整鉴定点信息列表时，可根据鉴定点查询接口出参中order字段将图片直接放入列表中
        [NameInMap("identify_point_img_list")]
        [Validation(Required=false)]
        public List<string> IdentifyPointImgList { get; set; }

    }

}
