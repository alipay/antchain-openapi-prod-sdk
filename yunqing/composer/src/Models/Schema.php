<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class Schema extends Model
{
    // schema所属的数据库实例信息。
    /**
     * @example
     *
     * @var Database
     */
    public $database;

    // schema名称。
    /**
     * @example aciamcore
     *
     * @var string
     */
    public $name;

    // 资源所属的资源池id。
    /**
     * @example rdb-ant58sit
     *
     * @var string
     */
    public $resourcePoolId;
    protected $_name = [
        'database'       => 'database',
        'name'           => 'name',
        'resourcePoolId' => 'resource_pool_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->database) {
            $res['database'] = null !== $this->database ? $this->database->toMap() : null;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->resourcePoolId) {
            $res['resource_pool_id'] = $this->resourcePoolId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Schema
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['database'])) {
            $model->database = Database::fromMap($map['database']);
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['resource_pool_id'])) {
            $model->resourcePoolId = $map['resource_pool_id'];
        }

        return $model;
    }
}
