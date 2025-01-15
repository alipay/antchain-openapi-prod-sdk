<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class BaddebtQueryModel extends Model
{
    // 服务分类，服务二级分类
    /**
     * @example category1
     *
     * @var string
     */
    public $serviceCategory;

    // 总金额，用户购买或使用服务时产生的具体金额
    /**
     * @example 36500
     *
     * @var int
     */
    public $totalAmount;

    // 商品数量，用户购买或使用服务时产生的具体商品数量
    /**
     * @example 1
     *
     * @var int
     */
    public $totalQuantity;

    // 用户姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $userName;

    // 服务商 pid
    /**
     * @example 2088xxxxxxxxxxxx
     *
     * @var string
     */
    public $isvPid;

    // 终端唯一标识
    /**
     * @example wcsQ4EKKaasuqLrXO9+xhwEAxxxx
     *
     * @var string
     */
    public $apdid;
    protected $_name = [
        'serviceCategory' => 'service_category',
        'totalAmount'     => 'total_amount',
        'totalQuantity'   => 'total_quantity',
        'userName'        => 'user_name',
        'isvPid'          => 'isv_pid',
        'apdid'           => 'apdid',
    ];

    public function validate()
    {
        Model::validateMaxLength('serviceCategory', $this->serviceCategory, 128);
        Model::validateMaxLength('userName', $this->userName, 128);
        Model::validateMaxLength('isvPid', $this->isvPid, 128);
        Model::validateMaxLength('apdid', $this->apdid, 128);
        Model::validateMinLength('serviceCategory', $this->serviceCategory, 1);
        Model::validateMinLength('userName', $this->userName, 1);
        Model::validateMinLength('isvPid', $this->isvPid, 1);
        Model::validateMinLength('apdid', $this->apdid, 1);
        Model::validateMaximum('totalAmount', $this->totalAmount, 10000000);
        Model::validateMaximum('totalQuantity', $this->totalQuantity, 10000);
        Model::validateMinimum('totalAmount', $this->totalAmount, 1);
        Model::validateMinimum('totalQuantity', $this->totalQuantity, 1);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->serviceCategory) {
            $res['service_category'] = $this->serviceCategory;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->totalQuantity) {
            $res['total_quantity'] = $this->totalQuantity;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->isvPid) {
            $res['isv_pid'] = $this->isvPid;
        }
        if (null !== $this->apdid) {
            $res['apdid'] = $this->apdid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BaddebtQueryModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['service_category'])) {
            $model->serviceCategory = $map['service_category'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }
        if (isset($map['total_quantity'])) {
            $model->totalQuantity = $map['total_quantity'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['isv_pid'])) {
            $model->isvPid = $map['isv_pid'];
        }
        if (isset($map['apdid'])) {
            $model->apdid = $map['apdid'];
        }

        return $model;
    }
}
