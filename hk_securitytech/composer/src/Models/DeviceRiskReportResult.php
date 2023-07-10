<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\HK_SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class DeviceRiskReportResult extends Model
{
    // success
    /**
     * @example true, false
     *
     * @var bool
     */
    public $success;

    // result_code
    /**
     * @example result_code
     *
     * @var string
     */
    public $resultCode;

    // result_status
    /**
     * @example result_status
     *
     * @var string
     */
    public $resultStatus;

    // apdid
    /**
     * @example apdid
     *
     * @var string
     */
    public $apdid;

    // token
    /**
     * @example token
     *
     * @var string
     */
    public $token;

    // current_time
    /**
     * @example current_time
     *
     * @var string
     */
    public $currentTime;

    // version
    /**
     * @example version
     *
     * @var string
     */
    public $version;

    // vkey_switch
    /**
     * @example vkey_switch
     *
     * @var string
     */
    public $vkeySwitch;

    // bug_track_switch
    /**
     * @example bug_track_switch
     *
     * @var string
     */
    public $bugTrackSwitch;

    // app_list_ver
    /**
     * @example app_list_ver
     *
     * @var string
     */
    public $appListVer;

    // dynamic_key
    /**
     * @example dynamic_key
     *
     * @var string
     */
    public $dynamicKey;

    // result_data
    /**
     * @example
     *
     * @var DeviceRiskReportResultData
     */
    public $resultData;
    protected $_name = [
        'success'        => 'success',
        'resultCode'     => 'result_code',
        'resultStatus'   => 'result_status',
        'apdid'          => 'apdid',
        'token'          => 'token',
        'currentTime'    => 'current_time',
        'version'        => 'version',
        'vkeySwitch'     => 'vkey_switch',
        'bugTrackSwitch' => 'bug_track_switch',
        'appListVer'     => 'app_list_ver',
        'dynamicKey'     => 'dynamic_key',
        'resultData'     => 'result_data',
    ];

    public function validate()
    {
        Model::validateRequired('success', $this->success, true);
        Model::validateRequired('resultCode', $this->resultCode, true);
        Model::validateRequired('resultStatus', $this->resultStatus, true);
        Model::validateRequired('apdid', $this->apdid, true);
        Model::validateRequired('token', $this->token, true);
        Model::validateRequired('currentTime', $this->currentTime, true);
        Model::validateRequired('version', $this->version, true);
        Model::validateRequired('vkeySwitch', $this->vkeySwitch, true);
        Model::validateRequired('bugTrackSwitch', $this->bugTrackSwitch, true);
        Model::validateRequired('appListVer', $this->appListVer, true);
        Model::validateRequired('dynamicKey', $this->dynamicKey, true);
        Model::validateRequired('resultData', $this->resultData, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultStatus) {
            $res['result_status'] = $this->resultStatus;
        }
        if (null !== $this->apdid) {
            $res['apdid'] = $this->apdid;
        }
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }
        if (null !== $this->currentTime) {
            $res['current_time'] = $this->currentTime;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->vkeySwitch) {
            $res['vkey_switch'] = $this->vkeySwitch;
        }
        if (null !== $this->bugTrackSwitch) {
            $res['bug_track_switch'] = $this->bugTrackSwitch;
        }
        if (null !== $this->appListVer) {
            $res['app_list_ver'] = $this->appListVer;
        }
        if (null !== $this->dynamicKey) {
            $res['dynamic_key'] = $this->dynamicKey;
        }
        if (null !== $this->resultData) {
            $res['result_data'] = null !== $this->resultData ? $this->resultData->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeviceRiskReportResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_status'])) {
            $model->resultStatus = $map['result_status'];
        }
        if (isset($map['apdid'])) {
            $model->apdid = $map['apdid'];
        }
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }
        if (isset($map['current_time'])) {
            $model->currentTime = $map['current_time'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['vkey_switch'])) {
            $model->vkeySwitch = $map['vkey_switch'];
        }
        if (isset($map['bug_track_switch'])) {
            $model->bugTrackSwitch = $map['bug_track_switch'];
        }
        if (isset($map['app_list_ver'])) {
            $model->appListVer = $map['app_list_ver'];
        }
        if (isset($map['dynamic_key'])) {
            $model->dynamicKey = $map['dynamic_key'];
        }
        if (isset($map['result_data'])) {
            $model->resultData = DeviceRiskReportResultData::fromMap($map['result_data']);
        }

        return $model;
    }
}
