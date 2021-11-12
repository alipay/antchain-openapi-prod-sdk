<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class AppPreviewTask extends Model
{
    // app name
    /**
     * @example xxx_name
     *
     * @var string
     */
    public $appName;

    // 是否需要部署
    /**
     * @example true, false
     *
     * @var bool
     */
    public $needDeploy;
    protected $_name = [
        'appName'    => 'app_name',
        'needDeploy' => 'need_deploy',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('needDeploy', $this->needDeploy, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->needDeploy) {
            $res['need_deploy'] = $this->needDeploy;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppPreviewTask
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['need_deploy'])) {
            $model->needDeploy = $map['need_deploy'];
        }

        return $model;
    }
}
