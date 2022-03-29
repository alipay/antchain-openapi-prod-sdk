<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AppTopItem extends Model
{
    // 应用名
    /**
     * @example RMS-rmsalarm
     *
     * @var string
     */
    public $appName;

    // 应用TopN统计值，有可能有小数，使用前转换为数值
    /**
     * @example 15
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'appName' => 'app_name',
        'value'   => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('value', $this->value, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppTopItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
