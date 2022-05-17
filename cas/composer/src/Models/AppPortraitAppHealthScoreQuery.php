<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AppPortraitAppHealthScoreQuery extends Model
{
    // 应用id
    /**
     * @example app_id
     *
     * @var string
     */
    public $appId;

    // app_name
    /**
     * @example app_name
     *
     * @var string
     */
    public $appName;

    // health_score
    /**
     * @example 95
     *
     * @var int
     */
    public $healthScore;

    // 同比上升下降分数
    /**
     * @example 20
     *
     * @var int
     */
    public $y2y;

    // 上升下降原因列表
    /**
     * @example ["2022-01-01 发生端口8080不可用", "2022-03-01 发生端口8080不可用"]
     *
     * @var string[]
     */
    public $reasonList;
    protected $_name = [
        'appId'       => 'app_id',
        'appName'     => 'app_name',
        'healthScore' => 'health_score',
        'y2y'         => 'y2y',
        'reasonList'  => 'reason_list',
    ];

    public function validate()
    {
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
        if (null !== $this->healthScore) {
            $res['health_score'] = $this->healthScore;
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
     * @return AppPortraitAppHealthScoreQuery
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
        if (isset($map['health_score'])) {
            $model->healthScore = $map['health_score'];
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
