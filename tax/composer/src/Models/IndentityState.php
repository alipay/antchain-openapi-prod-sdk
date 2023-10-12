<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class IndentityState extends Model
{
    // 纳税人识别号
    /**
     * @example 91440101MA59UGFL91
     *
     * @var string
     */
    public $nsrshb;

    // 纳税人名称
    /**
     * @example 张三
     *
     * @var string
     */
    public $nsrmc;

    // 税务机构名称
    /**
     * @example 123
     *
     * @var string
     */
    public $swjgmc;

    // 纳税人识别号状态
    /**
     * @example 正常 非正常 注销 报验 核销报验 无税务登记
     *
     * @var string
     */
    public $state;

    // 查询时间
    /**
     * @example 123
     *
     * @var string
     */
    public $time;
    protected $_name = [
        'nsrshb' => 'nsrshb',
        'nsrmc'  => 'nsrmc',
        'swjgmc' => 'swjgmc',
        'state'  => 'state',
        'time'   => 'time',
    ];

    public function validate()
    {
        Model::validateRequired('nsrshb', $this->nsrshb, true);
        Model::validateRequired('nsrmc', $this->nsrmc, true);
        Model::validateRequired('swjgmc', $this->swjgmc, true);
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('time', $this->time, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->nsrshb) {
            $res['nsrshb'] = $this->nsrshb;
        }
        if (null !== $this->nsrmc) {
            $res['nsrmc'] = $this->nsrmc;
        }
        if (null !== $this->swjgmc) {
            $res['swjgmc'] = $this->swjgmc;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->time) {
            $res['time'] = $this->time;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IndentityState
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['nsrshb'])) {
            $model->nsrshb = $map['nsrshb'];
        }
        if (isset($map['nsrmc'])) {
            $model->nsrmc = $map['nsrmc'];
        }
        if (isset($map['swjgmc'])) {
            $model->swjgmc = $map['swjgmc'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['time'])) {
            $model->time = $map['time'];
        }

        return $model;
    }
}
