<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\HK_SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class SubmitDeviceriskReportResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // success
    /**
     * @var bool
     */
    public $success;

    // apdid
    /**
     * @var string
     */
    public $apdid;

    // token
    /**
     * @var string
     */
    public $token;

    // current_time
    /**
     * @var string
     */
    public $currentTime;

    // version
    /**
     * @var string
     */
    public $version;

    // vkey_switch
    /**
     * @var string
     */
    public $vkeySwitch;

    // bug_track_switch
    /**
     * @var string
     */
    public $bugTrackSwitch;

    // app_list_ver
    /**
     * @var string
     */
    public $appListVer;

    // dynamic_key
    /**
     * @var string
     */
    public $dynamicKey;

    // result_data
    /**
     * @var DeviceRiskReportResultData
     */
    public $resultData;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'success'        => 'success',
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
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
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
     * @return SubmitDeviceriskReportResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
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
