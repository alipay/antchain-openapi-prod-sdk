<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class GetTenantIaasaccountResponse extends Model
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

    // 账户关联的AccessKey
    /**
     * @var string
     */
    public $accessKey;

    // 账户关联的AccessSecret
    /**
     * @var string
     */
    public $accessSecret;

    // IaaS账户名
    /**
     * @var string
     */
    public $account;

    // 创建时间，ISO8601格式
    /**
     * @var string
     */
    public $createTime;

    // IaaS账户id
    /**
     * @var string
     */
    public $id;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'accessKey'    => 'access_key',
        'accessSecret' => 'access_secret',
        'account'      => 'account',
        'createTime'   => 'create_time',
        'id'           => 'id',
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetTenantIaasaccountResponse
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

        return $model;
    }
}
