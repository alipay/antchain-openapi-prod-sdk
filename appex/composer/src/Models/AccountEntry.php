<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class AccountEntry extends Model
{
    // mychain的账户名字
    /**
     * @example 无
     *
     * @var string
     */
    public $accountName;

    // account_name的hash的hex string
    /**
     * @example 无
     *
     * @var string
     */
    public $accountId;
    protected $_name = [
        'accountName' => 'account_name',
        'accountId'   => 'account_id',
    ];

    public function validate()
    {
        Model::validateRequired('accountName', $this->accountName, true);
        Model::validateRequired('accountId', $this->accountId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accountName) {
            $res['account_name'] = $this->accountName;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AccountEntry
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['account_name'])) {
            $model->accountName = $map['account_name'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }

        return $model;
    }
}
