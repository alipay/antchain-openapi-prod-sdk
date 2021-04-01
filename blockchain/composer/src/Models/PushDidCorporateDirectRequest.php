<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class PushDidCorporateDirectRequest extends Model
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

    // did
    /**
     * @var string
     */
    public $did;

    // did doc json string
    /**
     * @var string
     */
    public $doc;

    // 对hash进行签名后接字符串
    /**
     * @var string
     */
    public $signData;

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
        'signData'          => 'sign_data',
        'bizCode'           => 'biz_code',
    ];

    public function validate()
    {
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('doc', $this->doc, true);
        Model::validateRequired('signData', $this->signData, true);
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
        if (null !== $this->signData) {
            $res['sign_data'] = $this->signData;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushDidCorporateDirectRequest
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
        if (isset($map['sign_data'])) {
            $model->signData = $map['sign_data'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }

        return $model;
    }
}
