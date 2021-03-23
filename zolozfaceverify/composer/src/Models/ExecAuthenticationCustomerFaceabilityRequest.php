<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ZOLOZFACEVERIFY\Models;

use AlibabaCloud\Tea\Model;

class ExecAuthenticationCustomerFaceabilityRequest extends Model
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

    // extract(提取特征)、sex(检测性别)、rect(人脸矩形框识别)
    /**
     * @var string
     */
    public $ability;

    // 算法版本
    /**
     * @var string
     */
    public $algVer;

    // 图片encode base64 String
    /**
     * @var string
     */
    public $authImg;

    // 业务接入方生成，唯一ID
    /**
     * @var string
     */
    public $bizId;

    // 场景码
    /**
     * @var string
     */
    public $sceneCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'ability'           => 'ability',
        'algVer'            => 'alg_ver',
        'authImg'           => 'auth_img',
        'bizId'             => 'biz_id',
        'sceneCode'         => 'scene_code',
    ];

    public function validate()
    {
        Model::validateRequired('ability', $this->ability, true);
        Model::validateRequired('algVer', $this->algVer, true);
        Model::validateRequired('authImg', $this->authImg, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
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
        if (null !== $this->ability) {
            $res['ability'] = $this->ability;
        }
        if (null !== $this->algVer) {
            $res['alg_ver'] = $this->algVer;
        }
        if (null !== $this->authImg) {
            $res['auth_img'] = $this->authImg;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecAuthenticationCustomerFaceabilityRequest
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
        if (isset($map['ability'])) {
            $model->ability = $map['ability'];
        }
        if (isset($map['alg_ver'])) {
            $model->algVer = $map['alg_ver'];
        }
        if (isset($map['auth_img'])) {
            $model->authImg = $map['auth_img'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }

        return $model;
    }
}
