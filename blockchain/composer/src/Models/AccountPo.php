<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class AccountPo extends Model
{
    // 账户 hash
    /**
     * @example 465518149b3407dc927e05208136c42b2c6b82fe961006f3dff5202b0c3d8764
     *
     * @var string
     */
    public $account;

    // 账户创建时间
    /**
     * @example 1573442990479
     *
     * @var int
     */
    public $createTime;

    // 创建该账户的交易hash
    /**
     * @example fffc98e106171ee7783fb79a433312e3ac98091cb82e7292ec62462138c7ff8e
     *
     * @var string
     */
    public $hash;

    // 创建该账户的 账户hash
    /**
     * @example e7d3e769f3f593dadcb8634cc5b09fc90dd3a61c4a06a79cb0923662fe6fae6b
     *
     * @var string
     */
    public $parent;
    protected $_name = [
        'account'    => 'account',
        'createTime' => 'create_time',
        'hash'       => 'hash',
        'parent'     => 'parent',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->account) {
            $res['account'] = $this->account;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->hash) {
            $res['hash'] = $this->hash;
        }
        if (null !== $this->parent) {
            $res['parent'] = $this->parent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AccountPo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['account'])) {
            $model->account = $map['account'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['hash'])) {
            $model->hash = $map['hash'];
        }
        if (isset($map['parent'])) {
            $model->parent = $map['parent'];
        }

        return $model;
    }
}
