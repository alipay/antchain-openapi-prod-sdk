<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ZOLOZFACEVERIFY\Models;

use AlibabaCloud\Tea\Model;

class MeteringDataDetail extends Model
{
    // 比对通过
    /**
     * @example 10
     *
     * @var int
     */
    public $identifyPassedPv;

    // 上传服务端成功
    /**
     * @example 10
     *
     * @var int
     */
    public $identifySucceedPv;

    // 计量类型
    /**
     * @example 计量类型
     *
     * @var string
     */
    public $meteringType;

    // 产品渲染（SDK唤起）
    /**
     * @example 10
     *
     * @var int
     */
    public $prodStartPv;

    // 查询结果通过
    /**
     * @example 10
     *
     * @var int
     */
    public $queryPassedPv;

    // 发起查询
    /**
     * @example 10
     *
     * @var int
     */
    public $querySucceedPv;

    // 可用性检查通过
    /**
     * @example 10
     *
     * @var int
     */
    public $usablePassedPv;

    // 可用性检查开始
    /**
     * @example 10
     *
     * @var int
     */
    public $usableStartPv;
    protected $_name = [
        'identifyPassedPv'  => 'identify_passed_pv',
        'identifySucceedPv' => 'identify_succeed_pv',
        'meteringType'      => 'metering_type',
        'prodStartPv'       => 'prod_start_pv',
        'queryPassedPv'     => 'query_passed_pv',
        'querySucceedPv'    => 'query_succeed_pv',
        'usablePassedPv'    => 'usable_passed_pv',
        'usableStartPv'     => 'usable_start_pv',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->identifyPassedPv) {
            $res['identify_passed_pv'] = $this->identifyPassedPv;
        }
        if (null !== $this->identifySucceedPv) {
            $res['identify_succeed_pv'] = $this->identifySucceedPv;
        }
        if (null !== $this->meteringType) {
            $res['metering_type'] = $this->meteringType;
        }
        if (null !== $this->prodStartPv) {
            $res['prod_start_pv'] = $this->prodStartPv;
        }
        if (null !== $this->queryPassedPv) {
            $res['query_passed_pv'] = $this->queryPassedPv;
        }
        if (null !== $this->querySucceedPv) {
            $res['query_succeed_pv'] = $this->querySucceedPv;
        }
        if (null !== $this->usablePassedPv) {
            $res['usable_passed_pv'] = $this->usablePassedPv;
        }
        if (null !== $this->usableStartPv) {
            $res['usable_start_pv'] = $this->usableStartPv;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MeteringDataDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['identify_passed_pv'])) {
            $model->identifyPassedPv = $map['identify_passed_pv'];
        }
        if (isset($map['identify_succeed_pv'])) {
            $model->identifySucceedPv = $map['identify_succeed_pv'];
        }
        if (isset($map['metering_type'])) {
            $model->meteringType = $map['metering_type'];
        }
        if (isset($map['prod_start_pv'])) {
            $model->prodStartPv = $map['prod_start_pv'];
        }
        if (isset($map['query_passed_pv'])) {
            $model->queryPassedPv = $map['query_passed_pv'];
        }
        if (isset($map['query_succeed_pv'])) {
            $model->querySucceedPv = $map['query_succeed_pv'];
        }
        if (isset($map['usable_passed_pv'])) {
            $model->usablePassedPv = $map['usable_passed_pv'];
        }
        if (isset($map['usable_start_pv'])) {
            $model->usableStartPv = $map['usable_start_pv'];
        }

        return $model;
    }
}
