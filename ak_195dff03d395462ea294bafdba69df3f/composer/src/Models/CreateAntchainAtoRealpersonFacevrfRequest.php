<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class CreateAntchainAtoRealpersonFacevrfRequest extends Model
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

    // 实人认证方案枚举
    // APP（客户端android/ios方案）
    // H5（网页）
    // ZFB（支付宝客户端H5方案）
    /**
     * @var string
     */
    public $solutionType;

    // 真实姓名
    /**
     * @var string
     */
    public $certName;

    // 证件号码
    /**
     * @var string
     */
    public $certNo;

    // 身份信息来源类型
    // IDENTITY_CARD（身份证）
    /**
     * @var string
     */
    public $certType;

    // 【solution_type=ZFB使用】
    // reserve（保存活体人脸 默认值）
    // never（不保存活体人脸）
    /**
     * @var string
     */
    public $faceReserveStrategy;

    // 【solution_type=ZFB使用】
    // 认证成功后需要跳转的地址
    /**
     * @var string
     */
    public $returnUrl;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'solutionType'        => 'solution_type',
        'certName'            => 'cert_name',
        'certNo'              => 'cert_no',
        'certType'            => 'cert_type',
        'faceReserveStrategy' => 'face_reserve_strategy',
        'returnUrl'           => 'return_url',
    ];

    public function validate()
    {
        Model::validateRequired('solutionType', $this->solutionType, true);
        Model::validateRequired('certName', $this->certName, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('certType', $this->certType, true);
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
        if (null !== $this->solutionType) {
            $res['solution_type'] = $this->solutionType;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->faceReserveStrategy) {
            $res['face_reserve_strategy'] = $this->faceReserveStrategy;
        }
        if (null !== $this->returnUrl) {
            $res['return_url'] = $this->returnUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAntchainAtoRealpersonFacevrfRequest
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
        if (isset($map['solution_type'])) {
            $model->solutionType = $map['solution_type'];
        }
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['face_reserve_strategy'])) {
            $model->faceReserveStrategy = $map['face_reserve_strategy'];
        }
        if (isset($map['return_url'])) {
            $model->returnUrl = $map['return_url'];
        }

        return $model;
    }
}
