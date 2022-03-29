<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryAppsAlarmrulecountRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 查询app清单
    /**
     * @var string[]
     */
    public $apps;
    protected $_name = [
        'authToken' => 'auth_token',
        'apps'      => 'apps',
    ];

    public function validate()
    {
        Model::validateRequired('apps', $this->apps, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->apps) {
            $res['apps'] = $this->apps;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAppsAlarmrulecountRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['apps'])) {
            if (!empty($map['apps'])) {
                $model->apps = $map['apps'];
            }
        }

        return $model;
    }
}
