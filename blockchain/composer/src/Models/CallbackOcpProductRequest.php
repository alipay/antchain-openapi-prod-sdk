<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CallbackOcpProductRequest extends Model
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

    // 任务状态变更，是否成功；
    /**
     * @var bool
     */
    public $downstatus;

    // 事件类型：开通、变更、释放、创建、停止、恢复等
    /**
     * @var string
     */
    public $event;

    // 产品实例Id列
    /**
     * @var string
     */
    public $instanceId;

    // 产品码 全局唯一
    /**
     * @var string
     */
    public $productCode;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'downstatus'        => 'downstatus',
        'event'             => 'event',
        'instanceId'        => 'instance_id',
        'productCode'       => 'product_code',
        'tenantId'          => 'tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('downstatus', $this->downstatus, true);
        Model::validateRequired('event', $this->event, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
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
        if (null !== $this->downstatus) {
            $res['downstatus'] = $this->downstatus;
        }
        if (null !== $this->event) {
            $res['event'] = $this->event;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CallbackOcpProductRequest
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
        if (isset($map['downstatus'])) {
            $model->downstatus = $map['downstatus'];
        }
        if (isset($map['event'])) {
            $model->event = $map['event'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }

        return $model;
    }
}
