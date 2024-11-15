<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class MultiSdkItem extends Model
{
    // 任务id
    /**
     * @example 123
     *
     * @var string
     */
    public $taskUniqueId;

    // 产品码
    /**
     * @example ABC
     *
     * @var string
     */
    public $prodCode;

    // sdk版本
    /**
     * @example 1.0.0
     *
     * @var string
     */
    public $saassdkVersion;

    // sdk语言
    /**
     * @example python
     *
     * @var string
     */
    public $lang;

    // 发布仓库
    /**
     * @example http://maven
     *
     * @var string
     */
    public $repo;

    // 发布地址
    /**
     * @example http://maven
     *
     * @var string
     */
    public $address;

    // 开始时间
    /**
     * @example 开始时间
     *
     * @var string
     */
    public $startTme;

    // 花费时间
    /**
     * @example
     *
     * @var int
     */
    public $cost;

    // 结束时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $endTime;

    // 打包状态
    /**
     * @example RUNNING
     *
     * @var string
     */
    public $status;

    // 查看链接
    /**
     * @example 123
     *
     * @var string
     */
    public $previewLink;

    // 依赖
    /**
     * @example 123
     *
     * @var string
     */
    public $dependency;
    protected $_name = [
        'taskUniqueId'   => 'task_unique_id',
        'prodCode'       => 'prod_code',
        'saassdkVersion' => 'saassdk_version',
        'lang'           => 'lang',
        'repo'           => 'repo',
        'address'        => 'address',
        'startTme'       => 'start_tme',
        'cost'           => 'cost',
        'endTime'        => 'end_time',
        'status'         => 'status',
        'previewLink'    => 'preview_link',
        'dependency'     => 'dependency',
    ];

    public function validate()
    {
        Model::validateRequired('taskUniqueId', $this->taskUniqueId, true);
        Model::validateRequired('prodCode', $this->prodCode, true);
        Model::validateRequired('saassdkVersion', $this->saassdkVersion, true);
        Model::validateRequired('lang', $this->lang, true);
        Model::validateRequired('repo', $this->repo, true);
        Model::validateRequired('address', $this->address, true);
        Model::validateRequired('startTme', $this->startTme, true);
        Model::validateRequired('cost', $this->cost, true);
        Model::validateRequired('endTime', $this->endTime, true);
        Model::validateRequired('status', $this->status, true);
        Model::validatePattern('startTme', $this->startTme, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('endTime', $this->endTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->taskUniqueId) {
            $res['task_unique_id'] = $this->taskUniqueId;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }
        if (null !== $this->saassdkVersion) {
            $res['saassdk_version'] = $this->saassdkVersion;
        }
        if (null !== $this->lang) {
            $res['lang'] = $this->lang;
        }
        if (null !== $this->repo) {
            $res['repo'] = $this->repo;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->startTme) {
            $res['start_tme'] = $this->startTme;
        }
        if (null !== $this->cost) {
            $res['cost'] = $this->cost;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->previewLink) {
            $res['preview_link'] = $this->previewLink;
        }
        if (null !== $this->dependency) {
            $res['dependency'] = $this->dependency;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MultiSdkItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['task_unique_id'])) {
            $model->taskUniqueId = $map['task_unique_id'];
        }
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }
        if (isset($map['saassdk_version'])) {
            $model->saassdkVersion = $map['saassdk_version'];
        }
        if (isset($map['lang'])) {
            $model->lang = $map['lang'];
        }
        if (isset($map['repo'])) {
            $model->repo = $map['repo'];
        }
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['start_tme'])) {
            $model->startTme = $map['start_tme'];
        }
        if (isset($map['cost'])) {
            $model->cost = $map['cost'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['preview_link'])) {
            $model->previewLink = $map['preview_link'];
        }
        if (isset($map['dependency'])) {
            $model->dependency = $map['dependency'];
        }

        return $model;
    }
}
