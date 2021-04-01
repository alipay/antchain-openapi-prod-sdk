<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartDidAgentVerifyauthresponseRequest extends Model
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

    // { ''challenge":xxxx, //待签名的明文
    // “expired”：xxxx,//签名有效时间
    // “sign”：xxxx，//对上述字段进行的签名
    // }
    /**
     * @var string
     */
    public $authResponse;

    // 待验证的did
    /**
     * @var string
     */
    public $did;

    // 场景码，找dis工作人员进行分配
    /**
     * @var string
     */
    public $bizCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'authResponse'      => 'auth_response',
        'did'               => 'did',
        'bizCode'           => 'biz_code',
    ];

    public function validate()
    {
        Model::validateRequired('authResponse', $this->authResponse, true);
        Model::validateRequired('did', $this->did, true);
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
        if (null !== $this->authResponse) {
            $res['auth_response'] = $this->authResponse;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartDidAgentVerifyauthresponseRequest
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
        if (isset($map['auth_response'])) {
            $model->authResponse = $map['auth_response'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }

        return $model;
    }
}
