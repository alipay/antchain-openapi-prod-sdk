<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\HK_SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class DeviceRiskReportResultData extends Model
{
    // webrtc_url
    /**
     * @example webrtc_url
     *
     * @var string
     */
    public $webrtcUrl;

    // a_dynamic_swi
    /**
     * @example a_dynamic_swi
     *
     * @var string
     */
    public $aDynamicSwi;

    // dynamic_interval
    /**
     * @example dynamic_interval
     *
     * @var string
     */
    public $dynamicInterval;

    // color
    /**
     * @example color
     *
     * @var string
     */
    public $color;

    // os
    /**
     * @example os
     *
     * @var string
     */
    public $os;

    // dynamic_cmd
    /**
     * @example dynamic_cmd
     *
     * @var string
     */
    public $dynamicCmd;

    // time_interval
    /**
     * @example time_interval
     *
     * @var string
     */
    public $timeInterval;

    // dynamic_trace
    /**
     * @example dynamic_trace
     *
     * @var string
     */
    public $dynamicTrace;

    // dynamic_num
    /**
     * @example dynamic_num
     *
     * @var string
     */
    public $dynamicNum;

    // result_type
    /**
     * @example result_type
     *
     * @var string
     */
    public $resultType;
    protected $_name = [
        'webrtcUrl'       => 'webrtc_url',
        'aDynamicSwi'     => 'a_dynamic_swi',
        'dynamicInterval' => 'dynamic_interval',
        'color'           => 'color',
        'os'              => 'os',
        'dynamicCmd'      => 'dynamic_cmd',
        'timeInterval'    => 'time_interval',
        'dynamicTrace'    => 'dynamic_trace',
        'dynamicNum'      => 'dynamic_num',
        'resultType'      => 'result_type',
    ];

    public function validate()
    {
        Model::validateRequired('webrtcUrl', $this->webrtcUrl, true);
        Model::validateRequired('aDynamicSwi', $this->aDynamicSwi, true);
        Model::validateRequired('dynamicInterval', $this->dynamicInterval, true);
        Model::validateRequired('color', $this->color, true);
        Model::validateRequired('os', $this->os, true);
        Model::validateRequired('dynamicCmd', $this->dynamicCmd, true);
        Model::validateRequired('timeInterval', $this->timeInterval, true);
        Model::validateRequired('dynamicTrace', $this->dynamicTrace, true);
        Model::validateRequired('dynamicNum', $this->dynamicNum, true);
        Model::validateRequired('resultType', $this->resultType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->webrtcUrl) {
            $res['webrtc_url'] = $this->webrtcUrl;
        }
        if (null !== $this->aDynamicSwi) {
            $res['a_dynamic_swi'] = $this->aDynamicSwi;
        }
        if (null !== $this->dynamicInterval) {
            $res['dynamic_interval'] = $this->dynamicInterval;
        }
        if (null !== $this->color) {
            $res['color'] = $this->color;
        }
        if (null !== $this->os) {
            $res['os'] = $this->os;
        }
        if (null !== $this->dynamicCmd) {
            $res['dynamic_cmd'] = $this->dynamicCmd;
        }
        if (null !== $this->timeInterval) {
            $res['time_interval'] = $this->timeInterval;
        }
        if (null !== $this->dynamicTrace) {
            $res['dynamic_trace'] = $this->dynamicTrace;
        }
        if (null !== $this->dynamicNum) {
            $res['dynamic_num'] = $this->dynamicNum;
        }
        if (null !== $this->resultType) {
            $res['result_type'] = $this->resultType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeviceRiskReportResultData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['webrtc_url'])) {
            $model->webrtcUrl = $map['webrtc_url'];
        }
        if (isset($map['a_dynamic_swi'])) {
            $model->aDynamicSwi = $map['a_dynamic_swi'];
        }
        if (isset($map['dynamic_interval'])) {
            $model->dynamicInterval = $map['dynamic_interval'];
        }
        if (isset($map['color'])) {
            $model->color = $map['color'];
        }
        if (isset($map['os'])) {
            $model->os = $map['os'];
        }
        if (isset($map['dynamic_cmd'])) {
            $model->dynamicCmd = $map['dynamic_cmd'];
        }
        if (isset($map['time_interval'])) {
            $model->timeInterval = $map['time_interval'];
        }
        if (isset($map['dynamic_trace'])) {
            $model->dynamicTrace = $map['dynamic_trace'];
        }
        if (isset($map['dynamic_num'])) {
            $model->dynamicNum = $map['dynamic_num'];
        }
        if (isset($map['result_type'])) {
            $model->resultType = $map['result_type'];
        }

        return $model;
    }
}
