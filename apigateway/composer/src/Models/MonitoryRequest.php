<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class MonitoryRequest extends Model
{
    // API标识
    /**
     * @example h4ZWfWe9anCJn4Tye3tPMiGJZJ2PeGWq
     *
     * @var string
     */
    public $apiId;

    // App标识
    /**
     * @example Oo2llCf0MkkhGtgL
     *
     * @var string
     */
    public $appId;

    // code
    /**
     * @example code1
     *
     * @var string
     */
    public $code;

    // 开始时间
    /**
     * @example
     *
     * @var int
     */
    public $startTime;

    // end_time
    /**
     * @example
     *
     * @var int
     */
    public $endTime;
    protected $_name = [
        'apiId'     => 'api_id',
        'appId'     => 'app_id',
        'code'      => 'code',
        'startTime' => 'start_time',
        'endTime'   => 'end_time',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->apiId) {
            $res['api_id'] = $this->apiId;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MonitoryRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['api_id'])) {
            $model->apiId = $map['api_id'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }

        return $model;
    }
}
