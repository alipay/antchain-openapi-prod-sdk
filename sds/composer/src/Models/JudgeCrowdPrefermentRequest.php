<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SDS\Models;

use AlibabaCloud\Tea\Model;

class JudgeCrowdPrefermentRequest extends Model
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

    // 业务号：可以标识用户的编码，例如手机号，身份证号等，通过业务号类型来控制，与biz_no_type和encrypt_type共同确定编码形式。
    /**
     * @var string
     */
    public $bizNo;

    // 业务号类型：1-手机号，2-支付宝用户id
    /**
     * @var string
     */
    public $bizNoType;

    // 加密方式：0-不加密，1-SHA1，2-MD5
    /**
     * @var string
     */
    public $encryptType;

    // json结构，可以传递自定义参数
    /**
     * @var string
     */
    public $properties;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizNo'             => 'biz_no',
        'bizNoType'         => 'biz_no_type',
        'encryptType'       => 'encrypt_type',
        'properties'        => 'properties',
    ];

    public function validate()
    {
        Model::validateRequired('bizNo', $this->bizNo, true);
        Model::validateRequired('bizNoType', $this->bizNoType, true);
        Model::validateRequired('encryptType', $this->encryptType, true);
        Model::validateMaxLength('properties', $this->properties, 512);
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
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }
        if (null !== $this->bizNoType) {
            $res['biz_no_type'] = $this->bizNoType;
        }
        if (null !== $this->encryptType) {
            $res['encrypt_type'] = $this->encryptType;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return JudgeCrowdPrefermentRequest
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
        if (isset($map['biz_no'])) {
            $model->bizNo = $map['biz_no'];
        }
        if (isset($map['biz_no_type'])) {
            $model->bizNoType = $map['biz_no_type'];
        }
        if (isset($map['encrypt_type'])) {
            $model->encryptType = $map['encrypt_type'];
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }

        return $model;
    }
}
