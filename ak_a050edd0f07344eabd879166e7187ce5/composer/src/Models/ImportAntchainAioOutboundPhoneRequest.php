<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_a050edd0f07344eabd879166e7187ce5\Models;

use AlibabaCloud\Tea\Model;

class ImportAntchainAioOutboundPhoneRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 任务ID
    /**
     * @var string
     */
    public $taskCode;

    // 收单手机号
    /**
     * @var string
     */
    public $userPhone;

    // 用户ID
    /**
     * @var string
     */
    public $userId;

    // 幂等控制参数，可以为空。为空时不进行幂等控
    /**
     * @var string
     */
    public $idempotenceId;

    // 业务系统在外呼时传入额外参数,json格式
    /**
     * @var string
     */
    public $bizExtInfo;

    // 计划外呼执行时间时间戳。默认为当前时间。单位毫秒
    /**
     * @var int
     */
    public $outcallTimestamp;

    // 计划外呼过期时间戳。 必须填写，一般为当天22:30左右。单位毫秒
    /**
     * @var int
     */
    public $expirationTimestamp;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'taskCode'            => 'task_code',
        'userPhone'           => 'user_phone',
        'userId'              => 'user_id',
        'idempotenceId'       => 'idempotence_id',
        'bizExtInfo'          => 'biz_ext_info',
        'outcallTimestamp'    => 'outcall_timestamp',
        'expirationTimestamp' => 'expiration_timestamp',
    ];

    public function validate()
    {
        Model::validateRequired('taskCode', $this->taskCode, true);
        Model::validateRequired('userPhone', $this->userPhone, true);
        Model::validateRequired('expirationTimestamp', $this->expirationTimestamp, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->taskCode) {
            $res['task_code'] = $this->taskCode;
        }
        if (null !== $this->userPhone) {
            $res['user_phone'] = $this->userPhone;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->idempotenceId) {
            $res['idempotence_id'] = $this->idempotenceId;
        }
        if (null !== $this->bizExtInfo) {
            $res['biz_ext_info'] = $this->bizExtInfo;
        }
        if (null !== $this->outcallTimestamp) {
            $res['outcall_timestamp'] = $this->outcallTimestamp;
        }
        if (null !== $this->expirationTimestamp) {
            $res['expiration_timestamp'] = $this->expirationTimestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportAntchainAioOutboundPhoneRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['task_code'])) {
            $model->taskCode = $map['task_code'];
        }
        if (isset($map['user_phone'])) {
            $model->userPhone = $map['user_phone'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['idempotence_id'])) {
            $model->idempotenceId = $map['idempotence_id'];
        }
        if (isset($map['biz_ext_info'])) {
            $model->bizExtInfo = $map['biz_ext_info'];
        }
        if (isset($map['outcall_timestamp'])) {
            $model->outcallTimestamp = $map['outcall_timestamp'];
        }
        if (isset($map['expiration_timestamp'])) {
            $model->expirationTimestamp = $map['expiration_timestamp'];
        }

        return $model;
    }
}
