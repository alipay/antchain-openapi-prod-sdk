<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class AntChainPurposeResponse extends Model
{
    // 用户申报用途状态
    /**
     * @example 1
     *
     * @var string
     */
    public $status;

    // 已申报的用途，比如供应链金融
    /**
     * @example 已申报的用途，比如供应链金融
     *
     * @var string
     */
    public $purpose;

    // 申报时间
    /**
     * @example 21-1-1
     *
     * @var string
     */
    public $createTime;

    // 简短说明用途
    /**
     * @example 简短说明用途
     *
     * @var string
     */
    public $chainPurposeItem;

    // 用途详情
    /**
     * @example 用途详情
     *
     * @var string
     */
    public $chainPurposeExtend;

    // 申请用途列表
    /**
     * @example []
     *
     * @var ChainPurpose[]
     */
    public $recordList;
    protected $_name = [
        'status'             => 'status',
        'purpose'            => 'purpose',
        'createTime'         => 'create_time',
        'chainPurposeItem'   => 'chain_purpose_item',
        'chainPurposeExtend' => 'chain_purpose_extend',
        'recordList'         => 'record_list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->purpose) {
            $res['purpose'] = $this->purpose;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->chainPurposeItem) {
            $res['chain_purpose_item'] = $this->chainPurposeItem;
        }
        if (null !== $this->chainPurposeExtend) {
            $res['chain_purpose_extend'] = $this->chainPurposeExtend;
        }
        if (null !== $this->recordList) {
            $res['record_list'] = [];
            if (null !== $this->recordList && \is_array($this->recordList)) {
                $n = 0;
                foreach ($this->recordList as $item) {
                    $res['record_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AntChainPurposeResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['purpose'])) {
            $model->purpose = $map['purpose'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['chain_purpose_item'])) {
            $model->chainPurposeItem = $map['chain_purpose_item'];
        }
        if (isset($map['chain_purpose_extend'])) {
            $model->chainPurposeExtend = $map['chain_purpose_extend'];
        }
        if (isset($map['record_list'])) {
            if (!empty($map['record_list'])) {
                $model->recordList = [];
                $n                 = 0;
                foreach ($map['record_list'] as $item) {
                    $model->recordList[$n++] = null !== $item ? ChainPurpose::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
