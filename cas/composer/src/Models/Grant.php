<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class Grant extends Model
{
    // account
    /**
     * @example
     *
     * @var DatabaseAccount
     */
    public $account;

    // privilege
    /**
     * @example privilege
     *
     * @var string
     */
    public $privilege;

    // schema
    /**
     * @example
     *
     * @var DbSchema
     */
    public $schema;
    protected $_name = [
        'account'   => 'account',
        'privilege' => 'privilege',
        'schema'    => 'schema',
    ];

    public function validate()
    {
        Model::validateRequired('account', $this->account, true);
        Model::validateRequired('privilege', $this->privilege, true);
        Model::validateRequired('schema', $this->schema, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->account) {
            $res['account'] = null !== $this->account ? $this->account->toMap() : null;
        }
        if (null !== $this->privilege) {
            $res['privilege'] = $this->privilege;
        }
        if (null !== $this->schema) {
            $res['schema'] = null !== $this->schema ? $this->schema->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Grant
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['account'])) {
            $model->account = DatabaseAccount::fromMap($map['account']);
        }
        if (isset($map['privilege'])) {
            $model->privilege = $map['privilege'];
        }
        if (isset($map['schema'])) {
            $model->schema = DbSchema::fromMap($map['schema']);
        }

        return $model;
    }
}
