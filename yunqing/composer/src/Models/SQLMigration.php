<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class SQLMigration extends Model
{
    // 变更名称
    /**
     * @example SQL_MIG_1243
     *
     * @var string
     */
    public $key;

    // 产品升级变更sql
    /**
     * @example select x；
     *
     * @var string
     */
    public $upgrade;

    // 回滚变更sql
    /**
     * @example select x;
     *
     * @var string
     */
    public $downgrade;
    protected $_name = [
        'key'       => 'key',
        'upgrade'   => 'upgrade',
        'downgrade' => 'downgrade',
    ];

    public function validate()
    {
        Model::validateRequired('key', $this->key, true);
        Model::validateRequired('upgrade', $this->upgrade, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->upgrade) {
            $res['upgrade'] = $this->upgrade;
        }
        if (null !== $this->downgrade) {
            $res['downgrade'] = $this->downgrade;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SQLMigration
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['upgrade'])) {
            $model->upgrade = $map['upgrade'];
        }
        if (isset($map['downgrade'])) {
            $model->downgrade = $map['downgrade'];
        }

        return $model;
    }
}
