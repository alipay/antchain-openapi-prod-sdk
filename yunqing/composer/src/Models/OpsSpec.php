<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class OpsSpec extends Model
{
    // 需要下线的pod列表
    /**
     * @example
     *
     * @var string[]
     */
    public $offlinePod;

    // 发布灰度策略
    /**
     * @example
     *
     * @var GrayRelease
     */
    public $grayRelease;
    protected $_name = [
        'offlinePod'  => 'offline_pod',
        'grayRelease' => 'gray_release',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->offlinePod) {
            $res['offline_pod'] = $this->offlinePod;
        }
        if (null !== $this->grayRelease) {
            $res['gray_release'] = null !== $this->grayRelease ? $this->grayRelease->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpsSpec
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['offline_pod'])) {
            if (!empty($map['offline_pod'])) {
                $model->offlinePod = $map['offline_pod'];
            }
        }
        if (isset($map['gray_release'])) {
            $model->grayRelease = GrayRelease::fromMap($map['gray_release']);
        }

        return $model;
    }
}
