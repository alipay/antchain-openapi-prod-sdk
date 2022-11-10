<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateIotbasicDeviceorderbatchRequest extends Model
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

    // 业务类型
    /**
     * @var string
     */
    public $bizScene;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 订单同步批量请求体
    /**
     * @var DeviceorderRequest[]
     */
    public $orderBatchSyncReq;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizScene'          => 'biz_scene',
        'tenantId'          => 'tenant_id',
        'orderBatchSyncReq' => 'order_batch_sync_req',
    ];

    public function validate()
    {
        Model::validateRequired('bizScene', $this->bizScene, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('orderBatchSyncReq', $this->orderBatchSyncReq, true);
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
        if (null !== $this->bizScene) {
            $res['biz_scene'] = $this->bizScene;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->orderBatchSyncReq) {
            $res['order_batch_sync_req'] = [];
            if (null !== $this->orderBatchSyncReq && \is_array($this->orderBatchSyncReq)) {
                $n = 0;
                foreach ($this->orderBatchSyncReq as $item) {
                    $res['order_batch_sync_req'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateIotbasicDeviceorderbatchRequest
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
        if (isset($map['biz_scene'])) {
            $model->bizScene = $map['biz_scene'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['order_batch_sync_req'])) {
            if (!empty($map['order_batch_sync_req'])) {
                $model->orderBatchSyncReq = [];
                $n                        = 0;
                foreach ($map['order_batch_sync_req'] as $item) {
                    $model->orderBatchSyncReq[$n++] = null !== $item ? DeviceorderRequest::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
