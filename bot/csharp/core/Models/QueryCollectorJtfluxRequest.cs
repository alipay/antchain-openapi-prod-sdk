// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryCollectorJtfluxRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 查询类型，支持LOCATION, TRACE,  ALARM三类
        [NameInMap("query_type")]
        [Validation(Required=true)]
        public string QueryType { get; set; }

        // 查询模式，支持抽样SAMPLE和分页PAGE两类，query_type不是LOCATION时必填
        [NameInMap("query_mode")]
        [Validation(Required=false)]
        public string QueryMode { get; set; }

        // 场景码
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 部标设备可信平台唯一ID列表
        [NameInMap("trustiot_device_id_list")]
        [Validation(Required=false)]
        public List<long?> TrustiotDeviceIdList { get; set; }

        // 开始时间，查询TRACE,  ALARM时必填
        [NameInMap("start_time")]
        [Validation(Required=false)]
        public long? StartTime { get; set; }

        // 结束时间，查询TRACE,  ALARM时必填
        [NameInMap("end_time")]
        [Validation(Required=false)]
        public long? EndTime { get; set; }

        // 查询ALARM的类型，默认查全部类型，包括ALARM_BASIC,ALARM_ADAS ,ALARM_DSM,ALARM_ACCELEROMETER四类
        [NameInMap("alarm_types")]
        [Validation(Required=false)]
        public List<string> AlarmTypes { get; set; }

        // 页码
        [NameInMap("page_index")]
        [Validation(Required=false)]
        public long? PageIndex { get; set; }

        // 单页数量
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

    }

}
