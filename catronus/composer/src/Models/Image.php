<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class Image extends Model
{
    // 镜像Ref
    /**
     * @example hub.alipay.net/namespace/repo
     *
     * @var string
     */
    public $imageRef;

    // 镜像标签
    /**
     * @example latest
     *
     * @var string
     */
    public $imageTag;

    // 应用名称
    /**
     * @example myapp
     *
     * @var string
     */
    public $appName;

    // 扫描状态
    /**
     * @example SUCCEDED,RUNNING,FAILED
     *
     * @var string
     */
    public $scanStatus;

    // 镜像漏洞
    /**
     * @example
     *
     * @var int
     */
    public $imageVul;

    // 镜像风险漏洞
    /**
     * @example
     *
     * @var int
     */
    public $imageRiskVul;

    // 开始时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $startTime;

    // 结束时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $endTime;
    protected $_name = [
        'imageRef'     => 'image_ref',
        'imageTag'     => 'image_tag',
        'appName'      => 'app_name',
        'scanStatus'   => 'scan_status',
        'imageVul'     => 'image_vul',
        'imageRiskVul' => 'image_risk_vul',
        'startTime'    => 'start_time',
        'endTime'      => 'end_time',
    ];

    public function validate()
    {
        Model::validateRequired('imageRef', $this->imageRef, true);
        Model::validateRequired('imageTag', $this->imageTag, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('scanStatus', $this->scanStatus, true);
        Model::validateRequired('imageVul', $this->imageVul, true);
        Model::validateRequired('imageRiskVul', $this->imageRiskVul, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('endTime', $this->endTime, true);
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('endTime', $this->endTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->imageRef) {
            $res['image_ref'] = $this->imageRef;
        }
        if (null !== $this->imageTag) {
            $res['image_tag'] = $this->imageTag;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->scanStatus) {
            $res['scan_status'] = $this->scanStatus;
        }
        if (null !== $this->imageVul) {
            $res['image_vul'] = $this->imageVul;
        }
        if (null !== $this->imageRiskVul) {
            $res['image_risk_vul'] = $this->imageRiskVul;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Image
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['image_ref'])) {
            $model->imageRef = $map['image_ref'];
        }
        if (isset($map['image_tag'])) {
            $model->imageTag = $map['image_tag'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['scan_status'])) {
            $model->scanStatus = $map['scan_status'];
        }
        if (isset($map['image_vul'])) {
            $model->imageVul = $map['image_vul'];
        }
        if (isset($map['image_risk_vul'])) {
            $model->imageRiskVul = $map['image_risk_vul'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }

        return $model;
    }
}
