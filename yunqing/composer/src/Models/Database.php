<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class Database extends Model
{
    // acgotonecore_db_-4784849131397729849。
    /**
     * @example 实例名称。
     *
     * @var string
     */
    public $name;

    // 数据库访问端口。
    /**
     * @example 3306
     *
     * @var int
     */
    public $port;

    // 数据库类型。MYSQL  |  OCEANBASE。
    /**
     * @example MYSQL
     *
     * @var string
     */
    public $provider;

    // 实例id。
    /**
     * @example obpaas_677bdcc0
     *
     * @var string
     */
    public $resourceId;

    // 资源池id。
    /**
     * @example rdb-ant58sit
     *
     * @var string
     */
    public $resourcePoolId;

    // 数据库访问地址。
    /**
     * @example 11.167.33.7
     *
     * @var string
     */
    public $url;
    protected $_name = [
        'name'           => 'name',
        'port'           => 'port',
        'provider'       => 'provider',
        'resourceId'     => 'resource_id',
        'resourcePoolId' => 'resource_pool_id',
        'url'            => 'url',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->port) {
            $res['port'] = $this->port;
        }
        if (null !== $this->provider) {
            $res['provider'] = $this->provider;
        }
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }
        if (null !== $this->resourcePoolId) {
            $res['resource_pool_id'] = $this->resourcePoolId;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Database
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['port'])) {
            $model->port = $map['port'];
        }
        if (isset($map['provider'])) {
            $model->provider = $map['provider'];
        }
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }
        if (isset($map['resource_pool_id'])) {
            $model->resourcePoolId = $map['resource_pool_id'];
        }
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }

        return $model;
    }
}
