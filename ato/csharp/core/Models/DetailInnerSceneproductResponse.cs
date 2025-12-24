// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class DetailInnerSceneproductResponse : TeaModel {
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

        // 商品id
        [NameInMap("platform_product_id")]
        [Validation(Required=false)]
        public string PlatformProductId { get; set; }

        // 一级分类
        [NameInMap("primary_category")]
        [Validation(Required=false)]
        public string PrimaryCategory { get; set; }

        // 二级分类
        [NameInMap("secondary_category")]
        [Validation(Required=false)]
        public string SecondaryCategory { get; set; }

        // 商品名称
        [NameInMap("product_name")]
        [Validation(Required=false)]
        public string ProductName { get; set; }

        // 商品成色
        [NameInMap("product_condition")]
        [Validation(Required=false)]
        public string ProductCondition { get; set; }

        // 商品描述
        [NameInMap("product_description")]
        [Validation(Required=false)]
        public string ProductDescription { get; set; }

        // 商品封面图
        [NameInMap("cover_image_url_list")]
        [Validation(Required=false)]
        public List<string> CoverImageUrlList { get; set; }

        // 商品封面图
        [NameInMap("large_cover_image_url_list")]
        [Validation(Required=false)]
        public List<string> LargeCoverImageUrlList { get; set; }

        // 商品详情图
        [NameInMap("detail_image_url_list")]
        [Validation(Required=false)]
        public List<string> DetailImageUrlList { get; set; }

        // 商品详情图
        [NameInMap("large_detail_image_url_list")]
        [Validation(Required=false)]
        public List<string> LargeDetailImageUrlList { get; set; }

        // 商品规格
        [NameInMap("spec_config_list")]
        [Validation(Required=false)]
        public List<ProductSpecConfig> SpecConfigList { get; set; }

        // 报名商家租赁属性信息列表
        [NameInMap("sign_merchant_lease_config_list")]
        [Validation(Required=false)]
        public List<SignMerchantLeaseConfig> SignMerchantLeaseConfigList { get; set; }

        // 适用商家列表
        [NameInMap("apply_product_merchant_list")]
        [Validation(Required=false)]
        public List<SignProductMerchant> ApplyProductMerchantList { get; set; }

        // 适用商家租赁属性信息列表
        [NameInMap("apply_merchant_lease_config_list")]
        [Validation(Required=false)]
        public List<SignMerchantLeaseConfig> ApplyMerchantLeaseConfigList { get; set; }

        // 推广场景
        [NameInMap("scene_name")]
        [Validation(Required=false)]
        public string SceneName { get; set; }

        // 场景商品上架状态
        [NameInMap("display_status")]
        [Validation(Required=false)]
        public string DisplayStatus { get; set; }

        // 推广模式
        [NameInMap("delivery_mode")]
        [Validation(Required=false)]
        public string DeliveryMode { get; set; }

        // 添加标志
        [NameInMap("added_flag")]
        [Validation(Required=false)]
        public bool? AddedFlag { get; set; }

    }

}
