// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 高德数据集合内record
    public class GdCustomersRecord : TeaModel {
        // 城市编码，数据类型为店铺或者城市时返回该属性与值
        [NameInMap("citycode")]
        [Validation(Required=true)]
        public string Citycode { get; set; }

        // 品牌id
        [NameInMap("brand_id")]
        [Validation(Required=true)]
        public string BrandId { get; set; }

        // 店铺id，数据类型为店铺或者店铺品牌时返回该属性与值
        [NameInMap("shop_id")]
        [Validation(Required=true)]
        public string ShopId { get; set; }

        // 时间（时间类型为天时：yyyyMMdd；时间类型为周时：yyyyWW；时间类型为月时：yyyyMM）
        [NameInMap("time")]
        [Validation(Required=true)]
        public string Time { get; set; }

        // 重叠指数集合
        [NameInMap("overlap_list")]
        [Validation(Required=true)]
        public List<Overlap> OverlapList { get; set; }

        // 重叠指数集合条数
        [NameInMap("overlap_list_num")]
        [Validation(Required=true)]
        public string OverlapListNum { get; set; }

        // 流入指数集合
        [NameInMap("src_list")]
        [Validation(Required=true)]
        public List<GdSrc> SrcList { get; set; }

        // 流入指数条数
        [NameInMap("src_list_num")]
        [Validation(Required=true)]
        public string SrcListNum { get; set; }

        // 流出指数集合
        [NameInMap("dest_list")]
        [Validation(Required=true)]
        public List<GdDest> DestList { get; set; }

        // 流出指数条数
        [NameInMap("dest_list_num")]
        [Validation(Required=true)]
        public string DestListNum { get; set; }

    }

}
