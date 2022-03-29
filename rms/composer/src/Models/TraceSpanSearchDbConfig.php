<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class TraceSpanSearchDbConfig extends Model
{
    // tracer插件名
    /**
     * @example datasource
     *
     * @var string
     */
    public $tracerPluginName;

    // 数据源tag key
    /**
     * @example db.endpoint
     *
     * @var string
     */
    public $datasourceKey;

    // 数据库tag key
    /**
     * @example db.database
     *
     * @var string
     */
    public $databaseKey;

    // 支持的数据库类型列表
    /**
     * @example
     *
     * @var string[]
     */
    public $supportedDbTypes;
    protected $_name = [
        'tracerPluginName' => 'tracer_plugin_name',
        'datasourceKey'    => 'datasource_key',
        'databaseKey'      => 'database_key',
        'supportedDbTypes' => 'supported_db_types',
    ];

    public function validate()
    {
        Model::validateRequired('tracerPluginName', $this->tracerPluginName, true);
        Model::validateRequired('datasourceKey', $this->datasourceKey, true);
        Model::validateRequired('databaseKey', $this->databaseKey, true);
        Model::validateRequired('supportedDbTypes', $this->supportedDbTypes, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tracerPluginName) {
            $res['tracer_plugin_name'] = $this->tracerPluginName;
        }
        if (null !== $this->datasourceKey) {
            $res['datasource_key'] = $this->datasourceKey;
        }
        if (null !== $this->databaseKey) {
            $res['database_key'] = $this->databaseKey;
        }
        if (null !== $this->supportedDbTypes) {
            $res['supported_db_types'] = $this->supportedDbTypes;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TraceSpanSearchDbConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tracer_plugin_name'])) {
            $model->tracerPluginName = $map['tracer_plugin_name'];
        }
        if (isset($map['datasource_key'])) {
            $model->datasourceKey = $map['datasource_key'];
        }
        if (isset($map['database_key'])) {
            $model->databaseKey = $map['database_key'];
        }
        if (isset($map['supported_db_types'])) {
            if (!empty($map['supported_db_types'])) {
                $model->supportedDbTypes = $map['supported_db_types'];
            }
        }

        return $model;
    }
}
