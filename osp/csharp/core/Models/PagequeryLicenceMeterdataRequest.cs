// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Osp.Models
{
    public class PagequeryLicenceMeterdataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 产品Code，如果不传参数，默认是“SOFA”
        [NameInMap("product_code")]
        [Validation(Required=false)]
        public string ProductCode { get; set; }

        // 传入商品Code，必填：mesh、mq、dtx 等
        [NameInMap("commodity_code")]
        [Validation(Required=true)]
        public string CommodityCode { get; set; }

        // SOFA的实例ID。
        // 如果不传则查询总量（合并所有实例的数据）
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 计量开始时间，只支持整点时间
        [NameInMap("meter_begin")]
        [Validation(Required=true)]
        public string MeterBegin { get; set; }

        // 计量结束时间，只支持整点时间（不包含）
        [NameInMap("meter_end")]
        [Validation(Required=true)]
        public string MeterEnd { get; set; }

        // 当前页码
        [NameInMap("current_page")]
        [Validation(Required=true)]
        public long? CurrentPage { get; set; }

        // 每页显示条数
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

    }

}
