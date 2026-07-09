<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryDeviceEmpowerRequest extends Model
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

    // 场景码 场景码与科技所属人-统一社会信用代码（technology_owner_id）不能同时为空
    /**
     * @var string
     */
    public $scene;

    // 科技所属人-统一社会信用代码  与场景码（scene）不能同时为空
    /**
     * @var string
     */
    public $technologyOwnerId;

    // 设备ID
    /**
     * @var string
     */
    public $deviceId;

    // 授权日期 yyyy-MM-dd 格式
    /**
     * @var string
     */
    public $queryDate;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'scene'             => 'scene',
        'technologyOwnerId' => 'technology_owner_id',
        'deviceId'          => 'device_id',
        'queryDate'         => 'query_date',
    ];

    public function validate()
    {
        Model::validateRequired('queryDate', $this->queryDate, true);
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
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->technologyOwnerId) {
            $res['technology_owner_id'] = $this->technologyOwnerId;
        }
        if (null !== $this->deviceId) {
            $res['device_id'] = $this->deviceId;
        }
        if (null !== $this->queryDate) {
            $res['query_date'] = $this->queryDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDeviceEmpowerRequest
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
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['technology_owner_id'])) {
            $model->technologyOwnerId = $map['technology_owner_id'];
        }
        if (isset($map['device_id'])) {
            $model->deviceId = $map['device_id'];
        }
        if (isset($map['query_date'])) {
            $model->queryDate = $map['query_date'];
        }

        return $model;
    }
}
