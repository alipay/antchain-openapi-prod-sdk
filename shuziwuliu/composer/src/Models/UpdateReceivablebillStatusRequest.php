<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class UpdateReceivablebillStatusRequest extends Model
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

    // 账单id，客户生成的账单唯一编号
    /**
     * @var string
     */
    public $billId;

    // 收款方did，账单的收款方数字身份
    /**
     * @var string
     */
    public $billPayeeDid;

    // 账单后续所可能产生的状态，以下三选一填写：账单确认、部分结算、已结清
    //
    //
    /**
     * @var string
     */
    public $updateStatus;

    // 更新状态时间，13位毫秒级时间戳
    /**
     * @var int
     */
    public $updateStatusTime;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'billId'            => 'bill_id',
        'billPayeeDid'      => 'bill_payee_did',
        'updateStatus'      => 'update_status',
        'updateStatusTime'  => 'update_status_time',
    ];

    public function validate()
    {
        Model::validateRequired('billId', $this->billId, true);
        Model::validateRequired('billPayeeDid', $this->billPayeeDid, true);
        Model::validateRequired('updateStatus', $this->updateStatus, true);
        Model::validateRequired('updateStatusTime', $this->updateStatusTime, true);
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
        if (null !== $this->billId) {
            $res['bill_id'] = $this->billId;
        }
        if (null !== $this->billPayeeDid) {
            $res['bill_payee_did'] = $this->billPayeeDid;
        }
        if (null !== $this->updateStatus) {
            $res['update_status'] = $this->updateStatus;
        }
        if (null !== $this->updateStatusTime) {
            $res['update_status_time'] = $this->updateStatusTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateReceivablebillStatusRequest
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
        if (isset($map['bill_id'])) {
            $model->billId = $map['bill_id'];
        }
        if (isset($map['bill_payee_did'])) {
            $model->billPayeeDid = $map['bill_payee_did'];
        }
        if (isset($map['update_status'])) {
            $model->updateStatus = $map['update_status'];
        }
        if (isset($map['update_status_time'])) {
            $model->updateStatusTime = $map['update_status_time'];
        }

        return $model;
    }
}
