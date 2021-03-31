// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 货物
    public class ContainerGoodsParam : TeaModel {
        // 预计备货时间
        [NameInMap("cargo_ready_date")]
        [Validation(Required=false)]
        public long? CargoReadyDate { get; set; }

        // 危险品页号
        [NameInMap("dg_page_no")]
        [Validation(Required=false)]
        public string DgPageNo { get; set; }

        // 危险品级别
        [NameInMap("dg_type")]
        [Validation(Required=false)]
        public string DgType { get; set; }

        // 危险品闪点
        [NameInMap("flash_point")]
        [Validation(Required=false)]
        public string FlashPoint { get; set; }

        // 货物
        [NameInMap("goods")]
        [Validation(Required=false)]
        public string Goods { get; set; }

        // 货物中文名
        [NameInMap("goods_cn")]
        [Validation(Required=false)]
        public string GoodsCn { get; set; }

        // 货物类型 业务必填
        [NameInMap("goods_type")]
        [Validation(Required=false)]
        public string GoodsType { get; set; }

        // HS CODE
        [NameInMap("hs_codes")]
        [Validation(Required=false)]
        public List<string> HsCodes { get; set; }

        // 唛头
        [NameInMap("marks")]
        [Validation(Required=false)]
        public string Marks { get; set; }

        // 件数 业务必填
        [NameInMap("number")]
        [Validation(Required=false)]
        public string Number { get; set; }

        // 包装类型
        [NameInMap("package_type")]
        [Validation(Required=false)]
        public string PackageType { get; set; }

        // 实际件数
        [NameInMap("real_number")]
        [Validation(Required=false)]
        public string RealNumber { get; set; }

        // 实际体积
        [NameInMap("real_volume")]
        [Validation(Required=false)]
        public string RealVolume { get; set; }

        // 实际重量
        [NameInMap("real_weight")]
        [Validation(Required=false)]
        public string RealWeight { get; set; }

        // 危险品联合国编号
        [NameInMap("un_no")]
        [Validation(Required=false)]
        public string UnNo { get; set; }

        // 体积 业务必填
        [NameInMap("volume")]
        [Validation(Required=false)]
        public string Volume { get; set; }

        // 毛重 业务必填
        [NameInMap("weight")]
        [Validation(Required=false)]
        public string Weight { get; set; }

    }

}
