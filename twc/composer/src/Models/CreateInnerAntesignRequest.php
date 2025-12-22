<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateInnerAntesignRequest extends Model
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

    // 调用方租户名
    /**
     * @var string
     */
    public $tenantName;

    // 业务线
    /**
     * @var string
     */
    public $businessLineCode;

    // 场景值
    /**
     * @var string
     */
    public $sceneCode;

    // 应用名
    /**
     * @var string
     */
    public $appName;

    // 生成签名图片明细
    /**
     * @var CreatePngDetails
     */
    public $details;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantName'        => 'tenant_name',
        'businessLineCode'  => 'business_line_code',
        'sceneCode'         => 'scene_code',
        'appName'           => 'app_name',
        'details'           => 'details',
    ];

    public function validate()
    {
        Model::validateRequired('tenantName', $this->tenantName, true);
        Model::validateRequired('businessLineCode', $this->businessLineCode, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('details', $this->details, true);
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
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->businessLineCode) {
            $res['business_line_code'] = $this->businessLineCode;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->details) {
            $res['details'] = null !== $this->details ? $this->details->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateInnerAntesignRequest
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
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['business_line_code'])) {
            $model->businessLineCode = $map['business_line_code'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['details'])) {
            $model->details = CreatePngDetails::fromMap($map['details']);
        }

        return $model;
    }
}
