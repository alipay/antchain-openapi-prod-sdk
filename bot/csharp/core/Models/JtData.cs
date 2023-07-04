// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 部标设备数据
    public class JtData : TeaModel {
        // 数据的可信平台唯一ID
        [NameInMap("trustiot_id")]
        [Validation(Required=true)]
        public long? TrustiotId { get; set; }

        // IoT可信平台设备唯一ID
        [NameInMap("trustiot_entity_id")]
        [Validation(Required=true)]
        public long? TrustiotEntityId { get; set; }

        // 上报原文解析处理之后的数据
        [NameInMap("processed_content")]
        [Validation(Required=true)]
        public string ProcessedContent { get; set; }

        // 和上一次上报数据里程对比，新增的里程数
        [NameInMap("delta_mileage")]
        [Validation(Required=false)]
        public long? DeltaMileage { get; set; }

        // 正常位置信息：LOCATION
        // 告警信息：ALARM_BASIC、 ALARM_ADAS、 ALARM_DSM、 ALARM_ACCELEROMETER
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 告警子类型
        // //ADAS
        // 10001: 前向碰撞报警
        // 10002: 车辆偏离报警
        // 10003: 车距过近报警
        // 10004: 行人碰撞报警
        // 10005: 频繁变道报警
        // 10006: 道路标识超限报警
        // 10007: 障碍物报警 //10008~10015 保留
        // 10016: 道路标志识别事件
        // 10017: 主动抓拍事件 //10018~10031 保留
        // //DSM
        // 10101: 疲劳驾驶报警
        // 10102: 接打电话报警
        // 10103: 抽烟报警报警
        // 10104: 分神驾驶报警
        // 10105: 驾驶员异常报警 //10106~10115 保留
        // 10116: 自动抓拍事件
        // 10117: 驾驶员变更事件 //10118~10031 保留
        // //加速度
        // 11701: 急加速
        // 11702: 急减速
        // 11703: 急转弯
        [NameInMap("alarm_sub_type")]
        [Validation(Required=false)]
        public long? AlarmSubType { get; set; }

    }

}
