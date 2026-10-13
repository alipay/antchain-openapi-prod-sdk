<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

class QueryWeatherLongrangeRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'requestId' => 'request_id',
        'latitude' => 'latitude',
        'longitude' => 'longitude',
        'forecastDays' => 'forecast_days',
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
        if (null !== $this->weatherVariables) {
            $res['weather_variables'] = $this->weatherVariables;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryWeatherLongrangeRequest
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

    // 请求唯一标识，用于请求追踪和问题定位。
    /**
     * @var string
     */
    public $requestId;

    // 查询地点纬度，取值范围 -90～90。
    /**
     * @var string
     */
    public $latitude;

    // 查询地点经度，取值范围 -180～180。
    /**
     * @var string
     */
    public $longitude;

    // 预测截止天数，整数 16～45。返回未来第 16 天至第 forecast_days 天（含）的预测数据，每 6 小时一个数据点；
    /**
     * @var int
     */
    public $forecastDays;

    // 气象要素编码列表，至少一项，使用代码定义的驼峰编码，如 temperature2m、windSpeed10m；仅返回指定要素。
    /**
     * @var string[]
     */
    public $weatherVariables;

}
