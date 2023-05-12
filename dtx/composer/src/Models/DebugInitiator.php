<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class DebugInitiator extends Model
{
    // 应用名
    /**
     * @example paycore
     *
     * @var string
     */
    public $appName;

    // 数据源名
    /**
     * @example obtrade001
     *
     * @var string
     */
    public $dsName;

    // 主事务记录表
    /**
     * @example activity_001
     *
     * @var string
     */
    public $activityTableName;
    protected $_name = [
        'appName'           => 'app_name',
        'dsName'            => 'ds_name',
        'activityTableName' => 'activity_table_name',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('dsName', $this->dsName, true);
        Model::validateRequired('activityTableName', $this->activityTableName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->dsName) {
            $res['ds_name'] = $this->dsName;
        }
        if (null !== $this->activityTableName) {
            $res['activity_table_name'] = $this->activityTableName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DebugInitiator
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['ds_name'])) {
            $model->dsName = $map['ds_name'];
        }
        if (isset($map['activity_table_name'])) {
            $model->activityTableName = $map['activity_table_name'];
        }

        return $model;
    }
}
