<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DONPA\Models;

use AlibabaCloud\Tea\Model;

class BindSlxfRequest extends Model
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

    // 修复批次号
    /**
     * @var string
     */
    public $batchId;

    // 待 修 复 sha256 加 密身份证号
    /**
     * @var string
     */
    public $idCard;

    // 脱敏后手机号码加密串， 需要拨打的该手机号码
    /**
     * @var string
     */
    public $unicomCustomerId;

    // 主叫号码，号码要求备案
    /**
     * @var string
     */
    public $seatNumber;

    // 外显号，外显号要求在外 显号池中
    /**
     * @var string
     */
    public $showNumber;

    // 虚拟小号， 线下分 配
    /**
     * @var string
     */
    public $telX;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'batchId'           => 'batch_id',
        'idCard'            => 'id_card',
        'unicomCustomerId'  => 'unicom_customer_id',
        'seatNumber'        => 'seat_number',
        'showNumber'        => 'show_number',
        'telX'              => 'tel_x',
    ];

    public function validate()
    {
        Model::validateRequired('batchId', $this->batchId, true);
        Model::validateRequired('idCard', $this->idCard, true);
        Model::validateRequired('unicomCustomerId', $this->unicomCustomerId, true);
        Model::validateRequired('seatNumber', $this->seatNumber, true);
        Model::validateRequired('showNumber', $this->showNumber, true);
        Model::validateRequired('telX', $this->telX, true);
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
        if (null !== $this->batchId) {
            $res['batch_id'] = $this->batchId;
        }
        if (null !== $this->idCard) {
            $res['id_card'] = $this->idCard;
        }
        if (null !== $this->unicomCustomerId) {
            $res['unicom_customer_id'] = $this->unicomCustomerId;
        }
        if (null !== $this->seatNumber) {
            $res['seat_number'] = $this->seatNumber;
        }
        if (null !== $this->showNumber) {
            $res['show_number'] = $this->showNumber;
        }
        if (null !== $this->telX) {
            $res['tel_x'] = $this->telX;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindSlxfRequest
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
        if (isset($map['batch_id'])) {
            $model->batchId = $map['batch_id'];
        }
        if (isset($map['id_card'])) {
            $model->idCard = $map['id_card'];
        }
        if (isset($map['unicom_customer_id'])) {
            $model->unicomCustomerId = $map['unicom_customer_id'];
        }
        if (isset($map['seat_number'])) {
            $model->seatNumber = $map['seat_number'];
        }
        if (isset($map['show_number'])) {
            $model->showNumber = $map['show_number'];
        }
        if (isset($map['tel_x'])) {
            $model->telX = $map['tel_x'];
        }

        return $model;
    }
}
