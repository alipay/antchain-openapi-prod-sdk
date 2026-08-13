// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 渠道扩展信息
    public class PetCashierApplyExtInfo : TeaModel {
        // 门店名称
        [NameInMap("store_name")]
        [Validation(Required=false)]
        public string StoreName { get; set; }

        // 门店id
        [NameInMap("store_id")]
        [Validation(Required=false)]
        public string StoreId { get; set; }

        // 门店社会统一信用代码
        [NameInMap("store_social_code")]
        [Validation(Required=false)]
        public string StoreSocialCode { get; set; }

        // 门店地址
        [NameInMap("store_address")]
        [Validation(Required=false)]
        public string StoreAddress { get; set; }

        // 门店地址省
        [NameInMap("store_addr_prov")]
        [Validation(Required=false)]
        public string StoreAddrProv { get; set; }

        // 门店地址市
        [NameInMap("store_addr_city")]
        [Validation(Required=false)]
        public string StoreAddrCity { get; set; }

        // 门店地址区
        [NameInMap("store_addr_dstc")]
        [Validation(Required=false)]
        public string StoreAddrDstc { get; set; }

        // 厂商社会信用代码
        [NameInMap("vendor_social_code")]
        [Validation(Required=true)]
        public string VendorSocialCode { get; set; }

        // 厂商名称
        [NameInMap("vendor_name")]
        [Validation(Required=true)]
        public string VendorName { get; set; }

        // 商品型号
        [NameInMap("comm_model")]
        [Validation(Required=true)]
        public string CommModel { get; set; }

        // 商品总价(包含定金)	String
        [NameInMap("total_price")]
        [Validation(Required=false)]
        public string TotalPrice { get; set; }

        // 已付定金
        [NameInMap("first_pay_amount")]
        [Validation(Required=false)]
        public string FirstPayAmount { get; set; }

        // 已付货款
        [NameInMap("order_paid_amount")]
        [Validation(Required=false)]
        public string OrderPaidAmount { get; set; }

        // 客户历史交易信息
        [NameInMap("his_tran_info")]
        [Validation(Required=false)]
        public List<HisTranInfo> HisTranInfo { get; set; }

    }

}
