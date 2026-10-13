// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    public class QueryWeatherLongrangeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 请求唯一标识，用于请求追踪和问题定位。
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 查询地点纬度，取值范围 -90～90。
        [NameInMap("latitude")]
        [Validation(Required=true)]
        public string Latitude { get; set; }

        // 查询地点经度，取值范围 -180～180。
        [NameInMap("longitude")]
        [Validation(Required=true)]
        public string Longitude { get; set; }

        // 预测截止天数，整数 16～45。返回未来第 16 天至第 forecast_days 天（含）的预测数据，每 6 小时一个数据点；
        [NameInMap("forecast_days")]
        [Validation(Required=true)]
        public long? ForecastDays { get; set; }

        // 气象要素编码列表，至少一项，使用代码定义的驼峰编码，如 temperature2m、windSpeed10m；仅返回指定要素。
        [NameInMap("weather_variables")]
        [Validation(Required=true)]
        public List<string> WeatherVariables { get; set; }

    }

}
