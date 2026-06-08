// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAASSPI.Models
{
    // 【批次详情】 批次详情
    public class WxStockData : TeaModel {
        // 【批次号】 微信为每个代金券批次分配的唯一id。
        [NameInMap("stock_id")]
        [Validation(Required=true)]
        public string StockId { get; set; }

        // 【批次创建方商户号】 微信为创建方商户分配的商户号
        [NameInMap("stock_creator_mchid")]
        [Validation(Required=true)]
        public string StockCreatorMchid { get; set; }

        // 【批次名称】 批次名称
        [NameInMap("stock_name")]
        [Validation(Required=true)]
        public string StockName { get; set; }

        // 【批次状态】 批次状态，枚举值：
        // unactivated：未激活
        // audit：审核中
        // running：运行中
        // stoped：已停止
        // paused：暂停发放
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 【创建时间】 批次创建时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示，北京时间2015年5月20日 13点29分35秒。
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public string CreateTime { get; set; }

        // 【使用说明】 批次描述信息
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 【满减券/消费金批次使用规则】 满减券或消费金批次特定信息。
        [NameInMap("stock_use_rule")]
        [Validation(Required=false)]
        public StockUseRule StockUseRule { get; set; }

        // 【可用开始时间】 可用开始时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示，北京时间2015年5月20日 13点29分35秒。
        [NameInMap("available_begin_time")]
        [Validation(Required=true)]
        public string AvailableBeginTime { get; set; }

        // 【可用结束时间】 可用结束时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示，北京时间2015年5月20日 13点29分35秒。
        [NameInMap("available_end_time")]
        [Validation(Required=true)]
        public string AvailableEndTime { get; set; }

        // 【已发券或消费金数量】 已发券或消费金数量
        [NameInMap("distributed_coupons")]
        [Validation(Required=true)]
        public long? DistributedCoupons { get; set; }

        // 【是否无资金流】 是否无资金流。枚举值：
        // true：是
        // false：否
        [NameInMap("no_cash")]
        [Validation(Required=true)]
        public bool? NoCash { get; set; }

        // 【激活批次的时间】 批次激活开启时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示，北京时间2015年5月20日 13点29分35秒。
        [NameInMap("start_time")]
        [Validation(Required=false)]
        public string StartTime { get; set; }

        // 【终止批次的时间】 批次永久停止时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示，北京时间2015年5月20日 13点29分35秒。
        [NameInMap("stop_time")]
        [Validation(Required=false)]
        public string StopTime { get; set; }

        // 【减至批次特定信息】 单品优惠特定信息
        [NameInMap("cut_to_message")]
        [Validation(Required=false)]
        public CutToMessage CutToMessage { get; set; }

        // 【是否单品优惠】 枚举值：
        // true：是
        // false：否
        [NameInMap("singleitem")]
        [Validation(Required=true)]
        public bool? Singleitem { get; set; }

        // 【批次类型】 批次类型
        // 枚举值：
        // NORMAL：代金券批次
        // DISCOUNT_CUT：立减与折扣
        // OTHER：其他
        [NameInMap("stock_type")]
        [Validation(Required=true)]
        public string StockType { get; set; }

        // 【卡包ID】 微信卡包ID
        [NameInMap("card_id")]
        [Validation(Required=false)]
        public string CardId { get; set; }

        // 【业务类型】 细分业务类型，仅有当business_type=MULTIUSE时，才会返回，枚举值：
        // MULTIUSE：消费金
        // 可选取值
        // MULTIUSE:  消费金类型
        [NameInMap("business_type")]
        [Validation(Required=false)]
        public string BusinessType { get; set; }

        // 消费金可用地域列表，仅有当business_type=MULTIUSE时，才会返回
        [NameInMap("available_region_list")]
        [Validation(Required=false)]
        public List<AvailableRegion> AvailableRegionList { get; set; }

        // 【消费金可用行业】 消费金可用行业列表，仅有当business_type=MULTIUSE时，才会返回
        [NameInMap("available_industry_list")]
        [Validation(Required=false)]
        public List<string> AvailableIndustryList { get; set; }

    }

}
