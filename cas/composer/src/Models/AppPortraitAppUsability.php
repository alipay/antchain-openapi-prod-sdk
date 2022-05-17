<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AppPortraitAppUsability extends Model
{
    // 应用id
    /**
     * @example app_id
     *
     * @var string
     */
    public $appId;

    // 应用名称
    /**
     * @example app_name
     *
     * @var string
     */
    public $appName;

    // 应用可用性
    /**
     * @example 0.9998
     *
     * @var int
     */
    public $appUsability;

    // 年同比
    /**
     * @example 0.06
     *
     * @var string
     */
    public $y2y;

    // 原因列表
    /**
     * @example ["2022-01-01 发生端口8080不可用", "2022-03-01 发生端口8080不可用"]
     *
     * @var string[]
     */
    public $reasonList;
    protected $_name = [
        'appId'        => 'app_id',
        'appName'      => 'app_name',
        'appUsability' => 'app_usability',
        'y2y'          => 'y2y',
        'reasonList'   => 'reason_list',
    ];

    public function validate()
    {
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('appName', $this->appName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->appUsability) {
            $res['app_usability'] = $this->appUsability;
        }
        if (null !== $this->y2y) {
            $res['y2y'] = $this->y2y;
        }
        if (null !== $this->reasonList) {
            $res['reason_list'] = $this->reasonList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppPortraitAppUsability
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['app_usability'])) {
            $model->appUsability = $map['app_usability'];
        }
        if (isset($map['y2y'])) {
            $model->y2y = $map['y2y'];
        }
        if (isset($map['reason_list'])) {
            if (!empty($map['reason_list'])) {
                $model->reasonList = $map['reason_list'];
            }
        }

        return $model;
    }
}
