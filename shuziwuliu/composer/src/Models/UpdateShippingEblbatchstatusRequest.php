<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class UpdateShippingEblbatchstatusRequest extends Model
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

    // 电子提单批次号
    /**
     * @var string
     */
    public $batchNo;

    // 批次下的提单状态变更明细
    /**
     * @var EblStatusDetail[]
     */
    public $eblStatusDetails;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'batchNo'           => 'batch_no',
        'eblStatusDetails'  => 'ebl_status_details',
    ];

    public function validate()
    {
        Model::validateRequired('batchNo', $this->batchNo, true);
        Model::validateRequired('eblStatusDetails', $this->eblStatusDetails, true);
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
        if (null !== $this->batchNo) {
            $res['batch_no'] = $this->batchNo;
        }
        if (null !== $this->eblStatusDetails) {
            $res['ebl_status_details'] = [];
            if (null !== $this->eblStatusDetails && \is_array($this->eblStatusDetails)) {
                $n = 0;
                foreach ($this->eblStatusDetails as $item) {
                    $res['ebl_status_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateShippingEblbatchstatusRequest
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
        if (isset($map['batch_no'])) {
            $model->batchNo = $map['batch_no'];
        }
        if (isset($map['ebl_status_details'])) {
            if (!empty($map['ebl_status_details'])) {
                $model->eblStatusDetails = [];
                $n                       = 0;
                foreach ($map['ebl_status_details'] as $item) {
                    $model->eblStatusDetails[$n++] = null !== $item ? EblStatusDetail::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
