<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class GetRecoveryInitiatorsResponse extends Model
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

    // app_name
    /**
     * @var string
     */
    public $appName;

    // biz_type
    /**
     * @var string
     */
    public $bizType;

    // 关联关系表的id，用于更新
    /**
     * @var int
     */
    public $bizTypeId;

    // client_version
    /**
     * @var string
     */
    public $clientVersion;

    // id
    /**
     * @var int
     */
    public $id;

    // instance_id
    /**
     * @var string
     */
    public $instanceId;

    // is_asyn
    /**
     * @var bool
     */
    public $isAsyn;

    // is_load_test
    /**
     * @var bool
     */
    public $isLoadTest;

    // is_mix
    /**
     * @var bool
     */
    public $isMix;

    // recovery_datasources
    /**
     * @var InitiatorDatasource[]
     */
    public $recoveryDatasources;

    // recovery_limit
    /**
     * @var int
     */
    public $recoveryLimit;

    // thread_num
    /**
     * @var int
     */
    public $threadNum;
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'appName'             => 'app_name',
        'bizType'             => 'biz_type',
        'bizTypeId'           => 'biz_type_id',
        'clientVersion'       => 'client_version',
        'id'                  => 'id',
        'instanceId'          => 'instance_id',
        'isAsyn'              => 'is_asyn',
        'isLoadTest'          => 'is_load_test',
        'isMix'               => 'is_mix',
        'recoveryDatasources' => 'recovery_datasources',
        'recoveryLimit'       => 'recovery_limit',
        'threadNum'           => 'thread_num',
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
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->bizTypeId) {
            $res['biz_type_id'] = $this->bizTypeId;
        }
        if (null !== $this->clientVersion) {
            $res['client_version'] = $this->clientVersion;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->isAsyn) {
            $res['is_asyn'] = $this->isAsyn;
        }
        if (null !== $this->isLoadTest) {
            $res['is_load_test'] = $this->isLoadTest;
        }
        if (null !== $this->isMix) {
            $res['is_mix'] = $this->isMix;
        }
        if (null !== $this->recoveryDatasources) {
            $res['recovery_datasources'] = [];
            if (null !== $this->recoveryDatasources && \is_array($this->recoveryDatasources)) {
                $n = 0;
                foreach ($this->recoveryDatasources as $item) {
                    $res['recovery_datasources'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->recoveryLimit) {
            $res['recovery_limit'] = $this->recoveryLimit;
        }
        if (null !== $this->threadNum) {
            $res['thread_num'] = $this->threadNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetRecoveryInitiatorsResponse
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
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['biz_type_id'])) {
            $model->bizTypeId = $map['biz_type_id'];
        }
        if (isset($map['client_version'])) {
            $model->clientVersion = $map['client_version'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['is_asyn'])) {
            $model->isAsyn = $map['is_asyn'];
        }
        if (isset($map['is_load_test'])) {
            $model->isLoadTest = $map['is_load_test'];
        }
        if (isset($map['is_mix'])) {
            $model->isMix = $map['is_mix'];
        }
        if (isset($map['recovery_datasources'])) {
            if (!empty($map['recovery_datasources'])) {
                $model->recoveryDatasources = [];
                $n                          = 0;
                foreach ($map['recovery_datasources'] as $item) {
                    $model->recoveryDatasources[$n++] = null !== $item ? InitiatorDatasource::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['recovery_limit'])) {
            $model->recoveryLimit = $map['recovery_limit'];
        }
        if (isset($map['thread_num'])) {
            $model->threadNum = $map['thread_num'];
        }

        return $model;
    }
}
