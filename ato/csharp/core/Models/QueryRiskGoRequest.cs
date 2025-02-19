// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryRiskGoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 风险类型。枚举值：MARKETING_PURCHASE_COMMON 营销抢购风险识别；INDUSTRY_SCALPER_COMMON 行业黄牛风险识别；MARKETING_AWARDING_COMMON 营销发奖风险识别；INDUSTRY_FARMING_COMMON 行业刷单风险识别；INDUSTRY_BADDEBT_COMMON 履约坏账风险识别
        [NameInMap("risk_type")]
        [Validation(Required=true, MaxLength=50)]
        public string RiskType { get; set; }

        // 单次请求流水号，需要保证唯一
        [NameInMap("flow_id")]
        [Validation(Required=true, MaxLength=32)]
        public string FlowId { get; set; }

        // 调用行业，枚举值：
        // insurance 保险；retail 零售；finance 金融行业；logistics 物流行业；city_services 城市服务；medical 医疗服务；digital_media 数媒行业；recycle 回收行业；payment 缴费行业；vehicle 汽车；travel 旅游；air_travel 航旅行业；FMCG 快消零售；education 教育行业；fashion_retail 时尚零售；game_industry 文体行业；rental 租赁；advertisement 广告行业；restaurants 餐饮行业；ticket 票务行业；complexes 综合体行业
        [NameInMap("business_code")]
        [Validation(Required=true, MaxLength=30)]
        public string BusinessCode { get; set; }

        // 风险咨询对应的自身业务场景/环节，枚举值：
        // register 注册；order 下单；payment 支付；login 登录；offline_query 离线查询；inquery 查询；reserve 预约；invitation 邀请；other 其他
        [NameInMap("scene")]
        [Validation(Required=true, MaxLength=50)]
        public string Scene { get; set; }

        // 支付宝用户 2088 账号
        [NameInMap("user_id")]
        [Validation(Required=false, MaxLength=50)]
        public string UserId { get; set; }

        // 支付宝用户 open_id 账号。需要注意，user_id 和 open_id 不可同时为空，同时传入时，以 user_id 为准
        [NameInMap("open_id")]
        [Validation(Required=false, MaxLength=128)]
        public string OpenId { get; set; }

        // 支付宝商家 pid，如果风险咨询对象是支付宝商家，则填写pid
        [NameInMap("mer_pid")]
        [Validation(Required=false, MaxLength=50)]
        public string MerPid { get; set; }

        // 手机号码，用于直接输入风险咨询对象的手机号码
        [NameInMap("mobile_no")]
        [Validation(Required=false, MaxLength=50)]
        public string MobileNo { get; set; }

        // 身份证号码
        [NameInMap("cert_no")]
        [Validation(Required=false, MaxLength=50)]
        public string CertNo { get; set; }

        // 账户登录 ip
        [NameInMap("ip")]
        [Validation(Required=false, MaxLength=32)]
        public string Ip { get; set; }

        // 地理位置，用于输入用户产生交易时的地理位置信息
        [NameInMap("lbs")]
        [Validation(Required=false, MaxLength=50)]
        public string Lbs { get; set; }

        // 咨询方类型，填写风险咨询中对应的商户或服务商对于蚂蚁的类型。枚举值：direct_isv 直连服务商；indirect_isv 间连服务商；unconn_isv 无关服务商；direct_mer 直连商户；indirect_mer 间连商户；unconn_mer 无关联商户；unknown 其他
        [NameInMap("role")]
        [Validation(Required=false, MaxLength=128)]
        public string Role { get; set; }

        // 可填入活动id唯一值，或其他活动信息
        [NameInMap("activity_info")]
        [Validation(Required=false, MaxLength=100)]
        public string ActivityInfo { get; set; }

        // 营销抢购风险识别入参模型
        [NameInMap("purchase_query_model")]
        [Validation(Required=false)]
        public PurchaseQueryModel PurchaseQueryModel { get; set; }

        // 行业黄牛风险识别入参模型
        [NameInMap("scalper_query_model")]
        [Validation(Required=false)]
        public ScalperQueryModel ScalperQueryModel { get; set; }

        // 营销发奖风险识别入参模型
        [NameInMap("awarding_query_model")]
        [Validation(Required=false)]
        public AwardingQueryModel AwardingQueryModel { get; set; }

        // 行业刷单风险识别入参模型
        [NameInMap("farming_query_model")]
        [Validation(Required=false)]
        public FarmingQueryModel FarmingQueryModel { get; set; }

        // 行业履约风险识别入参模型
        [NameInMap("baddebt_query_model")]
        [Validation(Required=false)]
        public BaddebtQueryModel BaddebtQueryModel { get; set; }

        // 商户appId,当openId不为空时必填
        [NameInMap("merchant_app_id")]
        [Validation(Required=false)]
        public string MerchantAppId { get; set; }

    }

}
