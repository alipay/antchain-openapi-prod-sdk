<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Osp\Models;

use AlibabaCloud\Tea\Model;

class Product extends Model
{
    // 产品id
    /**
     * @example 100
     *
     * @var int
     */
    public $id;

    // 产品名称
    /**
     * @example ms
     *
     * @var string
     */
    public $productName;

    // 产品代码
    /**
     * @example MS
     *
     * @var string
     */
    public $productCode;

    // 开通状态, T为已开通, F为未开通
    /**
     * @example T
     *
     * @var string
     */
    public $openingStatus;

    // 运行状态的枚举值:
    // running 正在运行
    // stopped 已经停止
    // starting 正在启动
    // start_fail 启动失败
    // stopping 正在停止
    // stop_fail 停止失败
    // arrearage 因为欠费, 已经停止
    // stopping_arr 因为欠费, 正在停止
    //
    /**
     * @example running
     *
     * @var string
     */
    public $runningStatus;
    protected $_name = [
        'id'            => 'id',
        'productName'   => 'product_name',
        'productCode'   => 'product_code',
        'openingStatus' => 'opening_status',
        'runningStatus' => 'running_status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->openingStatus) {
            $res['opening_status'] = $this->openingStatus;
        }
        if (null !== $this->runningStatus) {
            $res['running_status'] = $this->runningStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Product
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['opening_status'])) {
            $model->openingStatus = $map['opening_status'];
        }
        if (isset($map['running_status'])) {
            $model->runningStatus = $map['running_status'];
        }

        return $model;
    }
}
