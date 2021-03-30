<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CreateCargowaybillBillsettleRequest extends Model
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

    // 平台did
    /**
     * @var string
     */
    public $platformDid;

    // 账单code（账单唯一标识）
    /**
     * @var string
     */
    public $billCode;

    // 结算金额（2位小数）
    /**
     * @var string
     */
    public $settleAmount;

    // 结算状态（只有2种状态：部分结算、已结清）
    /**
     * @var string
     */
    public $settleStatus;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'platformDid'       => 'platform_did',
        'billCode'          => 'bill_code',
        'settleAmount'      => 'settle_amount',
        'settleStatus'      => 'settle_status',
    ];

    public function validate()
    {
        Model::validateRequired('platformDid', $this->platformDid, true);
        Model::validateRequired('billCode', $this->billCode, true);
        Model::validateRequired('settleAmount', $this->settleAmount, true);
        Model::validateRequired('settleStatus', $this->settleStatus, true);
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
        if (null !== $this->platformDid) {
            $res['platform_did'] = $this->platformDid;
        }
        if (null !== $this->billCode) {
            $res['bill_code'] = $this->billCode;
        }
        if (null !== $this->settleAmount) {
            $res['settle_amount'] = $this->settleAmount;
        }
        if (null !== $this->settleStatus) {
            $res['settle_status'] = $this->settleStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateCargowaybillBillsettleRequest
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
        if (isset($map['platform_did'])) {
            $model->platformDid = $map['platform_did'];
        }
        if (isset($map['bill_code'])) {
            $model->billCode = $map['bill_code'];
        }
        if (isset($map['settle_amount'])) {
            $model->settleAmount = $map['settle_amount'];
        }
        if (isset($map['settle_status'])) {
            $model->settleStatus = $map['settle_status'];
        }

        return $model;
    }
}
