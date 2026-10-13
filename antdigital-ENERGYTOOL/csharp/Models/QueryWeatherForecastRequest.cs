// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    public class QueryWeatherForecastRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 请求 ID，由调用方生成，用于请求追踪，不可为空。
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 纬度，十进制度数；Java 类型 BigDecimal。查询位置须符合产品合约的站点授权范围。
        [NameInMap("latitude")]
        [Validation(Required=true)]
        public string Latitude { get; set; }

        // 经度，十进制度数；Java 类型 BigDecimal。查询位置须符合产品合约的站点授权范围。
        [NameInMap("longitude")]
        [Validation(Required=true)]
        public string Longitude { get; set; }

        // 需要预测的天数；未传 past_days 时必须大于等于 1；当前产品面向 15 天以内预测。注意：当输入为1时表示预测今天的数据，输入2时表示预测明天数据，以此推类。
        [NameInMap("forecast_days")]
        [Validation(Required=true)]
        public long? ForecastDays { get; set; }

        // 此前预测的天数，可选且不能为负数。内部数据查询未传时按 0 处理，查询起点为当天减去 past_days。
        [NameInMap("past_days")]
        [Validation(Required=false)]
        public long? PastDays { get; set; }

        // 气象要素编码列表，不可为空，数量不得超过合约许可。示例包含温度、湿度、天气代码、10米风速、降水量和总云量；short_term_rain 须使用独立短临降水接口。
        [NameInMap("weather_variables")]
        [Validation(Required=true)]
        public List<string> WeatherVariables { get; set; }

    }

}
