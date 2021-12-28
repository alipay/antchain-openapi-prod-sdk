<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class NotifyRpgwUserSignresultRequest extends Model
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

    // 调用方平台用户id
    /**
     * @var string
     */
    public $platformUserIdentification;

    // 用户手机号
    /**
     * @var string
     */
    public $userCode;

    // 签约结果，1成功，0失败
    /**
     * @var string
     */
    public $signResult;

    // 失败原因描述
    /**
     * @var string
     */
    public $resultDesc;
    protected $_name = [
        'authToken'                  => 'auth_token',
        'productInstanceId'          => 'product_instance_id',
        'platformUserIdentification' => 'platform_user_identification',
        'userCode'                   => 'user_code',
        'signResult'                 => 'sign_result',
        'resultDesc'                 => 'result_desc',
    ];

    public function validate()
    {
        Model::validateRequired('platformUserIdentification', $this->platformUserIdentification, true);
        Model::validateRequired('userCode', $this->userCode, true);
        Model::validateRequired('signResult', $this->signResult, true);
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
        if (null !== $this->platformUserIdentification) {
            $res['platform_user_identification'] = $this->platformUserIdentification;
        }
        if (null !== $this->userCode) {
            $res['user_code'] = $this->userCode;
        }
        if (null !== $this->signResult) {
            $res['sign_result'] = $this->signResult;
        }
        if (null !== $this->resultDesc) {
            $res['result_desc'] = $this->resultDesc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotifyRpgwUserSignresultRequest
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
        if (isset($map['platform_user_identification'])) {
            $model->platformUserIdentification = $map['platform_user_identification'];
        }
        if (isset($map['user_code'])) {
            $model->userCode = $map['user_code'];
        }
        if (isset($map['sign_result'])) {
            $model->signResult = $map['sign_result'];
        }
        if (isset($map['result_desc'])) {
            $model->resultDesc = $map['result_desc'];
        }

        return $model;
    }
}
