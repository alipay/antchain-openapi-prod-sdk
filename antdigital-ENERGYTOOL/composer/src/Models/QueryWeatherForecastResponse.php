<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

use AntChain\ENERGYTOOL\Models\WeatherVariable;

class QueryWeatherForecastResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'quotaCost' => 'quota_cost',
        'forecastBatchTime' => 'forecast_batch_time',
        'weatherVariablesList' => 'weather_variables_list',
        'requestId' => 'request_id',
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
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryWeatherForecastResponse
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
                    $model->weatherVariablesList[$n++] = null !== $item ? WeatherVariable::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['request_id'])){
            $model->requestId = $map['request_id'];
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

    // 本次查询消耗的额度，Java 类型 BigDecimal；内部数据链路成功查询固定消耗 1，MAYA 链路取下游返回值，可能为空。
    /**
     * @var string
     */
    public $quotaCost;

    // 实际返回的气象预测数据批次时间，Java 类型 Date；数据链路未提供批次时可能为空。
    /**
     * @var string
     */
    public $forecastBatchTime;

    // 气象数据列表，每个元素为 WeatherVariableDTO，包含时间、预测批次及各气象要素。要素值在 Java DTO 中为 String，未返回或缺测时可能为空。
    /**
     * @var WeatherVariable[]
     */
    public $weatherVariablesList;

    // 本次请求 ID
    /**
     * @var string
     */
    public $requestId;

}
