// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    public class QueryWeatherLongrangeResponse : TeaModel {
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

        // 请求唯一标识，与入参一致；对应 Java requestId。
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

        // 本次查询配额消耗，对应 quotaCost，成功查询固定为 1。
        [NameInMap("quota_cost")]
        [Validation(Required=false)]
        public string QuotaCost { get; set; }

        // 预测数据批次时间，格式 yyyy-MM-dd HH:mm:ss。
        [NameInMap("forecast_batch_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ForecastBatchTime { get; set; }

        // 中长期气象预测数据列表，未来第 16 天至指定截止天，每 6 小时一个数据点。仅返回请求指定的气象要素；网关字段需映射至 WeatherLongRangeVariableDTO 对应 Java 属性。
        [NameInMap("weather_variables_list")]
        [Validation(Required=false)]
        public List<WeatherLongRangeVariable> WeatherVariablesList { get; set; }

    }

}
