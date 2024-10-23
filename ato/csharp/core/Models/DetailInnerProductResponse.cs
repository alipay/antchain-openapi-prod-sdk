// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class DetailInnerProductResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 商家社会统一信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

        // 商品名称
        [NameInMap("product_name")]
        [Validation(Required=false)]
        public string ProductName { get; set; }

        // 商品id
        [NameInMap("product_id")]
        [Validation(Required=false)]
        public string ProductId { get; set; }

        // 商品规格
        [NameInMap("product_model")]
        [Validation(Required=false)]
        public string ProductModel { get; set; }

        // 商品版本
        [NameInMap("product_version")]
        [Validation(Required=false)]
        public string ProductVersion { get; set; }

        // 指导价
        [NameInMap("product_price")]
        [Validation(Required=false)]
        public string ProductPrice { get; set; }

        // 一级类目
        [NameInMap("main_class")]
        [Validation(Required=false)]
        public string MainClass { get; set; }

        // 二级类目
        [NameInMap("sub_class")]
        [Validation(Required=false)]
        public string SubClass { get; set; }

        // 品牌
        [NameInMap("product_brand")]
        [Validation(Required=false)]
        public string ProductBrand { get; set; }

        // 商品链接
        [NameInMap("product_url")]
        [Validation(Required=false)]
        public string ProductUrl { get; set; }

        // 商品详情
        [NameInMap("product_detail_info")]
        [Validation(Required=false)]
        public string ProductDetailInfo { get; set; }

    }

}
