<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WINDWARD\Models;

use AlibabaCloud\Tea\Model;

class QueryFinanceAbilityRequest extends Model
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

    // 大经分
    /**
     * @var string
     */
    public $sceneCode;

    // 身份证号
    /**
     * @var string
     */
    public $certNo;

    // 姓名
    /**
     * @var string
     */
    public $userName;

    // 手机号
    /**
     * @var string
     */
    public $telNo;

    // true
    /**
     * @var bool
     */
    public $encrypt;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'sceneCode'         => 'scene_code',
        'certNo'            => 'cert_no',
        'userName'          => 'user_name',
        'telNo'             => 'tel_no',
        'encrypt'           => 'encrypt',
    ];

    public function validate()
    {
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('certNo', $this->certNo, true);
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
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->telNo) {
            $res['tel_no'] = $this->telNo;
        }
        if (null !== $this->encrypt) {
            $res['encrypt'] = $this->encrypt;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryFinanceAbilityRequest
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
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['tel_no'])) {
            $model->telNo = $map['tel_no'];
        }
        if (isset($map['encrypt'])) {
            $model->encrypt = $map['encrypt'];
        }

        return $model;
    }
}
