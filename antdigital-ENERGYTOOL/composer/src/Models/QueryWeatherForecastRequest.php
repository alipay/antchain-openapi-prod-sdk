<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

class QueryWeatherForecastRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'requestId' => 'request_id',
        'latitude' => 'latitude',
        'longitude' => 'longitude',
        'forecastDays' => 'forecast_days',
        'pastDays' => 'past_days',
        'weatherVariables' => 'weather_variables',
    ];
    public function validate() {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('latitude', $this->latitude, true);
        Model::validateRequired('longitude', $this->longitude, true);
        Model::validateRequired('forecastDays', $this->forecastDays, true);
        Model::validateRequired('weatherVariables', $this->weatherVariables, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->latitude) {
            $res['latitude'] = $this->latitude;
        }
        if (null !== $this->longitude) {
            $res['longitude'] = $this->longitude;
        }
        if (null !== $this->forecastDays) {
            $res['forecast_days'] = $this->forecastDays;
        }
        if (null !== $this->pastDays) {
            $res['past_days'] = $this->pastDays;
        }
        if (null !== $this->weatherVariables) {
            $res['weather_variables'] = $this->weatherVariables;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryWeatherForecastRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['request_id'])){
            $model->requestId = $map['request_id'];
        }
        if(isset($map['latitude'])){
            $model->latitude = $map['latitude'];
        }
        if(isset($map['longitude'])){
            $model->longitude = $map['longitude'];
        }
        if(isset($map['forecast_days'])){
            $model->forecastDays = $map['forecast_days'];
        }
        if(isset($map['past_days'])){
            $model->pastDays = $map['past_days'];
        }
        if(isset($map['weather_variables'])){
            if(!empty($map['weather_variables'])){
                $model->weatherVariables = $map['weather_variables'];
            }
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 请求 ID，由调用方生成，用于请求追踪，不可为空。
    /**
     * @var string
     */
    public $requestId;

    // 纬度，十进制度数；Java 类型 BigDecimal。查询位置须符合产品合约的站点授权范围。
    /**
     * @var string
     */
    public $latitude;

    // 经度，十进制度数；Java 类型 BigDecimal。查询位置须符合产品合约的站点授权范围。
    /**
     * @var string
     */
    public $longitude;

    // 需要预测的天数；未传 past_days 时必须大于等于 1；当前产品面向 15 天以内预测。注意：当输入为1时表示预测今天的数据，输入2时表示预测明天数据，以此推类。
    /**
     * @var int
     */
    public $forecastDays;

    // 此前预测的天数，可选且不能为负数。内部数据查询未传时按 0 处理，查询起点为当天减去 past_days。
    /**
     * @var int
     */
    public $pastDays;

    // 气象要素编码列表，不可为空，数量不得超过合约许可。示例包含温度、湿度、天气代码、10米风速、降水量和总云量；short_term_rain 须使用独立短临降水接口。
    /**
     * @var string[]
     */
    public $weatherVariables;

}
