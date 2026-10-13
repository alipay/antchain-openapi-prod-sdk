<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

use AntChain\ENERGYTOOL\Models\WeatherLongRangeVariable;

class QueryWeatherLongrangeResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'requestId' => 'request_id',
        'quotaCost' => 'quota_cost',
        'forecastBatchTime' => 'forecast_batch_time',
        'weatherVariablesList' => 'weather_variables_list',
    ];
    public function validate() {
        Model::validatePattern('forecastBatchTime', $this->forecastBatchTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->quotaCost) {
            $res['quota_cost'] = $this->quotaCost;
        }
        if (null !== $this->forecastBatchTime) {
            $res['forecast_batch_time'] = $this->forecastBatchTime;
        }
        if (null !== $this->weatherVariablesList) {
            $res['weather_variables_list'] = [];
            if(null !== $this->weatherVariablesList && is_array($this->weatherVariablesList)){
                $n = 0;
                foreach($this->weatherVariablesList as $item){
                    $res['weather_variables_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryWeatherLongrangeResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['request_id'])){
            $model->requestId = $map['request_id'];
        }
        if(isset($map['quota_cost'])){
            $model->quotaCost = $map['quota_cost'];
        }
        if(isset($map['forecast_batch_time'])){
            $model->forecastBatchTime = $map['forecast_batch_time'];
        }
        if(isset($map['weather_variables_list'])){
            if(!empty($map['weather_variables_list'])){
                $model->weatherVariablesList = [];
                $n = 0;
                foreach($map['weather_variables_list'] as $item) {
                    $model->weatherVariablesList[$n++] = null !== $item ? WeatherLongRangeVariable::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 请求唯一标识，与入参一致；对应 Java requestId。
    /**
     * @var string
     */
    public $requestId;

    // 本次查询配额消耗，对应 quotaCost，成功查询固定为 1。
    /**
     * @var string
     */
    public $quotaCost;

    // 预测数据批次时间，格式 yyyy-MM-dd HH:mm:ss。
    /**
     * @var string
     */
    public $forecastBatchTime;

    // 中长期气象预测数据列表，未来第 16 天至指定截止天，每 6 小时一个数据点。仅返回请求指定的气象要素；网关字段需映射至 WeatherLongRangeVariableDTO 对应 Java 属性。
    /**
     * @var WeatherLongRangeVariable[]
     */
    public $weatherVariablesList;

}
