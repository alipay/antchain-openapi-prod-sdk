// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DUANKA.Models
{
    public class QueryIrBrandRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 品牌MD5的 32位小写
        [NameInMap("brandmd5")]
        [Validation(Required=true)]
        public string Brandmd5 { get; set; }

        // 开始日期，包含填写时间 ，目前与end_date最大间隔不大于7天
        [NameInMap("begin_date")]
        [Validation(Required=true)]
        public string BeginDate { get; set; }

        // 结束日期，包含填写时间， 目前与start_date最大间隔不大于7天
        [NameInMap("end_date")]
        [Validation(Required=true)]
        public string EndDate { get; set; }

        // 场景码,brand_overview 品牌汇总；brand_citylevel 品牌城市汇总
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

    }

}
