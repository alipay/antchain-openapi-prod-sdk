<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class TrasactionAppInfo extends Model
{
    // 应用名
    /**
     * @example aaaa
     *
     * @var string
     */
    public $appName;

    // recovery_id
    /**
     * @example 1
     *
     * @var int
     */
    public $recoveryId;
    protected $_name = [
        'appName'    => 'app_name',
        'recoveryId' => 'recovery_id',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('recoveryId', $this->recoveryId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->recoveryId) {
            $res['recovery_id'] = $this->recoveryId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TrasactionAppInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['recovery_id'])) {
            $model->recoveryId = $map['recovery_id'];
        }

        return $model;
    }
}
