<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class RegisterCdsqScratchesRequest extends Model
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

    // 平台名称
    /**
     * @var string
     */
    public $partnerCode;

    // 交易流水号
    /**
     * @var string
     */
    public $transactionNo;

    // 用户ID
    /**
     * @var string
     */
    public $userid;

    // 购买时间
    /**
     * @var string
     */
    public $buytime;

    // 车牌号
    /**
     * @var string
     */
    public $carNo;

    // 停车地址
    /**
     * @var string
     */
    public $address;

    // 场景码
    /**
     * @var string
     */
    public $sceneCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'partnerCode'       => 'partner_code',
        'transactionNo'     => 'transaction_no',
        'userid'            => 'userid',
        'buytime'           => 'buytime',
        'carNo'             => 'car_no',
        'address'           => 'address',
        'sceneCode'         => 'scene_code',
    ];

    public function validate()
    {
        Model::validateRequired('partnerCode', $this->partnerCode, true);
        Model::validateRequired('transactionNo', $this->transactionNo, true);
        Model::validateRequired('carNo', $this->carNo, true);
        Model::validateRequired('address', $this->address, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
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
        if (null !== $this->partnerCode) {
            $res['partner_code'] = $this->partnerCode;
        }
        if (null !== $this->transactionNo) {
            $res['transaction_no'] = $this->transactionNo;
        }
        if (null !== $this->userid) {
            $res['userid'] = $this->userid;
        }
        if (null !== $this->buytime) {
            $res['buytime'] = $this->buytime;
        }
        if (null !== $this->carNo) {
            $res['car_no'] = $this->carNo;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RegisterCdsqScratchesRequest
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
        if (isset($map['partner_code'])) {
            $model->partnerCode = $map['partner_code'];
        }
        if (isset($map['transaction_no'])) {
            $model->transactionNo = $map['transaction_no'];
        }
        if (isset($map['userid'])) {
            $model->userid = $map['userid'];
        }
        if (isset($map['buytime'])) {
            $model->buytime = $map['buytime'];
        }
        if (isset($map['car_no'])) {
            $model->carNo = $map['car_no'];
        }
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }

        return $model;
    }
}
