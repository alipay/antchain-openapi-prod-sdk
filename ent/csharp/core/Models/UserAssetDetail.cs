// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENT.Models
{
    // 用户资产明细
    public class UserAssetDetail : TeaModel {
        // 粉丝粒变化数量，带符号整数，单位分个。
        [NameInMap("asset")]
        [Validation(Required=true)]
        public long? Asset { get; set; }

        // 资产类型：PRE_ALLOCATION（待发放），RELEASED（已到账），CANCELLED（已取消），REDEEMING（兑现中），REDEEMED（已兑现）
        [NameInMap("asset_type")]
        [Validation(Required=true)]
        public string AssetType { get; set; }

        // 业务单号
        [NameInMap("biz_no")]
        [Validation(Required=true)]
        public string BizNo { get; set; }

        // 事件时间，时区GMT+8，精确到毫秒。
        [NameInMap("event_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EventTime { get; set; }

        // 备注信息
        [NameInMap("memo")]
        [Validation(Required=true)]
        public string Memo { get; set; }

        // 项目名称
        [NameInMap("project_name")]
        [Validation(Required=true)]
        public string ProjectName { get; set; }

        // 收益变化额度，单位为分。
        [NameInMap("revenue")]
        [Validation(Required=true)]
        public Revenue Revenue { get; set; }

    }

}
