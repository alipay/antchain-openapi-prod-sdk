<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class OperateDataexportTriggerlogRequest extends Model
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

    // tenant_id
    /**
     * @var string
     */
    public $tenantId;

    // biz_id
    /**
     * @var string
     */
    public $bizId;

    // 导出任务ID
    /**
     * @var string
     */
    public $name;

    // 操作
    /**
     * @var string
     */
    public $action;

    // 导出任务日志ID列表
    /**
     * @var string[]
     */
    public $logs;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'bizId'             => 'biz_id',
        'name'              => 'name',
        'action'            => 'action',
        'logs'              => 'logs',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('action', $this->action, true);
        Model::validateRequired('logs', $this->logs, true);
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
        if (null !== $this->action) {
            $res['action'] = $this->action;
        }
        if (null !== $this->logs) {
            $res['logs'] = $this->logs;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateDataexportTriggerlogRequest
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
        if (isset($map['action'])) {
            $model->action = $map['action'];
        }
        if (isset($map['logs'])) {
            if (!empty($map['logs'])) {
                $model->logs = $map['logs'];
            }
        }

        return $model;
    }
}
