<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class UpdateImageReposcanstrategyRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 策略ID
    /**
     * @var string
     */
    public $strategyId;

    // 项目列表
    /**
     * @var string[]
     */
    public $projects;

    // 仓库列表
    /**
     * @var string[]
     */
    public $repositories;

    // 镜像开始时间
    /**
     * @var string
     */
    public $imageBeginTime;

    // 定时描述
    /**
     * @var string
     */
    public $crontab;
    protected $_name = [
        'authToken'      => 'auth_token',
        'strategyId'     => 'strategy_id',
        'projects'       => 'projects',
        'repositories'   => 'repositories',
        'imageBeginTime' => 'image_begin_time',
        'crontab'        => 'crontab',
    ];

    public function validate()
    {
        Model::validateRequired('strategyId', $this->strategyId, true);
        Model::validatePattern('imageBeginTime', $this->imageBeginTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->strategyId) {
            $res['strategy_id'] = $this->strategyId;
        }
        if (null !== $this->projects) {
            $res['projects'] = $this->projects;
        }
        if (null !== $this->repositories) {
            $res['repositories'] = $this->repositories;
        }
        if (null !== $this->imageBeginTime) {
            $res['image_begin_time'] = $this->imageBeginTime;
        }
        if (null !== $this->crontab) {
            $res['crontab'] = $this->crontab;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateImageReposcanstrategyRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['strategy_id'])) {
            $model->strategyId = $map['strategy_id'];
        }
        if (isset($map['projects'])) {
            if (!empty($map['projects'])) {
                $model->projects = $map['projects'];
            }
        }
        if (isset($map['repositories'])) {
            if (!empty($map['repositories'])) {
                $model->repositories = $map['repositories'];
            }
        }
        if (isset($map['image_begin_time'])) {
            $model->imageBeginTime = $map['image_begin_time'];
        }
        if (isset($map['crontab'])) {
            $model->crontab = $map['crontab'];
        }

        return $model;
    }
}
