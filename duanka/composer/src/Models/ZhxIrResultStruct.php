<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DUANKA\Models;

use AlibabaCloud\Tea\Model;

class ZhxIrResultStruct extends Model
{
    // 日合计交易金额指数
    /**
     * @example 13.34374889
     *
     * @var string
     */
    public $amtIndexV;

    // 日合计交易笔数指标
    /**
     * @example 17.09792805
     *
     * @var string
     */
    public $transNumIndexV;

    // 日合计交易人数指数
    /**
     * @example user_num_index
     *
     * @var string
     */
    public $userNumIndexV;

    // 时间
    /**
     * @example 20240321
     *
     * @var string
     */
    public $dt;

    // 城市等级
    /**
     * @example 4线
     *
     * @var string
     */
    public $cityLevel;
    protected $_name = [
        'amtIndexV'      => 'amt_index_v',
        'transNumIndexV' => 'trans_num_index_v',
        'userNumIndexV'  => 'user_num_index_v',
        'dt'             => 'dt',
        'cityLevel'      => 'city_level',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->amtIndexV) {
            $res['amt_index_v'] = $this->amtIndexV;
        }
        if (null !== $this->transNumIndexV) {
            $res['trans_num_index_v'] = $this->transNumIndexV;
        }
        if (null !== $this->userNumIndexV) {
            $res['user_num_index_v'] = $this->userNumIndexV;
        }
        if (null !== $this->dt) {
            $res['dt'] = $this->dt;
        }
        if (null !== $this->cityLevel) {
            $res['city_level'] = $this->cityLevel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ZhxIrResultStruct
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['amt_index_v'])) {
            $model->amtIndexV = $map['amt_index_v'];
        }
        if (isset($map['trans_num_index_v'])) {
            $model->transNumIndexV = $map['trans_num_index_v'];
        }
        if (isset($map['user_num_index_v'])) {
            $model->userNumIndexV = $map['user_num_index_v'];
        }
        if (isset($map['dt'])) {
            $model->dt = $map['dt'];
        }
        if (isset($map['city_level'])) {
            $model->cityLevel = $map['city_level'];
        }

        return $model;
    }
}
