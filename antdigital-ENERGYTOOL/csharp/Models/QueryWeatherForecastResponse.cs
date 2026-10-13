// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    public class QueryWeatherForecastResponse : TeaModel {
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

        // 本次查询消耗的额度，Java 类型 BigDecimal；内部数据链路成功查询固定消耗 1，MAYA 链路取下游返回值，可能为空。
        [NameInMap("quota_cost")]
        [Validation(Required=false)]
        public string QuotaCost { get; set; }

        // 实际返回的气象预测数据批次时间，Java 类型 Date；数据链路未提供批次时可能为空。
        [NameInMap("forecast_batch_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ForecastBatchTime { get; set; }

        // 气象数据列表，每个元素为 WeatherVariableDTO，包含时间、预测批次及各气象要素。要素值在 Java DTO 中为 String，未返回或缺测时可能为空。
        [NameInMap("weather_variables_list")]
        [Validation(Required=false)]
        public List<WeatherVariable> WeatherVariablesList { get; set; }

        // 本次请求 ID
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

    }

}
