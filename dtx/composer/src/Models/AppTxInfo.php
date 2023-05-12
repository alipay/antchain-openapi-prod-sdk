<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class AppTxInfo extends Model
{
    // appInfo
    /**
     * @example
     *
     * @var AppInfo
     */
    public $appInfo;

    // Stats
    /**
     * @example
     *
     * @var Stats
     */
    public $stats;
    protected $_name = [
        'appInfo' => 'app_info',
        'stats'   => 'stats',
    ];

    public function validate()
    {
        Model::validateRequired('appInfo', $this->appInfo, true);
        Model::validateRequired('stats', $this->stats, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appInfo) {
            $res['app_info'] = null !== $this->appInfo ? $this->appInfo->toMap() : null;
        }
        if (null !== $this->stats) {
            $res['stats'] = null !== $this->stats ? $this->stats->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppTxInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_info'])) {
            $model->appInfo = AppInfo::fromMap($map['app_info']);
        }
        if (isset($map['stats'])) {
            $model->stats = Stats::fromMap($map['stats']);
        }

        return $model;
    }
}
