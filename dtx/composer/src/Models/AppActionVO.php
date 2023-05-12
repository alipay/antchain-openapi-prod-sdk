<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class AppActionVO extends Model
{
    // 应用名
    /**
     * @example app
     *
     * @var string
     */
    public $appName;

    // 参与者名称数组
    /**
     * @example
     *
     * @var string[]
     */
    public $actionArray;
    protected $_name = [
        'appName'     => 'app_name',
        'actionArray' => 'action_array',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('actionArray', $this->actionArray, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->actionArray) {
            $res['action_array'] = $this->actionArray;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppActionVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['action_array'])) {
            if (!empty($map['action_array'])) {
                $model->actionArray = $map['action_array'];
            }
        }

        return $model;
    }
}
