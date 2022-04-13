<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QueryServiceProcesslogRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 观测对象类型，RPV2，RP_STAGE，POD
    /**
     * @var string
     */
    public $objectKind;

    // 观测对象名称
    /**
     * @var string
     */
    public $objectName;

    // 发布单对应的service_id
    /**
     * @var string
     */
    public $serviceId;

    // 发布单id
    /**
     * @var string
     */
    public $planId;
    protected $_name = [
        'authToken'  => 'auth_token',
        'objectKind' => 'object_kind',
        'objectName' => 'object_name',
        'serviceId'  => 'service_id',
        'planId'     => 'plan_id',
    ];

    public function validate()
    {
        Model::validateRequired('objectKind', $this->objectKind, true);
        Model::validateRequired('objectName', $this->objectName, true);
        Model::validateRequired('serviceId', $this->serviceId, true);
        Model::validateRequired('planId', $this->planId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->objectKind) {
            $res['object_kind'] = $this->objectKind;
        }
        if (null !== $this->objectName) {
            $res['object_name'] = $this->objectName;
        }
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->planId) {
            $res['plan_id'] = $this->planId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryServiceProcesslogRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['object_kind'])) {
            $model->objectKind = $map['object_kind'];
        }
        if (isset($map['object_name'])) {
            $model->objectName = $map['object_name'];
        }
        if (isset($map['service_id'])) {
            $model->serviceId = $map['service_id'];
        }
        if (isset($map['plan_id'])) {
            $model->planId = $map['plan_id'];
        }

        return $model;
    }
}
