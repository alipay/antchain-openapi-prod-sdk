<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class InitDidUpdatedidHashRequest extends Model
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

    // 发起者did
    /**
     * @var string
     */
    public $did;

    // did doc
    /**
     * @var string
     */
    public $doc;

    // 使用私钥对消息中其他字段进行签名
    /**
     * @var string
     */
    public $requestSignature;

    // 场景码，找dis工作人员进行分配
    /**
     * @var string
     */
    public $bizCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'did'               => 'did',
        'doc'               => 'doc',
        'requestSignature'  => 'request_signature',
        'bizCode'           => 'biz_code',
    ];

    public function validate()
    {
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('doc', $this->doc, true);
        Model::validateRequired('requestSignature', $this->requestSignature, true);
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
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->doc) {
            $res['doc'] = $this->doc;
        }
        if (null !== $this->requestSignature) {
            $res['request_signature'] = $this->requestSignature;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitDidUpdatedidHashRequest
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
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['doc'])) {
            $model->doc = $map['doc'];
        }
        if (isset($map['request_signature'])) {
            $model->requestSignature = $map['request_signature'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }

        return $model;
    }
}
