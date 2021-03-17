<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class CreateRealtytradePersonalRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 姓名
    /**
     * @var string
     */
    public $name;

    // 证件类型详见 https://tech.antfin.com/docs/2/155166，默认为CRED_PSN_CH_IDCARD（身份证类型）
    /**
     * @var string
     */
    public $certType;

    // 证件号码
    /**
     * @var string
     */
    public $certNo;

    // 手机号码
    /**
     * @var string
     */
    public $telephone;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'name'              => 'name',
        'certType'          => 'cert_type',
        'certNo'            => 'cert_no',
        'telephone'         => 'telephone',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('telephone', $this->telephone, true);
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->telephone) {
            $res['telephone'] = $this->telephone;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateRealtytradePersonalRequest
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['telephone'])) {
            $model->telephone = $map['telephone'];
        }

        return $model;
    }
}
