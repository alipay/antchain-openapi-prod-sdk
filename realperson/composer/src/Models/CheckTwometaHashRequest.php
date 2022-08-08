<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class CheckTwometaHashRequest extends Model
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

    // hash后的身份证号，不区分大小写，使用的hash算法参考hash_type字段
    /**
     * @var string
     */
    public $certNoHash;

    // hash后的姓名，不区分大小写，使用的hash类型参考hash_type
    /**
     * @var string
     */
    public $certNameHash;

    // 本次核验id
    /**
     * @var string
     */
    public $outerOrderId;

    // 支持的hash类型
    /**
     * @var string
     */
    public $hashType;

    // json格式的扩展字段
    /**
     * @var string
     */
    public $externInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'certNoHash'        => 'cert_no_hash',
        'certNameHash'      => 'cert_name_hash',
        'outerOrderId'      => 'outer_order_id',
        'hashType'          => 'hash_type',
        'externInfo'        => 'extern_info',
    ];

    public function validate()
    {
        Model::validateRequired('certNoHash', $this->certNoHash, true);
        Model::validateRequired('certNameHash', $this->certNameHash, true);
        Model::validateRequired('outerOrderId', $this->outerOrderId, true);
        Model::validateRequired('hashType', $this->hashType, true);
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
        if (null !== $this->certNoHash) {
            $res['cert_no_hash'] = $this->certNoHash;
        }
        if (null !== $this->certNameHash) {
            $res['cert_name_hash'] = $this->certNameHash;
        }
        if (null !== $this->outerOrderId) {
            $res['outer_order_id'] = $this->outerOrderId;
        }
        if (null !== $this->hashType) {
            $res['hash_type'] = $this->hashType;
        }
        if (null !== $this->externInfo) {
            $res['extern_info'] = $this->externInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckTwometaHashRequest
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
        if (isset($map['cert_no_hash'])) {
            $model->certNoHash = $map['cert_no_hash'];
        }
        if (isset($map['cert_name_hash'])) {
            $model->certNameHash = $map['cert_name_hash'];
        }
        if (isset($map['outer_order_id'])) {
            $model->outerOrderId = $map['outer_order_id'];
        }
        if (isset($map['hash_type'])) {
            $model->hashType = $map['hash_type'];
        }
        if (isset($map['extern_info'])) {
            $model->externInfo = $map['extern_info'];
        }

        return $model;
    }
}
