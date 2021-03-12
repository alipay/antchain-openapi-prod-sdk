<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunChainStatics extends Model
{
    // alias
    /**
     * @example alias
     *
     * @var string
     */
    public $alias;

    // Dt
    /**
     * @example Dt
     *
     * @var int
     */
    public $dt;

    // trans_count
    /**
     * @example 21323
     *
     * @var int
     */
    public $transCount;

    // last_sum_block_height
    /**
     * @example 1231
     *
     * @var int
     */
    public $lastSumBlockHeight;

    // creat_time
    /**
     * @example creat_time
     *
     * @var int
     */
    public $creatTime;
    protected $_name = [
        'alias'              => 'alias',
        'dt'                 => 'dt',
        'transCount'         => 'trans_count',
        'lastSumBlockHeight' => 'last_sum_block_height',
        'creatTime'          => 'creat_time',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->alias) {
            $res['alias'] = $this->alias;
        }
        if (null !== $this->dt) {
            $res['dt'] = $this->dt;
        }
        if (null !== $this->transCount) {
            $res['trans_count'] = $this->transCount;
        }
        if (null !== $this->lastSumBlockHeight) {
            $res['last_sum_block_height'] = $this->lastSumBlockHeight;
        }
        if (null !== $this->creatTime) {
            $res['creat_time'] = $this->creatTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunChainStatics
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['alias'])) {
            $model->alias = $map['alias'];
        }
        if (isset($map['dt'])) {
            $model->dt = $map['dt'];
        }
        if (isset($map['trans_count'])) {
            $model->transCount = $map['trans_count'];
        }
        if (isset($map['last_sum_block_height'])) {
            $model->lastSumBlockHeight = $map['last_sum_block_height'];
        }
        if (isset($map['creat_time'])) {
            $model->creatTime = $map['creat_time'];
        }

        return $model;
    }
}
