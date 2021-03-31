// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class SaveBizGoodsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        [NameInMap("action")]
        [Validation(Required=false)]
        public string Action { get; set; }

        // 预计备货时间 毫秒值单位
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

        // 货代did
        [NameInMap("forwarder_did")]
        [Validation(Required=true)]
        public string ForwarderDid { get; set; }

        // 货物 业务必填	
        // 
        [NameInMap("goods")]
        [Validation(Required=false)]
        public string Goods { get; set; }

        // 中文品名
        [NameInMap("goods_cn")]
        [Validation(Required=false)]
        public string GoodsCn { get; set; }

        // 货物ID
        [NameInMap("goods_id")]
        [Validation(Required=true)]
        public string GoodsId { get; set; }

        // 货物类型（业务必填）
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

        // 委托件数 业务必填	
        // 
        [NameInMap("number")]
        [Validation(Required=false)]
        public string Number { get; set; }

        // 订单号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

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

        // 委托体积（业务必填）
        [NameInMap("volume")]
        [Validation(Required=false)]
        public string Volume { get; set; }

        // 委托重量（业务必填）
        [NameInMap("weight")]
        [Validation(Required=false)]
        public string Weight { get; set; }

    }

}
