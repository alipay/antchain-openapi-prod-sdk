<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class RepoScanStrategy extends Model
{
    // 策略ID
    /**
     * @example 1000000000001
     *
     * @var string
     */
    public $id;

    // 仓库ID
    /**
     * @example 1000000000001
     *
     * @var string
     */
    public $repoId;

    // 仓库列表
    /**
     * @example
     *
     * @var string[]
     */
    public $projects;

    // 仓库列表
    /**
     * @example
     *
     * @var string[]
     */
    public $repositories;

    // 扫描开始时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $imageBeginTime;

    // 定时扫描任务
    /**
     * @example 0/3 * * * * ?
     *
     * @var string
     */
    public $crontab;

    // 下个日期
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $nextDate;

    // 策略状态
    /**
     * @example running
     *
     * @var string
     */
    public $state;
    protected $_name = [
        'id'             => 'id',
        'repoId'         => 'repo_id',
        'projects'       => 'projects',
        'repositories'   => 'repositories',
        'imageBeginTime' => 'image_begin_time',
        'crontab'        => 'crontab',
        'nextDate'       => 'next_date',
        'state'          => 'state',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('repoId', $this->repoId, true);
        Model::validateRequired('projects', $this->projects, true);
        Model::validateRequired('repositories', $this->repositories, true);
        Model::validateRequired('imageBeginTime', $this->imageBeginTime, true);
        Model::validateRequired('crontab', $this->crontab, true);
        Model::validateRequired('nextDate', $this->nextDate, true);
        Model::validateRequired('state', $this->state, true);
        Model::validatePattern('imageBeginTime', $this->imageBeginTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('nextDate', $this->nextDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->repoId) {
            $res['repo_id'] = $this->repoId;
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
        if (null !== $this->nextDate) {
            $res['next_date'] = $this->nextDate;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RepoScanStrategy
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['repo_id'])) {
            $model->repoId = $map['repo_id'];
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
        if (isset($map['next_date'])) {
            $model->nextDate = $map['next_date'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }

        return $model;
    }
}
