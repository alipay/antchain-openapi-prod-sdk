<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class RakeBackInfo extends Model
{
    // 推广层级
    /**
     * @example 1
     *
     * @var int
     */
    public $level;

    // 上级推广订单id
    /**
     * @example test id
     *
     * @var string
     */
    public $parentId;

    // 推广人id
    /**
     * @example test id
     *
     * @var string
     */
    public $promoterId;

    // 返佣额度
    /**
     * @example 10.5
     *
     * @var string
     */
    public $quota;

    // 返佣比例 10表示10%
    /**
     * @example 10
     *
     * @var string
     */
    public $rate;
    protected $_name = [
        'level'      => 'level',
        'parentId'   => 'parent_id',
        'promoterId' => 'promoter_id',
        'quota'      => 'quota',
        'rate'       => 'rate',
    ];

    public function validate()
    {
        Model::validateRequired('level', $this->level, true);
        Model::validateRequired('parentId', $this->parentId, true);
        Model::validateRequired('promoterId', $this->promoterId, true);
        Model::validateRequired('quota', $this->quota, true);
        Model::validateRequired('rate', $this->rate, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->level) {
            $res['level'] = $this->level;
        }
        if (null !== $this->parentId) {
            $res['parent_id'] = $this->parentId;
        }
        if (null !== $this->promoterId) {
            $res['promoter_id'] = $this->promoterId;
        }
        if (null !== $this->quota) {
            $res['quota'] = $this->quota;
        }
        if (null !== $this->rate) {
            $res['rate'] = $this->rate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RakeBackInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['level'])) {
            $model->level = $map['level'];
        }
        if (isset($map['parent_id'])) {
            $model->parentId = $map['parent_id'];
        }
        if (isset($map['promoter_id'])) {
            $model->promoterId = $map['promoter_id'];
        }
        if (isset($map['quota'])) {
            $model->quota = $map['quota'];
        }
        if (isset($map['rate'])) {
            $model->rate = $map['rate'];
        }

        return $model;
    }
}
