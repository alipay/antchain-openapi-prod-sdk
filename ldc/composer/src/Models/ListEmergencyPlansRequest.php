<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ListEmergencyPlansRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 预案名称
    /**
     * @var string
     */
    public $name;

    // 当前第几页
    /**
     * @var int
     */
    public $pageNumber;

    // 每页大小
    /**
     * @var int
     */
    public $pageSize;

    // 预案id，只有传预案id时才返回预案参数
    /**
     * @var string
     */
    public $emergencyPlanId;
    protected $_name = [
        'authToken'       => 'auth_token',
        'name'            => 'name',
        'pageNumber'      => 'page_number',
        'pageSize'        => 'page_size',
        'emergencyPlanId' => 'emergency_plan_id',
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->pageNumber) {
            $res['page_number'] = $this->pageNumber;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->emergencyPlanId) {
            $res['emergency_plan_id'] = $this->emergencyPlanId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListEmergencyPlansRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['page_number'])) {
            $model->pageNumber = $map['page_number'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['emergency_plan_id'])) {
            $model->emergencyPlanId = $map['emergency_plan_id'];
        }

        return $model;
    }
}
