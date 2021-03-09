<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DbSchemaGrant extends Model
{
    // privilege
    /**
     * @example privilege
     *
     * @var string
     */
    public $privilege;

    // account
    /**
     * @example
     *
     * @var DatabaseAccount
     */
    public $account;
    protected $_name = [
        'privilege' => 'privilege',
        'account'   => 'account',
    ];

    public function validate()
    {
        Model::validateRequired('privilege', $this->privilege, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->privilege) {
            $res['privilege'] = $this->privilege;
        }
        if (null !== $this->account) {
            $res['account'] = null !== $this->account ? $this->account->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DbSchemaGrant
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['privilege'])) {
            $model->privilege = $map['privilege'];
        }
        if (isset($map['account'])) {
            $model->account = DatabaseAccount::fromMap($map['account']);
        }

        return $model;
    }
}
