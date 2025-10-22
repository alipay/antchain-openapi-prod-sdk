<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class ListIssuerProjectRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 开始时间 (时间戳)（毫秒）
    /**
     * @var int
     */
    public $startTimeMills;

    // 结束时间 (时间戳)（毫秒）
    /**
     * @var int
     */
    public $endTimeMills;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'startTimeMills'    => 'start_time_mills',
        'endTimeMills'      => 'end_time_mills',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->startTimeMills) {
            $res['start_time_mills'] = $this->startTimeMills;
        }
        if (null !== $this->endTimeMills) {
            $res['end_time_mills'] = $this->endTimeMills;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListIssuerProjectRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['start_time_mills'])) {
            $model->startTimeMills = $map['start_time_mills'];
        }
        if (isset($map['end_time_mills'])) {
            $model->endTimeMills = $map['end_time_mills'];
        }

        return $model;
    }
}
