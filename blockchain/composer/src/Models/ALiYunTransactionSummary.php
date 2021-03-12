<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunTransactionSummary extends Model
{
    // alias
    /**
     * @example alias
     *
     * @var string
     */
    public $alias;

    // hash
    /**
     * @example hash
     *
     * @var string
     */
    public $hash;

    // trans_type_v6
    /**
     * @example trans_type_v6
     *
     * @var string
     */
    public $transTypeV6;

    // trans_type_v10
    /**
     * @example trans_type_v10
     *
     * @var string
     */
    public $transTypeV10;

    // category
    /**
     * @example 1
     *
     * @var int
     */
    public $category;

    // height
    /**
     * @example 2131231
     *
     * @var int
     */
    public $height;

    // block_hash
    /**
     * @example block_hash
     *
     * @var string
     */
    public $blockHash;

    // create_time
    /**
     * @example 123123123
     *
     * @var int
     */
    public $createTime;

    // reference_count
    /**
     * @example 1
     *
     * @var int
     */
    public $referenceCount;

    // from
    /**
     * @example from
     *
     * @var string
     */
    public $from;

    // to
    /**
     * @example to
     *
     * @var string
     */
    public $to;

    // gas_used
    /**
     * @example 123
     *
     * @var int
     */
    public $gasUsed;
    protected $_name = [
        'alias'          => 'alias',
        'hash'           => 'hash',
        'transTypeV6'    => 'trans_type_v6',
        'transTypeV10'   => 'trans_type_v10',
        'category'       => 'category',
        'height'         => 'height',
        'blockHash'      => 'block_hash',
        'createTime'     => 'create_time',
        'referenceCount' => 'reference_count',
        'from'           => 'from',
        'to'             => 'to',
        'gasUsed'        => 'gas_used',
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
        if (null !== $this->hash) {
            $res['hash'] = $this->hash;
        }
        if (null !== $this->transTypeV6) {
            $res['trans_type_v6'] = $this->transTypeV6;
        }
        if (null !== $this->transTypeV10) {
            $res['trans_type_v10'] = $this->transTypeV10;
        }
        if (null !== $this->category) {
            $res['category'] = $this->category;
        }
        if (null !== $this->height) {
            $res['height'] = $this->height;
        }
        if (null !== $this->blockHash) {
            $res['block_hash'] = $this->blockHash;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->referenceCount) {
            $res['reference_count'] = $this->referenceCount;
        }
        if (null !== $this->from) {
            $res['from'] = $this->from;
        }
        if (null !== $this->to) {
            $res['to'] = $this->to;
        }
        if (null !== $this->gasUsed) {
            $res['gas_used'] = $this->gasUsed;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunTransactionSummary
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['alias'])) {
            $model->alias = $map['alias'];
        }
        if (isset($map['hash'])) {
            $model->hash = $map['hash'];
        }
        if (isset($map['trans_type_v6'])) {
            $model->transTypeV6 = $map['trans_type_v6'];
        }
        if (isset($map['trans_type_v10'])) {
            $model->transTypeV10 = $map['trans_type_v10'];
        }
        if (isset($map['category'])) {
            $model->category = $map['category'];
        }
        if (isset($map['height'])) {
            $model->height = $map['height'];
        }
        if (isset($map['block_hash'])) {
            $model->blockHash = $map['block_hash'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['reference_count'])) {
            $model->referenceCount = $map['reference_count'];
        }
        if (isset($map['from'])) {
            $model->from = $map['from'];
        }
        if (isset($map['to'])) {
            $model->to = $map['to'];
        }
        if (isset($map['gas_used'])) {
            $model->gasUsed = $map['gas_used'];
        }

        return $model;
    }
}
