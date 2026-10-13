<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\FINMATERIAL\Models;

use AlibabaCloud\Tea\Model;

class ResponseMetadata extends Model {
    protected $_name = [
        'requestId' => 'request_id',
        'version' => 'version',
        'region' => 'region',
        'timeCost' => 'time_cost',
    ];
    public function validate() {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('version', $this->version, true);
        Model::validateRequired('region', $this->region, true);
        Model::validateRequired('timeCost', $this->timeCost, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->timeCost) {
            $res['time_cost'] = $this->timeCost;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ResponseMetadata
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['request_id'])){
            $model->requestId = $map['request_id'];
        }
        if(isset($map['version'])){
            $model->version = $map['version'];
        }
        if(isset($map['region'])){
            $model->region = $map['region'];
        }
        if(isset($map['time_cost'])){
            $model->timeCost = $map['time_cost'];
        }
        return $model;
    }
    // 请求关联标识；优先回显合法 X-Request-Id，缺失或非法时由服务端生成；不用于幂等或去重
    /**
     * @example -
     * @var string
     */
    public $requestId;

    // 接口版本
    /**
     * @example v1
     * @var string
     */
    public $version;

    // 服务区域
    /**
     * @example cn-xx
     * @var string
     */
    public $region;

    // 请求处理耗时，单位为毫秒
    /**
     * @example 1000
     * @var int
     */
    public $timeCost;

}
