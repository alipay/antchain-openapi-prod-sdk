// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS_SPI.Models
{
    public class QueryRightsprodConfigResponse : TeaModel {
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

        // 供应权益编码
        [NameInMap("supply_rights_code")]
        [Validation(Required=false)]
        public string SupplyRightsCode { get; set; }

        // 权益名称
        [NameInMap("rights_name")]
        [Validation(Required=false)]
        public string RightsName { get; set; }

        // 权益类型
        // 满减券:FULL_REDUCTION_COUPON 
        // 每满减券:EVERY_FULL_REDUCTION_COUPON
        // 折扣券:DISCOUNT_COUPON
        [NameInMap("rights_type")]
        [Validation(Required=false)]
        public string RightsType { get; set; }

        // 待发布:INIT
        // 已上线:ONLINE
        // 已暂停:PAUSED
        // 已下线:OFFLINE
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 权益创建时间格式为yyyy-MM-dd HH:mm:ss
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        // 权益发放开始时间
        [NameInMap("grant_start_time")]
        [Validation(Required=false)]
        public string GrantStartTime { get; set; }

        // 权益发放截止时间
        [NameInMap("grant_end_time")]
        [Validation(Required=false)]
        public string GrantEndTime { get; set; }

        // 生效时间类型 固定时间:1;领券后:0
        [NameInMap("validity_time_type")]
        [Validation(Required=false)]
        public string ValidityTimeType { get; set; }

        // 生效时间 格式为yyyy-MM-dd HH:mm:ss
        // 生效时间类型为 1 固定时间是必传
        [NameInMap("voucher_start_time")]
        [Validation(Required=false)]
        public string VoucherStartTime { get; set; }

        // 过期时间 格式为yyyy-MM-dd HH:mm:ss
        // 生效时间类型为 1 固定时间是必传
        [NameInMap("voucher_end_time")]
        [Validation(Required=false)]
        public string VoucherEndTime { get; set; }

        // 生效时间类型：DAY/HOUR
        // 当生效时间类型为0时 必传
        [NameInMap("validity_time_format")]
        [Validation(Required=false)]
        public string ValidityTimeFormat { get; set; }

        // 生效时间数
        // 生效时间类型 0时 必传
        [NameInMap("validity_time")]
        [Validation(Required=false)]
        public long? ValidityTime { get; set; }

        // 权益面额 单位：元
        [NameInMap("face_amount")]
        [Validation(Required=false)]
        public string FaceAmount { get; set; }

        // 门槛金额单位：元
        [NameInMap("sill_amount")]
        [Validation(Required=false)]
        public string SillAmount { get; set; }

        // 折扣数 88折 对应为8.8
        [NameInMap("discount")]
        [Validation(Required=false)]
        public string Discount { get; set; }

        // 最大优惠金额
        [NameInMap("max_discount_amount")]
        [Validation(Required=false)]
        public string MaxDiscountAmount { get; set; }

        // 券原始库存（最大发券数）
        [NameInMap("rights_num")]
        [Validation(Required=false)]
        public long? RightsNum { get; set; }

        // 总预算金额
        [NameInMap("total_budget")]
        [Validation(Required=false)]
        public string TotalBudget { get; set; }

        // 使用描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

    }

}
