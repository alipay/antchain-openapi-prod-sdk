<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class ApplyGuardImageadvancedRequest extends Model
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

    // 审核内容链接 目前支持 jpeg、png、jpg、bmp、webp 五种格式 图片的 contentType 必须为 image/xxx 或者 application/octet-stream，其余类型都无法识别
    /**
     * @var string
     */
    public $url;

    // 场景，固定填写：ADVANCED_IMAGE_SEC
    /**
     * @var string
     */
    public $sceneCode;

    // 数据Id，调用方入审数据的唯一Id
    /**
     * @var string
     */
    public $dataId;

    // 标识上游应用来源，字符串长度不能超过 128
    /**
     * @var string
     */
    public $appCode;

    // 客户业务ID 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
    /**
     * @var string
     */
    public $businessId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'url'               => 'url',
        'sceneCode'         => 'scene_code',
        'dataId'            => 'data_id',
        'appCode'           => 'app_code',
        'businessId'        => 'business_id',
    ];

    public function validate()
    {
        Model::validateRequired('url', $this->url, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('dataId', $this->dataId, true);
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
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->appCode) {
            $res['app_code'] = $this->appCode;
        }
        if (null !== $this->businessId) {
            $res['business_id'] = $this->businessId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyGuardImageadvancedRequest
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
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['app_code'])) {
            $model->appCode = $map['app_code'];
        }
        if (isset($map['business_id'])) {
            $model->businessId = $map['business_id'];
        }

        return $model;
    }
}
