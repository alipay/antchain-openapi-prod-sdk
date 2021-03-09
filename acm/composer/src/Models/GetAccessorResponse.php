<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class GetAccessorResponse extends Model
{
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // Accessor关联的AccessKey
    /**
     * @var string
     */
    public $accessKey;

    // Accessor关联的AccessKey的密钥，加密传输，网关返回后，使用调用方的AccessSecret进行解密
    /**
     * @var string
     */
    public $accessSecret;

    // AccessKey的密钥，加密传输，网关返回后，使用调用方的AccessSecret进行解密
    /**
     * @var string
     */
    public $account;

    // AccessKey创建时间，ISO8601格式
    /**
     * @var string
     */
    public $createTime;

    // Accessor唯一标识
    /**
     * @var string
     */
    public $id;

    // 关联的租户
    /**
     * @var string
     */
    public $tenant;

    // Accessor类型(RAM/ACCOUNT)
    /**
     * @var string
     */
    public $type;

    // 关联的用户ID
    /**
     * @var string
     */
    public $userId;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'accessKey'    => 'access_key',
        'accessSecret' => 'access_secret',
        'account'      => 'account',
        'createTime'   => 'create_time',
        'id'           => 'id',
        'tenant'       => 'tenant',
        'type'         => 'type',
        'userId'       => 'userId',
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
        if (null !== $this->accessKey) {
            $res['access_key'] = $this->accessKey;
        }
        if (null !== $this->accessSecret) {
            $res['access_secret'] = $this->accessSecret;
        }
        if (null !== $this->account) {
            $res['account'] = $this->account;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->userId) {
            $res['userId'] = $this->userId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAccessorResponse
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
        if (isset($map['access_key'])) {
            $model->accessKey = $map['access_key'];
        }
        if (isset($map['access_secret'])) {
            $model->accessSecret = $map['access_secret'];
        }
        if (isset($map['account'])) {
            $model->account = $map['account'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['userId'])) {
            $model->userId = $map['userId'];
        }

        return $model;
    }
}
