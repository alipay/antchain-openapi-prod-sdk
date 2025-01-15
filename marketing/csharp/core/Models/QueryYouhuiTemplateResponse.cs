// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MARKETING.Models
{
    public class QueryYouhuiTemplateResponse : TeaModel {
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

        // 模板类型:APPLY, NORMAL
        [NameInMap("t_type")]
        [Validation(Required=false)]
        public string TType { get; set; }

        // 币种
        [NameInMap("currency")]
        [Validation(Required=false)]
        public string Currency { get; set; }

        // 模板ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 模板名称
        [NameInMap("t_name")]
        [Validation(Required=false)]
        public string TName { get; set; }

        // 使用场景
        [NameInMap("t_use_scene")]
        [Validation(Required=false)]
        public string TUseScene { get; set; }

        // 模板开始时间
        [NameInMap("t_start_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string TStartTime { get; set; }

        // 模板有效结束时间
        [NameInMap("t_end_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string TEndTime { get; set; }

        // 优惠券允许发放的总数量
        [NameInMap("yh_max_release")]
        [Validation(Required=false)]
        public string YhMaxRelease { get; set; }

        // 券类型
        [NameInMap("yh_type")]
        [Validation(Required=false)]
        public string YhType { get; set; }

        // 满减条件金额(单位:元)， 如满200
        [NameInMap("yh_certain_money")]
        [Validation(Required=false)]
        public string YhCertainMoney { get; set; }

        // 生成券的面额(单位:元)
        [NameInMap("yh_amount")]
        [Validation(Required=false)]
        public string YhAmount { get; set; }

        // 折扣， 如: 0.75 取值范围(0, 1)
        [NameInMap("yh_discount_rate")]
        [Validation(Required=false)]
        public string YhDiscountRate { get; set; }

        // 优惠券使用次数 , 0表示无限制
        [NameInMap("yh_usage_count")]
        [Validation(Required=false)]
        public string YhUsageCount { get; set; }

        // 相对时间，绝对时间ABSOLUTE/RELATIVE
        [NameInMap("yh_validity_type")]
        [Validation(Required=false)]
        public string YhValidityType { get; set; }

        // 优惠券开始时间 yhValidityType=ABSOLUTE 不能为空, 精确到秒
        [NameInMap("yh_start_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string YhStartTime { get; set; }

        // 有效期结束时间， yhValidityType=ABSOLUTE 不能为空, 精确到秒
        [NameInMap("yh_end_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string YhEndTime { get; set; }

        // 有效时间——相对（单位秒），如果start_time为空，优惠券的有效期从生成的当天开始计算， 如果start_time不为空，优惠关的有效期从start_time开始算
        [NameInMap("yh_relative_second")]
        [Validation(Required=false)]
        public long? YhRelativeSecond { get; set; }

        // 每人限领数量
        [NameInMap("yh_per_limit_num")]
        [Validation(Required=false)]
        public long? YhPerLimitNum { get; set; }

        // 优惠券通用类型，UNIVERSAL通用券；NONUNIVERSAL非通用券
        [NameInMap("yh_universal_type")]
        [Validation(Required=false)]
        public string YhUniversalType { get; set; }

        // 模板状态 APPROVED审批通过，生效中
        [NameInMap("t_status")]
        [Validation(Required=false)]
        public string TStatus { get; set; }

        // 优惠券发券总额、总数量控制
        [NameInMap("yh_control_type")]
        [Validation(Required=false)]
        public string YhControlType { get; set; }

        // 申请原因
        [NameInMap("t_reason")]
        [Validation(Required=false)]
        public string TReason { get; set; }

        // 优惠条件备注，显示用
        [NameInMap("yh_description")]
        [Validation(Required=false)]
        public string YhDescription { get; set; }

        // 创建人, 系统操作为 应用名, 员工操作设置为工号
        [NameInMap("t_creator")]
        [Validation(Required=false)]
        public string TCreator { get; set; }

        // 最后修改人, 系统操作为 应用名, 员工操作设置为工号
        [NameInMap("t_modifier")]
        [Validation(Required=false)]
        public string TModifier { get; set; }

        // 创建时间
        [NameInMap("t_gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string TGmtCreate { get; set; }

        // 最后修改时间
        [NameInMap("t_gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string TGmtModified { get; set; }

        // 商品规格CODE。 限定商品类型时， 适用的商品集合， 通用券( yhUniversalType=NONUNIVERSAL)不能为空
        [NameInMap("item_code_set")]
        [Validation(Required=false)]
        public List<string> ItemCodeSet { get; set; }

    }

}
