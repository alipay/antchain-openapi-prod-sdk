<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ServiceProvider extends Model
{
    // 账户ID
    /**
     * @example 82d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $accountId;

    // 商家名称
    /**
     * @example 商家
     *
     * @var string
     */
    public $name;
    protected $_name = [
        'accountId' => 'account_id',
        'name'      => 'name',
    ];

    public function validate()
    {
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ServiceProvider
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
