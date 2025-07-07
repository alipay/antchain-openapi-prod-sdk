<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryAuthCaritemsRequest extends Model
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

    // 唯一场景码
    /**
     * @var string
     */
    public $sceneCode;

    // 来源码
    /**
     * @var string
     */
    public $sourceCode;

    // 唯一用户标识
    /**
     * @var string
     */
    public $userId;

    // 车牌号
    /**
     * @var string
     */
    public $licenseNo;

    // 车型
    /**
     * @var string
     */
    public $modelCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'sceneCode'         => 'scene_code',
        'sourceCode'        => 'source_code',
        'userId'            => 'user_id',
        'licenseNo'         => 'license_no',
        'modelCode'         => 'model_code',
    ];

    public function validate()
    {
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('sourceCode', $this->sourceCode, true);
        Model::validateRequired('licenseNo', $this->licenseNo, true);
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
        if (null !== $this->sourceCode) {
            $res['source_code'] = $this->sourceCode;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->licenseNo) {
            $res['license_no'] = $this->licenseNo;
        }
        if (null !== $this->modelCode) {
            $res['model_code'] = $this->modelCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAuthCaritemsRequest
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
        if (isset($map['source_code'])) {
            $model->sourceCode = $map['source_code'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['license_no'])) {
            $model->licenseNo = $map['license_no'];
        }
        if (isset($map['model_code'])) {
            $model->modelCode = $map['model_code'];
        }

        return $model;
    }
}
