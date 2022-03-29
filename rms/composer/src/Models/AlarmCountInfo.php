<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AlarmCountInfo extends Model
{
    // 自定义监控告警数量
    /**
     * @example 15
     *
     * @var int
     */
    public $customPluginCount;

    // 应用组告警数量
    /**
     * @example 5
     *
     * @var int
     */
    public $appGroupCount;

    // 应用监控告警数量
    /**
     * @example 8
     *
     * @var int
     */
    public $appCount;
    protected $_name = [
        'customPluginCount' => 'custom_plugin_count',
        'appGroupCount'     => 'app_group_count',
        'appCount'          => 'app_count',
    ];

    public function validate()
    {
        Model::validateRequired('customPluginCount', $this->customPluginCount, true);
        Model::validateRequired('appGroupCount', $this->appGroupCount, true);
        Model::validateRequired('appCount', $this->appCount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->customPluginCount) {
            $res['custom_plugin_count'] = $this->customPluginCount;
        }
        if (null !== $this->appGroupCount) {
            $res['app_group_count'] = $this->appGroupCount;
        }
        if (null !== $this->appCount) {
            $res['app_count'] = $this->appCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AlarmCountInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['custom_plugin_count'])) {
            $model->customPluginCount = $map['custom_plugin_count'];
        }
        if (isset($map['app_group_count'])) {
            $model->appGroupCount = $map['app_group_count'];
        }
        if (isset($map['app_count'])) {
            $model->appCount = $map['app_count'];
        }

        return $model;
    }
}
