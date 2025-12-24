// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class GetMarketingInsureurlRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 请求 id，做防重校验逻辑
        // 接口根据 requestId 做防重校验逻辑，若重复会报错
        [NameInMap("request_id")]
        [Validation(Required=true, MaxLength=128)]
        public string RequestId { get; set; }

        // 产品编码
        [NameInMap("product_code")]
        [Validation(Required=true, MaxLength=128)]
        public string ProductCode { get; set; }

        // 保司编码
        [NameInMap("channel_code")]
        [Validation(Required=true, MaxLength=64)]
        public string ChannelCode { get; set; }

        // 保司出单机构编码，若没有同保司编码
        [NameInMap("issue_org")]
        [Validation(Required=true, MaxLength=64)]
        public string IssueOrg { get; set; }

        // 保司产品编码
        [NameInMap("channel_product_code")]
        [Validation(Required=true, MaxLength=64)]
        public string ChannelProductCode { get; set; }

        // 保险产品类型，枚举：
        // STANDARD（均分）
        // PREMIUM（大小均分）
        // GIFT_TRANSFER（赠转商）
        [NameInMap("channel_product_type")]
        [Validation(Required=true, MaxLength=64)]
        public string ChannelProductType { get; set; }

        // 保险方案
        [NameInMap("insurance_plan")]
        [Validation(Required=true, MaxLength=20)]
        public string InsurancePlan { get; set; }

        // 一级渠道编码
        [NameInMap("first_channel")]
        [Validation(Required=true, MaxLength=64)]
        public string FirstChannel { get; set; }

        // 二级渠道编码
        [NameInMap("second_channel")]
        [Validation(Required=false, MaxLength=64)]
        public string SecondChannel { get; set; }

        // 三级渠道/广告版位
        [NameInMap("advertising_position")]
        [Validation(Required=false, MaxLength=64)]
        public string AdvertisingPosition { get; set; }

        // 设备类型/用户类型，枚举：
        // muid
        // oaid
        // caid
        // imei
        // idfa
        // userid
        [NameInMap("device_type")]
        [Validation(Required=true, MaxLength=64)]
        public string DeviceType { get; set; }

        // 设备编号/用户编号
        [NameInMap("device_id")]
        [Validation(Required=true, MaxLength=64)]
        public string DeviceId { get; set; }

        // 点击时间 yyyy-MM-dd HH:mm:ss
        [NameInMap("click_time")]
        [Validation(Required=true, MaxLength=20)]
        public string ClickTime { get; set; }

        // 订单编号
        [NameInMap("scene_order_no")]
        [Validation(Required=true, MaxLength=64)]
        public string SceneOrderNo { get; set; }

        // 投保人姓名
        [NameInMap("applicant_name")]
        [Validation(Required=false, MaxLength=64)]
        public string ApplicantName { get; set; }

        // 投保人证件号
        [NameInMap("applicant_cert_no")]
        [Validation(Required=false, MaxLength=64)]
        public string ApplicantCertNo { get; set; }

        // 投保人联系方式
        [NameInMap("applicant_phone")]
        [Validation(Required=false, MaxLength=64)]
        public string ApplicantPhone { get; set; }

    }

}
