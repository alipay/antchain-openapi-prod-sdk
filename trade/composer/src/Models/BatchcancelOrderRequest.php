<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class BatchcancelOrderRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 批次号
    /**
     * @var string
     */
    public $batchOrderBsnNo;

    // 租户Id
    /**
     * @var string
     */
    public $tenantId;
    protected $_name = [
        'authToken'       => 'auth_token',
        'batchOrderBsnNo' => 'batch_order_bsn_no',
        'tenantId'        => 'tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('batchOrderBsnNo', $this->batchOrderBsnNo, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->batchOrderBsnNo) {
            $res['batch_order_bsn_no'] = $this->batchOrderBsnNo;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcancelOrderRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['batch_order_bsn_no'])) {
            $model->batchOrderBsnNo = $map['batch_order_bsn_no'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }

        return $model;
    }
}
