<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AGORAX\Models;

use AlibabaCloud\Tea\Model;

class RoyaltyEntity extends Model
{
    // 分账接收方类型
    /**
     * @example userId
     *
     * @var string
     */
    public $type;

    // 分账接收方账号
    /**
     * @example 2088324168543
     *
     * @var string
     */
    public $account;

    // 分账接收方真实姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $name;

    // 分账关系描述
    /**
     * @example 分账给测试商户
     *
     * @var string
     */
    public $memo;
    protected $_name = [
        'type'    => 'type',
        'account' => 'account',
        'name'    => 'name',
        'memo'    => 'memo',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('account', $this->account, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->account) {
            $res['account'] = $this->account;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RoyaltyEntity
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['account'])) {
            $model->account = $map['account'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }

        return $model;
    }
}
