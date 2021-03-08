<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class GetIaasaccountBaseinfoResponse extends Model
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

    // 账号名称
    /**
     * @var string
     */
    public $account;

    // 账号ID
    /**
     * @var string
     */
    public $id;

    // iaas账号类型
    // ALIYUN_BID: 阿里云BID类型
    // ALIYUN_BID_MIG: 原本是阿里云BID类型，迁移后可两侧登录
    // ALIYUN_MPK: 阿里云MPK类型
    // ALIYUN_LOCALIZATION: 阿里云一方化类型
    /**
     * @var string
     */
    public $sourceType;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'account'    => 'account',
        'id'         => 'id',
        'sourceType' => 'source_type',
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
        if (null !== $this->account) {
            $res['account'] = $this->account;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->sourceType) {
            $res['source_type'] = $this->sourceType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetIaasaccountBaseinfoResponse
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
        if (isset($map['account'])) {
            $model->account = $map['account'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['source_type'])) {
            $model->sourceType = $map['source_type'];
        }

        return $model;
    }
}
