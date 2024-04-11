// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUQING.Models
{
    // 與情信息扩展字段
    public class YuqingMessageExtInfo : TeaModel {
        // 媒体地域
        [NameInMap("media_area_country")]
        [Validation(Required=false)]
        public string MediaAreaCountry { get; set; }

        // 媒体地域省份
        [NameInMap("media_area_province")]
        [Validation(Required=false)]
        public string MediaAreaProvince { get; set; }

        // 媒体地域-市
        [NameInMap("media_res_city")]
        [Validation(Required=false)]
        public string MediaResCity { get; set; }

        // 内容风险
        [NameInMap("general_model")]
        [Validation(Required=false)]
        public string GeneralModel { get; set; }

    }

}
