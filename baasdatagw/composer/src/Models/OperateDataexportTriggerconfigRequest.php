<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class OperateDataexportTriggerconfigRequest extends Model
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

    // -
    /**
     * @var string
     */
    public $tenantId;

    // -
    /**
     * @var string
     */
    public $bizId;

    // 导出任务ID
    /**
     * @var string
     */
    public $name;

    // -
    /**
     * @var Trigger
     */
    public $trigger;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'bizId'             => 'biz_id',
        'name'              => 'name',
        'trigger'           => 'trigger',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('trigger', $this->trigger, true);
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->trigger) {
            $res['trigger'] = null !== $this->trigger ? $this->trigger->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateDataexportTriggerconfigRequest
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['trigger'])) {
            $model->trigger = Trigger::fromMap($map['trigger']);
        }

        return $model;
    }
}
