// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class CreateEquityRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 授权类型 0 Auto，1Contract
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public long? AuthType { get; set; }

        // 链ID
        [NameInMap("chain_id")]
        [Validation(Required=true)]
        public string ChainId { get; set; }

        // 结算币种
        [NameInMap("currency")]
        [Validation(Required=true)]
        public string Currency { get; set; }

        // 权益价格（单位：元）
        [NameInMap("default_price")]
        [Validation(Required=true)]
        public string DefaultPrice { get; set; }

        // 代理操作专用，要代理操作的租户ID
        [NameInMap("delegated_tenant_id")]
        [Validation(Required=false)]
        public string DelegatedTenantId { get; set; }

        // 权益商品详情信息
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 权益商品详情图。上传仅接受链接，请使用OSS存储服务上传图片(;分隔)
        [NameInMap("desc_images")]
        [Validation(Required=true)]
        public string DescImages { get; set; }

        // 权益商品名称
        [NameInMap("equity_name")]
        [Validation(Required=true)]
        public string EquityName { get; set; }

        // 权益商品类型：类型为整型（不大于：2147483647），需要进行细分，类型由三部分组成；aabbbbcccc。aa 为大类分类，bbbb 为细项分类（无细项分类时为0000），cccc 为数据格式分类（其中0000表示无格式要求）。请根据实际商品类型填写，具体类型和兑换时数据结构查看文档【https://tech.antfin.com/docs/2/163896】 。不可修改，如需修改需重新发布商品
        [NameInMap("equity_type")]
        [Validation(Required=true)]
        public long? EquityType { get; set; }

        // 字段决定权益商品是否全量链上客户可见，当选择权益为false时，需要使用baas.antdao.equity.merchant.open接口增加权益商品可见客户
        [NameInMap("if_public")]
        [Validation(Required=true)]
        public bool? IfPublic { get; set; }

        // 权益商品主图。上传仅接受链接，请使用OSS存储服务上传图片(;分隔)
        [NameInMap("images")]
        [Validation(Required=true)]
        public string Images { get; set; }

        // 商户每日兑换上限
        [NameInMap("limit_per_merchant_and_day")]
        [Validation(Required=true)]
        public long? LimitPerMerchantAndDay { get; set; }

        // 商户每月兑换上限
        [NameInMap("limit_per_merchant_and_month")]
        [Validation(Required=true)]
        public long? LimitPerMerchantAndMonth { get; set; }

        // 用户每日兑换上限
        [NameInMap("limit_per_user_and_day")]
        [Validation(Required=true)]
        public long? LimitPerUserAndDay { get; set; }

        // 用户每月兑换上限
        [NameInMap("limit_per_user_and_month")]
        [Validation(Required=true)]
        public long? LimitPerUserAndMonth { get; set; }

        // 若需要兑换方提供的特殊信息，可增加在备注字段，并要求兑换方是否传入（按照需求方自定义内容信息）
        // - 如必须传入证件号，手机号信息，则权益需要通过运营平台审核，非必须采集信息将拒绝上架
        [NameInMap("memo")]
        [Validation(Required=false)]
        public string Memo { get; set; }

        // 外部交易ID
        [NameInMap("out_tx_id")]
        [Validation(Required=true)]
        public string OutTxId { get; set; }

        // 权益商品库存数量
        [NameInMap("total_count")]
        [Validation(Required=true)]
        public string TotalCount { get; set; }

        // 权益商品使用有效期结束时间（毫秒）
        [NameInMap("use_valid_not_after")]
        [Validation(Required=true)]
        public long? UseValidNotAfter { get; set; }

        // 权益商品使用有效期开始时间（毫秒）
        [NameInMap("use_valid_not_before")]
        [Validation(Required=true)]
        public long? UseValidNotBefore { get; set; }

        // 权益商品兑换有效期结束时间（毫秒）
        [NameInMap("valid_not_after")]
        [Validation(Required=true)]
        public long? ValidNotAfter { get; set; }

        // 权益商品兑换有效期开始时间（毫秒）
        [NameInMap("valid_not_before")]
        [Validation(Required=true)]
        public long? ValidNotBefore { get; set; }

        // 权益商品面值（单位：元）
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
