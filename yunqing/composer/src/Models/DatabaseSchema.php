<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class DatabaseSchema extends Model
{
    // 数据库方言
    /**
     * @example mysql
     *
     * @var string
     */
    public $dialect;

    // 数据库schema名称
    /**
     * @example acimacore
     *
     * @var string
     */
    public $name;

    // 拓扑名称
    /**
     * @example stadard
     *
     * @var string
     */
    public $topoCode;

    // schema数据库变更
    /**
     * @example
     *
     * @var SQLMigration[]
     */
    public $sqlMigrations;
    protected $_name = [
        'dialect'       => 'dialect',
        'name'          => 'name',
        'topoCode'      => 'topo_code',
        'sqlMigrations' => 'sql_migrations',
    ];

    public function validate()
    {
        Model::validateRequired('dialect', $this->dialect, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('topoCode', $this->topoCode, true);
        Model::validateRequired('sqlMigrations', $this->sqlMigrations, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dialect) {
            $res['dialect'] = $this->dialect;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->topoCode) {
            $res['topo_code'] = $this->topoCode;
        }
        if (null !== $this->sqlMigrations) {
            $res['sql_migrations'] = [];
            if (null !== $this->sqlMigrations && \is_array($this->sqlMigrations)) {
                $n = 0;
                foreach ($this->sqlMigrations as $item) {
                    $res['sql_migrations'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DatabaseSchema
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['dialect'])) {
            $model->dialect = $map['dialect'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['topo_code'])) {
            $model->topoCode = $map['topo_code'];
        }
        if (isset($map['sql_migrations'])) {
            if (!empty($map['sql_migrations'])) {
                $model->sqlMigrations = [];
                $n                    = 0;
                foreach ($map['sql_migrations'] as $item) {
                    $model->sqlMigrations[$n++] = null !== $item ? SQLMigration::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
